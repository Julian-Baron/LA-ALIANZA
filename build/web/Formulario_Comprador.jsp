<%-- 
    Document   : Formulario_Comprador
    Created on : 16/02/2021, 11:00:05 PM
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

<form action="Sv_compras" target="" method="get" name="formDatosPersonales">

	<label for="nombre">id_compra</label>
	<input type="text" name="id_compra" id="nombre" placeholder="id"/>

	<label for="apellidos">Codigo_pro</label>
	<input type="text" name="Codigo_pro" id="apellidos" placeholder="codigo"/>

	<label for="email" />Cantidad requerida</label>
	<input type="number" name="Cantidad re" id="email" placeholder="disponible" required />

	<label for="Precio_pro">Cedula del comprador</label>
	<input type ="text" name="Cedula" id="asunto" placeholder="N°"/>

    

	
	
	<input type="submit" name="enviar" value="enviar datos"/>
        <input type="submit" name="modificar" value="Modificar datos"/>
        <input type="submit" name="eliminar" value="Eliminar datos"/>
</form>

</body>
</html>
