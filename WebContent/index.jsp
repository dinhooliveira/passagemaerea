<%@ page import="voo.VooModel"%>
<%@ page import="voo.Aeroporto"%>
<%@ page import="java.util.List"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
   List<Aeroporto> aeroP = VooModel.listAeroPorto();
for(Aeroporto a : aeroP){
	out.println(a.getCidade());
}

%>
</body>
</html>