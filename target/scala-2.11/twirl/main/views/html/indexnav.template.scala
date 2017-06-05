
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object indexnav_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class indexnav extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html lang="en">
<head>
    <!-- Custom CSS -->
    <link href=""""),_display_(/*5.18*/routes/*5.24*/.Assets.versioned("stylesheets/indexnav.css")),format.raw/*5.69*/("""" rel="stylesheet">

</head>
<body>
    <nav class="navbar navbar-default navbar-fixed-top">
        <div class="container-fluid">
            <div class="navbar-header">
                <a class="navbar-brand">
                    Message In The Sky
                </a>
            </div>
            <div class="collapse navbar-collapse">
                <ul id="navbar-options" class="nav navbar-nav navbar-right">
                    <li><a data-toggle="modal" data-target="#loginModal"><span class="fa fa-grav" aria-hidden="true"></span> Login</a></li>
                </ul>
            </div><!-- /.navbar-collapse -->
        </div><!-- /.container-fluid -->
    </nav>


    <!-- Modal -->
    <div class="modal fade" id="loginModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
        <div class="modal-dialog modal-sm">
            <div class="modal-content">
                <div class="modal-header">
                    <!--button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button-->
                    <h4 class="modal-title">MITS</h4>
                </div>
                <div class="modal-body">
                    <h4>Login</h4>
                    <div class="form-group">
                        <div class="icon-addon addon-md">
                            <input type="text" placeholder="Email" class="form-control" id="loginEmail" />
                            <label for="loginEmail" class="glyphicon glyphicon-envelope" rel="tooltip" title="email"></label>
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="icon-addon addon-md">
                            <input type="password" placeholder="Password" class="form-control" id="loginPassword" />
                            <label for="loginPassword" class="glyphicon glyphicon-lock" rel="tooltip" title="password"></label>
                        </div>
                    </div>
                </div>
                <div class="modal-footer">
                    <p>Don't have an account? <a data-dismiss="modal" data-toggle="modal" data-target="#signupModal">Sign up</a> here.</p>
                    <button type="button" id="loginBtn" class="btn btn-primary">Login</button>
                </div>
            </div>
        </div>
    </div>

    <!-- Modal -->
    <div class="modal fade" id="signupModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
        <div class="modal-dialog modal-sm" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <!--button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button-->
                    <h4 class="modal-title">MITS</h4>
                </div>
                <div class="modal-body">
                    <h4>Sign Up</h4>
                    <div class="form-group">
                        <div class="icon-addon addon-md">
                            <input type="text" placeholder="Email" class="form-control" id="signupEmail" />
                            <label for="signupEmail" class="glyphicon glyphicon-envelope" rel="tooltip" title="email"></label>
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="icon-addon addon-md">
                            <input type="password" placeholder="Password" class="form-control" id="signupPassword" />
                            <label for="signupPassword" class="glyphicon glyphicon-lock" rel="tooltip" title="password"></label>
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="icon-addon addon-md">
                            <input type="password" placeholder="Re-enter" class="form-control" id="reenterPassword" />
                            <label for="reenterPassword" class="glyphicon glyphicon-lock" rel="tooltip" title="password"></label>
                        </div>
                    </div>
                </div>
                <div class="modal-footer">
                    <p>Already have an account? <a data-dismiss="modal" data-toggle="modal" data-target="#loginModal">Login</a> here.</p>
                    <button type="button" id="signupBtn" class="btn btn-primary">Sign Up</button>
                </div>
            </div>
        </div>
    </div>
</body>
</html>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object indexnav extends indexnav_Scope0.indexnav
              /*
                  -- GENERATED --
                  DATE: Sat Jun 03 11:24:59 PDT 2017
                  SOURCE: /Users/michelle/IdeaProjects/MessageInTheSky/app/views/indexnav.scala.html
                  HASH: 8071f513d555059f170dbf85d47be8c38ee3a300
                  MATRIX: 833->0|940->81|954->87|1019->132
                  LINES: 32->1|36->5|36->5|36->5
                  -- GENERATED --
              */
          