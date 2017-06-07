package controllers;

import play.*;
import play.mvc.*;

import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;

import java.util.Base64;
/**
 * Created by Edward on 1/27/2017.
 */
public class Account extends Controller {

    private static final SecureRandom random = new SecureRandom();

    /**
     * Function for user login.
     * @param email
     * @param password
     * @return
     */
    public static Result login(String email, String password){
        // Check if email exist in database
        if (!MySQL.accountExist(email))
            return ok("false");

        String[] passNsalt = MySQL.getPassSalt(email).clone();
        for (int i = 0; i < passNsalt.length; i++) {
            if (passNsalt[i] == null) {
                return ok("false");
            }
        }

        try {
            Base64.Encoder enc = Base64.getEncoder();
            Base64.Decoder dec = Base64.getDecoder();
            byte[] salt = dec.decode(passNsalt[1]);
            KeySpec spec = new PBEKeySpec(password.toCharArray(), salt, 65536, 128);
            SecretKeyFactory f = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
            byte[] hash = f.generateSecret(spec).getEncoded();
            if (!enc.encodeToString(hash).equals(passNsalt[0])) {
                return ok("Password does not match");
            }
        } catch (NoSuchAlgorithmException | InvalidKeySpecException ex) {
            Logger.error("Error occur during check hash: " + ex.getMessage());
            return ok("Error code 1");
        }

        session("mitsconnect", passNsalt[2]);
        return ok("true");
    }

    /**
     * Function for user sign up.
     * @param email
     * @param password
     * @return
     */
    public static Result signup(String email, String password){
        // Check if the email already exist in database
        if (MySQL.accountExist(email))
            return ok("false");

        String hashed_pass;
        String salt_string;

        try {
            byte[] salt = new byte[16];
            random.nextBytes(salt);
            KeySpec spec = new PBEKeySpec(password.toCharArray(), salt, 65536, 128);
            SecretKeyFactory f = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
            byte[] hash = f.generateSecret(spec).getEncoded();
            Base64.Encoder enc = Base64.getEncoder();
            salt_string = enc.encodeToString(salt);
            hashed_pass = enc.encodeToString(hash);
        } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
            Logger.error("Error occur during hashing: " + e.getMessage());
            // Note to self: change this
            return ok("Error code 1");
        }

        int act_id = 0;
        act_id = MySQL.addAccount(email, hashed_pass, salt_string);
        if (act_id == 0) {
            Logger.error("Error getting act_id");
            return ok("false");
        }

        // auto login after sign up
        session("mitsconnect", Integer.toString(act_id));
        return ok("true");
    }

    /**
     * Function for user logout.
     * @return
     */
    public static Result logout() {
        try {
            session().remove("mitsconnect");
        } catch (Exception e) {
            Logger.error("Error happened when logging out: " + e);
            return ok("false");
        }
        return ok("true");
    }
}