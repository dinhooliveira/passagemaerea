<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Area administrativa</title>
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/admin.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/bootstrap.min.css">
</head>
<body>
<%@include file="navbar.jsp" %>
<%@ page import="usuario.Usuario"%>

<% 
   if(session.getAttribute("usuario")==null){
	   response.sendRedirect("../login.jsp");
   }
%>
<div class="container" id="content">
