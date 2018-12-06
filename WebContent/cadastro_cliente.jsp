<%@ include file="header.jsp"%>
<div class="booking-form col-md-12">
	<form method="post" action="${pageContext.request.contextPath}/ClienteController" >
	
	<div class="row">
			<div class="col-md-4">
				<div class="form-group">
					<span class="form-label">Login</span> <input
						class="form-control" type="text" name="login" placeholder="" required>
				</div>
			</div>
			<div class="col-md-4">
				<div class="form-group">
					<span class="form-label">Senha </span> <input
						class="form-control" type="password" name="senha"  placeholder="" required>
				</div>
			</div>
			
		   <div class="col-md-4">
				<div class="form-group">
					<span class="form-label">Confirmação Senha</span> <input
						class="form-control" type="password" name="confirmaSenha" data-validation="confirmation" data-validation-confirm="senha" required>
				</div>
			</div>
		</div>
		
	
		<div class="row">
			<div class="col-md-4">
				<div class="form-group">
					<span class="form-label">Nome</span> <input
						class="form-control" type="text" name="nome" placeholder="Severino" required>
				</div>
			</div>
			<div class="col-md-4">
				<div class="form-group">
					<span class="form-label">Sobrenome </span> <input
						class="form-control" type="text" name="sobrenome" placeholder="Lima" required>
				</div>
			</div>
			
		   <div class="col-md-4">
				<div class="form-group">
					<span class="form-label">Nascimento</span> <input
						class="form-control" type="date" name="nascimento" required>
				</div>
			</div>
		</div>
		<div class="row">
		
			<div class="col-md-2">
				<div class="form-group">
					<span class="form-label">Cep</span> <input
						class="form-control" type="text" name="cep"  required>
				</div>
			</div>
			<div class="col-md-4">
				<div class="form-group">
					<span class="form-label">Logradouro</span> 
						<input class="form-control" type="text" name="logradouro"  required>
				</div>
			</div>
			<div class="col-md-2">
				<div class="form-group">
					<span class="form-label">numero</span>
					<input class="form-control" type="number" name="numero"  required>
					
				</div>
			</div>
			
			<div class="col-md-4">
				<div class="form-group">
					<span class="form-label">Complemento</span>
					<input class="form-control" type="text" name="complemento"  >
					
				</div>
			</div>
		</div>
		<div class="row">
			<div class="col-md-3">
				<div class="form-group">
				<span class="form-label">Numero do cartão</span>
					<input class="form-control" type="text" name="numerocartao"  required>
				</div>
			</div>
			<div class="col-md-3">
				<div class="form-group">
				<span class="form-label">Codigo</span>
					<input class="form-control" type="number" name="codigo"  required>
				</div>
			</div>
			<div class="col-md-3">
				<div class="form-group">
				<span class="form-label">validade</span>
					<input class="form-control" type="date" name="validade"  required>
				</div>
			</div>
		</div>
		
		<div class="row">
			
			<div class="col-md-3">
				<div class="form-btn">
					<button class="submit-btn">Cadastrar</button>
				</div>
			</div>
			<input type="hidden" name="acao" value="create">
		</div>
	</form>
</div>

<%@ include file="footer.jsp"%>
