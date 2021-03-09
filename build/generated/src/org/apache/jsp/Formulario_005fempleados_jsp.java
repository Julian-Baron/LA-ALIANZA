package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Modelos.Mod_empleados;
import Constructor.Con_empleados;
import java.util.ArrayList;

public final class Formulario_005fempleados_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl\" crossorigin=\"anonymous\">\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-b5kHyXgcpbZJO/tY9Ul7kGkf1S0CWuKcCD38l8YkeH8z8QjE0GmW1gYU5S9FOnJ0\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/styles_header.css\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!-- inicio de la cabecera-->\n");
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
      out.write("        \n");
      out.write("        <div class=\"container \">\n");
      out.write("            <h1>Formulario para la Gestion de empleados</h1>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div id=\"section\">\n");
      out.write("            <form action=\"Sv_empleados\" target=\"\" method=\"Post\" name=\"formDatosPersonales\">\n");
      out.write("                <div class=\"mb-3\"><!--Cedula del empleado-->\n");
      out.write("                    <label for=\"exampleInputEmail1\" class=\"form-label\">Cedula</label>\n");
      out.write("                    <input type=\"text\" name=\"cedula\" class=\"form-control\" id=\"exampleInputEmail1\" aria-describedby=\"emailHelp\">\n");
      out.write("                    <div id=\"emailHelp\" class=\"form-text\"></div>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"mb-3\"><!--Nombre del empleado-->\n");
      out.write("                    <label for=\"exampleInputEmail1\" class=\"form-label\">Nombre</label>\n");
      out.write("                    <input type=\"text\" name=\"nombre\" class=\"form-control\" id=\"exampleInputEmail1\" aria-describedby=\"emailHelp\">\n");
      out.write("                    <div id=\"emailHelp\" class=\"form-text\"></div>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"mb-3\"><!--Apellido del empleado-->\n");
      out.write("                    <label for=\"exampleInputEmail1\" class=\"form-label\">Apellido</label>\n");
      out.write("                    <input type=\"text\" name=\"apellido\" class=\"form-control\" id=\"exampleInputEmail1\" aria-describedby=\"emailHelp\">\n");
      out.write("                    <div id=\"emailHelp\" class=\"form-text\"></div>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"mb-3\"><!--Telefono del empleado-->\n");
      out.write("                    <label for=\"exampleInputEmail1\" class=\"form-label\">Telefono</label>\n");
      out.write("                    <input type=\"text\" name=\"telefono\" class=\"form-control\" id=\"exampleInputEmail1\" aria-describedby=\"emailHelp\">\n");
      out.write("                    <div id=\"emailHelp\" class=\"form-text\"></div>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"mb-3\"><!--Correo del empleado-->\n");
      out.write("                    <label for=\"exampleInputEmail1\" class=\"form-label\">Correo</label>\n");
      out.write("                    <input type=\"email\" name=\"correo\" class=\"form-control\" id=\"exampleInputEmail1\" aria-describedby=\"emailHelp\">\n");
      out.write("                    <div id=\"emailHelp\" class=\"form-text\"></div>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"mb-3\"><!--Codigo del empleado-->\n");
      out.write("                    <label for=\"exampleInputEmail1\" class=\"form-label\">Cod_emp</label>\n");
      out.write("                    <input type=\"text\" name=\"codigo\" class=\"form-control\" id=\"exampleInputEmail1\" aria-describedby=\"emailHelp\">\n");
      out.write("                    <div id=\"emailHelp\" class=\"form-text\"></div>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <button type=\"submit\" name=\"enviar\" class=\"btn btn-primary\">Insertar</button>\n");
      out.write("                <button type=\"submit\" name=\"eliminar\" class=\"btn btn-primary\">Eliminar</button>\n");
      out.write("                <button type=\"submit\" name=\"modificar\" class=\"btn btn-primary\">Modificar</button>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                <!--Sin boostrap\n");
      out.write("                <label for=\"Cedula\">Cedula</label>\n");
      out.write("                <input type=\"text\" name=\"Cedula\" id=\"nombre\" placeholder=\"Nº Cedula\"/>\n");
      out.write("                \n");
      out.write("                <label for=\"nombre\">Nombre</label>\n");
      out.write("                <input type=\"text\" name=\"nombre\" id=\"nombre\" placeholder=\"Nombre\"/>\n");
      out.write("\n");
      out.write("                <label for=\"apellidos\">Apellido</label>\n");
      out.write("                <input type=\"text\" name=\"apellido\" id=\"apellidos\" placeholder=\"Apellido\"/>\n");
      out.write("                \n");
      out.write("                <label for=\"Codigo del empleado\">Telefono</label>\n");
      out.write("                <input type =\"text\" name=\"telefono\" id=\"asunto\" placeholder=\"Telefono\"/>\n");
      out.write("                \n");
      out.write("                <label for=\"telefono\">Correo</label>\n");
      out.write("                <input type=\"email\" name=\"correo\" id=\"email\" placeholder=\"Correo\"  />\n");
      out.write("                \n");
      out.write("                <label for=\"Codigo del empleado\">Codigo_empleado</label>\n");
      out.write("                <input type =\"text\" name=\"codigo\" id=\"asunto\" placeholder=\"Codigo_empleado\"/>\n");
      out.write("\n");
      out.write("                <input type=\"submit\" name=\"enviar\" value=\"enviar datos\"/>\n");
      out.write("                <input type=\"submit\" name=\"modificar\" value=\"Modificar datos\"/>\n");
      out.write("                <input type=\"submit\" name=\"eliminar\" value=\"eliminar datos\"/>\n");
      out.write("                -->\n");
      out.write("            </form>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <div id=\"section-table\">\n");
      out.write("                <table class=\"table\">\n");
      out.write("                   <thead>\n");
      out.write("                     <tr>\n");
      out.write("                         <th>Cedula</th>\n");
      out.write("                         <th>Nombre</th>\n");
      out.write("                         <th>apellido_cli</th>\n");
      out.write("                         <th>Telefono</th>\n");
      out.write("                         <th>Correo Electronico</th>\n");
      out.write("                         <th>Cod_empleado</th>\n");
      out.write("                     </tr>     \n");
      out.write("                 </thead>\n");
      out.write("                    ");

         
                        ArrayList<Con_empleados> datosu=new ArrayList<>();
                        
                        Modelos.Mod_empleados mu=new Mod_empleados();
                        datosu=mu.consultar_empleados();
                        Con_empleados  u=new Con_empleados();

                        for(int i=0; i<datosu.size(); i++){

                        u=datosu.get(i);


                    
      out.write("\n");
      out.write("                    \n");
      out.write("                        <tbody>\n");
      out.write("                            \n");
      out.write("                                <tr>\n");
      out.write("                                    <td><input required type=\"text\" name=\"Codigoced\" class=\"form-control\" id=\"exampleInputEmail1\" aria-describedby=\"emailHelp\" value=\"");
      out.print(u.getCedula());
      out.write("\"></td>\n");
      out.write("                                    <td><input required type=\"text\" name=\"nombrea\" class=\"form-control\" id=\"exampleInputEmail1\" aria-describedby=\"emailHelp\" value=\"");
      out.print(u.getNombre_emp());
      out.write("\"></td>\n");
      out.write("                                    <td><input required type=\"text\" name=\"apellidoa\" class=\"form-control\" id=\"exampleInputEmail1\" aria-describedby=\"emailHelp\" value=\"");
      out.print(u.getApellido_emp());
      out.write("\"></td>\n");
      out.write("                                    <td><input required type=\"text\" name=\"telefonoa\" class=\"form-control\" id=\"exampleInputEmail1\" aria-describedby=\"emailHelp\" value=\"");
      out.print(u.getTelefono_emp());
      out.write("\"></td>\n");
      out.write("                                    <td><input required type=\"text\" name=\"correoa\" class=\"form-control\" id=\"exampleInputEmail1\" aria-describedby=\"emailHelp\" value=\"");
      out.print(u.getCorreo_emp());
      out.write("\"></td>\n");
      out.write("                                    <td><input required type=\"text\" name=\"codigoa\" class=\"form-control\" id=\"exampleInputEmail1\" aria-describedby=\"emailHelp\" value=\"");
      out.print(u.getCod_emp());
      out.write("\"></td>\n");
      out.write("                                    <td>\n");
      out.write("                                        \n");
      out.write("                                    </td>\n");
      out.write("                                </tr>\n");
      out.write("                             \n");
      out.write("                        </tbody>\n");
      out.write("                   \n");
      out.write("                             ");

                                 }
                                 
      out.write("\n");
      out.write("                </table>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>       \n");
      out.write("   </div>        \n");
      out.write("    </body>\n");
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
