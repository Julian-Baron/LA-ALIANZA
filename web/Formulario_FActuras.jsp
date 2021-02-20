<%-- 
    Document   : Formulario_FActuras
    Created on : 16/02/2021, 11:00:39 PM
    Author     : Trabajos
--%>

<%@page import="Modelos.Mod_Facturas"%>
<%@page import="Constructor.Con_Facturas"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>Introducción formularios web</title>
	<meta charset="utf-8"/>
	<meta name="description" content=""/>
        <link rel="stylesheet" href="css/Styles.css">
	

</head>
<body>

<form action="" target="" method="get" name="formDatosPersonales">

	<label for="nombre">Consultar Factura por numero de factura</label>
	<input type="number" name="Codigo Factura" id="nombre" placeholder="id"/>
        <input type="submit" name="FacturaEn" value="enviar datos"/>
        
        
	<label for="apellidos">Consultar Factura por cedula del cliente</label>
	<input type="text" name="Cedula" id="apellidos" placeholder="codigo"/>
        <input type="submit" name="PorCedula" value="enviar datos"/>
        
	<label for="email" />Consultar factura por fecha de accion</label>
	<input type="text" name="Fecha" id="email" placeholder="disponible"/>
        <input type="submit" name="PorFecha" value="enviar datos"/>

	
</form>
    
    
    <section>
        <table>
            <thead>
                <tr>
                    <th>id_factura</th>
                    <th>Fecha_Fac</th>
                    <th>Cedula</th>
                    <th>Id_compra</th>
                    <th>Codigo_Domicilio</th>
                </tr>
            </thead>
                            
            <%
                if(request.getParameter("FacturaEn")!=null) {
                int a;
                a=Integer.parseInt(request.getParameter("Codigo Factura"));
                ArrayList<Con_Facturas> data=new ArrayList<>();
                String b=null,c=null;
                
                
                Con_Facturas con=new Con_Facturas(c, b, a);
                Modelos.Mod_Facturas md=new Mod_Facturas();
                Con_Facturas cu=new Con_Facturas();
                
                data=md.consultar_facturaXnumeroFac(con);
                
                for (int i = 0; i <data.size(); i++) {
                        cu=data.get(i);
                       
                    
                            
                        
                    %>   
                    <tbody>
                        <tr>
                            <td><%=cu.getId_factura()%></td>
                            <td><%=cu.getFecha_fac()%></td>
                            <td><%=cu.getCedula()%></td>
                            <td><%=cu.getId_compra()%></td>
                            <td><%=cu.getCod_domicilio()%></td>
                        </tr>
                    </tbody>
                    <%
                        
                    }
                }
                    
                    
            
                else if(request.getParameter("PorCedula")!=null) {
                String c;int a=0;
                c=request.getParameter("Cedula");
                ArrayList<Con_Facturas> data=new ArrayList<>();
                String b=null;
                
                
                Con_Facturas con=new Con_Facturas(c, b, a);
                Modelos.Mod_Facturas md=new Mod_Facturas();
                Con_Facturas cu=new Con_Facturas();
                
                data=md.consultar_facturaXCedula(con);
                
                for (int i = 0; i <data.size(); i++) {
                        cu=data.get(i);
                       
                    
                            
                        
                    %>   
                    <tbody>
                        <tr>
                            <td><%=cu.getId_factura()%></td>
                            <td><%=cu.getFecha_fac()%></td>
                            <td><%=cu.getCedula()%></td>
                            <td><%=cu.getId_compra()%></td>
                            <td><%=cu.getCod_domicilio()%></td>
                        </tr>
                    </tbody>
                    <%
                        
                    }
                }
                else if(request.getParameter("PorFecha")!=null) {
                String b;int a=0;
                b=request.getParameter("Fecha");
                ArrayList<Con_Facturas> data=new ArrayList<>();
                String c=null;
                
                
                Con_Facturas con=new Con_Facturas(c, b, a);
                Modelos.Mod_Facturas md=new Mod_Facturas();
                Con_Facturas cu=new Con_Facturas();
                
                data=md.consultar_facturaXfechaFac(con);
                
                for (int i = 0; i <data.size(); i++) {
                        cu=data.get(i);
                       
                    
                            
                        
                    %>   
                    <tbody>
                        <tr>
                            <td><%=cu.getId_factura()%></td>
                            <td><%=cu.getFecha_fac()%></td>
                            <td><%=cu.getCedula()%></td>
                            <td><%=cu.getId_compra()%></td>
                            <td><%=cu.getCod_domicilio()%></td>
                        </tr>
                    </tbody>
                    <%
                        
                    }
                }
                    %>
                
                
                
               
                
               
        </table>     
        
    </section>
    
</body>
</html>
