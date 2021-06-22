$('.title li').click(function(){
    	$(this).addClass('clickborder');
    	$(this).siblings().removeClass('clickborder');
        if($(this).index()==1)
        {
        	$('.code').show();
        	$('.account').hide();	

        }else{
            $('.account').show();
        	$('.code').hide();
        	}
    })