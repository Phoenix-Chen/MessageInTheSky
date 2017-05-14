package controllers;

import play.*;
import play.mvc.*;
import play.mvc.Http.MultipartFormData;
import play.mvc.Http.MultipartFormData.FilePart;

import java.io.File;
import org.apache.commons.io.FileUtils;

import javax.xml.bind.DatatypeConverter;
import java.io.IOException;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.security.MessageDigest;
import java.util.Base64;

import static play.data.Form.form;

/**
 * Created by Phoenix on 04/24/2017
 */

public class Audio extends Controller {

//    public Result upload() {
//        File file = request().body().asRaw().asFile();
//        return ok("File uploaded");
//    }


    public Result upload() {
        MultipartFormData<File> body = request().body().asMultipartFormData();
        FilePart<File> audio = body.getFile("file");
        double longitude = Double.parseDouble(form().bindFromRequest().get("lon"));
        double latitude = Double.parseDouble(form().bindFromRequest().get("lat"));
        if (audio != null) {
            String fileName = audio.getFilename();
            String contentType = audio.getContentType();

            File file = audio.getFile();
            try {
                FileUtils.moveFile(file, new File("public/audio", fileName));
            } catch (IOException ioe) {
                System.out.println("Problem operating on filesystem");
            }

            String newName = sha_1(fileName);
            rename_file(fileName, newName.concat(".mp3"));
            move_file_to(newName.concat(".mp3"));

            String act_id = session("mitsconnect");
            MySQL.addAudio(act_id, newName, latitude, longitude);

            return ok("File uploaded");
        } else {
            flash("error", "Missing file");
            return badRequest();
        }
    }

    /*
     * Creates a new name using sha1 hasing
     */
    public static String sha_1(String filename)
    {
        int bytesRead = 0;
        File file = new File("public/audio", filename);
        byte[] buffer = new byte[8192];
        Base64.Encoder enc = Base64.getEncoder();
        try {
            FileInputStream is = new FileInputStream(file);
            is.read(buffer);
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            while ((bytesRead = is.read(buffer)) > 0) {
                baos.write(buffer, 0, bytesRead);
            }
            byte[] audioBytes = baos.toByteArray();

            MessageDigest md = MessageDigest.getInstance("SHA-1");
            byte[] tmp = md.digest(audioBytes);

            String newname = toHexString(tmp);

            //return newname.concat(".mp3");
            return newname;
        } catch(Exception e) {
            //io exception
            e.printStackTrace();
        }
        finally{
            //is.close();
        }
        //return buffer.toString();
        return "";
    }



    private static String toHexString(byte[] array) {
        return DatatypeConverter.printHexBinary(array).toLowerCase();
    }
//    /*
//     * Takes a string
//     * and returns the hex representation
//     */
//    public byte[] hex_cast(String hashname)
//    {
//        int length = hashname.length();
//        byte[] hex_name = new byte [length/2];
//        for (int i = 0; i < length; i += 2) {
//            hex_name[i / 2] = (byte) ((Character.digit(hashname.charAt(i), 16) << 4)
//                    + Character.digit(hashname.charAt(i + 1), 16));
//        }
//        return hex_name;
//    }

    /*
     * Changes the name of the file to it's SHA1 name
     */
    public static void rename_file(String oldname, String newname)
    {
        File file = new File("public/audio", oldname);
        File file2 = new File("public/audio", newname);

        // Rename file
        boolean success = file.renameTo(file2);
        if (!success) {
            // File was not successfully renamed
        }
    }

    /*
     * Moves file to the specified folder
     * Need to include *full* path
     */
    public static void move_file_to(String filename)
    {
        File fromFile = new File("public/audio", filename);
        Path source = fromFile.toPath();
        Path newdir = Paths.get("public/sha1");
        try {
            Files.move(source, newdir.resolve(source.getFileName()), StandardCopyOption.REPLACE_EXISTING);
        } catch(java.io.IOException e) {
            // io exception
        }
    }


    public Result getAudio() {
        return ok(MySQL.getAudio());
    }
}