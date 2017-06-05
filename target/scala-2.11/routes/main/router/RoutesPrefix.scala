
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/Ishan/IdeaProjects/MessageInTheSky/conf/routes
// @DATE:Mon May 22 19:13:40 PDT 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
