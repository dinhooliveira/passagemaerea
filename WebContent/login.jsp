<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Seja Bem vindo!</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/login.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/bootstrap.min.css">
</head>
<body>
	<div class="container">

	<div class="col-12" >
		<form id="form" method="post" action="${pageContext.request.contextPath}/UsuarioController">
		    <h3>Area Restrita</h3>
			<div class="form-group">
				<label>Usuario</label> 
				<input type="text" name="login" class="form-control" placeholder="">
			</div>
			<div class="form-group">
				<label>Senha</label> <input
					type="password" name="senha" class="form-control" placeholder="">
			</div>
			<input type="hidden" name="acao" value="login">
			<button type="submit" class="btn btn-primary">Logar</button>
		</form>
	</div>
	</div>
	
	
	<script src="${pageContext.request.contextPath}/assets/js/slim.js"></script>
    <script src="${pageContext.request.contextPath}/assets/js/bootstrap.min.js"></script>
</body>
</html>