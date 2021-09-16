$(document).ready(function() {
	
	var body_wid = screen.width;
	
    $("a,input,button").focus(
        function(){this.blur()}
    );//去掉超链接时的虚边框
    $(".begin_circle").click(function(){
        show_date_time(0);
    });
    //正计时
    //以下是practical左侧列表切换效果
    $(".p_progress ul li").click(function() {
    	var liflag=$(this).attr("liflag");
        var num=$(this).index();
        var NUM=num+2;
        $(".p-task").css("display","none");
        //$(".p-task:eq("+NUM+")").css("display","block");
        $("#taskli"+liflag).css("display","block");
        if(typeof(liflag)=="undefined"){
        	$("#preImage").css("display","block");
        	
        }
        $(".p_progress ul li").each(function() {
            $(this).removeClass("p_progress_active");
            $(".p-precondition ul li").removeClass("p-precondition-active");
            $(".p-mobile-development").removeClass("p-mobile-development-active");
        });
        $(this).addClass("p_progress_active");
        $(".practical-right-toggle-answer").css("display","none");
        $(".practical-right-toggle-knowlage").css("display","none");
        $(".p-about-knowloge,.p-look-answer-see").find("i").removeClass("i-border-down").addClass("i-border-up");
        
        //完成效果预览

        function preview(){
            var $width=$(".practical-right-preview img").width();
            var $height=$(".practical-right-preview img").height();

            $(".practical-right-preview img").css("margin-left",-$width/2+"px");
            $(".practical-right-preview img").css("margin-top",-$height/2+"px");
        }
        window.onload=preview();
        //完成效果预览鼠标成放大镜效果
        node.attr("style","cursor: url('../img/search.cur'), auto;");
    });
    
    $(".p-precondition ul li").click(function(){
        $(".p-precondition ul li").each(function() {
            $(this).removeClass("p-precondition-active");
            $(".p-mobile-development").removeClass("p-mobile-development-active");
        });
        $(this).addClass("p-precondition-active");
        $(".p_progress ul li").removeClass("p_progress_active");
        var num=$(this).index();
        $(".p-task").css("display","none");
        $(".p-task:eq("+num+")").css("display","block");
        $(".practical-right-toggle-answer").css("display","none");
        $(".practical-right-toggle-knowlage").css("display","none");
    })
    

    
        $(".p-mobile-development").click(function(){
        $(this).addClass("p-mobile-development-active");
        $(".p-precondition ul li").removeClass("p-precondition-active");
        $(".p_progress ul li").removeClass("p_progress_active");
        $(".p-task").css("display","none");
        $("#mobile-development").css("display","block");
        $(".practical-right-toggle-answer").css("display","none");
        $(".practical-right-toggle-knowlage").css("display","none");
    })
    //以上是practical左侧列表切换效果
/*        $(".p-about-knowloge").click(function(){
            var vi=$(this).attr("vi");
            if($(this).find("i").hasClass("i-border-down")){
                $(this).find("i").removeClass("i-border-down").addClass("i-border-up");
            }else{
                $(this).find("i").removeClass("i-border-up").addClass("i-border-down");
            }
            $(this).next().find("i").removeClass("i-border-down").addClass("i-border-up");
            $("#practical-answer" + vi).css("display","none");
            $("#practical-knowledge" + vi).slideToggle(500);
        });*/
    	/*$(".p-look-answer-see").click(function(){

            var vi=$(this).attr("vi");

            if($(this).find("i").hasClass("i-border-down")){
                $(this).find("i").removeClass("i-border-down").addClass("i-border-up");
            }else{
                $(this).find("i").removeClass("i-border-up").addClass("i-border-down");
            }
            $(this).prev().find("i").removeClass("i-border-down").addClass("i-border-up");
            $("#practical-knowledge" + vi).css("display","none");
            $("#practical-answer" + vi).fadeToggle(500);
        });*/
    //查看知识点/答案
    
    //2015.12.7效果预览跳窗
    $(".practical-right-preview img").click(function(){
       $(".bg_practical,.bg_practical_preview").show();
       var width=$(".bg_practical_preview img").width();
        var height=$(".bg_practical_preview img").height();
        $(".bg_practical_preview").css("margin-left",-width/2+"px");
        $(".bg_practical_preview").css("margin-top",-height/2+"px");
    });
    $(".bg_practical,.bg_practical_preview").click(function(){
        $(".bg_practical,.bg_practical_preview").hide();
    });
    
    /*9.20 添加*/
    /*返回顶部事件*/
    $(window).scroll(function () {
        var s = $(document).scrollTop();//鼠标滑动的距离
        if(body_wid >= 1024) {
            if(s > 0) {
                $('.backNav').show();
                if(s > 300) {
                    $('.p-left').addClass('p-left-list-fixed');
                }else{
                    $('.p-left').removeClass('p-left-list-fixed');
                }
            }
            else {
                $('.backNav').hide();
            }
        }
    });
    $('.backNav').on('click', function () {
        $('body,html').animate({scrollTop:0},500);
    });
    
});
/* 以下是正计时*/
var HOUR_MILLS = 60*60;
var MIN_MILLS = 60;
var SEN_MILLS = 1;
var total_time = 0;
function show_date_time(start_mills){
    if(start_mills != null)
        total_time = start_mills;
    var show_hour = parseInt(total_time / HOUR_MILLS);
    if(show_hour>99){
        total_time = 0;
        window.setTimeout("show_date_time("+total_time+")", 1000);
        return;
    }
    var show_min = parseInt((total_time - (show_hour*HOUR_MILLS)) / MIN_MILLS);
    var show_sen = parseInt((total_time - (show_hour*HOUR_MILLS + show_min*MIN_MILLS)) / SEN_MILLS);
    $("#timer").html(pad(show_hour,2)+":"+pad(show_min,2)+":"+pad(show_sen,2));
    total_time++;
    window.setTimeout("show_date_time("+total_time+")", 1000);
}
function pad(num,n){
    var len = num.toString().length;
    while(len<n){
        num = "0"+num;
        len++;
    }
    return num;
}
//以上是正计时

/*********************3.22 添加，此函数为上传文件中的点击提交结果和点击关闭按钮事件***********************/

function upload_start() {
	$("#file-1").fileinput('reset');
    $('#bg').show();
    $('#upload_content').show();
}
function upload_close() {
	 
    $('#bg').hide();
    $('#upload_content').hide();
}
/*********************3.22 结束***********************/
/*********3.22 添加，此函数为上传文件中的点击提交结果和点击关闭按钮事件************/
//鼠标划过上传文件中大的关闭按钮事件


$('.upload_img').hover(function () {
  var $this  =  $(this);
  $this.attr('src','studentpriactical/img/closes_hover.png');
}, function () {
  var $this  =  $(this);
  $this.attr('src','studentpriactical/img/closes.png');
});
/*********************3.22 结束***********************/
//提交按钮与下载按钮的显示
//下载按钮显示函数
function toggle_nav_down(){
	  var $down = $('.down');
    $down.show();
   $('.nam').removeClass('col-md-8').addClass('col-md-6');
   $down.parent().removeClass('col-md-2').addClass('col-md-4');
}
//下载按钮隐藏函数
function toggle_nav_downhide(){
	var $down = $('.down');
	$down.hide();
  $('.nam').removeClass('col-md-6').addClass('col-md-8');
  $down.parent().removeClass('col-md-4').addClass('col-md-2');
}

//9.20点击知识点和答案，页面跳转到其所在div事件
function onScoll(obj) {
  $("html,body").stop(true);
  $("html,body").animate({scrollTop: $(obj).offset().top}, 1000);
}
//9.20 结束
