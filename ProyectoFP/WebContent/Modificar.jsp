<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="proyectofp.Impresoras"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Modificar Usuario</title>
</head>
<body>
	<h1>Modificar</h1>

	<%
		Impresoras DatosImpresoras = (Impresoras) request.getAttribute("DatosImpresoras");
	%>
	<form class="col s12" action="MainServlet?action=modifiedmonitorled"
		method="post">
		<div class="row">

			<div class="input-field col l4 m6 s12">
				<input type="text" name="marca" id="marca"
					value="<%=DatosImpresoras.getMarca()%>"
					placeholder="Escriba aquí la marca" required> <label
					for="resolucion">Marca</label>
			</div>

			<div class="input-field col l4 m6 s12">
				<input type="text" name="modelo" id="modelo"
					value="<%=DatosImpresoras.getModelo()%>"
					placeholder="Escriba aquí el modelo" required> <label
					for="modelo">Modelo</label>
			</div>

			<div class="input-field col l4 m6 s12">
				<input type="text" name="tipo" id="Tipo"
					value="<%=DatosImpresoras.getTipo()%>"
					placeholder="Escriba aquí el tipo" required> <label
					for="tipo">Tipo</label>
			</div>

			<div class="input-field col l4 m6 s12">
				<input type="number" step="0.01" name="precio" id="precio"
					value="<%=DatosImpresoras.getPrecio()%>"
					placeholder="Escriba aquí el precio" required> <label
					for="precio">Precio</label>
			</div>

			<input type="hidden" name="modeloantiguo"
				value="<%=DatosImpresoras.getModelo()%>">
			<button class="waves-effect waves-light btn" type="submit"
				name="modificar">Modificar</button>
	</form>
</body>
</html>