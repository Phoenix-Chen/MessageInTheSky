
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/phoenixchen/Documents/websites/MessageInTheSky/conf/routes
// @DATE:Tue May 30 04:21:18 PDT 2017


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
