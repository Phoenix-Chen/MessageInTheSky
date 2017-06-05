
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/michelle/IdeaProjects/MessageInTheSky/conf/routes
// @DATE:Sat Jun 03 11:24:58 PDT 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_1: controllers.HomeController,
  // @LINE:13
  Assets_4: controllers.Assets,
  // @LINE:16
  Account_2: controllers.Account,
  // @LINE:21
  Message_0: controllers.Message,
  // @LINE:26
  Audio_3: controllers.Audio,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_1: controllers.HomeController,
    // @LINE:13
    Assets_4: controllers.Assets,
    // @LINE:16
    Account_2: controllers.Account,
    // @LINE:21
    Message_0: controllers.Message,
    // @LINE:26
    Audio_3: controllers.Audio
  ) = this(errorHandler, HomeController_1, Assets_4, Account_2, Message_0, Audio_3, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_1, Assets_4, Account_2, Message_0, Audio_3, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """index""", """controllers.HomeController.index()"""),
    ("""GET""", this.prefix, """controllers.HomeController.main()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """javascriptRoutes""", """controllers.HomeController.javascriptRoutes()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.Account.login(email:String, password:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signup""", """controllers.Account.signup(email:String, password:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """controllers.Account.logout()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addmessage""", """controllers.Message.addMessage(content:String, lat:String, lon:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getmessage""", """controllers.Message.getMessage()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """gethistory""", """controllers.Message.getHistory()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """upload""", """controllers.Audio.upload()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getaudio""", """controllers.Audio.getAudio()"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("index")))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_1.index(),
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
  private[this] lazy val controllers_HomeController_main1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_main1_invoker = createInvoker(
    HomeController_1.main(),
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

  // @LINE:10
  private[this] lazy val controllers_HomeController_javascriptRoutes2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("javascriptRoutes")))
  )
  private[this] lazy val controllers_HomeController_javascriptRoutes2_invoker = createInvoker(
    HomeController_1.javascriptRoutes(),
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

  // @LINE:13
  private[this] lazy val controllers_Assets_versioned3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned3_invoker = createInvoker(
    Assets_4.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_Account_login4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_Account_login4_invoker = createInvoker(
    Account_2.login(fakeValue[String], fakeValue[String]),
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

  // @LINE:17
  private[this] lazy val controllers_Account_signup5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signup")))
  )
  private[this] lazy val controllers_Account_signup5_invoker = createInvoker(
    Account_2.signup(fakeValue[String], fakeValue[String]),
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

  // @LINE:18
  private[this] lazy val controllers_Account_logout6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_Account_logout6_invoker = createInvoker(
    Account_2.logout(),
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

  // @LINE:21
  private[this] lazy val controllers_Message_addMessage7_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addmessage")))
  )
  private[this] lazy val controllers_Message_addMessage7_invoker = createInvoker(
    Message_0.addMessage(fakeValue[String], fakeValue[String], fakeValue[String]),
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

  // @LINE:22
  private[this] lazy val controllers_Message_getMessage8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getmessage")))
  )
  private[this] lazy val controllers_Message_getMessage8_invoker = createInvoker(
    Message_0.getMessage(),
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

  // @LINE:23
  private[this] lazy val controllers_Message_getHistory9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("gethistory")))
  )
  private[this] lazy val controllers_Message_getHistory9_invoker = createInvoker(
    Message_0.getHistory(),
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

  // @LINE:26
  private[this] lazy val controllers_Audio_upload10_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("upload")))
  )
  private[this] lazy val controllers_Audio_upload10_invoker = createInvoker(
    Audio_3.upload(),
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

  // @LINE:27
  private[this] lazy val controllers_Audio_getAudio11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getaudio")))
  )
  private[this] lazy val controllers_Audio_getAudio11_invoker = createInvoker(
    Audio_3.getAudio(),
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
        controllers_HomeController_index0_invoker.call(HomeController_1.index())
      }
  
    // @LINE:7
    case controllers_HomeController_main1_route(params) =>
      call { 
        controllers_HomeController_main1_invoker.call(HomeController_1.main())
      }
  
    // @LINE:10
    case controllers_HomeController_javascriptRoutes2_route(params) =>
      call { 
        controllers_HomeController_javascriptRoutes2_invoker.call(HomeController_1.javascriptRoutes())
      }
  
    // @LINE:13
    case controllers_Assets_versioned3_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned3_invoker.call(Assets_4.versioned(path, file))
      }
  
    // @LINE:16
    case controllers_Account_login4_route(params) =>
      call(params.fromQuery[String]("email", None), params.fromQuery[String]("password", None)) { (email, password) =>
        controllers_Account_login4_invoker.call(Account_2.login(email, password))
      }
  
    // @LINE:17
    case controllers_Account_signup5_route(params) =>
      call(params.fromQuery[String]("email", None), params.fromQuery[String]("password", None)) { (email, password) =>
        controllers_Account_signup5_invoker.call(Account_2.signup(email, password))
      }
  
    // @LINE:18
    case controllers_Account_logout6_route(params) =>
      call { 
        controllers_Account_logout6_invoker.call(Account_2.logout())
      }
  
    // @LINE:21
    case controllers_Message_addMessage7_route(params) =>
      call(params.fromQuery[String]("content", None), params.fromQuery[String]("lat", None), params.fromQuery[String]("lon", None)) { (content, lat, lon) =>
        controllers_Message_addMessage7_invoker.call(Message_0.addMessage(content, lat, lon))
      }
  
    // @LINE:22
    case controllers_Message_getMessage8_route(params) =>
      call { 
        controllers_Message_getMessage8_invoker.call(Message_0.getMessage())
      }
  
    // @LINE:23
    case controllers_Message_getHistory9_route(params) =>
      call { 
        controllers_Message_getHistory9_invoker.call(Message_0.getHistory())
      }
  
    // @LINE:26
    case controllers_Audio_upload10_route(params) =>
      call { 
        controllers_Audio_upload10_invoker.call(Audio_3.upload())
      }
  
    // @LINE:27
    case controllers_Audio_getAudio11_route(params) =>
      call { 
        controllers_Audio_getAudio11_invoker.call(Audio_3.getAudio())
      }
  }
}
