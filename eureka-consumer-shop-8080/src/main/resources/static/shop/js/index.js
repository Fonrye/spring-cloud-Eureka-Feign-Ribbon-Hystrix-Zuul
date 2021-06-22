$('.navright').mouseenter(function(){
	$('.navright a').css('color','#ff6700');
	$('.navright').css('background','white');
	$('.under').slideDown(1000);
})
$('.navright').mouseleave(function(){
	$('.navright a').css('color','#b0b0b0');
	$('.navright').css('background','#424242');
	$('.under').slideUp(1000);
})

$('.wrap').mouseenter(function(){
	$('.hleft').stop().animate({'left':'0px'},300);
})
$('.wrap').mouseleave(function(){
	$('.hleft').stop().animate({'left':'-49px'},300);
})

$('.hright1 input').focus(function(){
	$('.header .hright1 ol').slideDown(300);
	$('.header .hright1 .word').hide();
	$('.header .hright1 input').css('borderColor','#ff6700');
	$('.header .hright1 span').css('borderColor','#ff6700');
})
$('.hright1 input').blur(function(){
	$('.header .hright1 ol').slideUp(300);
    $('.header .hright1 .word').show();
    $('.header .hright1 input').css('borderColor','#dadada');
	$('.header .hright1 span').css('borderColor','#dadada');
})
// $('.word a').mouseenter(function(){
// 	$(this).addClass('con');
// 	// $(this).siblings().removeClass('con');
// })
// $('.word a').mouseleave(function(){
	
// 	$(this).siblings().removeClass('con');
// })

$('.header .hright1 ol li').mouseenter(function(){
	$(this).addClass('conn');
	$(this).siblings().removeClass('conn');
})
    var timer;
    var num=0;
    function gogo(){
        clearInterval(timer)
        timer=setInterval(function(){
            num++;
            if(num>4){
                num=0;
            }
            // 让ul左移;
            $('.bb').css('left', -num*1103+'px');
            // 对应的圆圈增加类
            $('.bann>ol>li').eq(num).addClass('current');
            // 兄弟姐妹删除类
            $('.bann>ol>li').eq(num).siblings().removeClass('current');
           
        },2000)
    }
    gogo();
     $('.bann').hover(function() {
        // 鼠标移入停止定时器
        clearInterval(timer)
    }, function() {
        // 鼠标移出开始定时器
        gogo();
    });
     //看前一张图片 
    $('.left').click(function(event) {
        num--;
        if(num<0){
            num=4;
        }
        $('.bb').css('left', -num*1103+'px');
        $('.bann>ol>li').eq(num).addClass('current');
        $('.bann>ol>li').eq(num).siblings().removeClass('current');
    });
    // 看后一张图片 
    $('.right').click(function(event) {
        num++;
        if(num>4){
            num=0;
        }
        $('.bb').css('left', -num*1103+'px');
        $('.bann>ol>li').eq(num).addClass('current');
        $('.bann>ol>li').eq(num).siblings().removeClass('current');
    });

    // 点击索引
    $('ol li').click(function(event) {
        num=$(this).index();
        $('.bb').css('left', -num*1103+'px');
        $(this).addClass('current');
        $(this).siblings().removeClass('current');
    });

    $('.aside>ul>li').mouseenter(function(){
    	$(this).children('div').show();
    })
    $('.aside>ul>li').mouseleave(function(){
    	$(this).children('div').hide();
    })

    var time;
    var n=0;
    function go(){
        clearInterval(time)
        time=setInterval(function(){
            n++;
            if(n>2){
                n=0;
            }
            // 让ul左移;
            $('.bannbuy .move').css('left', -890*n+'px');  
        },1000)
    }
    go();
    $('.bannbuy').hover(function(){
    	clearInterval(time);
    },function(){
    	go();
    })

    $('.right').hover(function(){
    	clearInterval(time);
    },function(){
    	go();
    })

     $('.rleft').click(function(event){
     	n--;
     	if(n==-1) n=0;
        	$('.move').css('left', -n*890+'px');
           
       })
    
    $('.rright').click(function(event) {
        n++;
        	if(n==3)n=2;
              $('.move').css('left', -n*890+'px');
         
       
       })
    //content2(foot2)
    $('.center2 .right li').mouseenter(function(){
    	$(this).addClass('clickborder');
    	$(this).siblings().removeClass('clickborder');
        if($(this).index()==1)
        {
        	$('.hot').show();
        	$('.tv').hide();
        }else{
            $('.tv').show();
        	$('.hot').hide();
        	}
    })
     $('.center4 .right li').mouseenter(function(){
    	$(this).addClass('clickborder');
    	$(this).siblings().removeClass('clickborder');
        if($(this).index()==1)
        {
        	$('.hot4').show();
        	$('.sound').hide();
        }else{
            $('.sound').show();
        	$('.hot4').hide();
        	}
    })

 $('.center6 .right li').mouseenter(function(){
    	$(this).addClass('clickborder');
    	$(this).siblings().removeClass('clickborder');
        if($(this).index()==1)
        {
        	$('.hot6').show();
        	$('.out6').hide();
        }else{
            $('.out6').show();
        	$('.hot6').hide();
        	}
    })
     $('.center3 .right li').mouseenter(function(){
    	$(this).addClass('clickborder');
    	$(this).siblings().removeClass('clickborder');
        if($(this).index()==1)
        {
        	$('.hot3').show();
        	$('.out3').hide();
        }else{
            $('.out3').show();
        	$('.hot3').hide();
        	}
    })
      $('.center5 .right li').mouseenter(function(){
    	$(this).addClass('clickborder');
    	$(this).siblings().removeClass('clickborder');
        if($(this).index()==1)
        {
        	$('.hot5').show();
        	$('.out5').hide();
        }else{
            $('.out5').show();
        	$('.hot5').hide();
        	}
    })

    $(window).scroll(function(){
    	if($(window).scrollTop()<700){
    		 $('.ssix').hide();
    	}else
    	{
          $('.ssix').show();
       }
    })
                      
    // $('.ssix').click(duncyion(){

    // 	$('html,body').animate({'scrollTop':$( window).offset().top})
    // })
$('.six').mouseenter(function(){
	$('six').css('color','#ff6700');
})
  

