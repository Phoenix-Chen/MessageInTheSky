var lat;
var lon;
var earth;

function getLocation() {
    if (navigator.geolocation) {
        navigator.geolocation.getCurrentPosition(updateLocation);
    } else {
        alert("Geolocation is not supported by this browser.");
    }
    //alert(lon);

}

function updateLocation(position) {
    lat = position.coords.latitude;
    // For some reason the javascript getLocation get a negative longitude
    lon = position.coords.longitude;
    //alert(lon);
    //    var loc = "lat: ";
    //    loc = loc.concat(lat.toString(), ",lon: ", lon.toString());
    //    console.log(loc);
    //earth.setView([lat, lon], 3);
}


$(document).ready(function() {
    getLocation();
    initEarth();
    $('#addMessageBtn').click(function() {
        addMessage();
    });

    //addMarker(38,121,'233333');
    //console.log(lon);
    $('#message-form-link').click(function(e) {
        $("#message-form").delay(100).fadeIn(100);
        $("#audio-form").fadeOut(100);
        $('#audio-form-link').removeClass('active');
        $(this).addClass('active');
        e.preventDefault();
    });
    $('#audio-form-link').click(function(e) {
        $("#audio-form").delay(100).fadeIn(100);
        $("#message-form").fadeOut(100);
        $('#message-form-link').removeClass('active');
        $(this).addClass('active');
        e.preventDefault();
    });

    $('#js-upload-submit').click(function(event) {
        event.preventDefault();
        if (lat == null || lon == null) {
            alert('Cannot get your location...')
            return;
        }
        var file = $('#file').get(0).files[0];
        var formData = new FormData();
        formData.append('file', file);
        formData.append('lat', lat);
        formData.append('lon', lon);
        $.ajax({
            url: 'upload',
            data: formData,
            type: 'POST',
            contentType: false,
            processData: false,
            beforeSend: function(data) {
                alert('Are you sure you want to upload document?');
            },
            success: function(data) {
                //call your jQuery action here
                alert('Upload completed: ' + data);
                location.reload();
            },
            error: function(jqXHR, textStatus, errorThrown) {
                alert(textStatus + ': ' + errorThrown);
            }
        });
        return false;
    });
    //    audiojs.events.ready(function() {
    //        var as = audiojs.createAll();
    //      });

    setMessages();
    setAudio();

});

var initEarth = function() {

    var options = {
        sky: true,
        atmosphere: true,
        dragging: true,
        tilting: true,
        zooming: true,
        //center: [46.8011, 8.2266],
        //zoom: 2
    };
    earth = new WE.map('earth_div', options);
    WE.tileLayer('http://data.webglearth.com/natural-earth-color/{z}/{x}/{y}.jpg', {
        tileSize: 256,
        bounds: [
            [-85, -180],
            [85, 180]
        ],
        minZoom: 0,
        maxZoom: 16,
        //attribution: 'WebGLEarth example',
        tms: true
    }).addTo(earth);
    WE.tileLayer('http://tile.stamen.com/toner/{z}/{x}/{y}.png', {
        opacity: 0.6
    }).addTo(earth);

    // Start a simple rotation animation
    var before = null;
    requestAnimationFrame(function animate(now) {
        var c = earth.getPosition();
        var elapsed = before ? now - before : 0;
        before = now;
        earth.setCenter([c[0], c[1] + 0.1 * (elapsed / 30)]);
        requestAnimationFrame(animate);
    });

    earth.setView([51.505, 0], 2);
    //setMessages();
    //console.log(lon);
}
//
var setMessages = function() {
    JsRoutes.controllers.Message.getMessage().ajax({
        success: function(data) {
            if (data != null && data != '') {
                var obj = JSON.parse(data);
                var messages = obj.messages;

                for (var i = 0; i < messages.length; i++) {
                    addMarker(parseFloat(messages[i].latitude), parseFloat(messages[i].longitude), messages[i].content);
                }
            } else {
                alert("Sorry, data cannot be load...");
            }
        }
    });
}

function addMarker(lon, lat, message) {
    //alert(typeof(lon));
    var marker = WE.marker([lat, lon], '/assets/images/custom_pin1.png', 25, 41).addTo(earth);
    marker.bindPopup("<b>Message In The Sky</b><br></br><span style='font-size:10px;color:#999'>" + message + "</span>", {
        maxWidth: 150,
        closeButton: true
    });
    //alert(message);
}


function addMessage() {
    var message = $('#addMessageTextarea').val();
    if (message == null || message == '') {
        alert('Please enter the message you want to send');
        return;
    }

    if (lat == null || lon == null) {
        alert('Cannot get your location...')
        return;
    }

    JsRoutes.controllers.Message.addMessage(message, lon, lat).ajax({
        success: function(data) {
            if (data == 'true') {
                //alert("Welcome!");
                location.reload();
            } else {
                alert("Sorry, your wish cannot be sent...");
            }
        }
    });
}

var setAudio = function() {
    JsRoutes.controllers.Audio.getAudio().ajax({
        success: function(data) {
            if (data != null && data != '') {
                var obj = JSON.parse(data);
                var audio = obj.audio;

                for (var i = 0; i < audio.length; i++) {
                    addAudioMarker(parseFloat(audio[i].latitude), parseFloat(audio[i].longitude), audio[i].audio);
                }
            } else {
                alert("Sorry, data cannot be load...");
            }
        }
    });
}

function addAudioMarker(lon, lat, audio) {
    var marker = WE.marker([lat, lon], '/assets/images/custom_pin2.png', 25, 41).addTo(earth);
    //marker.bindPopup("<audio src='http://localhost:9000/assets/sha1/" + audio +".mp3' preload='auto' />", {maxWidth: 150, closeButton: true});
    marker.bindPopup("<img src='/assets/images/favicon.png' id='play-" + audio + "'>", {
        maxWidth: 50,
        closeButton: true
    });
    $('#play-' + audio).click(function() {
        playAudio(audio);
    });
}

function playAudio(filename) {
    var audio = new Audio('/assets/sha1/' + filename + '.mp3');
    audio.play();
}
