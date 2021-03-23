<%-- 
    Document   : formulario_clientes
    Created on : 20/02/2021, 11:08:09 AM
    Author     : Personal
--%>
<%@page import="Constructor.Con_clientes"%>
<%@page import="Modelos.Mod_Clientes"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Constructor.Con_Domicilios"%>
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
                        <a class="navbar-brand" href="#">Menu</a>
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
                                <li><a class="dropdown-item nav-link active" href="#">Formularios Clientes</a></li>
                                <li><a class="dropdown-item nav-link" href="formulario_Productos.jsp">Formularios Productos</a></li>
                                <li><a class="dropdown-item nav-link" href="Formulario_Domicilios.jsp">Formularios Domicilios</a></li>
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
                              <a class="nav-link" href="#">Cerrar Sesion</a>
                            </li>
                            
                          </ul>
                        </div>
        
            </nav>
       
	</header>
       
    <!-- Contenedor formulario-->
    <div class="container" id="container-first">
            <h1>Formulario para la Gestion de clientes</h1>
            <div class="row">
                <div id="section">
            <form action="Sv_clientes" method="Post" name="formDatosPersonales">
                
                <div class="mb-3">
                        <label  class="form-label">Cedula</label>
                        <input type="text" name="Cedula" class="form-control"  aria-describedby="emailHelp">
                        <div  class="form-text"></div>
                </div>

                        <!--<label for="Cedula">Cedula</label>
                        <input type="text" name="Cedula" id="nombre" placeholder="Nº Cedula"/>-->

                <div class="mb-3">
                        <label  class="form-label">Nombre</label>
                        <input type="text" name="nombre" class="form-control"  aria-describedby="emailHelp">
                        <div  class="form-text"></div>
                </div>
                
                <div class="mb-3">
                        <label class="form-label">Apellido</label>
                        <input type="text" name="apellido" class="form-control"  aria-describedby="emailHelp">
                        <div  class="form-text"></div>
                </div>
                        
                <div class="mb-3">
                        <label class="form-label">Correo</label>
                        <input type="email" name="correo" class="form-control" aria-describedby="emailHelp">
                        <div  class="form-text"></div>
                </div>
                <div class="mb-3">
                        <label class="form-label">Direccion</label>
                        <input type="text" name="direccion" class="form-control" aria-describedby="emailHelp">
                        <div  class="form-text"></div>
                </div>
                        
                <div class="mb-3">
                        <label class="form-label">Telefono</label>
                        <input type="text" name="telefono" class="form-control" aria-describedby="emailHelp">
                        <div  class="form-text"></div>
                </div>
                        
                
                <input type="submit" name="eliminar" class="btn btn-primary" value="Eliminar">
                <input type="submit" name="modificar" class="btn btn-secondary" value="Modificar">    
                <input type="submit" name="enviar" class="btn btn-warning" value="Insertar">
                   
                
                <!--
                <label for="nombre">Cedula</label>
                <input type="text" name="Cedula" id="nombre" placeholder="Nº Cedula"/>
                
                <label for="nombre">Nombre</label>
                <input type="text" name="nombre" id="nombre" placeholder="Nombre"/>

                <label for="apellidos">Apellido</label>
                <input type="text" name="apellido" id="apellidos" placeholder="Apellido"/>

                <label for="email" />Correo</label>
                <input type="email" name="correo" id="email" placeholder="Correo"  />
                
                <label for="Precio_pro">Direccion</label>
                <input type ="text" name="direccion" id="asunto" placeholder="Direccion"/>
                
                <label for="asunto">Telefono</label>
                <input type ="text" name="telefono" id="asunto" placeholder="Telefono"/>

                <input type="submit" name="enviar" value="enviar datos"/>
                <input type="submit" name="modificar" value="Modificar datos"/>
                <input type="submit" name="eliminar" value="eliminar datos"/>-->
                
                
            </form>
            
            
            <div id="section-tabla">
                <table class="table table-hover table-bordered" >
                   <thead>
                     <tr>
                         <th>Cedula</th>
                         <th>Nombre</th>
                         <th>apellido_cli</th>
                         <th>Correo Electronico</th>
                         <th>Direccion_cli</th>
                         <th>Telefono</th>
                     </tr>     
                 </thead>
                    <%
         
                        ArrayList<Con_clientes> datosu=new ArrayList<>();
                        
                        Modelos.Mod_Clientes mu=new Mod_Clientes();
                        datosu=mu.consultar_clientes();
                        Con_clientes  u=new Con_clientes();

                        for(int i=0; i<datosu.size(); i++){

                        u=datosu.get(i);


                    %>
                    <tbody>

                                <tr>
                                    <td><%=u.getCedula()%></td>
                                    <td><%=u.getNombre()%></td>
                                    <td><%=u.getApellido()%></td>
                                    <td><%=u.getCorreo()%></td>
                                    <td><%=u.getDireccion()%></td>
                                    <td><%=u.getTelefono()%></td>
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
