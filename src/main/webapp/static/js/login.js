
function msgtemp(msg,className) {
	return '<div class="alert ${className} alert-dismissible fade in" role="alert">'+
		'<button type="button" class="close" data-dismiss="alert" aria-label="Close">'+
		'<span aria-hidden="true">&times;</span></button>'+msg+'</div>';
};
(function($){
	$.fn.extend({
		/* 重置验证码发送按钮 */
		rewire: function (time){
			var $this = $(this);
			var time = time || 60;
			time -= 1;
			if (time == 0) {
				$this.removeAttr("disabled");
				$this.html("获取验证码");
			} else {
				$this.prop("disabled", true);
				$this.html("重新发送（{0}）".format(time));
				setTimeout(function() { $this.rewire(time) }, 1000);
			}
		},
		/*
		 * 验证手机号码
		 * 
		 * @return 0,1,2,3
		 *		0:验证成功; 1:内容为空;  2长度不为11位; 3:格式不对。
		 */
		validatemobile: function (){
			var num = $(this).val();
			if (num.length == 0) {
				$(this)[0].focus();
				return 1;
			} else if (num.length != 11) {
				$(this)[0].focus();
				return 2;
			} else {
				var reg = /^(((13[0-9]{1})|(15[0-9]{1})|(18[0-9]{1}))+\d{8})$/;
				if(!reg.test(num)) {
					$(this)[0].focus();
					return 3;
				} else {
					return 0;
				}
			}
		},
		/*
		 * 验证密码 $phone 被验证的输入框jQ对象
		 * 字母+数字，字母+特殊字符，数字+特殊字符，至少6位
		 * @return 0,1,2,3
		 *		0:验证成功; 1:内容为空; 2:长度过短; 3:格式不对。
		 */
		validatepwd: function (){
			var num = $(this).val();
			if (num.length == 0) {
				$(this)[0].focus();
				return 1
			} else if (num.length < 6) {
				$(this)[0].focus();
				return 2
			} else {
				var  reg = /^(?![a-zA-z]+$)(?!\d+$)(?![!@#$%^&*]+$)[a-zA-Z\d!@#$%^&*]+$/;
				if(!reg.test(num)) {
					$(this)[0].focus();
					return 3;
				} else {
					return 0;
				}
			}
		},

	});
})(jQuery);

$(document).ready(function() {
    var p='<%=request.getAttribute("p")%>';     
    switch(p) {
    case 'register': $('.register').show(); break;
    default: $('.login').show();

// 发送验证码事件
$('.getsms').click(function() {
    var phone = $(this).parents('form').find('input.phone');
    var error = $(this).parents('form').find('.error_msg');
    switch(phone.validatemobile()) {
        case 0:
            // 短信验证码的php请求
            error.html(msgtemp('验证码 <strong>已发送</strong>','alert-success'));
            $(this).rewire(60);
        break;
        case 1: error.html(msgtemp('<strong>手机号码为空</strong> 请输入手机号码',    'alert-warning')); break;
        case 2: error.html(msgtemp('<strong>手机号码错误</strong> 请输入11位数的号码','alert-warning')); break;
        case 3: error.html(msgtemp('<strong>手机号码错误</strong> 请输入正确的号码',  'alert-warning')); break;
    }
});
// 以下确定按钮仅供参考
$('#login_submit').click(function() {
    var form = $(this).parents('form');
    var userID = form.find('input.phone').val();
    var password = form.find('input.password').val();
    var error = form.find('.error_msg');


    // 验证手机号参考这个
    // switch(phone.validatemobile()) {
    //     case 1: error.html(msgtemp('<strong>手机号码为空</strong> 请输入手机号码',    'alert-warning')); return; break;
    //     case 2: error.html(msgtemp('<strong>手机号码错误</strong> 请输入11位数的号码','alert-warning')); return; break;
    //     case 3: error.html(msgtemp('<strong>手机号码错误</strong> 请输入正确的号码',  'alert-warning')); return; break;
    // }
    // // 验证密码复杂度参考这个
    // switch(pwd.validatepwd()) {
    //     case 1: error.html(msgtemp('<strong>密码不能为空</strong> 请输入密码',    'alert-warning')); return; break;
    //     case 2: error.html(msgtemp('<strong>密码过短</strong> 请输入6位以上的密码','alert-warning')); return; break;
    //     case 3: error.html(msgtemp('<strong>密码过于简单</strong><br>密码需为字母、数字或特殊字符组合',  'alert-warning')); return; break;
    // }
	if(userID=="") {
		error.html(msgtemp('<strong>请输入账户名</strong> ', 'alert-warning'));
	}
	else if(password=="")
		error.html(msgtemp('<strong>请输入密码</strong> ',    'alert-warning'));
	else
	$.ajax({
		url: 'loginProcess',
		type: 'post',
		dataType: "text",
		data: {
			userID: userID,
			password: password
		},
		success: function (msg) {
			if(msg==1)
				parent.document.location.href = "home";
			if(msg==2)
				error.html(msgtemp('<strong>账户不存在</strong> ',    'alert-warning'));
			if(msg==3)
				error.html(msgtemp('<strong>密码错误</strong> ',    'alert-warning'));
			if(msg==4)
				parent.document.location.href = "admin";

		},
		error: function (item) {
		}
	})
})

    
    $('#register').click(function() {$('.login').fadeOut(150,function() {$('.register').fadeIn(150)})});
    $('#reglogin').click(function() {$('.register').fadeOut(150,function() {$('.login').fadeIn(150)})});
};      
});