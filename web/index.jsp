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
<html lang="en">
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl" crossorigin="anonymous">
    <link rel="stylesheet" href="css/styles_header.css">
    <link rel="stylesheet" href="css/Style_index.css">
    
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
      
      
    

    <!-- Option 1: Bootstrap Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.bundle.min.js" integrity="sha384-b5kHyXgcpbZJO/tY9Ul7kGkf1S0CWuKcCD38l8YkeH8z8QjE0GmW1gYU5S9FOnJ0" crossorigin="anonymous"></script>
    
       <!-- inicio de la cabecera-->
        <header>
            <div class="spinner"></div>
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
                              <a class="nav-link" href="login.jsp">Iniciar Sesion</a>
                            </li>
                            
                          </ul>
                        </div>
        
            </nav>
       
	</header>
       <!--Contenedor principal que mostrara imagen de bienbenida-->
       
       <div class="conteiner-sm">
            
           <div class="row">
               
               <div class="contenedor">

                   <!--CAROUSEL-->
                   <div id="carouselExampleControls" class="carousel slide" data-bs-ride="carousel">
  <div class="carousel-inner">
    <div class="carousel-item active">
      <img src="img/supermercado_paginaprincipal.jpg" class="img-fluid img-principal" alt="...">
    </div>
    <div class="carousel-item">
        <img src="img/snack.jpg" class="img-fluid img-principal" alt="...">
    </div>
    <div class="carousel-item">
        <img src="img/lefrute.jpg" class="img-fluid img-principal" alt="...">
    </div>
  </div>
  <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleControls"  data-bs-slide="prev">
    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
    <span class="visually-hidden">Previous</span>
  </button>
  <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleControls"  data-bs-slide="next">
    <span class="carousel-control-next-icon" aria-hidden="true"></span>
    <span class="visually-hidden">Next</span>
  </button>
</div>
           <!--END CAROUSEL-->    
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
<!--                            <h1>Los mejores productos de calidad</h1>
                        </div>
                    <div class="row">
                        

                    <div class="col-10"><p>
                       El supermercado la Alianza cuenta  con un sistema de domicilio eficaz el cual consiste en un paso a paso desde el cual el cliente solicita su pedido mediante vía telefónica cuya relación uno a muchos le permite al cliente adquirir gran cantidad de productos , los empleados toman nota del pedido y los datos del cliente como la dirección, el  nombre del usuario, el apellido y su edad en una libreta  junto con los productos solicitados donde la relación muchos a muchos hace que el empleado pueda organizar la información y los datos del pedido de manera eficaz q e inmediatamente se le informa al encargado del domicilio acerca del pedido y se le brindan los datos del cliente para su respectiva entrega donde la relación muchos a uno toma lugar al momento de entregar los productos del cliente confirmando los datos descritos por el cliente y se analiza la calidad de estos y si cumple las condiciones pactadas se finaliza el  proceso o de lo contrario se repite el proceso para cumplir con las condiciones estipuladas.

                    </p>
                    </div>
                    
                    </div>
                </div>
    -->            
    
         <div class="showcase">

            <h2>Los mejores productos de calidad</h2>
            <p>El supermercado la Alianza cuenta  con un sistema de domicilio eficaz el cual consiste en un paso a paso desde el cual el cliente solicita su pedido mediante vía telefónica cuya relación uno a muchos le permite al cliente adquirir gran cantidad de productos , los empleados toman nota del pedido y los datos del cliente como la dirección, el  nombre del usuario, el apellido y su edad en una libreta  junto con los productos solicitados donde la relación muchos a muchos hace que el empleado pueda organizar la información y los datos del pedido de manera eficaz q e inmediatamente se le informa al encargado del domicilio acerca del pedido y se le brindan los datos del cliente para su respectiva entrega donde la relación muchos a uno toma lugar al momento de entregar los productos del cliente confirmando los datos descritos por el cliente y se analiza la calidad de estos y si cumple las condiciones pactadas se finaliza el  proceso o de lo contrario se repite el proceso para cumplir con las condiciones estipuladas.
</p>
            <a href="#" class="btn">Read More <i class="fas fa-angle-double-right"></i></a>


        </div>
                
            </section>    
                    </div>
                    
                </div>
                
            </div>
       </div>
       


            <section class="social">

                <p>Contactanos!!!

                    <div class="links">

                <a href="#">

                    <i class="fab fa-facebook-f"></i>

                </a>

                <a href="#">

                    <i class="fab fa-whatsapp"></i>

                </a>

                <a href="#">

                    <i class="fab fa-youtube"></i>

                </a>


                    </div>

                </p>

            </section>



    </div>

    <div class="footer-links">

        <div class="footer-container">
            <ul>
                <li>
                    <a href="#">
                        <h3>Title One</h3>
                    </a>
                </li>
                <li>
                    <a href="#">Bloodlust</a>
                </li>
                <li>
                    <a href="#">Bloodlust</a>
                </li>
                <li>
                    <a href="#">Bloodlust</a>
                </li>
                <li>
                    <a href="#">Bloodlust</a>
                </li>
                <li>
                    <a href="#">Bloodlust</a>
                </li>
                <li>
                    <a href="#">Bloodlust</a>
                </li>
                <li>
                    <a href="#">Bloodlust</a>
                </li>
            </ul>
            <ul>
                <li>
                    <a href="#">
                        <h3>Title One</h3>
                    </a>
                </li>
                <li>
                    <a href="#">Bloodlust</a>
                </li>
                <li>
                    <a href="#">Bloodlust</a>
                </li>
                <li>
                    <a href="#">Bloodlust</a>
                </li>
                <li>
                    <a href="#">Bloodlust</a>
                </li>
                <li>
                    <a href="#">Bloodlust</a>
                </li>
                <li>
                    <a href="#">Bloodlust</a>
                </li>
                <li>
                    <a href="#">Bloodlust</a>
                </li>
            </ul>
            <ul>
                <li>
                    <a href="#">
                        <h3>Title One</h3>
                    </a>
                </li>
                <li>
                    <a href="#">Bloodlust</a>
                </li>
                <li>
                    <a href="#">Bloodlust</a>
                </li>
                <li>
                    <a href="#">Bloodlust</a>
                </li>
                <li>
                    <a href="#">Bloodlust</a>
                </li>
                <li>
                    <a href="#">Bloodlust</a>
                </li>
                <li>
                    <a href="#">Bloodlust</a>
                </li>
                <li>
                    <a href="#">Bloodlust</a>
                </li>
            </ul>
            <ul>
                <li>
                    <a href="#">
                        <h3>Title One</h3>
                    </a>
                </li>
                <li>
                    <a href="#">Bloodlust</a>
                </li>
                <li>
                    <a href="#">Bloodlust</a>
                </li>
                <li>
                    <a href="#">Bloodlust</a>
                </li>
                <li>
                    <a href="#">Bloodlust</a>
                </li>
                <li>
                    <a href="#">Bloodlust</a>
                </li>
                <li>
                    <a href="#">Bloodlust</a>
                </li>
                <li>
                    <a href="#">Bloodlust</a>
                </li>
            </ul>
        </div>

    </div>

    <footer class="footer">

        <h3>Yopi`s Company Copyright &copy;</h3>
        
        

    </footer>


    </div>
            
  </body>
</html>