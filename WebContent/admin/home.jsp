
<%@ include file="header.jsp"%>
<%@ page import="voo.VooModel" %>
<%@ page import="voo.Voo" %>
<%@ page import="java.util.List"%>


<div class="card">
	<div class="card-header card-header-primary">
	<b>Voo Lista</b>
	<a href="${pageContext.request.contextPath}/VooController?pagina=novo" class="btn btn-success float-right text-white">Novo</a>
	</div>
	<div class="card-body">
		<table class="table">
			<thead>
				<th>Código</th>
				<th>Data</th>
				<th>Hora</th>
				<th>Origem</th>
				<th>Destino</th>
				<th>Vagas</th>
			</thead>
			<tbody>
			<%
				List<Voo> voo = VooModel.listaVoo();
			    
			    String data;
				for(Voo v : voo){
					out.println("<tr>");
					out.println("<td>"+v.getId()+"</td>");
					out.println("<td>"+v.getData()+"</td>");
					out.println("<td>"+v.getHorario()+"</td>");
					out.println("<td>"+v.getOrigem()+"</td>");
					out.println("<td>"+v.getDestino()+"</td>");
					out.println("<td>"+v.getDisponivel()+"</td>");
					out.println("</tr>");
				}
			%>

			
			</tbody>
		</table>
	</div>
</div>

<%@include file="footer.jsp"%>
