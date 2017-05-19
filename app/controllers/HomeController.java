package controllers;

import play.*;
import play.mvc.*;
import play.routing.JavaScriptReverseRouter;

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
    public Result index() {
        String se = session("mitsconnect");
        if (se != null) {
            return redirect("/");
        }
        return ok(views.html.index.render());
    }

    public Result main() {
        String se = session("mitsconnect");
        if (se == null) {
            return redirect("/index");
        }
        return ok(views.html.main.render());
    }

    public Result javascriptRoutes() {
        return ok(
                JavaScriptReverseRouter.create("JsRoutes",
                        routes.javascript.Account.login(),
                        routes.javascript.Account.signup(),
                        routes.javascript.Account.logout(),
                        routes.javascript.Message.addMessage(),
                        routes.javascript.Message.getMessage(),
                        routes.javascript.Message.getHistory(),
                        routes.javascript.Audio.upload(),
                        routes.javascript.Audio.getAudio()
                )
        ).as("text/javascript");
    }
}
