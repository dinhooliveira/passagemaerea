
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
		<div class="row"></div>
		<div class="row">
			<div class="col-md-4">
				<div class="form-group">
					<label>Data</label> <input type="date" class="form-control">
				</div>
			</div>
			<div class="col-md-4">
				<div class="form-group">
					<label>Horario</label> <input type="time" class="form-control">
				</div>
			</div>
			<div class="col-md-4">
				<div class="form-group">
					<label>Assentos disponiveis</label> <input type="number" min="1"
						class="form-control">
				</div>
			</div>

			<div class="col-md-4">
				<div class="form-group">
					<label>Origem</label> <select class="form-control">
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
					<label>Destino</label> <select class="form-control">
						<%
							for(Aeroporto a : aeroP){
								out.println("<option value='"+a.getId()+"'>"+ a.getNome()+ " -"+ a.getCidade()+"</option>");
							}
						%>
					</select>
				</div>
			</div>
		</div>
	</div>

</div>

<%@include file="footer.jsp"%>
