<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<%
String idBus=request.getParameter("idBus");
String Nom=request.getParameter("Nom");
String Ape=request.getParameter("Ape");
String Edad=request.getParameter("Edad");
String Dire=request.getParameter("Dire");
String Dui=request.getParameter("Dui");
String Nit=request.getParameter("Nit");
String Gru=request.getParameter("Gru");
String Ultima=request.getParameter("Ultima");

if(idBus==null){
	idBus="";
	Nom="";
	Ape="";
	Edad="";
	Dire="";
	Dui="";
	Nit="";
	Gru="";
	Ultima="";
	
}

%>

<body>


<form action="ServeleteControler">
<table align="center">
	<thead>

	</thead>
		<tbody>
			<tr>
				<td>
					<p>Id</p><input type="text" name="Id" value="<%=idBus %>">
					<p>Nombre</p><input type="text" name="Unombre" value="<%=Nom %>">
					<p>Apellido</p><input type="text" name="Uapellido" value="<%=Ape %>">
					<p>Edad</p><input type="text" name="Uedad" value="<%=Edad %>">
					<p>Direccion</p><input type="text" name="Udireccion" value="<%=Dire %>">
					<p>Dui</p><input type="text" name="Udui" value="<%=Dui %>">
					<p>Nit</p><input type="text" name="Unit" value="<%=Nit %>">
					<p>Grupo de Clase Programacion 3 al que pertenece</p><input type="text" name="Ugrupo" value="<%=Gru %>">
					<p>Utima Nota Obtenida en Programacion 2</p><input type="text" name="Unota" value="<%=Ultima %>">
					<br>
					<br>
				</td>
			</tr>
		</tbody>
</table>

<input type="submit" class="btn btn-info" value="Guardar" name="btn">
<input type="submit" class="btn btn-info" value="Actualizar" name= "btn">
</form>
</body>
</html>