
$('.selectcountry').click(function(){
	$('.hi').show();
})
$('.selectcountry').mouseleave(function(){
	$('.hi').hide();
})

$('.hi li').click(function(){
	$('.count').html($(this).html());
})


$('.nubhead').click(function(){
	$('.hi2').show();
})
$('.selectnub').mouseleave(function(){
	$('.hi2').hide();
})

$('.hi2 li').click(function(){
	$('.nubhead').html($(this).html());
})



// $('.phone').blur(function(){
//         var flag=true;
//         var re=/^((13[0-9]{1})|(15[0-9]{1})|(18[0-9]{1}))+(\d{8})$/;
//      	if($('.phone').val()==""){
//      		flag=false;
//      		$('.tips').html('!请输入号码');
//      	}else if($('.phone').val()!=""&&!$('.phone').val().match(re)){
//      		        flag=false;
// 					$('.tips').html('!格式错误');
//      	}
//
//      	return flag
// 	})
//



