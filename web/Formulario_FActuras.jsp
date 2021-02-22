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
        
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.bundle.min.js" integrity="sha384-b5kHyXgcpbZJO/tY9Ul7kGkf1S0CWuKcCD38l8YkeH8z8QjE0GmW1gYU5S9FOnJ0" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="css/styles_header.css">

</head>
<body >
    <!-- inicio de la cabecera-->
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
    
    <!-- Contenedor formulario y tablas para centramiento de la pagina-->
    <div class="container ">
            <h1>Formulario para la Gestion de compras</h1>
            <div class="row">
                <div id="section">
                    <form action="" target="" method="Post" name="formDatosPersonales">

                        <div class="mb-3">
                            <label for="exampleInputEmail1" class="form-label">Consultar Factura por numero de factura</label>
                            <input type="number" name="Codigo Factura" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                            <div id="emailHelp" class="form-text"></div>
                            <input type="submit" name="FacturaEn" class="btn btn-primary" value="Ingresar">
                        </div>
                        
                        

                        <div class="mb-3">
                            <label for="exampleInputEmail1" class="form-label">Consultar Factura por cedula del cliente</label>
                            <input type="text" name="Codigo_pro" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                            <div id="emailHelp" class="form-text"></div>
                            <input type="submit" name="PorCedula" class="btn btn-primary" value="Ingresar">
                        </div>

                        

                        <div class="mb-3">
                            <label for="exampleInputEmail1" class="form-label">Consultar Factura  por fecha de accion</label>
                            <input type="number" name="Cantidad re" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                            <div id="emailHelp" class="form-text"></div>
                            <input type="submit" name="PorFecha" class="btn btn-primary" value="Ingresar">
                        </div>

                        <!--
                        <div class="mb-3">
                        <label for="exampleInputEmail1" class="form-label">Id_compra</label>
                        <input type="text" name="Cedula" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                        <div id="emailHelp" class="form-text"></div>
                        </div>

                        <div class="col-auto">

                        
                        </br>
                        <div class="mb-3">
                        <label for="exampleInputEmail1" class="form-label">Cod_domicilio</label>
                        <input type="text" name="Cedula" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                        <div id="emailHelp" class="form-text"></div>
                        </div>

                        <div class="col-auto">
                                              
                        -->
                        </br>

                        
                        <!--<button type="submit" class="btn btn-primary">Modificar</button>
                        <button type="submit" class="btn btn-primary">Eliminar</button>-->

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
                                 <th>Id_factura</th>
                                 <th>Fecha_fac</th>
                                 <th>Cedula</th>
                                 <th>Id_compra</th>
                                 <th>Cod_domicilio</th>
                                 
                             </tr>     
                         </thead>
                            <%

                                ArrayList<Con_Facturas> datosu=new ArrayList<>();

                                Modelos.Mod_Facturas mu=new Mod_Facturas();
                                datosu=mu.consultar_factura();
                                Con_Facturas  u=new Con_Facturas();

                                for(int i=0; i<datosu.size(); i++){

                                u=datosu.get(i);


                            %>
                            <tbody>

                                        <tr>
                                            <td><%=u.getId_factura()%></td>
                                            <td><%=u.getFecha_fac()%></td>
                                            <td><%=u.getCedula()%></td>
                                            <td><%=u.getId_compra()%></td>
                                            <td><%=u.getCod_domicilio()%></td>
                                          
                                        </tr>
                                     </tbody>
                                     <%
                                         }
                                         %>
                        </table>
                        

                    </div>
                </div>        
            </div>
        <section>
            <br>
            <br>
            <br>
            <h1 class="">Tabla Generada por consultas</h1>
        <table class="table">
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
    </div>

<!--<form action="" target="" method="get" name="formDatosPersonales">

	<label for="nombre">Consultar Factura por numero de factura</label>
	<input type="number" name="Codigo Factura" id="nombre" placeholder="id"/>
        <input type="submit" name="FacturaEn" value="enviar datos"/>
        
        
	<label for="apellidos">Consultar Factura por cedula del cliente</label>
	<input type="text" name="Cedula" id="apellidos" placeholder="codigo"/>
        <input type="submit" name="PorCedula" value="enviar datos"/>
        
	<label for="email" />Consultar factura por fecha de accion</label>
	<input type="text" name="Fecha" id="email" placeholder="disponible"/>
        <input type="submit" name="PorFecha" value="enviar datos"/>

	
</form>-->
    
    
    
    
</body>
</html>
