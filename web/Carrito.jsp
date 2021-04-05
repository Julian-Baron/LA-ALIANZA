<%-- 
    Document   : Carrito
    Created on : 23/03/2021, 01:03:13 PM
    Author     : Personal
--%>

<%@page import="Constructor.Con_productos"%>
<%@page import="controllers.ControladorProducto"%>
<%@page import="Constructor.Articulo"%>
<%@page import="Constructor.Con_carrito"%>
<%@page import="java.util.ArrayList"%>
<%
    HttpSession obj=request.getSession();
    String ua=(String) obj.getAttribute("usuario");
    String ced=(String) obj.getAttribute("cedula");
    String nom_cli=(String) obj.getAttribute("nombre_cli");
%>            
<%
    HttpSession sesion=request.getSession(true);
    ArrayList<Articulo> articulos = sesion.getAttribute("carrito") == null ? null : (ArrayList)sesion.getAttribute("carrito");

%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
    <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl" crossorigin="anonymous">
    <link rel="stylesheet" href="css/styles_header.css">
    <link rel="stylesheet" href="css/Style_index.css">
    <link rel="preconnect" href="https://fonts.gstatic.com">

<link href="https://fonts.googleapis.com/css2?family=Orbitron:wght@500&display=swap" rel="stylesheet">
    

    
        <!--ICONO-->
    <link rel="icon" href="img/alianza_1.png">
    

    <!--CSS-->
    <link rel="stylesheet" href="css/fonts.css">

    <title>Productos</title>
  </head>
    <body>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.bundle.min.js" integrity="sha384-b5kHyXgcpbZJO/tY9Ul7kGkf1S0CWuKcCD38l8YkeH8z8QjE0GmW1gYU5S9FOnJ0" crossorigin="anonymous"></script>
        <script src="js/jquery-3.6.0.min.js"></script>
        <script src="js/Carr.js"></script>
        <header>
		<!-- cabecera de la pagina-->
                <nav class="navbar navbar-expand-lg sticky-top navbar-light bg" style="background: #DEB916">
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

                                  <a class="nav-link active" aria-current="page" href="index.jsp">Inicio</a>
                            </li> <li class="nav-item">
                                <a class="nav-link fas fa-cart-plus"  aria-current="page" href="Productos_td.jsp">Seguir comprando<label><%request.getAttribute("contador");%></label></a>
                            </li>
                              <li class="nav-item dropdown">
                              <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                                  Formularios
                              </a>
                              <ul class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
                                
                              </ul>
                            </li>                                               
                            
                            <li class="nav-item">
                                <a class="nav-link " href="Carrito.jsp">Ver carrito</a>
                            </li>                          
                                
                                
                            
                          </ul>
                        </div>
                    </div>
                 
            </nav>
       
	</header>
                            
        <section>
            <div class="container mt-4" >

                <div class="fs-2" style="color: black" >Compras generadas </div>
                <div class="row">
                    <div class="col-xl-8">
                        <table class="table table-success table-striped">

                            <thead>
                                
                                    <tr>                
                                        <th>Nombre</th>
                                        <th>Descripcion</th>
                                        <th>Precio</th>
                                        <th>Cantidad</th>
                                        <th>Total</th>
                                    </tr>
                                
                            </thead>
                            <tbody>
                                <%
                                     
                                   controllers.ControladorProducto cp=new ControladorProducto();
                                   double total=0;
                                   if(articulos != null){
                                   for(Articulo a: articulos){
                                       Con_productos producto= cp.getproducto(a.getIdProducto());
                                        total+=a.getCantidad()* producto.getPrecio(); 
                                        
                                    %>
                                    
                                    <tr>
                                        <td><%=producto.getNombre_pro()%></td>
                                        <td><%=producto.getDescripcion()%></td>
                                        <td>$ <%=producto.getPrecio()%></td>
                                        <td><%=a.getCantidad()%></td>
                                        <td>$ <%=Math.round(producto.getPrecio()*a.getCantidad()*100.0/100.0)%></td>
                                        <td>
                                            <span id="idarticulo" style="display:none;"><%=producto.getCod_pro()%></span>
                                            <a class="" id="deleteitem"><svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-trash-fill" viewBox="0 0 16 16">
                                                <path d="M2.5 1a1 1 0 0 0-1 1v1a1 1 0 0 0 1 1H3v9a2 2 0 0 0 2 2h6a2 2 0 0 0 2-2V4h.5a1 1 0 0 0 1-1V2a1 1 0 0 0-1-1H10a1 1 0 0 0-1-1H7a1 1 0 0 0-1 1H2.5zm3 4a.5.5 0 0 1 .5.5v7a.5.5 0 0 1-1 0v-7a.5.5 0 0 1 .5-.5zM8 5a.5.5 0 0 1 .5.5v7a.5.5 0 0 1-1 0v-7A.5.5 0 0 1 8 5zm3 .5v7a.5.5 0 0 1-1 0v-7a.5.5 0 0 1 1 0z"/>
                                            </svg></i></a>
                                        </td>
                                    </tr>
                                    <%
                                        }
                                    }
                                       
                                    
                                    %>
                            </tbody>
                        </table>

                            <%if(articulos == null){%>
                            <span style="color: black" >No hay articulos en el carro</span>
                            <%}%>

                    </div>
                    
                            
                    <div class="col-sm-4">
                        <div class="card">
                            <div class="card-header" style="color: black">
                                <div class="fs-2" >Compras generadas</div>

                            </div>
                        </div>
                        <div class="card-body">
                            <label>Subtotal:</label>
                            <input type="text"  readonly="" class="form-control" value="<%=Math.round(total*100.0/100.0)%>">
                            <label>Total Pagar:</label>
                            <input type="text"  readonly="" class="form-control" value="<%=Math.round(total*100.0/100.0)%>">
                        </div>
                        <div class="card-footer">
                            <a class="btn btn-info btn-block">Generar compra</a>                    
                        </div>
                    </div>
                    
                </div>
                <a href="javascript:window.history.go(-2)">Seguir Comprando</a> 
                
            </div>
            
        </section>
                                              
        
    </body>
</html>
