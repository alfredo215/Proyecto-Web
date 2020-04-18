<html>
<link rel="stylesheet" type="text/css" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<script src="http://code.jquery.com/jquery-latest.js">
</script>
<script type="text/javascript">
	$(document).ready(function(){
		
			var btn = $('#carga').val();
			$.post('ServeleteControler',{

			},function(respose){

			let datos = JSON.parse(respose)
			//console.log(datos);
			var tabladatos = document.getElementById('tablaDatos')
			for (let item of datos) {

				tabladatos.innerHTML +=`
				<tr>

				<td>${item.id}</td>
				<td>${item.nombre}</td>
				<td>${item.apellido}</td>
				<td>${item.edad}</td>
				<td>${item.direccion}</td>
				<td>${item.dui}</td>
				<td>${item.nit}</td>
				<td>${item.grupoDeClaseProgramacion3Alquepertenece}</td>
				<td>${item.utimaNotaObtenidaEnProgramacion2}</td>
				
				<td><a href="ServeleteControler?btn=Eliminar&Id=${item.id}" class = "btn btn-warning">Eliminar</a>
				<a href="Funciones.jsp?idBus=${item.id}&Nom=${item.nombre}&Ape=${item.apellido}&Edad=${item.edad}&Dire=${item.direccion}&Dui=${item.dui}&Nit=${item.nit}&Gru=${item.grupoDeClaseProgramacion3Alquepertenece}&Ultima=${item.utimaNotaObtenidaEnProgramacion2}" class = "btn btn-danger">Modificar</a>
				
				</td>

				</tr>

				`

				//console.log(item.id);
			}

			});
		});
		
</script>
<body>
<h2 align="center">Usuarios</h2>

 				<a href="Funciones.jsp" class="btn btn-info">Agregar</a>


				<table class="table table-dark" id="tablaDatos">
					<thead>
						<th>Id</th>
						<th>Nombre</th>
						<th>Apellido</th>
						<th>Edad</th>
						<th>Direccion</th>
						<th>Dui</th>
						<th>Nit</th>
						<th>grupoDeClaseProgramacion3Alquepertenece</th>
						<th>utimaNotaObtenidaEnProgramacion2</th>
						<th>Opciones</th>
					</thead>
					<tbody>
						

					</tbody>
					
				</table>


				
</body>
</html>
