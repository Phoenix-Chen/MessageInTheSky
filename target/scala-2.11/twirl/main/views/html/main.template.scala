
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
    <div class="add" id="add-message-icon" data-toggle="modal" data-target="#addMessage" style="display: block"></div>
    <div class=" add rotate" id="bubbleInterface" style="display: block; background: none; top: 5%; left: 32%; width: 700px; height: 700px;">
        <div class="add" style="top: 93%; left: 2%; display: block; background: none; border: 3px solid #3b9eeb; width: 120px; height: 120px;"></div>
        <div class="add" style="top: 0%; left: 80%; display: block; background: none; border: 1.4px solid #3b9eeb; width: 190px; height: 190px;"></div>
        <div class="add" style="top: 18%; left: 94%; display: block; background: none; border: 2px solid #3b9eeb; width: 134px; height: 134px;"></div>
        <div class="add" style="top: 55%; left: 100%; display: block; background: none; border: 0.5px solid #3b9eeb; width: 110px; height: 110px;"></div>
        <div class="add" style="top: 100%; left: 40%; display: block; background: none; border: 2px solid #3b9eeb; width: 110px; height: 110px;"></div>
        <div class="add" style="top: -1%; left: -17%; display: block; background: none; border: 1px solid #3b9eeb; width: 200px; height: 200px;"></div>
        <div class="add" style="top: 0%; left: -8%; display: block; background: none; border: 1px solid #3b9eeb; width: 110px; height: 110px;"></div>
        <div class="add" style="top: -10%; left: -1%; display: block; background: none; border: 3px solid #3b9eeb; width: 110px; height: 110px;"></div>
        <div class="add" style="top: -20%; left: 29%; display: block; background: none; border: 2px solid #3b9eeb; width: 144px; height: 144px;"></div>
        <div class="add" style="top: 50%; left: -20%; display: block; background: none; border: 1px solid #3b9eeb; width: 110px; height: 110px;"></div>
        <div class="add" style="top: 76%; left: -18%; display: block; background: none; border: 2px solid #3b9eeb; width: 188px; height: 188px;"></div>
        <div class="add" style="top: 15%; left: -14%; display: block; background: none; border: 2px solid #3b9eeb; width: 110px; height: 110px;"></div>
        <div class="add" style="top: 91%; left: 78%; display: block; background: none; border: 2px solid #3b9eeb; width: 175px; height: 175px;"></div>
        <div class="bubble" style="top: 15%; left: 50%; width: 110px; height: 110px;"></div>
    </div>
        <div class="bubble" style="top: 5%; left: 50%; width: 200px; height: 200px;"></div>
    <div class="modal fade" id="addMessage" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
        <div class="panel panel-upload modal-dialog" style = "left: 0%; top: 22%; background: none;">
            <div class="panel-heading" style="background: none;">
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
                                <textarea class="form-control" id="addMessageTextarea" rows="5" style="background: none; border: none; box-shadow: none;
                                    color: white; font-size: x-large;
                                    padding: inherit; border-radius: inherit;"></textarea>
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
                                    <input type="file" id="file" name="file" style="width: inherit; padding: inherit; font-size: 18px; box-shadow: none; padding: inherit;"/>
                                </div>
                                <button type="submit" class="btn btn-sm btn-primary" id="js-upload-submit">Upload Audio</button>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
        <!--<div class="add rotate" style="display: block; background: none; top: 5%; left: 32%; width: 700px; height: 700px;"></div>-->
    <!-- End of Add Icon-->

    </div>
    <!-- jQuery -->
    <script src=""""),_display_(/*89.19*/routes/*89.25*/.Assets.versioned("javascripts/jquery-3.1.0.min.js")),format.raw/*89.77*/(""""></script>

    <!-- Bootstrap Core JavaScript -->
    <script src=""""),_display_(/*92.19*/routes/*92.25*/.Assets.versioned("javascripts/bootstrap.min.js")),format.raw/*92.74*/(""""></script>

    <!-- Web GL Earth JavaScript -->
    <script src=""""),_display_(/*95.19*/routes/*95.25*/.Assets.versioned("javascripts/webglearth.js")),format.raw/*95.71*/(""""></script>

    <!-- Custom JavaScript -->
    <script src=""""),_display_(/*98.19*/routes/*98.25*/.Assets.versioned("javascripts/slidebar.js")),format.raw/*98.69*/(""""></script>
    <script src=""""),_display_(/*99.19*/routes/*99.25*/.Assets.versioned("javascripts/main.js")),format.raw/*99.65*/(""""></script>

    <!--<script src=""""),_display_(/*101.23*/routes/*101.29*/.Assets.versioned("javascripts/bubble.js")),format.raw/*101.71*/(""""></script>

    <script src=""""),_display_(/*103.19*/routes/*103.25*/.Assets.versioned("javascripts/sails.io.js")),format.raw/*103.69*/(""""></script>-->

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
                  DATE: Mon Jun 05 15:23:37 PDT 2017
                  SOURCE: /Users/Ishan/IdeaProjects/MessageInTheSky/app/views/main.scala.html
                  HASH: 7372cb6459ae9f4903b703d1b7e8186efd67f9e1
                  MATRIX: 825->0|1007->156|1021->162|1091->212|1180->274|1195->280|1257->321|1377->414|1392->420|1447->454|1564->545|1595->555|1627->560|6865->5771|6880->5777|6953->5829|7050->5899|7065->5905|7135->5954|7230->6022|7245->6028|7312->6074|7401->6136|7416->6142|7481->6186|7538->6216|7553->6222|7614->6262|7677->6297|7693->6303|7757->6345|7816->6376|7832->6382|7898->6426
                  LINES: 32->1|40->9|40->9|40->9|43->12|43->12|43->12|46->15|46->15|46->15|51->20|51->20|52->21|120->89|120->89|120->89|123->92|123->92|123->92|126->95|126->95|126->95|129->98|129->98|129->98|130->99|130->99|130->99|132->101|132->101|132->101|134->103|134->103|134->103
                  -- GENERATED --
              */
          