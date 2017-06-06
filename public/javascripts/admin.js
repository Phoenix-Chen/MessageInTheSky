$(document).ready(function() {
    $('#logoutBtn').click(function(){logout();});
    setNegMessages();
});

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

function setNegMessages() {
    JsRoutes.controllers.Message.getNegativeMessage().ajax({
        success: function(data) {
                    if (data != null && data != '') {
                        var obj = JSON.parse(data);
                        var messages = obj.messages;

                        for (var i = 0; i < messages.length; i++) {
                            $('#message-container').append(makeRow(messages[i].content, messages[i].post_id));
                        }
                    } else {
                        alert("Sorry, data cannot be load...");
                    }
                }
    });
}

function makeRow(message, post_id) {
    return "<tr><td>" + message + "</td>" + makeDeleteBtn(post_id) + "</tr>";
}

function makeDeleteBtn(post_id) {
    return "<td><button class='btn btn-danger glyphicon glyphicon-remove row-remove' onclick='deletePost(" + post_id + ")'></button></td>";
}

function deletePost(post_id) {
    JsRoutes.controllers.Message.deleteNegativeMessage(post_id).ajax({
            success : function(data) {
                if (data == 'true') {
                    //alert("bye!");
                    location.reload();
                } else {
                    alert("Something weird happened...");
                }
            }
        });
}