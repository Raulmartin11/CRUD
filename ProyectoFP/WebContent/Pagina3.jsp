<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ page import="proyectofp.Impresoras"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Menu Principal</title>
</head>
<body>
	<%
		Impresoras[] DatosImpresoras =(Impresoras[]) request.getAttribute("DatosImpresoras");
	%>
	<div class="container">
		<div class="row">
			<div class="col l12 m12 s12">

				<table style="margin: 0 auto;" bgcolor="#dbdbdb" class="striped">
					<thead>
						<tr>
							<th>Marca</th>
							<th>Modelo</th>
							<th>Tipo</th>
							<th>Precio</th>
						<tr>
					</thead>
					<%
						for (int i = 0; i < DatosImpresoras.length; i++) {
							out.print("<tr><td>" + DatosImpresoras[i].getMarca() + "</td><td>" + DatosImpresoras[i].getModelo()
									+ "</td><td>" + DatosImpresoras[i].getTipo() + "</td><td>" + DatosImpresoras[i].getPrecio()
									+ "</td></tr>");
						}
					%>
				</table>
			</div>
		</div>
	</div>
</body>
</html>