package controllers;

import play.Logger;
import play.mvc.*;
import com.google.cloud.language.spi.v1.LanguageServiceClient;
import com.google.cloud.language.v1.Document;
import com.google.cloud.language.v1.Document.Type;
import com.google.cloud.language.v1.Sentiment;

import java.io.IOException;

/**
 * Created by Phoenix on 02/06/2017.
 */

public class Message extends Controller {

    /**
     *
     * @param content
     * @param lat
     * @param lon
     * @return
     */
    public static Result addMessage(String content, String lat, String lon) {
        // Note to self: also check if content, lat, lon is null or empty here
        // also wrap the lon and lat parsing with try catch block

        String act_id = session("mitsconnect");

        double longitude = Double.parseDouble(lon);
        double latitude = Double.parseDouble(lat);

        //boolean success = MySQL.addMessage(act_id, content, longitude, latitude);
        int post_id = MySQL.addMessage(act_id, content, longitude, latitude);
        if (post_id > -1) {
            float score = getSentiment(content);
            if (score <= 0 ) {
                MySQL.addNegativeMessage(post_id);
            }
            return ok("true");
        }

        //return ok(String.valueOf(success));
        return ok("false");
    }

    public static Result getMessage() {

        return ok(MySQL.getMessage());
    }

    public static Result getHistory() {
        String act_id = session("mitsconnect");
        return ok(MySQL.getHistory(act_id));
    }

    private static float getSentiment(String content) {
        float score = 1;
        try {
            LanguageServiceClient language = LanguageServiceClient.create();
            Document doc = Document.newBuilder().setContent(content).setType(Type.PLAIN_TEXT).build();
            Sentiment sentiment = language.analyzeSentiment(doc).getDocumentSentiment();

            //System.out.printf("Text: %s%n", content);
            //System.out.printf("Sentiment: %s, %s%n", sentiment.getScore(), sentiment.getMagnitude());
            score = sentiment.getScore();
        } catch (IOException e) {
            Logger.error(e.getMessage());
        }
        return score;
    }

    public static Result getNegativeMessage() {
        return ok(MySQL.getNegativeMessage());
    }

    public static Result deleteNegativeMessage(String post_id) {
        return ok(Boolean.toString(MySQL.deleteNegativeMessage(post_id)));
    }
}