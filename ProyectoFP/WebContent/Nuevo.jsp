<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>A�adir Usuario</title>
</head>
<body>
	<h1>Introduzca los datos del nuevo MonitorLED</h1>
	<form class="col s12" action="MainServlet?action=Add" method="post">
		<div class="row">

			<div class="input-field col l4 m6 s12">
			<input type="text" name="marca" id="marca"
					placeholder="Escriba aqu� la marca" required> <label
					for="marca">Marca</label>
			</div>
			
			<div class="input-field col l4 m6 s12">
				<input type="text" name="modelo" id="modelo"
					placeholder="Escriba aqu� el modelo" required> <label
					for="modelo">Modelo</label>
			</div>
			
			<div class="input-field col l4 m6 s12">
				<input type="text" name="tipo" id="Tipo"
					placeholder="Escriba aqu� el tipo" required> <label
					for="tipo">Tipo</label>
			</div>
			
			<div class="input-field col l4 m6 s12">
				<input type="number" step="0.01" name="precio" id="precio"
					placeholder="Escriba aqu� el precio" required> <label
					for="precio">Precio</label>
			</div>

			<button class="waves-effect waves-light btn" type="submit"
				name="a�adir">A�adir</button>
	</form>
</body>
</html>