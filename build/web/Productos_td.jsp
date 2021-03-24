<%-- 
    Document   : Productos_td
    Created on : 14/03/2021, 11:29:37 AM
    Author     : Personal
--%>

<%@page import="controllers.ControladorProducto"%>
<%@page import="javax.swing.JOptionPane"%>
<%@page import="Modelos.Modelo_Productos"%>
<%@page import="Constructor.Con_productos"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!--Busqueda de datos de los productos-->
<%
           
        controllers.ControladorProducto can=new ControladorProducto();
        %>
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
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css2?family=Arvo&display=swap" rel="stylesheet">
    
       <!--Font-->
    
    <link rel="preconnect" href="https://fonts.gstatic.com">
<link href="https://fonts.googleapis.com/css2?family=Fredericka+the+Great&display=swap" rel="stylesheet">
    

    <!--CSS-->
    <link rel="stylesheet" href="css/fonts.css">

    <!--ICONO-->
    <link rel="icon" href="img/alianza_1.png">
    
<<<<<<< Upstream, based on i1/Yopi1

    
    <title>Formularios de Gestion Clientes</title>
=======
    <title>Productos</title>
>>>>>>> 230e0e0 Nuevas clases para la gestion del carro de compras y js para el boton de eliminar, jsp nuevos para la presentacion del las compras
  </head>
    <body font-family="'Arvo', serif;">
        
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.bundle.min.js" integrity="sha384-b5kHyXgcpbZJO/tY9Ul7kGkf1S0CWuKcCD38l8YkeH8z8QjE0GmW1gYU5S9FOnJ0" crossorigin="anonymous"></script>
        
        <header>
		<!-- cabecera de la pagina-->
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
                            <li class="nav-item">
                                <a class="nav-link " href="Formularios de gestion.jsp">Volver</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link " href="Carrito.jsp"><img class="bi bi-cart" src="img/cart.svg"></i>Ver carrito</a>
                            </li>
                            <li class="nav-item">
                              <a class="nav-link" href="#">Cerrar Sesion</a>
                            </li>
                            
                          </ul>
                        </div>
                    
        
            </nav>
       
	</header>
        
        
        <section>
            
            
            <div class="container-xl" id="container-first">
                <div class="row">
                    <form>
                       <div class="col-sm-4">
                            <%=can.getProductos()%>
                        </div>
                    </form> 
                </div>
            </div>
                    
            
        </section>
        
        
        <script>
            
            
        </script>
    </body>
</html>
