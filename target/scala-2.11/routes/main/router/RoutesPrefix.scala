
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/York/GitHub/Play-Starter/conf/routes
// @DATE:Fri May 26 01:22:04 CST 2017


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
