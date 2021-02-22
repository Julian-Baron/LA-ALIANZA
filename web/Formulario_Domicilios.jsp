<%-- 
    Document   : Formulario_Domicilios
    Created on : 16/02/2021, 10:38:53 PM
    Author     : Trabajos
--%>

<%@page import="Modelos.Mod_Domicilios"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Constructor.Con_Domicilios"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>Introducción formularios web</title>
	<meta charset="utf-8"/>
	<meta name="description" content=""/>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.bundle.min.js" integrity="sha384-b5kHyXgcpbZJO/tY9Ul7kGkf1S0CWuKcCD38l8YkeH8z8QjE0GmW1gYU5S9FOnJ0" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="css/styles_header.css">
	

</head>
<body>
    
    <header>
		<div class="wrapper">
			<div class="logo">Supermercado la Alianza</div>
			
			<nav>
				<a href="#">Inicio</a>
				<a href="#">Servicios</a>
				<a href="#">Proyectos</a>
				<a href="#">Contacto</a>
			</nav>
		</div>
    </header>
    <div class="container">
            <h1>Formulario para la Gestion de Domicilios</h1>
            <div class="row">
                <div id="section">
                    <form action="Sv_compras" target="" method="Post" name="formDatosPersonales">

                        <div class="mb-3">
                        <label for="exampleInputEmail1" class="form-label">Codigo de domicilio</label>
                        <input type="text" name="id_compra" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                        <div id="emailHelp" class="form-text"></div>
                        </div>
                       

                        <div class="mb-3">
                        <label for="exampleInputEmail1" class="form-label">Fecha_pedido</label>
                        <input type="text" name="Codigo_pro" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                        <div id="emailHelp" class="form-text"></div>
                        </div>

                        

                        <div class="mb-3">
                        <label for="exampleInputEmail1" class="form-label">Id_compra</label>
                        <input type="number" name="Cantidad re" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                        <div id="emailHelp" class="form-text"></div>
                        </div>
                        
                        
                        <div class="mb-3">
                        <label for="exampleInputEmail1" class="form-label">Cedula del empleado</label>
                        <input type="text" name="Cedula" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                        <div id="emailHelp" class="form-text"></div>
                        </div>

                        <div class="col-auto">

                        
                        </br>
                        <!--<label for="telefono">Rol</label>
                        <input type="email" name="rol" id="email" placeholder="Correo"  />

                        <label for="Codigo del empleado">sexo</label>
                        <input type ="text" name="codigo" id="asunto" placeholder="Codigo_empleado"/>
                        -->
                        
                        
                        </br>

                        <button type="submit" class="btn btn-primary">Ingresar</button>
                        <button type="submit" class="btn btn-primary">Modificar</button>
                        <button type="submit" class="btn btn-primary">Eliminar</button>

                        <!--<input type="submit" name="enviar" value="enviar datos"/>
                        <input type="submit" name="modificar" value="Modificar datos"/>
                        <input type="submit" name="eliminar" value="eliminar datos"/>-->
                    </form>
                    </br>
                    </br>
                    </br>
                    <div id="section-tabla">
                        <table class="table">
                           <thead>
                             <tr>
                                 <th>Cod_domicilio</th>
                                 <th>Fecha de pedido</th>
                                 <th>Id de la compra</th>
                                 <th>Cedula del comprador</th>
                                 
                             </tr>     
                         </thead>
                            <%

                                ArrayList<Con_Domicilios> datosu=new ArrayList<>();

                                Modelos.Mod_Domicilios mu=new Mod_Domicilios();
                                datosu=mu.Consultar_Domicilios();
                                Con_Domicilios  u=new Con_Domicilios();

                                for(int i=0; i<datosu.size(); i++){

                                u=datosu.get(i);


                            %>
                            <tbody>

                                        <tr>
                                            <td><%=u.getCod_domicilio()%></td>
                                            <td><%=u.getFechaPedido()%></td>
                                            <td><%=u.getId_compra()%></td>
                                            <td><%=u.getCedula()%></td>
                                          
                                        </tr>
                                     </tbody>
                                     <%
                                         }
                                         %>
                        </table>


                    </div>
                </div>        
            </div>
        </div>
        </div>
    
<!--<form action="Sv_domicilios" target="" method="get" name="formDatosPersonales">

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
	
        
        
</form>-->

</body>
</html>
