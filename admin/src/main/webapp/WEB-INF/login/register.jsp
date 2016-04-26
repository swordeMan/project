<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<meta name="description" content="">
<meta name="author" content="zhangsh">

<title>Signin Template for Bootstrap</title>

<link href="dist/css/bootstrap.min.css" rel="stylesheet">
<link href="dist/css/bootstrapValidator.css" rel="stylesheet">

<link href="local/css/view/carousel.css" rel="stylesheet">

<!--兼容性问题-->
<link href="assets/css/ie10-viewport-bug-workaround.css"
	rel="stylesheet">
<script src="assets/js/ie-emulation-modes-warning.js"></script>


</head>

<body>
	<div class="container">
	<nav class="navbar navbar-inverse navbar-static-top">
				<div class="container">
					<div class="navbar-header">
						<button type="button" class="navbar-toggle collapsed"
							data-toggle="collapse" data-target="#navbar"
							aria-expanded="false" aria-controls="navbar">
							<span class="sr-only">Toggle navigation</span> <span
								class="icon-bar"></span> <span class="icon-bar"></span> <span
								class="icon-bar"></span>
						</button>
						<a class="navbar-brand" href="#">追  忆</a>
					</div>
					<div id="navbar" class="navbar-collapse collapse">
						<ul class="nav navbar-nav">
							<li class="active"><a href="#">主页</a></li>
							<li><a href="#about">关于</a></li>
							<li><a href="#contact">Contact</a></li>
							<li class="dropdown"><a href="#" class="dropdown-toggle"
								data-toggle="dropdown" role="button" aria-haspopup="true"
								aria-expanded="false">更多 <span class="caret"></span></a>
								<ul class="dropdown-menu">
									<li><a href="#">Action</a></li>
									<li><a href="#">Another action</a></li>
									<li><a href="#">Something else here</a></li>
									<li role="separator" class="divider"></li>
									<li class="dropdown-header">Nav header</li>
									<li><a href="#">Separated link</a></li>
									<li><a href="#">One more separated link</a></li>
								</ul></li>
						</ul>
						<form class="navbar-form navbar-right" role="form" action="login">
							<div class="form-group">
								<input type="email" placeholder="Email" class="form-control">
							</div>
							<div class="form-group">
								<input type="password" placeholder="Password"
									class="form-control">
							</div>
							<button type="submit" class="btn btn-success">登 录</button>
						</form>
					</div>
				</div>
			</nav>
		<div class="col-lg-8 col-lg-offset-2">
			<form:form id="registerForm" commandName="user"
				class="form-horizontal" action="submitRegister">
				<h2 class="form-signin-heading">加入我们</h2>
				<p class="lead">从此理财不再有后顾之忧</p>

				<div class="form-group">
					<label class="col-lg-3 control-label" for="inputEmail">邮 箱</label>
					<form:errors class="text-danger" path="email" />
					<div class="col-lg-5">

						<form:input path="email" id="inputEmail"
							placeholder="Email address" type="text" class="form-control"
							name="email" />

					</div>
				</div>
				<div class="form-group">
					<label class="col-lg-3 control-label" for="inputPassword">密 码</label>
					<form:errors class="text-danger" path="password" />
					<div class="col-lg-5">
						<form:input path="password" id="inputPassword" type="password"
							class="form-control" name="password" placeholder="Password" />

					</div>
				</div>

				<div class="form-group">
					<label class="col-lg-3 control-label" for="inputConfirmPassword">密码确认</label>
					<div class="col-lg-5">
						<input id="inputConfirmPassword" type="password"
							class="form-control" name="confirmPassword"
							placeholder="Password" />
					</div>
				</div>
				<div class="col-lg-5 col-lg-offset-3">
					<div class="checkbox">
						<label> <input type="checkbox" value="remember-me">
							《同意用户协议》
						</label>
					</div>
					<button class="btn btn-lg btn-primary btn-block" type="submit">注
						册</button>
				</div>
			</form:form>
		</div>
	</div>
	<!-- /container -->

	<script type="text/javascript" src="assets/js/jquery/jquery-1.12.2.js"></script>
	<script type="text/javascript" src="dist/js/bootstrap.js"></script>
	<script type="text/javascript" src="dist/js/bootstrapValidator.js"></script>

	<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
	<script src="assets/js/ie10-viewport-bug-workaround.js"></script>
	<script type="text/javascript">
		$(document)
				.ready(
						function() {
							$('#registerForm')
									.bootstrapValidator(
											{
												message : 'This value is not valid',
												feedbackIcons : {
													valid : 'glyphicon glyphicon-ok',
													invalid : 'glyphicon glyphicon-remove',
													validating : 'glyphicon glyphicon-refresh'
												},
												fields : {

													email : {
														validators : {
															notEmpty : {
																message : '邮箱不能为空'
															},
															emailAddress : {
																message : '请输入正确的邮箱'
															}
														}
													},

													password : {
														validators : {
															notEmpty : {
																message : '请输入密码'
															},
															stringLength: {
										                        min: 6,
										                        max: 30,
										                        message: '密码的长度为6-30位'
										                    } 
														}
													},
													confirmPassword : {
														validators : {
															notEmpty : {
																message : '确认密码不能为空'
															},
															identical : {
																field : 'password',
																message : '两次密码输入不一致'
															}
														}
													}
												}
											});
						});
	</script>

</body>
</html>
