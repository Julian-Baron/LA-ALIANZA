<%-- 
    Document   : Formulario_usuarios
    Created on : 20/02/2021, 09:53:28 PM
    Author     : Personal
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="Modelos.Mod_usuarios"%>
<%@page import="Constructor.Con_usuarios"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
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
            <h1>Formulario para la Gestion de usuarios</h1>
            <div class="row">
                <div id="section">
                    <form action="Sv_usuarios" target="" method="Post" name="formDatosPersonales">

                        <div class="mb-3">
                        <label for="exampleInputEmail1" class="form-label">Cedula</label>
                        <input type="text" name="Cedula" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                        <div id="emailHelp" class="form-text"></div>
                        </div>

                        <!--<label for="Cedula">Cedula</label>
                        <input type="text" name="Cedula" id="nombre" placeholder="Nº Cedula"/>-->

                        <div class="mb-3">
                        <label for="exampleInputEmail1" class="form-label">Nombre de usuario</label>
                        <input type="text" name="nombre" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                        <div id="emailHelp" class="form-text"></div>
                        </div>

                        <!--<label for="nombre">Nombre de usuario</label>
                        <input type="text" name="nombre" id="nombre" placeholder="Nombre"/>-->

                        <div class="mb-3">
                        <label for="exampleInputEmail1" class="form-label">Contraseña</label>
                        <input type="password" name="contraseña" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                        <div id="emailHelp" class="form-text"></div>
                        </div>

                        <!--<label for="apellidos">Contraseña</label>
                        <input type="text" name="contraseña" id="apellidos" placeholder="Apellido"/>
                        -->

                        <div class="col-auto">

                        <select class="form-select" id="autoSizingSelect" name="rol">
                            <option selected>Escoger...</option>
                            <option value="1">Administrador</option>
                            <option value="2">Empleado</option>
                            <option value="3">Cliente</option>
                        </select>
                        </div>
                        </br>
                        <!--<label for="telefono">Rol</label>
                        <input type="email" name="rol" id="email" placeholder="Correo"  />

                        <label for="Codigo del empleado">sexo</label>
                        <input type ="text" name="codigo" id="asunto" placeholder="Codigo_empleado"/>
                        -->
                        
                        <div class="col-auto">

                        <select class="form-select" id="autoSizingSelect" name="sexo">
                            <option selected>Sexo...</option>
                            <option value="1">Masculino</option>
                            <option value="2">Femenino</option>
                            <option value="3">Otro..</option>
                        </select>
                        </div>
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
                                 <th>Cedula</th>
                                 <th>Nombre de Usuario</th>
                                 <th>Contraseña</th>
                                 <th>rol</th>
                                 <th>Sexo</th>
                                 
                             </tr>     
                         </thead>
                            <%

                                ArrayList<Con_usuarios> datosu=new ArrayList<>();

                                Modelos.Mod_usuarios mu=new Mod_usuarios();
                                datosu=mu.consultar_empleados();
                                Con_usuarios  u=new Con_usuarios();

                                for(int i=0; i<datosu.size(); i++){

                                u=datosu.get(i);


                            %>
                            <tbody>

                                        <tr>
                                            <td><%=u.getCedula()%></td>
                                            <td><%=u.getNombre_usu()%></td>
                                            <td><%=u.getContraseña()%></td>
                                            <td><%=u.getRol()%></td>
                                            <td><%=u.getSexo()%></td>

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

<!--<form>
  <div class="mb-3">
    <label for="exampleInputEmail1" class="form-label">Email address</label>
    <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
    <div id="emailHelp" class="form-text">We'll never share your email with anyone else.</div>
  </div>
  <div class="mb-3">
    <label for="exampleInputPassword1" class="form-label">Password</label>
    <input type="password" class="form-control" id="exampleInputPassword1">
  </div>
  <div class="mb-3 form-check">
    <input type="checkbox" class="form-check-input" id="exampleCheck1">
    <label class="form-check-label" for="exampleCheck1">Check me out</label>
  </div>
  <button type="submit" class="btn btn-primary">Submit</button>
</form>-->