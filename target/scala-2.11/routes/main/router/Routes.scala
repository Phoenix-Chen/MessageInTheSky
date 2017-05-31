
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/phoenixchen/Documents/websites/MessageInTheSky/conf/routes
// @DATE:Tue May 30 20:14:58 PDT 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

object Routes extends Routes

class Routes extends GeneratedRouter {

  import ReverseRouteContext.empty

  override val errorHandler: play.api.http.HttpErrorHandler = play.api.http.LazyHttpErrorHandler

  private var _prefix = "/"

  def withPrefix(prefix: String): Routes = {
    _prefix = prefix
    router.RoutesPrefix.setPrefix(prefix)
    
    this
  }

  def prefix: String = _prefix

  lazy val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation: Seq[(String, String, String)] = List(
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """index""", """controllers.HomeController.index()"""),
    ("""GET""", prefix, """controllers.HomeController.main()"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """admin""", """controllers.HomeController.admin()"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """javascriptRoutes""", """controllers.HomeController.javascriptRoutes()"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""", """controllers.Account.login(email:String, password:String)"""),
    ("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """signup""", """controllers.Account.signup(email:String, password:String)"""),
    ("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """logout""", """controllers.Account.logout()"""),
    ("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """addmessage""", """controllers.Message.addMessage(content:String, lat:String, lon:String)"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """getmessage""", """controllers.Message.getMessage()"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """gethistory""", """controllers.Message.getHistory()"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """getnegmessage""", """controllers.Message.getNegativeMessage()"""),
    ("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """deletemessage""", """controllers.Message.deleteNegativeMessage(post_id:String)"""),
    ("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """upload""", """controllers.Audio.upload()"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """getaudio""", """controllers.Audio.getAudio()"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("index")))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    controllers.HomeController.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      """ An example controller showing a sample home page""",
      this.prefix + """index"""
    )
  )

  // @LINE:7
  private[this] lazy val controllers_HomeController_main1_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_main1_invoker = createInvoker(
    controllers.HomeController.main(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "main",
      Nil,
      "GET",
      """""",
      this.prefix + """"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_HomeController_admin2_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin")))
  )
  private[this] lazy val controllers_HomeController_admin2_invoker = createInvoker(
    controllers.HomeController.admin(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "admin",
      Nil,
      "GET",
      """""",
      this.prefix + """admin"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_HomeController_javascriptRoutes3_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("javascriptRoutes")))
  )
  private[this] lazy val controllers_HomeController_javascriptRoutes3_invoker = createInvoker(
    controllers.HomeController.javascriptRoutes(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "javascriptRoutes",
      Nil,
      "GET",
      """ Javascript Routes""",
      this.prefix + """javascriptRoutes"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_Assets_versioned4_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned4_invoker = createInvoker(
    controllers.Assets.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/$file<.+>"""
    )
  )

  // @LINE:17
  private[this] lazy val controllers_Account_login5_route: Route.ParamsExtractor = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_Account_login5_invoker = createInvoker(
    controllers.Account.login(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Account",
      "login",
      Seq(classOf[String], classOf[String]),
      "POST",
      """ Account api""",
      this.prefix + """login"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_Account_signup6_route: Route.ParamsExtractor = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signup")))
  )
  private[this] lazy val controllers_Account_signup6_invoker = createInvoker(
    controllers.Account.signup(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Account",
      "signup",
      Seq(classOf[String], classOf[String]),
      "POST",
      """""",
      this.prefix + """signup"""
    )
  )

  // @LINE:19
  private[this] lazy val controllers_Account_logout7_route: Route.ParamsExtractor = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_Account_logout7_invoker = createInvoker(
    controllers.Account.logout(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Account",
      "logout",
      Nil,
      "POST",
      """""",
      this.prefix + """logout"""
    )
  )

  // @LINE:22
  private[this] lazy val controllers_Message_addMessage8_route: Route.ParamsExtractor = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addmessage")))
  )
  private[this] lazy val controllers_Message_addMessage8_invoker = createInvoker(
    controllers.Message.addMessage(fakeValue[String], fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Message",
      "addMessage",
      Seq(classOf[String], classOf[String], classOf[String]),
      "POST",
      """ Message api""",
      this.prefix + """addmessage"""
    )
  )

  // @LINE:23
  private[this] lazy val controllers_Message_getMessage9_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getmessage")))
  )
  private[this] lazy val controllers_Message_getMessage9_invoker = createInvoker(
    controllers.Message.getMessage(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Message",
      "getMessage",
      Nil,
      "GET",
      """""",
      this.prefix + """getmessage"""
    )
  )

  // @LINE:24
  private[this] lazy val controllers_Message_getHistory10_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("gethistory")))
  )
  private[this] lazy val controllers_Message_getHistory10_invoker = createInvoker(
    controllers.Message.getHistory(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Message",
      "getHistory",
      Nil,
      "GET",
      """""",
      this.prefix + """gethistory"""
    )
  )

  // @LINE:25
  private[this] lazy val controllers_Message_getNegativeMessage11_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getnegmessage")))
  )
  private[this] lazy val controllers_Message_getNegativeMessage11_invoker = createInvoker(
    controllers.Message.getNegativeMessage(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Message",
      "getNegativeMessage",
      Nil,
      "GET",
      """""",
      this.prefix + """getnegmessage"""
    )
  )

  // @LINE:26
  private[this] lazy val controllers_Message_deleteNegativeMessage12_route: Route.ParamsExtractor = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deletemessage")))
  )
  private[this] lazy val controllers_Message_deleteNegativeMessage12_invoker = createInvoker(
    controllers.Message.deleteNegativeMessage(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Message",
      "deleteNegativeMessage",
      Seq(classOf[String]),
      "POST",
      """""",
      this.prefix + """deletemessage"""
    )
  )

  // @LINE:29
  private[this] lazy val controllers_Audio_upload13_route: Route.ParamsExtractor = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("upload")))
  )
  private[this] lazy val controllers_Audio_upload13_invoker = createInvoker(
    controllers.Audio.upload(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Audio",
      "upload",
      Nil,
      "POST",
      """ Audio api""",
      this.prefix + """upload"""
    )
  )

  // @LINE:30
  private[this] lazy val controllers_Audio_getAudio14_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getaudio")))
  )
  private[this] lazy val controllers_Audio_getAudio14_invoker = createInvoker(
    controllers.Audio.getAudio(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Audio",
      "getAudio",
      Nil,
      "GET",
      """""",
      this.prefix + """getaudio"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params) =>
      call { 
        controllers_HomeController_index0_invoker.call(controllers.HomeController.index())
      }
  
    // @LINE:7
    case controllers_HomeController_main1_route(params) =>
      call { 
        controllers_HomeController_main1_invoker.call(controllers.HomeController.main())
      }
  
    // @LINE:8
    case controllers_HomeController_admin2_route(params) =>
      call { 
        controllers_HomeController_admin2_invoker.call(controllers.HomeController.admin())
      }
  
    // @LINE:11
    case controllers_HomeController_javascriptRoutes3_route(params) =>
      call { 
        controllers_HomeController_javascriptRoutes3_invoker.call(controllers.HomeController.javascriptRoutes())
      }
  
    // @LINE:14
    case controllers_Assets_versioned4_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned4_invoker.call(controllers.Assets.versioned(path, file))
      }
  
    // @LINE:17
    case controllers_Account_login5_route(params) =>
      call(params.fromQuery[String]("email", None), params.fromQuery[String]("password", None)) { (email, password) =>
        controllers_Account_login5_invoker.call(controllers.Account.login(email, password))
      }
  
    // @LINE:18
    case controllers_Account_signup6_route(params) =>
      call(params.fromQuery[String]("email", None), params.fromQuery[String]("password", None)) { (email, password) =>
        controllers_Account_signup6_invoker.call(controllers.Account.signup(email, password))
      }
  
    // @LINE:19
    case controllers_Account_logout7_route(params) =>
      call { 
        controllers_Account_logout7_invoker.call(controllers.Account.logout())
      }
  
    // @LINE:22
    case controllers_Message_addMessage8_route(params) =>
      call(params.fromQuery[String]("content", None), params.fromQuery[String]("lat", None), params.fromQuery[String]("lon", None)) { (content, lat, lon) =>
        controllers_Message_addMessage8_invoker.call(controllers.Message.addMessage(content, lat, lon))
      }
  
    // @LINE:23
    case controllers_Message_getMessage9_route(params) =>
      call { 
        controllers_Message_getMessage9_invoker.call(controllers.Message.getMessage())
      }
  
    // @LINE:24
    case controllers_Message_getHistory10_route(params) =>
      call { 
        controllers_Message_getHistory10_invoker.call(controllers.Message.getHistory())
      }
  
    // @LINE:25
    case controllers_Message_getNegativeMessage11_route(params) =>
      call { 
        controllers_Message_getNegativeMessage11_invoker.call(controllers.Message.getNegativeMessage())
      }
  
    // @LINE:26
    case controllers_Message_deleteNegativeMessage12_route(params) =>
      call(params.fromQuery[String]("post_id", None)) { (post_id) =>
        controllers_Message_deleteNegativeMessage12_invoker.call(controllers.Message.deleteNegativeMessage(post_id))
      }
  
    // @LINE:29
    case controllers_Audio_upload13_route(params) =>
      call { 
        controllers_Audio_upload13_invoker.call(controllers.Audio.upload())
      }
  
    // @LINE:30
    case controllers_Audio_getAudio14_route(params) =>
      call { 
        controllers_Audio_getAudio14_invoker.call(controllers.Audio.getAudio())
      }
  }
}