package controllers;

import play.*;
import play.mvc.*;
import play.mvc.Http.MultipartFormData;
import play.mvc.Http.MultipartFormData.FilePart;

import java.io.File;
import org.apache.commons.io.FileUtils;
import java.io.IOException;

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
        if (audio != null) {
            String fileName = audio.getFilename();
            String contentType = audio.getContentType();

            File file = audio.getFile();
            try {
                FileUtils.moveFile(file, new File("public/audio", fileName));
            } catch (IOException ioe) {
                System.out.println("Problem operating on filesystem");
            }

            return ok("File uploaded");
        } else {
            flash("error", "Missing file");
            return badRequest();
        }
    }

}