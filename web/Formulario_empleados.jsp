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
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container ">
            <h1>Formulario para la Gestion de compras</h1>
            <div class="row">
                <div id="section">
            <form action="Sv_empleados" target="" method="Post" name="formDatosPersonales">
                <div class="mb-3"><!--Cedula del empleado-->
                    <label for="exampleInputEmail1" class="form-label">Cedula</label>
                    <input type="text" name="Cedula" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                    <div id="emailHelp" class="form-text"></div>
                </div>
                
                <div class="mb-3"><!--Nombre del empleado-->
                    <label for="exampleInputEmail1" class="form-label">Nombre</label>
                    <input type="text" name="nombre" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                    <div id="emailHelp" class="form-text"></div>
                </div>
                
                <div class="mb-3"><!--Apellido del empleado-->
                    <label for="exampleInputEmail1" class="form-label">Apellido</label>
                    <input type="text" name="apellido" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                    <div id="emailHelp" class="form-text"></div>
                </div>
                
                <div class="mb-3"><!--Telefono del empleado-->
                    <label for="exampleInputEmail1" class="form-label">Apellido</label>
                    <input type="text" name="Cedula" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                    <div id="emailHelp" class="form-text"></div>
                </div>
                
                
                
                
                
                
                <!--Sin boostrap-->
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
            </form>
            
            
            <div id="section-tabla">
                <table>
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
                                    <td><%=u.getCedula()%></td>
                                    <td><%=u.getNombre_emp()%></td>
                                    <td><%=u.getApellido_emp()%></td>
                                    <td><%=u.getTelefono_emp()%></td>
                                    <td><%=u.getCorreo_emp()%></td>
                                    <td><%=u.getCod_emp()%></td>
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
