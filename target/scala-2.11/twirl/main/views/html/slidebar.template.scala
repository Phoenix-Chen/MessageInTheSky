
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object slidebar_Scope0 {
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

class slidebar extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html lang="en">
<head>
    <!-- Custom CSS -->
    <link href=""""),_display_(/*5.18*/routes/*5.24*/.Assets.versioned("stylesheets/slidebar.css")),format.raw/*5.69*/("""" rel="stylesheet">
</head>

<body>
    <ul class="nav nav-tabs navbar-right">
        <li id="menu-icon" class="menu-icon"></li>
    </ul>
    <div id="mySidenav" class="sidenav">
        <a href="javascript:void(0)" class="closebtn" id="close-icon">&times;</a>
        <a>
            <div class="profile-frame row">
                <div id="profile-pic"></div>
            </div>
        </a>
        <a id="my-message-btn" data-toggle="modal" data-target="#myMessage">My Messages</a>
        <a id="logoutBtn">Log Out</a>
    </div>
    <!-- Modal -->
    <div class="modal fade" id="myMessage" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
      <div class="modal-dialog" role="document">
        <div class="modal-content">
          <div class="modal-header">
            <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
            <h4 class="modal-title" id="myModalLabel">My Messages</h4>
          </div>
          <div class="modal-body" id="myMessageBody">
              <div class="row">
                  <div class="col-lg-12">
                      <ul class="timeline" id="timeline">
                      </ul>
                  </div>
              </div>
          </div>
          <!--div class="modal-footer">
            <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
            <button type="button" class="btn btn-primary">Save changes</button>
          </div-->
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
object slidebar extends slidebar_Scope0.slidebar
              /*
                  -- GENERATED --
                  DATE: Tue May 30 04:21:18 PDT 2017
                  SOURCE: /Users/phoenixchen/Documents/websites/MessageInTheSky/app/views/slidebar.scala.html
                  HASH: b991766369bc0c9359d28684c4d9f0ed33568503
                  MATRIX: 833->0|940->81|954->87|1019->132
                  LINES: 32->1|36->5|36->5|36->5
                  -- GENERATED --
              */
          