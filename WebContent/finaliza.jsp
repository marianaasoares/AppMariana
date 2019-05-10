<%@page import="negocio.Estudante"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<head>
	<title>Cadastro realizado com sucesso!</title>
	<meta charset="ISO-8859-1">
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
</head>

<body>

	<%
	String meuTitulo= (String)request.getAttribute("titulo");
	String mensagem = (String)request.getAttribute("mensagem");
	%>

	<div class="container">
  		<h2><%=meuTitulo %></h2>
  		<div class="alert alert-success">
    		<strong>Successo!</strong> <%=mensagem%>.
  		</div>
  	</div>
  	
</body>
</html>