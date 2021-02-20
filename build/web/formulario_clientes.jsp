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
        
        <title>JSP Page</title>
    </head>
    <body>
       
        <div id="section">
            <form action="Sv_clientes" target="" method="Post" name="formDatosPersonales">

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
                <input type="submit" name="eliminar" value="eliminar datos"/>
            </form>
            
            
            <div id="section-tabla">
                <table>
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
        
        
        
    </body>
</html>
