
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/Ishan/IdeaProjects/MessageInTheSky/conf/routes
// @DATE:Mon May 22 19:13:40 PDT 2017

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAudio Audio = new controllers.ReverseAudio(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseHomeController HomeController = new controllers.ReverseHomeController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseMessage Message = new controllers.ReverseMessage(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAccount Account = new controllers.ReverseAccount(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAudio Audio = new controllers.javascript.ReverseAudio(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseHomeController HomeController = new controllers.javascript.ReverseHomeController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseMessage Message = new controllers.javascript.ReverseMessage(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAccount Account = new controllers.javascript.ReverseAccount(RoutesPrefix.byNamePrefix());
  }

}
