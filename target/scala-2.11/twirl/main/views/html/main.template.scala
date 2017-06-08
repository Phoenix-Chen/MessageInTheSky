
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
    <div id="bubbleInterface">

        <div class="cancel" id="bubbleCancelButton"></div>

        <div class=" add rotate fade in" id="rotatingBubble" style="display: block; background: none; top: 14%; left: 32%; width: 700px; height: 700px;">
            <div class="bubble" style="top: 25%; left: 50%; width: 110px; height: 110px;"></div>
        </div>
        <div class="add customBackground" style="top: 50%; left: 18%; display: block; border: 3px solid #3b9eeb; width: 120px; height: 120px;"></div>
        <div class="add customBackground" style="top: 45%; left: 67%; display: block; border: 1.4px solid #3b9eeb; width: 190px; height: 190px;"></div>
        <div class="add customBackground" style="top: 20%; left: 66%; display: block; border: 2px solid #3b9eeb; width: 134px; height: 134px;"></div>
        <div class="add customBackground" style="top: 30%; left: 71%; display: block; border: 0.5px solid #3b9eeb; width: 110px; height: 110px;"></div>
        <div class="add customBackground" style="top: 65%; left: 30%; display: block; border: 2px solid #3b9eeb; width: 110px; height: 110px;"></div>
        <div class="add customBackground" style="top: 34%; left: 22%; display: block; border: 1px solid #3b9eeb; width: 200px; height: 200px;"></div>
        <div class="add customBackground" style="top: 24%; left: 28%; display: block; border: 1px solid #3b9eeb; width: 110px; height: 110px;"></div>
        <div class="add customBackground" style="top: 58%; left: 25%; display: block; border: 3px solid #3b9eeb; width: 110px; height: 110px;"></div>
        <div class="add customBackground" style="top: 73%; left: 33%; display: block; border: 2px solid #3b9eeb; width: 144px; height: 144px;"></div>
        <div class="add bubble customBackground" style="top: 78%; left: 26%; display: block; border: 1px solid #3b9eeb; width: 110px; height: 110px;"></div>
        <div class="add customBackground" style="top: 61%; left: 63%; display: block; border: 2px solid #3b9eeb; width: 188px; height: 188px;"></div>
        <div class="add customBackground" style="top: 41%; left: 69%; display: block; border: 2px solid #3b9eeb; width: 110px; height: 110px;"></div>
        <div class="add customBackground" style="top: 71%; left: 56%; display: block; border: 2px solid #3b9eeb; width: 175px; height: 175px;"></div>
        <div class="bubble" style="top: 15%; left: 50%; width: 110px; height: 110px;"></div>

        <div class="modal" id="addMessage" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
            <div class="panel panel-upload modal-dialog" id="addMessageDialog" style = "left: 0%; top: 22%; background: none;">
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
    </div>
        <!--<div class="add rotate" style="display: block; background: none; top: 5%; left: 32%; width: 700px; height: 700px;"></div>-->
    <!-- End of Add Icon-->

    </div>
    <!-- jQuery -->
    <script src=""""),_display_(/*95.19*/routes/*95.25*/.Assets.versioned("javascripts/jquery-3.1.0.min.js")),format.raw/*95.77*/(""""></script>

    <!-- Bootstrap Core JavaScript-->
    <script src=""""),_display_(/*98.19*/routes/*98.25*/.Assets.versioned("javascripts/bootstrap.min.js")),format.raw/*98.74*/(""""></script>

    <!-- Web GL Earth JavaScript -->
    <script src=""""),_display_(/*101.19*/routes/*101.25*/.Assets.versioned("javascripts/webglearth.js")),format.raw/*101.71*/(""""></script>

    <!-- Custom JavaScript -->
    <script src=""""),_display_(/*104.19*/routes/*104.25*/.Assets.versioned("javascripts/slidebar.js")),format.raw/*104.69*/(""""></script>
    <script src=""""),_display_(/*105.19*/routes/*105.25*/.Assets.versioned("javascripts/main.js")),format.raw/*105.65*/(""""></script>

    <!--<script src=""""),_display_(/*107.23*/routes/*107.29*/.Assets.versioned("javascripts/bubble.js")),format.raw/*107.71*/(""""></script>

    <script src=""""),_display_(/*109.19*/routes/*109.25*/.Assets.versioned("javascripts/sails.io.js")),format.raw/*109.69*/(""""></script>-->

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
                  DATE: Wed Jun 07 20:33:21 PDT 2017
                  SOURCE: /Users/Ishan/IdeaProjects/MessageInTheSky/app/views/main.scala.html
                  HASH: 1208638f4e1ae1063465fa5755a4a0b85970b42c
                  MATRIX: 825->0|1007->156|1021->162|1091->212|1180->274|1195->280|1257->321|1377->414|1392->420|1447->454|1564->545|1595->555|1627->560|7172->6078|7187->6084|7260->6136|7356->6205|7371->6211|7441->6260|7537->6328|7553->6334|7621->6380|7711->6442|7727->6448|7793->6492|7851->6522|7867->6528|7929->6568|7992->6603|8008->6609|8072->6651|8131->6682|8147->6688|8213->6732
                  LINES: 32->1|40->9|40->9|40->9|43->12|43->12|43->12|46->15|46->15|46->15|51->20|51->20|52->21|126->95|126->95|126->95|129->98|129->98|129->98|132->101|132->101|132->101|135->104|135->104|135->104|136->105|136->105|136->105|138->107|138->107|138->107|140->109|140->109|140->109
                  -- GENERATED --
              */
          