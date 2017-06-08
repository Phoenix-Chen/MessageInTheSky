$(document).ready(function() {
    $('#signupBtn').click(function(){$('#bubbleInterface').hide(); signup();});
    $('#loginBtn').click(function(){$('#bubbleInterface').hide(); login();});
});

function login() {
    email = $('#loginEmail').val();
    if (!emailValid(email)) {
        alert("Please input a valid email address");
        return;
    }

    password = $('#loginPassword').val();

    JsRoutes.controllers.Account.login(email, password).ajax({
        success : function(data) {
            if (data == 'true') {
                //alert("Welcome!");
                location.reload();
            }else{
                alert("Incorrect Email or Password.");
            }
        }
    });
}

function signup() {
    email = $('#signupEmail').val();
    if (!emailValid(email)) {
        alert("Please input a valid email address");
        return;
    }

    password = $('#signupPassword').val();
    /*if (!passwordValid(password)){
        return;
    }*/


    reenter = $('#reenterPassword').val();
    if (!passwordValid(password, reenter)){
        return;
    }

    /*if (password != reenter) {
        alert("Passwords do not match.");
        return;
    }*/

    JsRoutes.controllers.Account.signup(email, password).ajax({
        success : function(data) {
            if (data == 'true') {
                //alert("Welcome!");
                location.reload();
            }else{
                alert("Email already exists...");
            }
        }
    });

}

function emailValid(email) {
    var filter = /^([\w-]+(?:\.[\w-]+)*)@((?:[\w-]+\.)*\w[\w-]{0,66})\.([a-z]{2,6}(?:\.[a-z]{2})?)$/i;
    if (filter.test(email)) {
        return true;
    }
    return false;
}

/**
 * This function checks if the password is in a valid format by checking if
 * it contains at least a number, a lowercase character, an uppercase character,
 * a special character and by checking if the re-entered password matches the
 * originally entered password.
 * @param password; the original password
 * @param reenter; the re-entered password
 * @returns {boolean}; returns either true or false
 */
function passwordValid(password, reenter){
    var val = /(?=.*[0-9])/;
    if (!val.test(password)){
        alert("Password must contain a number.");
        return false;
    }

    val = /(?=.*[a-z])/;
    if (!val.test(password)){
        alert("Password must contain a lowercase character [a-z].");
        return false;
    }

    val = /(?=.*[A-Z])/;
    if (!val.test(password)){
        alert("Password must contain an uppercase character [A-Z].");
        return false;
    }

    val = /(?=.*[@#$%^&*<>])/;
    if (!val.test(password)){
        alert("Password must contain a special character from @#$%^&*<>.");
        return false;
    }

    if (password.valueOf().length < 8){
        alert("Password cannot be less than 8 characters.");
        return false;
    }

    else{

        if (password != reenter){
            alert("Passwords do not match!");
            return false;
        }
        else {
            return true;
        }
    }

}