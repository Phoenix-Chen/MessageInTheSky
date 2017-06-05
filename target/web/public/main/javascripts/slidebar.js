/* Set the width of the side navigation to 250px */
function openNav() {
    document.getElementById("mySidenav").style.width = "250px";
}

/* Set the width of the side navigation to 0 */
function closeNav() {
    document.getElementById("mySidenav").style.width = "0";
}

function logout() {
    JsRoutes.controllers.Account.logout().ajax({
        success : function(data) {
            if (data == 'true') {
                //alert("bye!");
            } else {
                alert("Something weird happened...");
            }
            location.reload();
        }
    });
}

function setHistory() {
    JsRoutes.controllers.Message.getHistory().ajax({
            success : function(data) {
                 if (data != null && data != '') {
                    var obj = JSON.parse(data);
                    var history = obj.history;

                    for (var i = 0; i < history.length; i++) {
                        var li = '<li><div class="timeline-image"><div class="timeline-image-inner center-block">';
                        if (history[i].type == 'text') {
                            li += history[i].content;
                        } else {
                            li += "<img height='100%'  src='/assets/images/white-play.png' id='history-" + history[i].audio + "'>";
                            $(document).on('click','#history-' + history[i].audio,function() {
                                var audio_id = this.id;
                                playAudio(audio_id.substring(8,audio_id.length));
                            });
                        }
                        li += '</div></div>';
                        if (i != history.length-1) {
                            li += '<div class="line"></div>';
                        }
                        li += '</li>';
                        $('#timeline').append(li);
                    }
                 } else {
                    //alert("Sorry, data cannot be load...");
                 }
            }
        });

}


$(document).ready(function(){
    $('#menu-icon').click(function(){openNav();});
    $('#close-icon').click(function(){closeNav();});
    $('#logoutBtn').click(function(){logout();});

    setHistory();
});