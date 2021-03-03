package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Modelos.Mod_Domicilios;
import java.util.ArrayList;
import Constructor.Con_Domicilios;

public final class Formulario_005fDomicilios_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t<title>Introducción formularios web</title>\n");
      out.write("\t<meta charset=\"utf-8\"/>\n");
      out.write("\t<meta name=\"description\" content=\"\"/>\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl\" crossorigin=\"anonymous\">\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-b5kHyXgcpbZJO/tY9Ul7kGkf1S0CWuKcCD38l8YkeH8z8QjE0GmW1gYU5S9FOnJ0\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/styles_header.css\">\n");
      out.write("\t\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    \n");
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
      out.write("    <!-- Contenedor formulario-->\n");
      out.write("    <div class=\"container\">\n");
      out.write("            <h1>Formulario para la Gestion de Domicilios</h1>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div id=\"section\">\n");
      out.write("                    <form action=\"Sv_compras\" target=\"\" method=\"Post\" name=\"formDatosPersonales\">\n");
      out.write("\n");
      out.write("                        <div class=\"mb-3\">\n");
      out.write("                        <label for=\"exampleInputEmail1\" class=\"form-label\">Codigo de domicilio</label>\n");
      out.write("                        <input type=\"text\" name=\"id_compra\" class=\"form-control\" id=\"exampleInputEmail1\" aria-describedby=\"emailHelp\">\n");
      out.write("                        <div id=\"emailHelp\" class=\"form-text\"></div>\n");
      out.write("                        </div>\n");
      out.write("                       \n");
      out.write("\n");
      out.write("                        <div class=\"mb-3\">\n");
      out.write("                        <label for=\"exampleInputEmail1\" class=\"form-label\">Fecha_pedido</label>\n");
      out.write("                        <input type=\"text\" name=\"Codigo_pro\" class=\"form-control\" id=\"exampleInputEmail1\" aria-describedby=\"emailHelp\">\n");
      out.write("                        <div id=\"emailHelp\" class=\"form-text\"></div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        \n");
      out.write("\n");
      out.write("                        <div class=\"mb-3\">\n");
      out.write("                        <label for=\"exampleInputEmail1\" class=\"form-label\">Id_compra</label>\n");
      out.write("                        <input type=\"number\" name=\"Cantidad re\" class=\"form-control\" id=\"exampleInputEmail1\" aria-describedby=\"emailHelp\">\n");
      out.write("                        <div id=\"emailHelp\" class=\"form-text\"></div>\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        <div class=\"mb-3\">\n");
      out.write("                        <label for=\"exampleInputEmail1\" class=\"form-label\">Cedula del empleado</label>\n");
      out.write("                        <input type=\"text\" name=\"Cedula\" class=\"form-control\" id=\"exampleInputEmail1\" aria-describedby=\"emailHelp\">\n");
      out.write("                        <div id=\"emailHelp\" class=\"form-text\"></div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"col-auto\">\n");
      out.write("\n");
      out.write("                        \n");
      out.write("                        </br>\n");
      out.write("                        <!--<label for=\"telefono\">Rol</label>\n");
      out.write("                        <input type=\"email\" name=\"rol\" id=\"email\" placeholder=\"Correo\"  />\n");
      out.write("\n");
      out.write("                        <label for=\"Codigo del empleado\">sexo</label>\n");
      out.write("                        <input type =\"text\" name=\"codigo\" id=\"asunto\" placeholder=\"Codigo_empleado\"/>\n");
      out.write("                        -->\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        </br>\n");
      out.write("\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-primary\">Ingresar</button>\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-primary\">Modificar</button>\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-primary\">Eliminar</button>\n");
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
      out.write("                                 <th>Cod_domicilio</th>\n");
      out.write("                                 <th>Fecha de pedido</th>\n");
      out.write("                                 <th>Id de la compra</th>\n");
      out.write("                                 <th>Cedula del comprador</th>\n");
      out.write("                                 \n");
      out.write("                             </tr>     \n");
      out.write("                         </thead>\n");
      out.write("                            ");


                                ArrayList<Con_Domicilios> datosu=new ArrayList<>();

                                Modelos.Mod_Domicilios mu=new Mod_Domicilios();
                                datosu=mu.Consultar_Domicilios();
                                Con_Domicilios  u=new Con_Domicilios();

                                for(int i=0; i<datosu.size(); i++){

                                u=datosu.get(i);


                            
      out.write("\n");
      out.write("                            <tbody>\n");
      out.write("\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td>");
      out.print(u.getCod_domicilio());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print(u.getFechaPedido());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print(u.getId_compra());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print(u.getCedula());
      out.write("</td>\n");
      out.write("                                          \n");
      out.write("                                        </tr>\n");
      out.write("                                     </tbody>\n");
      out.write("                                     ");

                                         }
                                         
      out.write("\n");
      out.write("                        </table>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>        \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("    \n");
      out.write("<!--<form action=\"Sv_domicilios\" target=\"\" method=\"get\" name=\"formDatosPersonales\">\n");
      out.write("\n");
      out.write("\t<label for=\"nombre\">Codigo de domicilio</label>\n");
      out.write("\t<input type=\"number\" name=\"codigo\" id=\"nombre\" placeholder=\"\"/>\n");
      out.write("\t\n");
      out.write("\n");
      out.write("\t<label for=\"apellidos\">Fecha_pedido</label>\n");
      out.write("\t<input type=\"date\" name=\"fecha\" id=\"apellidos\" placeholder=\"\"/>\n");
      out.write("\t\n");
      out.write("\t<label for=\"email\" />id_compra</label>\n");
      out.write("\t<input type=\"text\" name=\"id_compra\" id=\"apellidos\" placeholder=\"\"/>\n");
      out.write("        \n");
      out.write("        <label for=\"email\" />Cedula del empleado</label>\n");
      out.write("\t<input type=\"text\" name=\"ceduladelempleado\" id=\"apellidos\" placeholder=\"\"/>\n");
      out.write("        \n");
      out.write("\t<input type=\"submit\" name=\"enviar\" value=\"Ingresar datos\"/>\n");
      out.write("        <input type=\"submit\" name=\"modificar\" value=\"modificar datos\"/>\n");
      out.write("        <input type=\"submit\" name=\"eliminar\" value=\"Eliminar datos\"/>\n");
      out.write("\t\n");
      out.write("        \n");
      out.write("        \n");
      out.write("</form>-->\n");
      out.write("\n");
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
