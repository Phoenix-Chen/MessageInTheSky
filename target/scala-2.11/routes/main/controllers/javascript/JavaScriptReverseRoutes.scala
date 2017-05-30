
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/phoenixchen/Documents/websites/MessageInTheSky/conf/routes
// @DATE:Tue May 30 04:21:18 PDT 2017

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:13
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file)})
        }
      """
    )
  
  }

  // @LINE:26
  class ReverseAudio(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:26
    def upload: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Audio.upload",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "upload"})
        }
      """
    )
  
    // @LINE:27
    def getAudio: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Audio.getAudio",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getaudio"})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "index"})
        }
      """
    )
  
    // @LINE:7
    def main: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.main",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:10
    def javascriptRoutes: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.javascriptRoutes",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "javascriptRoutes"})
        }
      """
    )
  
  }

  // @LINE:21
  class ReverseMessage(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:22
    def getMessage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Message.getMessage",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getmessage"})
        }
      """
    )
  
    // @LINE:23
    def getHistory: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Message.getHistory",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "gethistory"})
        }
      """
    )
  
    // @LINE:21
    def addMessage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Message.addMessage",
      """
        function(content,lat,lon) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addmessage" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("content", content), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("lat", lat), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("lon", lon)])})
        }
      """
    )
  
  }

  // @LINE:16
  class ReverseAccount(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:18
    def logout: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Account.logout",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
        }
      """
    )
  
    // @LINE:17
    def signup: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Account.signup",
      """
        function(email,password) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "signup" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("email", email), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("password", password)])})
        }
      """
    )
  
    // @LINE:16
    def login: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Account.login",
      """
        function(email,password) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("email", email), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("password", password)])})
        }
      """
    )
  
  }


}