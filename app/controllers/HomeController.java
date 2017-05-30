package controllers;

import play.*;
import play.mvc.*;


/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public static Result index() {
        String se = session("mitsconnect");
        if (se != null) {
            return redirect("/");
        }
        return ok(views.html.index.render());
    }

    public static Result main() {
        String se = session("mitsconnect");
        if (se == null) {
            return redirect("/index");
        }
        return ok(views.html.main.render());
    }

    public static Result javascriptRoutes() {
        return ok(
                Routes.javascriptRouter("JsRoutes",
                        controllers.routes.javascript.Account.login(),
                        controllers.routes.javascript.Account.signup(),
                        controllers.routes.javascript.Account.logout(),
                        controllers.routes.javascript.Message.addMessage(),
                        controllers.routes.javascript.Message.getMessage(),
                        controllers.routes.javascript.Message.getHistory(),
                        controllers.routes.javascript.Audio.upload(),
                        controllers.routes.javascript.Audio.getAudio()
                )
        ).as("text/javascript");
    }
}
