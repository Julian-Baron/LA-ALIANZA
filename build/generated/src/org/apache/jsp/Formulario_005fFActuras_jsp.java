package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Modelos.Mod_Facturas;
import Constructor.Con_Facturas;
import java.util.ArrayList;

public final class Formulario_005fFActuras_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<title>Introducción formularios wb</title>\n");
      out.write("\t<meta charset=\"utf-8\"/>\n");
      out.write("\t<meta name=\"description\" content=\"\"/>\n");
      out.write("        \n");
      out.write("\t<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl\" crossorigin=\"anonymous\">\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-b5kHyXgcpbZJO/tY9Ul7kGkf1S0CWuKcCD38l8YkeH8z8QjE0GmW1gYU5S9FOnJ0\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/styles_header.css\">\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body >\n");
      out.write("    <!-- inicio de la cabecera-->\n");
      out.write("    <header>\n");
      out.write("\t\t<div class=\"wrapper\">\n");
      out.write("\t\t\t<div class=\"logo\">Supermercado la Alianza</div>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<nav>\n");
      out.write("\t\t\t\t<a href=\"Formulario_Comprador.jsp\">Formulario Comprador</a>\n");
      out.write("\t\t\t\t<a href=\"Formulario_Domicilios.jsp\">Formulario Domicilios</a>\n");
      out.write("\t\t\t\t<a href=\"Formulario_FActuras.jsp\">Formulario Facturas</a>\n");
      out.write("\t\t\t\t<a href=\"Formulario_empleados.jsp\">Formulario empleados</a>\n");
      out.write("                                <a href=\"Formulario_usuarios.jsp\">Formulario usuarios</a>\n");
      out.write("                                <a href=\"formulario_Productos.jsp\">Gestion productos</a>\n");
      out.write("                                <a href=\"formulario_clientes.jsp\">Gestion Clientes</a>\n");
      out.write("\t\t\t</nav>\n");
      out.write("\t\t</div>\n");
      out.write("\t</header>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <!-- Contenedor formulario y tablas para centramiento de la pagina-->\n");
      out.write("    <div class=\"container \">\n");
      out.write("            <h1>Formulario para la Gestion de compras</h1>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div id=\"section\">\n");
      out.write("                    <form action=\"\" target=\"\" method=\"Post\" name=\"formDatosPersonales\">\n");
      out.write("\n");
      out.write("                        <div class=\"mb-3\">\n");
      out.write("                            <label for=\"exampleInputEmail1\" class=\"form-label\">Consultar Factura por numero de factura</label>\n");
      out.write("                            <input type=\"number\" name=\"Codigo Factura\" class=\"form-control\" id=\"exampleInputEmail1\" aria-describedby=\"emailHelp\">\n");
      out.write("                            <div id=\"emailHelp\" class=\"form-text\"></div>\n");
      out.write("                            <input type=\"submit\" name=\"FacturaEn\" class=\"btn btn-primary\" value=\"Ingresar\">\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("\n");
      out.write("                        <div class=\"mb-3\">\n");
      out.write("                            <label for=\"exampleInputEmail1\" class=\"form-label\">Consultar Factura por cedula del cliente</label>\n");
      out.write("                            <input type=\"text\" name=\"Codigo_pro\" class=\"form-control\" id=\"exampleInputEmail1\" aria-describedby=\"emailHelp\">\n");
      out.write("                            <div id=\"emailHelp\" class=\"form-text\"></div>\n");
      out.write("                            <input type=\"submit\" name=\"PorCedula\" class=\"btn btn-primary\" value=\"Ingresar\">\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        \n");
      out.write("\n");
      out.write("                        <div class=\"mb-3\">\n");
      out.write("                            <label for=\"exampleInputEmail1\" class=\"form-label\">Consultar Factura  por fecha de accion</label>\n");
      out.write("                            <input type=\"number\" name=\"Cantidad re\" class=\"form-control\" id=\"exampleInputEmail1\" aria-describedby=\"emailHelp\">\n");
      out.write("                            <div id=\"emailHelp\" class=\"form-text\"></div>\n");
      out.write("                            <input type=\"submit\" name=\"PorFecha\" class=\"btn btn-primary\" value=\"Ingresar\">\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <!--\n");
      out.write("                        <div class=\"mb-3\">\n");
      out.write("                        <label for=\"exampleInputEmail1\" class=\"form-label\">Id_compra</label>\n");
      out.write("                        <input type=\"text\" name=\"Cedula\" class=\"form-control\" id=\"exampleInputEmail1\" aria-describedby=\"emailHelp\">\n");
      out.write("                        <div id=\"emailHelp\" class=\"form-text\"></div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"col-auto\">\n");
      out.write("\n");
      out.write("                        \n");
      out.write("                        </br>\n");
      out.write("                        <div class=\"mb-3\">\n");
      out.write("                        <label for=\"exampleInputEmail1\" class=\"form-label\">Cod_domicilio</label>\n");
      out.write("                        <input type=\"text\" name=\"Cedula\" class=\"form-control\" id=\"exampleInputEmail1\" aria-describedby=\"emailHelp\">\n");
      out.write("                        <div id=\"emailHelp\" class=\"form-text\"></div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"col-auto\">\n");
      out.write("                                              \n");
      out.write("                        -->\n");
      out.write("                        </br>\n");
      out.write("\n");
      out.write("                        \n");
      out.write("                        <!--<button type=\"submit\" class=\"btn btn-primary\">Modificar</button>\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-primary\">Eliminar</button>-->\n");
      out.write("\n");
      out.write("                        <!--<input type=\"submit\" name=\"enviar\" value=\"enviar datos\"/>\n");
      out.write("                        <input type=\"submit\" name=\"modificar\" value=\"Modificar datos\"/>\n");
      out.write("                        <input type=\"submit\" name=\"eliminar\" value=\"eliminar datos\"/>-->\n");
      out.write("                    </form>\n");
      out.write("                    </br>\n");
      out.write("                    </br>\n");
      out.write("                    </br>\n");
      out.write("                    <div id=\"section-tabla\">\n");
      out.write("                        <table class=\"table\">\n");
      out.write("                           <thead>\n");
      out.write("                             <tr>\n");
      out.write("                                 <th>Id_factura</th>\n");
      out.write("                                 <th>Fecha_fac</th>\n");
      out.write("                                 <th>Cedula</th>\n");
      out.write("                                 <th>Id_compra</th>\n");
      out.write("                                 <th>Cod_domicilio</th>\n");
      out.write("                                 \n");
      out.write("                             </tr>     \n");
      out.write("                         </thead>\n");
      out.write("                            ");


                                ArrayList<Con_Facturas> datosu=new ArrayList<>();

                                Modelos.Mod_Facturas mu=new Mod_Facturas();
                                datosu=mu.consultar_factura();
                                Con_Facturas  u=new Con_Facturas();

                                for(int i=0; i<datosu.size(); i++){

                                u=datosu.get(i);


                            
      out.write("\n");
      out.write("                            <tbody>\n");
      out.write("\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td>");
      out.print(u.getId_factura());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print(u.getFecha_fac());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print(u.getCedula());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print(u.getId_compra());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print(u.getCod_domicilio());
      out.write("</td>\n");
      out.write("                                          \n");
      out.write("                                        </tr>\n");
      out.write("                                     </tbody>\n");
      out.write("                                     ");

                                         }
                                         
      out.write("\n");
      out.write("                        </table>\n");
      out.write("                        \n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>        \n");
      out.write("            </div>\n");
      out.write("        <section>\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <h1 class=\"\">Tabla Generada por consultas</h1>\n");
      out.write("        <table class=\"table\">\n");
      out.write("            <thead>\n");
      out.write("                <tr>\n");
      out.write("                    <th>id_factura</th>\n");
      out.write("                    <th>Fecha_Fac</th>\n");
      out.write("                    <th>Cedula</th>\n");
      out.write("                    <th>Id_compra</th>\n");
      out.write("                    <th>Codigo_Domicilio</th>\n");
      out.write("                </tr>\n");
      out.write("            </thead>\n");
      out.write("                            \n");
      out.write("            ");

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
                       
                    
                            
                        
                    
      out.write("   \n");
      out.write("                    <tbody>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>");
      out.print(cu.getId_factura());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(cu.getFecha_fac());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(cu.getCedula());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(cu.getId_compra());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(cu.getCod_domicilio());
      out.write("</td>\n");
      out.write("                        </tr>\n");
      out.write("                    </tbody>\n");
      out.write("                    ");

                        
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
                       
                    
                            
                        
                    
      out.write("   \n");
      out.write("                    <tbody>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>");
      out.print(cu.getId_factura());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(cu.getFecha_fac());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(cu.getCedula());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(cu.getId_compra());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(cu.getCod_domicilio());
      out.write("</td>\n");
      out.write("                        </tr>\n");
      out.write("                    </tbody>\n");
      out.write("                    ");

                        
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
                       
                    
                            
                        
                    
      out.write("   \n");
      out.write("                    <tbody>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>");
      out.print(cu.getId_factura());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(cu.getFecha_fac());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(cu.getCedula());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(cu.getId_compra());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(cu.getCod_domicilio());
      out.write("</td>\n");
      out.write("                        </tr>\n");
      out.write("                    </tbody>\n");
      out.write("                    ");

                        
                    }
                }
                    
      out.write("\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("               \n");
      out.write("                \n");
      out.write("               \n");
      out.write("        </table>\n");
      out.write("        \n");
      out.write("    </section>                \n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("<!--<form action=\"\" target=\"\" method=\"get\" name=\"formDatosPersonales\">\n");
      out.write("\n");
      out.write("\t<label for=\"nombre\">Consultar Factura por numero de factura</label>\n");
      out.write("\t<input type=\"number\" name=\"Codigo Factura\" id=\"nombre\" placeholder=\"id\"/>\n");
      out.write("        <input type=\"submit\" name=\"FacturaEn\" value=\"enviar datos\"/>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("\t<label for=\"apellidos\">Consultar Factura por cedula del cliente</label>\n");
      out.write("\t<input type=\"text\" name=\"Cedula\" id=\"apellidos\" placeholder=\"codigo\"/>\n");
      out.write("        <input type=\"submit\" name=\"PorCedula\" value=\"enviar datos\"/>\n");
      out.write("        \n");
      out.write("\t<label for=\"email\" />Consultar factura por fecha de accion</label>\n");
      out.write("\t<input type=\"text\" name=\"Fecha\" id=\"email\" placeholder=\"disponible\"/>\n");
      out.write("        <input type=\"submit\" name=\"PorFecha\" value=\"enviar datos\"/>\n");
      out.write("\n");
      out.write("\t\n");
      out.write("</form>-->\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
