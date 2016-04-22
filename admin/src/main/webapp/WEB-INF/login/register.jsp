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

<!--兼容性问题-->
<link href="assets/css/ie10-viewport-bug-workaround.css"
	rel="stylesheet">
<script src="assets/js/ie-emulation-modes-warning.js"></script>


</head>

<body>
	<div class="container">
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
