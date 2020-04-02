<html>
<link rel="stylesheet" type="text/css" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<body>
<h2 align="center">Usuarios</h2>
<table align="center">
	<thead>
		<tbody>
			<tr>
				<td>
					<form action="ServeleteControler" method="post">
					<p>Id</p><input type="text" name="Id">
					<p>Nombre</p><input type="text" name="Unombre">
					<p>Apellido</p><input type="text" name="Uapellido">
					<p>Edad</p><input type="text" name="Uedad">
					<p>Direccion</p><input type="text" name="Udireccion">
					<p>Dui</p><input type="text" name="Udui">
					<p>Nit</p><input type="text" name="Unit">
					<p>Grupo de Clase Programacion 3 al que pertenece</p><input type="text" name="Ugrupo">
					<p>Utima Nota Obtenida en Programacion 2</p><input type="text" name="Unota">
					<br>
					<br>
				<input type="submit" name="btn" value="Guardar"> 
				<input type="submit" name="btn" value="Actualizar"> 
				<input type="submit" name="btn" value="Eliminar"> 

				</form>
				</td>
			</tr>
		</tbody>
	</thead>
</table>
</body>
</html>
