<%-- 
    Document   : formulario_Productos
    Created on : 16/02/2021, 07:11:30 PM
    Author     : Trabajos
--%>

<%@page import="Modelos.Modelo_Productos"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Constructor.Con_productos"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
	<title>Formulario Productos</title>
	<meta charset="utf-8"/>
	<meta name="description" content=""/>
    <link rel="stylesheet" href="css/Styles.css">
	

    </head>
    <body>
    
        <div id="section">
            <form action="Sv_productos" target="" method="Post" name="formDatosPersonales">

                <label for="nombre">Cod_producto</label>
                <input type="text" name="Codigo_pro" id="nombre" placeholder="Nombre del producto"/>
                
                <label for="nombre">Nombre</label>
                <input type="text" name="nombre" id="nombre" placeholder="Nombre del producto"/>

                <label for="apellidos">Marca del Producto</label>
                <input type="text" name="Marca" id="apellidos" placeholder="Marca del producto"/>

                <label for="email" />Cantidad disponible</label>
                <input type="text" name="Cantidad" id="email" placeholder="disponible" required />

                <label for="Precio_pro">Precio del producto</label>
                <input type ="text" name="Precio" id="asunto" placeholder="Precio pro"/>

                <label for="asunto">Descripcion del producto</label>
                <input type ="text" name="Descripcion" id="asunto" placeholder="Descripcion"/>

                <input type="submit" name="enviar" value="enviar datos"/>
                <input type="submit" name="modificar" value="enviar datos"/>
                <input type="submit" name="eliminar" value="enviar datos"/>
            </form>
            
            
            <div id="section-tabla">
                <table>
                   <thead>
                     <tr>

                         <th>Codigo_Producto</th>
                         <th>Nombre</th>
                         <th>Marca del producto</th>
                         <th>Cantidad disponible</th>
                         <th>Precio</th>
                         <th>Descripcion</th>
                     </tr>     
                 </thead>
                    <%
         
                        ArrayList<Con_productos> datosu=new ArrayList<>();
                        
                        Modelos.Modelo_Productos mu=new Modelo_Productos();
                        datosu=mu.consultarusuarios();
                        Con_productos  u=new Con_productos();

                        for(int i=0; i<datosu.size(); i++){

                        u=datosu.get(i);


                    %>
                    <tbody>

                                <tr>
                                    <td><%=u.getCod_pro()%></td>
                                    <td><%=u.getNombre_pro()%></td>
                                    <td><%=u.getMarca()%></td>
                                    <td><%=u.getDisponibles()%></td>
                                    <td><%=u.getPrecio()%></td>
                                    <td><%=u.getDescripcion()%></td>
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
