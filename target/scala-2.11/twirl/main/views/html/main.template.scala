
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
        """),_display_(/*20.10*/slidebar()),format.raw/*20.20*/("""
        """),format.raw/*21.9*/("""<!-- Start of Add Icon -->
        <div id="add-message-icon" data-toggle="modal" data-target="#addMessage"></div>
        <!--div class="modal fade" id="addMessage" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                        <h4 class="modal-title">Wish</h4>
                    </div>
                    <div class="modal-body">
                        <div class="form-group">
                            <label for="addMessageTextarea">Send Your Wishes:</label>
                            <textarea class="form-control" id="addMessageTextarea" rows="5"></textarea>
                        </div>
                    </div>
                    <div class="modal-footer">
                        <button id="addMessageBtn" type="button" class="btn btn-info">Send</button>
                    </div>
                </div>
            </div>
        </div-->
        <div class="modal fade" id="addMessage" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">

             <div class="panel panel-login modal-dialog">
                 <div class="panel-heading">
                     <div class="row">
                         <div class="col-xs-6">
                             <a href="#" class="active" id="login-form-link">Text</a>
                         </div>
                         <div class="col-xs-6">
                             <a href="#" id="register-form-link">Audio</a>
                         </div>
                     </div>
                     <hr>
                 </div>
                 <div class="panel-body">
                     <div class="row">
                         <div class="col-lg-12">
                             <form id="login-form" action="" method="post" role="form" style="display: block;">
                                 <div class="form-group">
                                     <label for="addMessageTextarea">Send Your Wishes:</label>
                                     <textarea class="form-control" id="addMessageTextarea" rows="5"></textarea>
                                 </div>
                                 <div class="form-group">
                                     <div class="row">
                                         <div class="col-sm-6 col-sm-offset-3">
                                             <button id="addMessageBtn" type="button" class="btn btn-info">Send</button>
                                         </div>
                                     </div>
                                 </div>
                             </form>
                             <form id="register-form" role="form" style="display: none;">
                                 <div class="form-inline">
                                     <div class="form-group">
                                         <input type="file" id="file" name="file" />
                                     </div>
                                     <input type="submit" class="btn btn-sm btn-primary" id="js-upload-submit">Upload files</input>
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
    <script src=""""),_display_(/*89.19*/routes/*89.25*/.Assets.versioned("javascripts/jquery-3.1.0.min.js")),format.raw/*89.77*/(""""></script>

    <!-- Bootstrap Core JavaScript -->
    <script src=""""),_display_(/*92.19*/routes/*92.25*/.Assets.versioned("javascripts/bootstrap.min.js")),format.raw/*92.74*/(""""></script>
    
    <!-- React.JS Core JavaScript>
    <script src=""""),_display_(/*95.19*/routes/*95.25*/.Assets.versioned("javascripts/react.min.js")),format.raw/*95.70*/(""""></script>
    <script src=""""),_display_(/*96.19*/routes/*96.25*/.Assets.versioned("javascripts/react-dom.min.js")),format.raw/*96.74*/(""""></script>
    <script src=""""),_display_(/*97.19*/routes/*97.25*/.Assets.versioned("javascripts/react-with-addons.min.js")),format.raw/*97.82*/(""""></script-->

    <!-- Web GL Earth JavaScript -->
    <script src=""""),_display_(/*100.19*/routes/*100.25*/.Assets.versioned("javascripts/webglearth.js")),format.raw/*100.71*/(""""></script>

    <!-- Custom JavaScript -->
    <script src=""""),_display_(/*103.19*/routes/*103.25*/.Assets.versioned("javascripts/slidebar.js")),format.raw/*103.69*/(""""></script>
    <script src=""""),_display_(/*104.19*/routes/*104.25*/.Assets.versioned("javascripts/main.js")),format.raw/*104.65*/(""""></script>
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
                  DATE: Tue Apr 25 11:24:14 PDT 2017
                  SOURCE: /Users/phoenixchen/Documents/websites/MessageInTheSky/app/views/main.scala.html
                  HASH: 0953d82077d1e6b70c2223a71611ece83c1f3e3d
                  MATRIX: 825->0|1007->156|1021->162|1091->212|1184->278|1199->284|1261->325|1381->418|1396->424|1451->458|1577->557|1608->567|1644->576|5269->4174|5284->4180|5357->4232|5454->4302|5469->4308|5539->4357|5636->4427|5651->4433|5717->4478|5774->4508|5789->4514|5859->4563|5916->4593|5931->4599|6009->4656|6107->4726|6123->4732|6191->4778|6281->4840|6297->4846|6363->4890|6421->4920|6437->4926|6499->4966
                  LINES: 32->1|40->9|40->9|40->9|43->12|43->12|43->12|46->15|46->15|46->15|51->20|51->20|52->21|120->89|120->89|120->89|123->92|123->92|123->92|126->95|126->95|126->95|127->96|127->96|127->96|128->97|128->97|128->97|131->100|131->100|131->100|134->103|134->103|134->103|135->104|135->104|135->104
                  -- GENERATED --
              */
          