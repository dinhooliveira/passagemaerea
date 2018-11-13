<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Seja Bem vindo!</title>
<link rel="stylesheet" href="<% request.getContextPath();%>/passagemaerea/assets/css/bootstrap.min.css">
</head>
<body>
	<div class="container">
		<form>
			<div class="form-group">
				<label>Email</label> 
				<input type="email" class="form-control" placeholder="email@dominio.com">
			</div>
			<div class="form-group">
				<label>Password</label> <input
					type="password" class="form-control" placeholder="Password">
			</div>
			
			<button type="submit" class="btn btn-primary">Logar</button>
		</form>
	</div>
</body>
</html>