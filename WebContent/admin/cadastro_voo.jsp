
<%@ include file="header.jsp"%>
<%@ page import="voo.VooModel"%>
<%@ page import="voo.Aeroporto"%>
<%@ page import="java.util.List"%>
<%
   List<Aeroporto> aeroP = VooModel.listAeroPorto();

%>
<div class="card">
	<div class="card-header card-header-primary">
		<b>Voo Novo</b>
	</div>
	<div class="card-body">
	<form id="formulario_voo" method="post" action="${pageContext.request.contextPath}/VooController" class="col-md-12">
		<div class="row"></div>
		<div class="row">
		    
			<div class="col-md-4">
				<div class="form-group">
					<label>Data</label> <input type="date" name="data"  required class="form-control">
				</div>
			</div>
			<div class="col-md-4">
				<div class="form-group">
					<label>Horario</label> <input type="time" name="horario" data-validation="time" class="form-control">
				</div>
			</div>
			<div class="col-md-4">
				<div class="form-group">
					<label>Assentos disponiveis</label> <input type="number" required min="1" name="assentos"  data-validation="number"
						class="form-control">
				</div>
			</div>

			<div class="col-md-4">
				<div class="form-group">
					<label>Origem</label> <select class="form-control" name="destino">
					    <%
							for(Aeroporto a : aeroP){
								out.println("<option value='"+a.getId()+"'>"+ a.getNome()+ " -"+ a.getCidade()+"</option>");
							}
						%>
					</select>
				</div>
			</div>

			<div class="col-md-4">
				<div class="form-group">
					<label>Destino</label> <select class="form-control" name="origem">
						<%
							for(Aeroporto a : aeroP){
								out.println("<option value='"+a.getId()+"'>"+ a.getNome()+ " -"+ a.getCidade()+"</option>");
							}
						%>
					</select>
				</div>
			</div>
			<input type="hidden" name="acao" value="create">
		    <div class="col-md-12">
		       <button type="submit"  class="btn btn-primary">Salvar</button>
		    </div>
		    
		</div>
	 </form>
	</div>

</div>

<%@include file="footer.jsp"%>
