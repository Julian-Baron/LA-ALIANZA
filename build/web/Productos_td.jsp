<%-- 
    Document   : Productos_td
    Created on : 14/03/2021, 11:29:37 AM
    Author     : Personal
--%>

<%@page import="Modelos.Modelo_Productos"%>
<%@page import="Constructor.Con_productos"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!--Busqueda de datos de los productos-->
<%
            ArrayList<Constructor.Con_productos> data=new ArrayList<>();
            Constructor.Con_productos con=new Con_productos();
            Modelos.Modelo_Productos mod=new Modelo_Productos();
            
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
    <title>Formularios de Gestion Clientes</title>
  </head>
    <body font-family:'Arvo', serif;>
        
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
        
        
        <section>
            <% /*Inicio de bucle para la busqueda de productos*/
                data=mod.consultarusuarios();
                for (int i = 0; i < data.size(); i++) {
                        con=data.get(i);
                                            
            %>
            <div class="container-xl px-4">
                <div class="row text-center align-self-center ">   
                            <div class="card" style="width: 18rem;">
                                <img src="<%=con.getImg()%>" class="card-img-top" alt="...">
                                    <div class="card-body">
                                      <h5 class="card-title"><%=con.getNombre_pro()%></h5>
                                      <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                                      <a href="#" class="btn btn-primary">Go somewhere</a>
                                   </div>
                            </div>
                            <div class="card" style="width: 20rem; margin: 20px; padding: 0px">
                                <img src="img/avatar-2155431_640.png" class="card-img-top" alt="..." style="height: 240px">
                                <div class="card-body">
                                    <a href="formulario_clientes.jsp" style="text-decoration: none"><h5 class="card-title">Formularios clientes</h5></a>
                                  <p class="card-text">Gestion de clientes que se han registradro.</p>
                                  <a href="formulario_clientes.jsp" class="btn btn-primary">Dirijirse...</a>
                                </div>
                            </div>
                        </div>
            </div>
            <%
            }
            /*Final del bucle*/
            %>
        </section>
        
        
        <script>
            
            $(function () {
                $('[data-toggle="popover"]').popover()
            });
        </script>
    </body>
</html>
