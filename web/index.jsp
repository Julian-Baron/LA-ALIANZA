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
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl" crossorigin="anonymous">
    <link rel="stylesheet" href="css/styles_header.css">
    <link rel="stylesheet" href="css/Style_index.css">
    
    <title>Formularios de Gestion Clientes</title>
  </head>
  <body>
    

    <!-- Option 1: Bootstrap Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.bundle.min.js" integrity="sha384-b5kHyXgcpbZJO/tY9Ul7kGkf1S0CWuKcCD38l8YkeH8z8QjE0GmW1gYU5S9FOnJ0" crossorigin="anonymous"></script>
    
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
                    <div class="container-fluid"> 
                            
                        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
                            <span class="navbar-toggler-icon"></span>
                          </button>
                        <div class="collapse navbar-collapse" id="navbarNavDropdown">
                          <ul class="navbar-nav">
                              <li class="nav-item">
                              <a class="nav-link active" aria-current="page" href="#">Inicio</a>
                            </li>
                              <li class="nav-item dropdown">
                              <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                                  Formularios
                              </a>
                              <ul class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
                                <li><a class="dropdown-item nav-link " href="#">Formularios Clientes</a></li>
                                <li><a class="dropdown-item nav-link" href="formulario_Productos.jsp">Formularios Productos</a></li>
                                <li><a class="dropdown-item nav-link active" href="#">Formularios Domicilios</a></li>
                                <li><a class="dropdown-item nav-link" href="Formulario_usuarios.jsp">Formularios Usuarios</a></li>
                                <li><a class="dropdown-item nav-link" href="Formulario_FActuras.jsp">Formularios Facturas</a></li>
                                <li><a class="dropdown-item nav-link" href="Formulario_Comprador.jsp">Formularios Compras</a></li>
                              </ul>
                            </li>                                               
                            <li class="nav-item">
                              <a class="nav-link active" aria-current="page" href="#">Inicio</a>
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
       <!--Contenedor principal que mostrara imagen de bienbenida-->
       
       <div class="conteiner-sm">
            
           <div class="row">
               
               <div class="contenedor">
                   <img class="img-fluid img-principal" src="img/supermercado_paginaprincipal.jpg" />
               
                   <div class="centrado">BIENVENIDO A LA PAGINA DE SUPERMERCADOS LA ALIANZA</div>
                   
                   <div class="centrado-abajo">
                    <button type="button" class="btn btn-light">SABER MÁS...</button>

                   </div>
            </div>
               
           </div>
            <!--Contenedor de la pagina despues de la imagen. Almacenara toda la informacion correspondiente-->
            <div class="container-md">
            <section>
                <div class="container-md">
                    <div class="container " style="transform: translateX(20%)">
                            <h1>Los mejores productos de calidad</h1>
                        </div>
                    <div class="row">
                        
                    <div class="col-1 position-relative">
                    <img src="img/face.png">
                    </div>
                    <div class="col-10"><p>
                        Esto es así porque los navegadores no reconocen un salto de línea, a no ser que se lo indiquemos específicamente. Para ello, empleamos otro tag nuevo. Se trata de <br>. Este tag no recibe ningún tipo de atributo y no tiene cierre, es decir, no existe </br>. Esto último es así porque, a diferencia de otros tags, este no establece un efecto sobre la página (como hace, por ejemplo, body, que tiene que marcar el principio y el final de los contenidos), sino que este tag ejecuta una acción puntual (un salto de línea). Veamos un ejemplo, modificación del código anterior. Tecléelo y guárdelo como salto_de_linea.htm.
                    </p>
                    </div>
                    
                    </div>
                </div>
            </section>
            </div>    
            
  </body>
</html>