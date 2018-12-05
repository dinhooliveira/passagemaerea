<%@ include file="header.jsp"%>
<div class="booking-form col-md-12">
	<form>
	
		<div class="row">
			<div class="col-md-4">
				<div class="form-group">
					<span class="form-label">Nome</span> <input
						class="form-control" type="text" name="nome" placeholder="Severino">
				</div>
			</div>
			<div class="col-md-4">
				<div class="form-group">
					<span class="form-label">Sobrenome </span> <input
						class="form-control" type="text" name="sobrenome" placeholder="Lima">
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
						class="form-control" type="text" required>
				</div>
			</div>
			<div class="col-md-4">
				<div class="form-group">
					<span class="form-label">Logradouro</span> 
						<input class="form-control" type="text" required>
				</div>
			</div>
			<div class="col-md-2">
				<div class="form-group">
					<span class="form-label">numero</span>
					<input class="form-control" type="number" required>
					
				</div>
			</div>
			
			<div class="col-md-4">
				<div class="form-group">
					<span class="form-label">Complemento</span>
					<input class="form-control" type="text" required>
					
				</div>
			</div>
		</div>
		<div class="row">
			<div class="col-md-3">
				<div class="form-group">
					<span class="form-label">Travel class</span> <select
						class="form-control">
						<option>Economy class</option>
						<option>Business class</option>
						<option>First class</option>
					</select> <span class="select-arrow"></span>
				</div>
			</div>
			<div class="col-md-3">
				<div class="form-btn">
					<button class="submit-btn">Show flights</button>
				</div>
			</div>
			<div class="col-md-3">
				<div class="form-btn">
					<a
						href="${pageContext.request.contextPath}/ClienteController?pagina=cadastro"
						class="">Fazer Cadastro</a>
				</div>
			</div>
		</div>
	</form>
</div>
<%@ include file="footer.jsp"%>