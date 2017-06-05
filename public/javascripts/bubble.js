var bubbleArray = [];
var min_bubble_count = 200, // Minimum number of bubbles
    max_bubble_count = 250, // Maximum number of bubbles
    min_bubble_size = 2, // Smallest possible bubble diameter (px)
    max_bubble_size = 30; // Largest possible bubble diameter (px)
function bubbles() {
  // Settings

  
  $.ajax({
    type: 'get',
    url: '/message'
  })
  .done(function(response) {
    //console.log(response);
    callback(response);
  });


  var callback = function(response){


    
    // Calculate a random number of bubbles based on our min/max
    //var bubbleCount = min_bubble_count + Math.floor(Math.random() * (max_bubble_count + 1));
    var bubbleCount = 0;
    // Create the bubbles

    for (var i=0,j=response.length; i<j; i++) {
      console.log(response[i].message);
      if(response[i].message!="I Did This" && response[i].message!="" && response[i].message!=null){
        $bubbles.append('<div class="bubble" data-key="'+response[i].key+'" data-id="'+response[i].id+'" data-message="'+response[i].message+'"></div>');
        bubbleCount++;
      }
      bubbleArray[response[i].key] = response[i].message;
    }
    
    // Now randomise the various bubble elements
    $bubbles.find('.bubble').each(function(){
      
      // Randomise the bubble positions (0 - 100%)
      var pos_rand = Math.floor(Math.random() * 90);
      var pos_rand_y = Math.floor(Math.random() * 71)+15;
      
      // Randomise their size
      var size_rand = min_bubble_size + Math.floor(Math.random() * (max_bubble_size + 1));
      
      // Randomise the time they start rising (0-15s)
      var delay_rand = Math.floor(Math.random() * 10);
      
      // Randomise their speed (3-8s)
      var speed_rand = 8 + Math.floor(Math.random() * 9);
      
      // Cache the this selector
      var $this = $(this);
      
      // Apply the new styles
      $this.css({
        'left' : pos_rand + '%',
        'bottom' : pos_rand_y + '%',
        
        '-webkit-animation-duration' : speed_rand + 's',
        '-moz-animation-duration' : speed_rand + 's',
        '-ms-animation-duration' : speed_rand + 's',
        'animation-duration' : speed_rand + 's',
        
        '-webkit-animation-delay' : delay_rand + 's',
        '-moz-animation-delay' : delay_rand + 's',
        '-ms-animation-delay' : delay_rand + 's',
        'animation-delay' : delay_rand + 's',

        'width' : size_rand + 'px',
        'height' : size_rand + 'px'
      });
  

$this.hover(
  function() {
    var obj = $bubbles.append('<div class="box-container hover"><div class="box text">'+$(this).attr('data-message')+'</div></div>');
    obj.find('.hover').css({
      'left': $this.offset().left +30,
      'top': $this.offset().top -20,
      'display': 'block'
    });
  }, function() {
    $('.hover').remove();
  }
);

      // $this.click(function(){
      //   //append box
      //   console.log($(this).attr('data-message'));
      //   $('.hover').remove();
      //   var obj = $bubbles.append('<div class="box-container hover"><div class="box text">'+$(this).attr('data-message')+'</div></div>');
      //   obj.find('.hover').css({
      //     'left': $this.offset().left +100,
      //     'top': $this.offset().top -20,
      //     'display': 'block'
      //   });
      //   console.log($this.offset().left+'__'+$this.offset().top);
      // });
      
    });

  };

}

// In case users value their laptop battery life
// Allow them to turn the bubbles off
// $('.bubble-toggle').click(function(){
//   if($bubbles.is(':empty')) {
//     bubbles();
//     $bubbles.show();
//     $(this).text('Bubbles Off');
//   } else {
//     $bubbles.fadeOut(function(){
//       $(this).empty();
//     });
//     $(this).text('Bubbles On');
//   }
  
//   return false;
// });

var $bubbles = $('.bubbles');
var key;
var message;
var email;
$(document).ready(function(){
  
  setTimeout(function() {
    bubbles();
    $('.add').fadeIn();
  }, 3000);

  $('.add').click(function(){
    $('.hover').remove();
      $(this).css({
        'background': 'none'
      });
      $(this).addClass('rotate');
    $(this).animate({
      top: '25%',
      left: '35%',
      width: 400,
      height: 400,
    }, 4000, 'easeInOutBack', function() {
      //show messagebox
      // 
      // $(this).css({
      //   '-webkit-animation-play-state': 'initial',
      //   'background': 'none',
      // });
      $('.verify h4').text(' ');
      $('.verify span').remove();
      $('.verify h4').wordTypeErase({
        delayOfStart: 0,
        delayOfWords: 10
      });

      var offsetLeft = $(this).offset().left;
      var offsetTop = $(this).offset().top;
      $('.box-container').css({
        'left': offsetLeft +120,
        'top': offsetTop + 200
      }).fadeIn();
      $('.verify .input').focus();
      $('.verify .input').keydown(function(e){
          
          if(e.keyCode == 13){
              e.preventDefault();
              key = $('.verify .input').val();
              if(typeof(bubbleArray[key]) === "undefined"){
                alert('Wrong verification code!');
                $(this).val('');
              }
              else{
                //ZIH07YN7
                if(!bubbleArray[key]){
					//new bubble
                  $('.verify').fadeOut(function(){
                    $('.message').fadeIn();
                    $('.message h4').text(' ');
                    $('.message span').remove();
                    $('.message h4').wordTypeErase({
                      delayOfStart: 0,
                      delayOfWords: 10
                    });
                    $('.message .inputtext').focus();
                    $('.message .inputtext').keydown(function(e){
						//remove "congratulations" message
                      if($('.message h4').text()!== ' '){
                        //e.preventDefault();
						$('.message h4').remove();
						$('.message span').remove();
						$('.message .input').focus();
                      }
                    });                
                  });
                }
                else{
					//existing 
                  var usermessage = $('.bubble[data-key="'+$(this).val()+'"]').attr('data-message');
                  $('.verify').fadeOut(function(){
                    $('.usermessage').fadeIn();                    
                    $('.usermessage h4').text(' ');
                    $('.usermessage span').remove();
                    $('.usermessage h4').attr('data-type-words', usermessage);
                    $('.usermessage h4').wordTypeErase({
                      delayOfStart: 0,
                      delayOfWords: 10
                    });
                  });
                  // $('.verify').fadeOut(function(){
                  //   boxClose();
                  // });
                  // console.log($('.bubble[data-key="'+$(this).val()+'"]'));
                  // $('.bubble[data-key="'+$(this).val()+'"]').css({
                  //   '-webkit-animation-play-state': 'paused',
                  //   'z-index': 9999
                  // });
                  // $('.bubble[data-key="'+$(this).val()+'"]').animate({
                  //   'width': 500,
                  //   'height': 500,
                  //   'top': '20%',
                  //   'left': '20%',
                  // }, 2000, 'easeInOutBack', function() {

                  // });
                }
              }
          }
      });
    });
  });
});

//When the Next button is clicked
$('.message .next').click(function(e){
	message = $('.message .inputtext').val();

	$('.message').fadeOut(function(){
 	    $('.email').fadeIn();
  	 	$('.email h4').text(' ');
 	 	$('.email span').remove();
  		$('.email h4').wordTypeErase({
    		delayOfStart: 0,
    		delayOfWords: 10
  	    });
  		$('.email .input').focus();
	});
});

//When the Cast button is clicked
$('.email .cast').click(function(e){

  //e.preventDefault();
  email = $('.email .input').val();
  // ajax save
  console.log('here')
  $.ajax({
    type: 'get',
    url: '/index2?key='+key+'&message='+message+'&email='+email
  })
  .done(function(response) {
    console.log(response);
    $('.box').hide();
    $('.add.rotate').animate({
      'left': '20px',
      'top': $(window).height()-200,
      'width': '200px',
      'height': '200px',
    }, 4000, 'easeOutBack', function() {

      $('.add.rotate').animate({
        'left': $(window).width()+300,
        'top': '-100px',
        'width': '20px',
        'height': '20px',
      }, 5000, 'easeInOutBack', function() {

        $bubbles.append('<div class="bubble" data-key="'+response[0].key+'" data-id="'+response[0].id+'" data-message="'+response[0].message+'"></div>');
        var newBubble = $('.bubble[data-id="'+response[0].id+'"]');
        console.log(newBubble);

        var pos_rand = Math.floor(Math.random() * 80)+10;
        var pos_rand_y = Math.floor(Math.random() * 71)+15;
    
        // Randomise their size
        var size_rand = min_bubble_size + Math.floor(Math.random() * (max_bubble_size + 1));
    
        // Randomise the time they start rising (0-15s)
        var delay_rand = Math.floor(Math.random() * 10);
    
        // Randomise their speed (3-8s)
        var speed_rand = 8 + Math.floor(Math.random() * 9);

    
        // Apply the new styles
    
        newBubble.css({
          // 'left': '49%',
          // 'bottom': '51%',
          // 'width': '200',
          // 'height': '200',
          '-webkit-animation-duration' : speed_rand + 's',
          '-moz-animation-duration' : speed_rand + 's',
          '-ms-animation-duration' : speed_rand + 's',
          'animation-duration' : speed_rand + 's',
      
          '-webkit-animation-delay' : delay_rand + 's',
          '-moz-animation-delay' : delay_rand + 's',
          '-ms-animation-delay' : delay_rand + 's',
          'animation-delay' : delay_rand + 's'
        });

        console.log(pos_rand);
        console.log(pos_rand_y);
        newBubble.animate({
          'width': 20,
          'height': 20,
          'left': pos_rand+'%',
          'bottom': pos_rand_y+'%',
        }, 5000, 'easeInOutBack', function() {
          boxClose();
        });

        newBubble.hover(
          function() {
            var obj = $bubbles.append('<div class="box-container hover"><div class="box text">'+$(this).attr('data-message')+'</div></div>');
            obj.find('.hover').css({
              'left': $(this).offset().left +30,
              'top': $(this).offset().top -20,
              'display': 'block'
            });
          }, function() {
            $('.hover').remove();
          }
        );




      });

    });
	
    // $('.email').fadeOut(function(){
    //   boxClose();
    // });
    //append bubble

  });


});


$('.box .close').click(function(e){
  e.preventDefault();
  $('.box .usermessage').hide();
  $('.box .usermessage h4').attr('data-type-words', '');
  $('.box .usermessage h4').text(' ');
  boxClose();
});

var boxClose = function(){
  $('.box-container').fadeOut();
  $('.input').val('');
  $('.add').animate({
    top: '-5px',
    left: '49%',
    width: 60,
    height: 60,
  }, 5000, 'easeInOutBack', function() {
    $(this).removeClass('rotate');
    $(this).css({
      '-webkit-animation-play-state': 'initial',
      'background': "url('../images/plus.png') center center no-repeat rgba(0,0,0,0.8)"
    });
    $('.verify').show();
    location.reload();
  });
};

    window.onload = function () {
        //google sky
        //if(window.prettyPrint)prettyPrint();init();
    };
