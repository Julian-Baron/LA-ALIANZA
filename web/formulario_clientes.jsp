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
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.bundle.min.js" integrity="sha384-b5kHyXgcpbZJO/tY9Ul7kGkf1S0CWuKcCD38l8YkeH8z8QjE0GmW1gYU5S9FOnJ0" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="css/styles_header.css">
        <title>Clientes</title>
    </head>
    <body>
       
       <!-- inicio de la cabecera-->
    <header>
		<div class="wrapper">
			<div class="logo">Supermercado la Alianza</div>
			
			<nav>
				<a href="Formulario_Comprador.jsp">Formulario Comprador</a>
				<a href="Formulario_Domicilios.jsp">Formulario Domicilios</a>
				<a href="Formulario_FActuras.jsp">Formulario Facturas</a>
				<a href="Formulario_empleados.jsp">Formulario empleados</a>
                                <a href="Formulario_usuarios.jsp">Formulario usuarios</a>
                                <a href="formulario_Productos.jsp">Gestion productos</a>
                                <a href="formulario_clientes.jsp">Gestion Clientes</a>
			</nav>
		</div>
	</header>
    <!-- Contenedor formulario-->
    <div class="container">
            <h1>Formulario para la Gestion de clientes</h1>
            <div class="row">
                <div id="section">
            <form action="Sv_clientes" target="" method="Post" name="formDatosPersonales">
                
                <div class="mb-3">
                        <label for="exampleInputEmail1" class="form-label">Cedula</label>
                        <input type="text" name="Cedula" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                        <div id="emailHelp" class="form-text"></div>
                </div>

                        <!--<label for="Cedula">Cedula</label>
                        <input type="text" name="Cedula" id="nombre" placeholder="Nº Cedula"/>-->

                <div class="mb-3">
                        <label for="exampleInputEmail1" class="form-label">Nombre</label>
                        <input type="text" name="nombre" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                        <div id="emailHelp" class="form-text"></div>
                </div>
                
                <div class="mb-3">
                        <label for="exampleInputEmail1" class="form-label">Apellido</label>
                        <input type="text" name="apellido" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                        <div id="emailHelp" class="form-text"></div>
                </div>
                        
                <div class="mb-3">
                        <label for="exampleInputEmail1" class="form-label">Correo</label>
                        <input type="email" name="correo" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                        <div id="emailHelp" class="form-text"></div>
                </div>
                <div class="mb-3">
                        <label for="exampleInputEmail1" class="form-label">Direccion</label>
                        <input type="text" name="direccion" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                        <div id="emailHelp" class="form-text"></div>
                </div>
                        
                <div class="mb-3">
                        <label for="exampleInputEmail1" class="form-label">Telefono</label>
                        <input type="text" name="telefono" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                        <div id="emailHelp" class="form-text"></div>
                </div>
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
                <table class="table">
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
