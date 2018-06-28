
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

