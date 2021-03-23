<%-- 
    Document   : Formulario_empleados
    Created on : 20/02/2021, 07:56:59 PM
    Author     : Personal
--%>

<%@page import="Modelos.Mod_empleados"%>
<%@page import="Constructor.Con_empleados"%>
<%@page import="java.util.ArrayList"%>
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
<link href="https://fonts.googleapis.com/css2?family=Fredericka+the+Great&display=swap" rel="stylesheet">
    

    <!--CSS-->
    <link rel="stylesheet" href="css/fonts.css">

    <!--ICONO-->
    <link rel="icon" href="img/alianza_1.png">
    
    <title>Formularios de Gestion Empleados</title>
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
			<div class="logo container">Supermercado la Alianza</div>
			
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
                <nav class="navbar navbar-expand-lg fixed-top navbar-light bg-info">
                    <div class="container"> 
                        <a class="navbar-brand" href="#">La Alianza</a>
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
                                  <li><a class="dropdown-item nav-link " href="formulario_clientes.jsp">Formularios Clientes</a></li>
                                <li><a class="dropdown-item nav-link" href="formulario_Productos.jsp">Formularios Productos</a></li>
                                <li><a class="dropdown-item nav-link" href="Formulario_Domicilios.jsp">Formularios Domicilios</a></li>
                                <li><a class="dropdown-item nav-link active" href="#">Formularios Usuarios</a></li>
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
                              <a class="nav-link" href="#">Cerrar Sesion</a>
                            </li>
                            
                          </ul>
                        </div>
                    </div>
            </nav>
       
	</header>
       
    <!-- Contenedor formulario-->
        
        <div class="container ">
            <h1>Formulario para la Gestion de empleados</h1>
            <div class="row">
                <div id="section">
                <form action="Sv_empleados"  method="Post" name="formDatosPersonales" required="">
                <div class="mb-3"><!--Cedula del empleado-->
                    <label for="exampleInputEmail1" class="form-label">Cedula</label>
                    <input type="text" name="cedula" class="form-control"  aria-describedby="emailHelp">
                    <div  class="form-text"></div>
                </div>
                
                <div class="mb-3"><!--Nombre del empleado-->
                    <label for="exampleInputEmail1" class="form-label">Nombre</label>
                    <input type="text" name="nombre" class="form-control"  aria-describedby="emailHelp">
                    <div  class="form-text"></div>
                </div>
                
                <div class="mb-3"><!--Apellido del empleado-->
                    <label for="exampleInputEmail1" class="form-label">Apellido</label>
                    <input type="text" name="apellido" class="form-control"  aria-describedby="emailHelp">
                    <div  class="form-text"></div>
                </div>
                
                <div class="mb-3"><!--Telefono del empleado-->
                    <label for="exampleInputEmail1" class="form-label">Telefono</label>
                    <input type="text" name="telefono" class="form-control"  aria-describedby="emailHelp">
                    <div  class="form-text"></div>
                </div>
                
                <div class="mb-3"><!--Correo del empleado-->
                    <label for="exampleInputEmail1" class="form-label">Correo</label>
                    <input type="email" name="correo" class="form-control"  aria-describedby="emailHelp">
                    <div  class="form-text"></div>
                </div>
                
                <div class="mb-3"><!--Codigo del empleado-->
                    <label for="exampleInputEmail1" class="form-label">Cod_emp</label>
                    <input type="text" name="codigo" class="form-control"  aria-describedby="emailHelp">
                    <div  class="form-text"></div>
                </div>
                    
                <input type="submit" name="eliminar" class="btn btn-primary" value="Eliminar">
                <input type="submit" name="modificar" class="btn btn-secondary" value="Modificar">    
                <input type="submit" name="enviar" class="btn btn-warning" value="Insertar">
               
                
                
                <!--Sin boostrap
                <label for="Cedula">Cedula</label>
                <input type="text" name="Cedula" id="nombre" placeholder="Nº Cedula"/>
                
                <label for="nombre">Nombre</label>
                <input type="text" name="nombre" id="nombre" placeholder="Nombre"/>

                <label for="apellidos">Apellido</label>
                <input type="text" name="apellido" id="apellidos" placeholder="Apellido"/>
                
                <label for="Codigo del empleado">Telefono</label>
                <input type ="text" name="telefono" id="asunto" placeholder="Telefono"/>
                
                <label for="telefono">Correo</label>
                <input type="email" name="correo" id="email" placeholder="Correo"  />
                
                <label for="Codigo del empleado">Codigo_empleado</label>
                <input type ="text" name="codigo" id="asunto" placeholder="Codigo_empleado"/>

                <input type="submit" name="enviar" value="enviar datos"/>
                <input type="submit" name="modificar" value="Modificar datos"/>
                <input type="submit" name="eliminar" value="eliminar datos"/>
                -->
            </form>
            
            
            <div id="section-table">
                <table class="table">
                   <thead>
                     <tr>
                         <th>Cedula</th>
                         <th>Nombre</th>
                         <th>apellido_cli</th>
                         <th>Telefono</th>
                         <th>Correo Electronico</th>
                         <th>Cod_empleado</th>
                     </tr>     
                 </thead>
                    <%
         
                        ArrayList<Con_empleados> datosu=new ArrayList<>();
                        
                        Modelos.Mod_empleados mu=new Mod_empleados();
                        datosu=mu.consultar_empleados();
                        Con_empleados  u=new Con_empleados();

                        for(int i=0; i<datosu.size(); i++){

                        u=datosu.get(i);


                    %>
                    
                        <tbody>
                            
                                <tr>
                                    <td><input required type="text" name="Codigoced" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" value="<%=u.getCedula()%>"></td>
                                    <td><input required type="text" name="nombrea" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" value="<%=u.getNombre_emp()%>"></td>
                                    <td><input required type="text" name="apellidoa" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" value="<%=u.getApellido_emp()%>"></td>
                                    <td><input required type="text" name="telefonoa" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" value="<%=u.getTelefono_emp()%>"></td>
                                    <td><input required type="text" name="correoa" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" value="<%=u.getCorreo_emp()%>"></td>
                                    <td><input required type="text" name="codigoa" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" value="<%=u.getCod_emp()%>"></td>
                                    <td>
                                        
                                    </td>
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
    </body>
</html>
