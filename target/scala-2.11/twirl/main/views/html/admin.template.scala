
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object admin_Scope0 {
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

class admin extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

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
    <link href=""""),_display_(/*8.18*/routes/*8.24*/.Assets.versioned("stylesheets/bootstrap.min.css")),format.raw/*8.74*/("""" rel="stylesheet">

    <!-- Custom CSS -->
    <link href=""""),_display_(/*11.18*/routes/*11.24*/.Assets.versioned("stylesheets/admin.css")),format.raw/*11.66*/("""" rel="stylesheet">

    <!-- Javascript Routes -->
    <script type="text/javascript" src='"""),_display_(/*14.42*/routes/*14.48*/.HomeController.javascriptRoutes()),format.raw/*14.82*/("""'></script>
</head>
<body>

    <nav class="navbar navbar-default navbar-fixed-top navbar-inverse">
        <div class="container-fluid">
            <div class="navbar-header">
                <a class="navbar-brand">
                    MITS Admin
                </a>
            </div>
            <div class="collapse navbar-collapse">
                <ul id="navbar-options" class="nav navbar-nav navbar-right">
                    <li><a id="logoutBtn"> Logout </a></li>
                </ul>
            </div><!-- /.navbar-collapse -->
        </div><!-- /.container-fluid -->
    </nav>

    <div class="container">
        <div class="row clearfix">
            <div class="col-md-12 table-responsive">
                <table class="table table-bordered table-hover table-sortable">
                    <thead>
                        <tr >
                            <th class="text-center">
                                Message
                            </th>
                            <th class="text-center" style="border-top: 1px solid #ffffff; border-right: 1px solid #ffffff;">
                            </th>
                        </tr>
                    </thead>
                    <tbody id="message-container">

                    </tbody>
                </table>
            </div>
        </div>
    </div>
    <!-- jQuery -->
    <script src=""""),_display_(/*54.19*/routes/*54.25*/.Assets.versioned("javascripts/jquery-3.1.0.min.js")),format.raw/*54.77*/(""""></script>

    <!-- Bootstrap Core JavaScript -->
    <script src=""""),_display_(/*57.19*/routes/*57.25*/.Assets.versioned("javascripts/bootstrap.min.js")),format.raw/*57.74*/(""""></script>

    <!-- Custom JavaScript -->
    <script src=""""),_display_(/*60.19*/routes/*60.25*/.Assets.versioned("javascripts/admin.js")),format.raw/*60.66*/(""""></script>
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
object admin extends admin_Scope0.admin
              /*
                  -- GENERATED --
                  DATE: Tue May 30 19:41:16 PDT 2017
                  SOURCE: /Users/phoenixchen/Documents/websites/MessageInTheSky/app/views/admin.scala.html
                  HASH: 6405d590b422f909074cae7a7e7f550fc600f689
                  MATRIX: 827->0|1008->155|1022->161|1092->211|1181->273|1196->279|1259->321|1379->414|1394->420|1449->454|2862->1840|2877->1846|2950->1898|3047->1968|3062->1974|3132->2023|3221->2085|3236->2091|3298->2132
                  LINES: 32->1|39->8|39->8|39->8|42->11|42->11|42->11|45->14|45->14|45->14|85->54|85->54|85->54|88->57|88->57|88->57|91->60|91->60|91->60
                  -- GENERATED --
              */
          