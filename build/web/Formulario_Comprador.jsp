<%-- 
    Document   : Formulario_Comprador
    Created on : 16/02/2021, 11:00:05 PM
    Author     : Trabajos
--%>

<%@page import="Modelos.Mod_Compras"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Constructor.Con_Compras"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl" crossorigin="anonymous">
    <link rel="stylesheet" href="css/styles_header.css">
    
       <!--Font-->    
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css2?family=Orbitron:wght@500&display=swap" rel="stylesheet">    

    <!--CSS-->
    <link rel="stylesheet" href="css/fonts.css">

    <!--ICONO-->
    <link rel="icon" href="img/alianza_1.png">
    
    <title>Formularios de Gestion Clientes</title>
  </head>
  <body>
    

    <!-- Optional JavaScript; choose one of the two! -->

    <!-- Option 1: Bootstrap Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.bundle.min.js" integrity="sha384-b5kHyXgcpbZJO/tY9Ul7kGkf1S0CWuKcCD38l8YkeH8z8QjE0GmW1gYU5S9FOnJ0" crossorigin="anonymous"></script>

    <!-- Option 2: Separate Popper and Bootstrap JS -->
    <!--
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.6.0/dist/umd/popper.min.js" integrity="sha384-KsvD1yqQ1/1+IA7gi3P0tyJcT3vR+NdBTt13hSJ2lnve8agRGXTTyNaBYmCR/Nwi" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.min.js" integrity="sha384-nsg8ua9HAw1y0W1btsyWgBklPnCUAFLuTMS2G72MMONqmOymq585AcH49TLBQObG" crossorigin="anonymous"></script>
    -->
       <!-- inicio de la cabecera-->
        <header>        
		<!--<div class="wrapper">-->
			
			
			<!--<nav>
				<a href="Formulario_Comprador.jsp">Formulario Comprador</a>
				<a href="Formulario_Domicilios.jsp">Formulario Domicilios</a>
				<a href="Formulario_FActuras.jsp">Formulario Facturas</a>
				<a href="Formulario_empleados.jsp">Formulario empleados</a>
                                <a href="Formulario_usuarios.jsp">Formulario usuarios</a>
                                <a href="formulario_Productos.jsp">Gestion productos</a>
                                <a href="formulario_clientes.jsp">Gestion Clientes</a>
			</nav>-->
                        
        
             <!--</div>-->
             <nav class="navbar navbar-expand-lg fixed-top navbar-light bg" style="background: #DEB916">
                  <div class="logo">Supermercado la Alianza                       
                            <img src="img/shopping-cart-2020929_640.png " class="" >
                            </div>
                    <div class="container"> 
                       
                        <a class="navbar-brand" href="index.jsp">Inicio</a>
                        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
                            <span class="navbar-toggler-icon"></span>
                        </button>
                        <div class="collapse navbar-collapse" id="navbarNavDropdown">
                            <ul class="navbar-nav">
                              <li class="nav-item dropdown">
                              <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                                  Formularios
                              </a>
                              <ul class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
                                <li><a class="dropdown-item nav-link" href="Formulario_usuarios.jsp">Formularios Usuarios</a></li>
                                <li><a class="dropdown-item nav-link" href="Formulario_FActuras.jsp">Formularios Facturas</a></li>
                                <li><a class="dropdown-item nav-link" href="Formulario_Comprador.jsp">Formularios Compras</a></li>
                              </ul>
                            </li>                                               
                            <li class="nav-item">
                              <a class="nav-link active" aria-current="page" href="Formulario_Comprador.jsp"></a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link " href="Formularios de gestion.jsp">Volver</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="login.jsp">Cerrar Sesion</a>
                            </li>
                            
                          </ul>
                        </div>
        
            </nav>
       
	</header>
       
    <!-- Contenedor formulario-->
    <div class="container" id="container-first">
            <h1>Formulario para la Gestion de compras</h1>
            <div class="row">
                <div id="section">
                    <form action="Sv_compras" target="" method="Post" name="formDatosPersonales">

                        <div class="mb-3">
                            <label class="form-label">Id_compra</label>
                                <input type="text" name="id_compra" class="form-control" aria-describedby="emailHelp">
                            <div id="emailHelp" class="form-text"></div>
                        </div>
                       

                        <div class="mb-3">
                        <label for="exampleInputEmail1" class="form-label">Codigo_pro</label>
                        <input type="text" name="Codigo_pro" class="form-control"  aria-describedby="emailHelp">
                        <div id="emailHelp" class="form-text"></div>
                        </div>

                        

                        <div class="mb-3">
                        <label for="exampleInputEmail1" class="form-label">Cantidad requerida</label>
                        <input type="number" name="Cantidad re" class="form-control"  aria-describedby="emailHelp">
                        <div id="emailHelp" class="form-text"></div>
                        </div>

                        
                        <div class="mb-3">
                        <label for="exampleInputEmail1" class="form-label">Cedula del comprador</label>
                        <input type="text" name="Cedula" class="form-control"  aria-describedby="emailHelp">
                        <div id="emailHelp" class="form-text"></div>
                        </div>

                        <div class="col-auto">
                        <input type="submit" name="eliminar" class="btn btn-primary" value="Eliminar">
                        <input type="submit" name="modificar" class="btn btn-secondary" value="Modificar">    
                        <input type="submit" name="enviar" class="btn btn-warning" value="Insertar">
                        </div>
                        <!--<label for="telefono">Rol</label>
                        <input type="email" name="rol" id="email" placeholder="Correo"  />

                        <label for="Codigo del empleado">sexo</label>
                        <input type ="text" name="codigo" id="asunto" placeholder="Codigo_empleado"/>
                        -->
                        
                        
                        

                        

                        <!--<input type="submit" name="enviar" value="enviar datos"/>
                        <input type="submit" name="modificar" value="Modificar datos"/>
                        <input type="submit" name="eliminar" value="eliminar datos"/>-->
                    </form>
                    </br>
                    </br>
                    </br>
                    <div id="section-tabla">
                        <table class="table table-success table-striped">
                           <thead>
                             <tr>
                                 <th>Id_compra</th>
                                 <th>Codigo del producto</th>
                                 <th>Cantidad requerida</th>
                                 <th>Cedula del comprador</th>
                                 
                             </tr>     
                         </thead>
                            <%

                                ArrayList<Con_Compras> datosu=new ArrayList<>();

                                Modelos.Mod_Compras mu=new Mod_Compras();
                                datosu=mu.consultarcompras();
                                Con_Compras  u=new Con_Compras();

                                for(int i=0; i<datosu.size(); i++){

                                u=datosu.get(i);


                            %>
                            <tbody>

                                        <tr>
                                            <td><%=u.getId_compra()%></td>
                                            <td><%=u.getCod_pro()%></td>
                                            <td><%=u.getCantidad()%></td>
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

<!--<form action="Sv_compras" target="" method="get" name="formDatosPersonales">

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
</form>-->

</body>
</html>
