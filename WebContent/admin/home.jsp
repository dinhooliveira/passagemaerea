
<%@include file="header.jsp"%>


<div class="card">
	<div class="card-header card-header-primary">
	<b>Voo Lista</b>
	<a href="<% request.getContextPath();%>/passagemaerea/vooController?pagina=novo" class="btn btn-success float-right text-white">Novo</a>
	</div>
	<div class="card-body">
		<table class="table">
			<thead>
				<th>Código</th>
				<th>Origem</th>
				<th>Destino</th>
				<th>Data</th>
				<th>Hora</th>
				<th>Vagas</th>
			</thead>
			<tbody>
			</tbody>
		</table>
	</div>
</div>

<%@include file="footer.jsp"%>
