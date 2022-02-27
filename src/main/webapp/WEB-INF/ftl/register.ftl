<!DOCTYPE html>
<html lang="zh">
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" />
	<title>注册页面</title>
	<link href="../../css/bootstrap.min.css" rel="stylesheet">
	<link href="../../css/materialdesignicons.min.css" rel="stylesheet">
	<link href="../../css/style.min.css" rel="stylesheet">
	<style>
		.lyear-wrapper {
			position: relative;
		}
		.lyear-login {
			display: flex !important;
			min-height: 100vh;
			align-items: center !important;
			justify-content: center !important;
		}
		.lyear-login:after{
			content: '';
			min-height: inherit;
			font-size: 0;
		}
		.login-center {
			background: #fff;
			min-width: 29.25rem;
			padding: 2.14286em 3.57143em;
			border-radius: 3px;
			margin: 2.85714em;
		}
		.login-center .has-feedback.feedback-left .form-control {
			padding-left: 38px;
			padding-right: 12px;
		}
		.login-center .has-feedback.feedback-left .form-control-feedback {
			left: 0;
			right: auto;
			width: 38px;
			height: 38px;
			line-height: 38px;
			z-index: 4;
			color: #dcdcdc;
		}
		.login-center .has-feedback.feedback-left.row .form-control-feedback {
			left: 15px;
		}
	</style>
</head>

<body>
<div class="row lyear-wrapper" style="background-image: url(../../images/login-bg-3.jpg); background-size: cover;">
	<div class="lyear-login">
		<div class="login-center">
			<form action="#!" method="post">
				<div class="form-group has-feedback feedback-left">
					<input type="text" placeholder="请输入您的用户名" class="form-control" name="username" id="username" />
					<span class="mdi mdi-account form-control-feedback" aria-hidden="true"></span>
				</div>
				<div class="form-group has-feedback feedback-left">
					<input type="password" placeholder="请输入密码" class="form-control" id="password" name="password" onkeyup="validate()"/>
					<span class="mdi mdi-lock form-control-feedback" aria-hidden="true"></span>
				</div>
				<div class="form-group has-feedback feedback-left">
					<input type="password" placeholder="请确认密码" class="form-control" id="password1" name="password" onkeyup="validate()" />
					<span class="mdi mdi-lock form-control-feedback" aria-hidden="true"></span>
				</div>
				<span id="feedback"></span>
				<div class="form-group">
					<a id="register" class="btn btn-block btn-primary" type="button" href="#">注册</a>
				</div>
			</form>
			<hr>
			<footer class="col-sm-12 text-center">
				<p class="m-b-0">Copyright © 2021 <a href="/main">电商网站</a>. All right reserved</p>
			</footer>
		</div>
	</div>
</div>
<script type="text/javascript">
	function validate() {
		var password= $("#password").val();
		var password1= $("#password1").val();
		if(password == password1){
			$("#feedback").html("两次密码相同")
			$("#feedback").css("color","green")
		}else {
			$("#feedback").html("两次密码不同")
			$("#feedback").css("color","red")
		}
	}
</script>
<script type="text/javascript" src="/js/jquery.min.js"></script>
<script type="text/javascript" src="/js/bootstrap.min.js"></script>
<script type="text/javascript" src="/js/admin/register.js"></script>
<!--消息提示-->
<script src="/js/bootstrap-notify.min.js"></script>
<script type="text/javascript" src="/js/lightyear.js"></script>
<script type="text/javascript">;</script>
</body>
</html>