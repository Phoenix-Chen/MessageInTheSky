package controllers;

import play.*;

/**
 * Created by Phoenix on 02/17/2017.
 */

public class Global extends GlobalSettings {

    @Override
    public void beforeStart(Application application) {
        Logger.info("Application about to start...");
        super.beforeStart(application);

        // Check database structure before application start
        // Note to self: Later wrap this with application destory if fail
        MySQL.checkDB();
    }
}