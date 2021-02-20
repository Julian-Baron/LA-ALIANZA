<%-- 
    Document   : Formulario_Domicilios
    Created on : 16/02/2021, 10:38:53 PM
    Author     : Trabajos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>Introducción formularios web</title>
	<meta charset="utf-8"/>
	<meta name="description" content=""/>
    <link rel="stylesheet" href="css/Styles.css">
	

</head>
<body>

<form action="Sv_domicilios" target="" method="get" name="formDatosPersonales">

	<label for="nombre">Codigo de domicilio</label>
	<input type="number" name="codigo" id="nombre" placeholder=""/>
	

	<label for="apellidos">Fecha_pedido</label>
	<input type="date" name="fecha" id="apellidos" placeholder=""/>
	
	<label for="email" />id_compra</label>
	<input type="text" name="id_compra" id="apellidos" placeholder=""/>
        
        <label for="email" />Cedula del empleado</label>
	<input type="text" name="ceduladelempleado" id="apellidos" placeholder=""/>
        
	<input type="submit" name="enviar" value="Ingresar datos"/>
        <input type="submit" name="modificar" value="modificar datos"/>
        <input type="submit" name="eliminar" value="Eliminar datos"/>
	
        
        
</form>

</body>
</html>
