
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



    <!-- Javascript Routes -->
    <script type="text/javascript" src='"""),_display_(/*14.42*/routes/*14.48*/.HomeController.javascriptRoutes()),format.raw/*14.82*/("""'></script>
</head>
<body>
    <div class="container">
    <div id="earth_div"></div>
    """),_display_(/*19.6*/slidebar()),format.raw/*19.16*/("""
    """),format.raw/*20.5*/("""<!-- Start of Add Icon -->
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
    <script src=""""),_display_(/*69.19*/routes/*69.25*/.Assets.versioned("javascripts/jquery-3.1.0.min.js")),format.raw/*69.77*/(""""></script>

    <!-- Bootstrap Core JavaScript -->
    <script src=""""),_display_(/*72.19*/routes/*72.25*/.Assets.versioned("javascripts/bootstrap.min.js")),format.raw/*72.74*/(""""></script>

    <!-- Web GL Earth JavaScript -->
    <script src=""""),_display_(/*75.19*/routes/*75.25*/.Assets.versioned("javascripts/webglearth.js")),format.raw/*75.71*/(""""></script>

    <!-- Custom JavaScript -->
    <script src=""""),_display_(/*78.19*/routes/*78.25*/.Assets.versioned("javascripts/slidebar.js")),format.raw/*78.69*/(""""></script>
    <script src=""""),_display_(/*79.19*/routes/*79.25*/.Assets.versioned("javascripts/main.js")),format.raw/*79.65*/(""""></script>
    <!-- Custom Css -->
    <link href=""""),_display_(/*81.18*/routes/*81.24*/.Assets.versioned("stylesheets/main.css")),format.raw/*81.65*/("""" rel="stylesheet">
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
                  DATE: Mon Jun 05 10:35:06 PDT 2017
                  SOURCE: /Users/michelle/IdeaProjects/MessageInTheSky/app/views/main.scala.html
                  HASH: 60e0603edeb3f96d89bdb466ce11edc3109d4593
                  MATRIX: 825->0|1007->156|1021->162|1091->212|1213->307|1228->313|1283->347|1400->438|1431->448|1463->453|3845->2808|3860->2814|3933->2866|4030->2936|4045->2942|4115->2991|4210->3059|4225->3065|4292->3111|4381->3173|4396->3179|4461->3223|4518->3253|4533->3259|4594->3299|4674->3352|4689->3358|4751->3399
                  LINES: 32->1|40->9|40->9|40->9|45->14|45->14|45->14|50->19|50->19|51->20|100->69|100->69|100->69|103->72|103->72|103->72|106->75|106->75|106->75|109->78|109->78|109->78|110->79|110->79|110->79|112->81|112->81|112->81
                  -- GENERATED --
              */
          