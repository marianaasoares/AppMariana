<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Login</title>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</head>

<body>

	<%
	boolean invalido = false;
	if(request.getAttribute("invalido") != null){
		invalido = (Boolean)request.getAttribute("invalido");
	}
	%>

	  	<%if(invalido){%>
		<div class="container">
		  <div class="alert alert-danger">
		    <strong>Problema!</strong> Usuário não encontrado!!!
		  </div>
		</div>
	  	<%}%>
	  
		<form action="AcessoController" method="post">
			<div class="container">
			 <h2>Acesso ao sistema</h2>
		    	<div class="form-group">
		      		<label for="email">Email:</label>
		      		<input type="email" class="form-control" id="email" placeholder="Entre com o email" name="email">
		    	</div>
		    	<div class="form-group">
		      		<label for="pwd">Senha:</label>
		     		 <input type="password" class="form-control" id="pwd" placeholder="Entre com a senha" name="senha">
		    	</div> 
		    	<button type="submit" class="btn btn-primary">Acessar</button>
	    	</div>
		</form>
</body>
</html>