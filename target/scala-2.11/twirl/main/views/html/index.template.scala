
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
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

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

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
        <link href=""""),_display_(/*8.22*/routes/*8.28*/.Assets.versioned("stylesheets/bootstrap.min.css")),format.raw/*8.78*/("""" rel="stylesheet">

        <!-- Custom CSS -->
        <link href=""""),_display_(/*11.22*/routes/*11.28*/.Assets.versioned("stylesheets/index.css")),format.raw/*11.70*/("""" rel="stylesheet">

        <!-- Javascript Routes -->
        <script type="text/javascript" src='"""),_display_(/*14.46*/routes/*14.52*/.HomeController.javascriptRoutes()),format.raw/*14.86*/("""'></script>
    </head>
    <body>

            """),_display_(/*18.14*/indexnav()),format.raw/*18.24*/("""

            """),format.raw/*20.13*/("""<div class="parallax">
                <div class="parallax-section">
                    <div class="parallax-layer parallax-layer-base">
                        <div class="container">
                            <div class="vertical-center">
                                <h1>Message In The Sky</h1>
                                <h3>Launch your message to the galaxy.</h3>
                                <button type="button" class="btn" data-toggle="modal" data-target="#signupModal">Join Now</button>
                            </div>
                        </div>
                    </div>
                    <div class="parallax-layer parallax-layer-back"></div>
                </div>
                <div class="content">
                    <div class="container">
                        <div class="infobox-1">
                            <h3>What is Message In The Sky?</h3>
                            <p>Message in the Sky is a public participatory media art project proposed by Professor Jiayi Young.  The project aims to collect people’s hopes and dreams then symbolically send them into the sky (galaxy).</p>
                        </div>
                        <div class="infobox-2 row">
                            <div class="infobox-2-left col-md-6">
                                <h3>Send your blessing up high</h3>
                                <p>Message in the Sky is a public participatory media art project proposed by Professor Jiayi Young.  The project aims to collect people’s hopes and dreams then symbolically send them into the sky (galaxy).</p>
                            </div><div class="infobox-2-right col-md-6">
                            <h3>Feel the love</h3>
                            <p>Message in the Sky is a public participatory media art project proposed by Professor Jiayi Young.  The project aims to collect people’s hopes and dreams then symbolically send them into the sky (galaxy).</p>
                        </div>
                        </div>
                    </div>
                </div>
            </div>

        <!-- jQuery -->
        <script src=""""),_display_(/*53.23*/routes/*53.29*/.Assets.versioned("javascripts/jquery-3.1.0.min.js")),format.raw/*53.81*/(""""></script>

        <!-- Bootstrap Core JavaScript -->
        <script src=""""),_display_(/*56.23*/routes/*56.29*/.Assets.versioned("javascripts/bootstrap.min.js")),format.raw/*56.78*/(""""></script>

        <!-- Custom JavaScript -->
        <script src=""""),_display_(/*59.23*/routes/*59.29*/.Assets.versioned("javascripts/indexnav.js")),format.raw/*59.73*/(""""></script>
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
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Sat Jun 03 11:24:59 PDT 2017
                  SOURCE: /Users/michelle/IdeaProjects/MessageInTheSky/app/views/index.scala.html
                  HASH: f219ef6c5d78aaa7e4b83af164a7d400ec9b5e53
                  MATRIX: 827->0|1028->175|1042->181|1112->231|1209->301|1224->307|1287->349|1415->450|1430->456|1485->490|1561->539|1592->549|1634->563|3799->2701|3814->2707|3887->2759|3992->2837|4007->2843|4077->2892|4174->2962|4189->2968|4254->3012
                  LINES: 32->1|39->8|39->8|39->8|42->11|42->11|42->11|45->14|45->14|45->14|49->18|49->18|51->20|84->53|84->53|84->53|87->56|87->56|87->56|90->59|90->59|90->59
                  -- GENERATED --
              */
          