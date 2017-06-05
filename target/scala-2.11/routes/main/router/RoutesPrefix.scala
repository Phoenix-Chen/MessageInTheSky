
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/michelle/IdeaProjects/MessageInTheSky/conf/routes
// @DATE:Sat Jun 03 11:24:58 PDT 2017


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
