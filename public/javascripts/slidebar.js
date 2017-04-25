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
            }else{
                alert("Something weird happened...");
            }
            location.reload();
        }
    });
}

$(document).ready(function(){
    $('#menu-icon').click(function(){openNav();});
    $('#close-icon').click(function(){closeNav();});
    $('#logoutBtn').click(function(){logout();});
});