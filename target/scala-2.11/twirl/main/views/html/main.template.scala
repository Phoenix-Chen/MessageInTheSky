
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
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

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">

    <title>Message In The Sky</title>

    <!-- Bootstrap Core CSS -->
    <link href=""""),_display_(/*9.18*/routes/*9.24*/.Assets.versioned("stylesheets/bootstrap.min.css")),format.raw/*9.74*/("""" rel="stylesheet">

    <!-- Custom Css -->
    <link href=""""),_display_(/*12.18*/routes/*12.24*/.Assets.versioned("stylesheets/main.css")),format.raw/*12.65*/("""" rel="stylesheet">

    <!-- Javascript Routes -->
    <script type="text/javascript" src='"""),_display_(/*15.42*/routes/*15.48*/.HomeController.javascriptRoutes()),format.raw/*15.82*/("""'></script>
</head>
<body>
    <div class="container">
    <div id="earth_div"></div>
    """),_display_(/*20.6*/slidebar()),format.raw/*20.16*/("""
    """),format.raw/*21.5*/("""<!-- Start of Add Icon -->
    <div id="add-message-icon" data-toggle="modal" data-target="#addMessage"></div>
    <div class="modal fade" id="addMessage" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">

        <div class="panel panel-upload modal-dialog">
            <div class="panel-heading">
                <div class="row">
                    <div class="col-xs-6">
                        <a href="#" class="active" id="message-form-link">Text</a>
                    </div>
                    <div class="col-xs-6">
                        <a href="#" id="audio-form-link">Audio</a>
                    </div>
                </div>
                <hr>
            </div>
            <div class="panel-body">
                <div class="row">
                    <div class="col-lg-12">
                        <form id="message-form" action="" method="post" role="form" style="display: block;">
                            <div class="form-group">
                                <label for="addMessageTextarea">Send Your Wishes:</label>
                                <textarea class="form-control" id="addMessageTextarea" rows="5"></textarea>
                            </div>
                            <div class="form-group">
                                <div class="row">
                                    <div class="col-md-6 col-md-offset-3">
                                        <button id="addMessageBtn" type="button" class="btn btn-info col-md-4 col-md-offset-4">Send</button>
                                    </div>
                                </div>
                            </div>
                        </form>
                        <form id="audio-form" role="form" style="display: none;">
                            <div class="form-inline">
                                <div class="form-group">
                                    <input type="file" id="file" name="file"/>
                                </div>
                                <button type="submit" class="btn btn-sm btn-primary" id="js-upload-submit">Upload Audio</button>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- End of Add Icon-->

    </div>
    <!-- jQuery -->
    <script src=""""),_display_(/*70.19*/routes/*70.25*/.Assets.versioned("javascripts/jquery-3.1.0.min.js")),format.raw/*70.77*/(""""></script>

    <!-- Bootstrap Core JavaScript -->
    <script src=""""),_display_(/*73.19*/routes/*73.25*/.Assets.versioned("javascripts/bootstrap.min.js")),format.raw/*73.74*/(""""></script>

    <!-- Web GL Earth JavaScript -->
    <script src=""""),_display_(/*76.19*/routes/*76.25*/.Assets.versioned("javascripts/webglearth.js")),format.raw/*76.71*/(""""></script>

    <!-- Custom JavaScript -->
    <script src=""""),_display_(/*79.19*/routes/*79.25*/.Assets.versioned("javascripts/slidebar.js")),format.raw/*79.69*/(""""></script>
    <script src=""""),_display_(/*80.19*/routes/*80.25*/.Assets.versioned("javascripts/main.js")),format.raw/*80.65*/(""""></script>
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
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Tue May 30 04:21:18 PDT 2017
                  SOURCE: /Users/phoenixchen/Documents/websites/MessageInTheSky/app/views/main.scala.html
                  HASH: fe84aefe4dffeae342edb52832db7be5708d2907
                  MATRIX: 825->0|1007->156|1021->162|1091->212|1180->274|1195->280|1257->321|1377->414|1392->420|1447->454|1564->545|1595->555|1627->560|4009->2915|4024->2921|4097->2973|4194->3043|4209->3049|4279->3098|4374->3166|4389->3172|4456->3218|4545->3280|4560->3286|4625->3330|4682->3360|4697->3366|4758->3406
                  LINES: 32->1|40->9|40->9|40->9|43->12|43->12|43->12|46->15|46->15|46->15|51->20|51->20|52->21|101->70|101->70|101->70|104->73|104->73|104->73|107->76|107->76|107->76|110->79|110->79|110->79|111->80|111->80|111->80
                  -- GENERATED --
              */
          