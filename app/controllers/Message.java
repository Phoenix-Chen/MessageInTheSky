package controllers;

import play.mvc.*;

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
    public Result addMessage(String content, String lat, String lon) {
        // Note to self: also check if content, lat, lon is null or empty here
        // also wrap the lon and lat parsing with try catch block

        String act_id = session("mitsconnect");

        double longitude = Double.parseDouble(lon);
        double latitude = Double.parseDouble(lat);

        boolean success = MySQL.addMessage(act_id, content, longitude, latitude);

        return ok(String.valueOf(success));
    }

    public Result getMessage() {

        return ok(MySQL.getMessage());
    }

    public Result getHistory() {
        String act_id = session("mitsconnect");
        return ok(MySQL.getHistory(act_id));
    }
}