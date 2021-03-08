package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Constructor.Con_clientes;
import Modelos.Mod_Clientes;
import java.util.ArrayList;
import Constructor.Con_Domicilios;

public final class formulario_005fclientes_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl\" crossorigin=\"anonymous\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/styles_header.css\">\n");
      out.write("        <title>Clientes</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.6.0/dist/umd/popper.min.js\" integrity=\"sha384-KsvD1yqQ1/1+IA7gi3P0tyJcT3vR+NdBTt13hSJ2lnve8agRGXTTyNaBYmCR/Nwi\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.min.js\" integrity=\"sha384-nsg8ua9HAw1y0W1btsyWgBklPnCUAFLuTMS2G72MMONqmOymq585AcH49TLBQObG\" crossorigin=\"anonymous\"></script>\n");
      out.write("    \n");
      out.write("       <!-- inicio de la cabecera-->\n");
      out.write("        <header>\n");
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
      out.write("       \n");
      out.write("\t</header>\n");
      out.write("       <div class=\"container-fluid\">\n");
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\n");
      out.write("            <a class=\"navbar-brand\" href=\"#\">Navbar</a>\n");
      out.write("            <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("              <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("            </button>\n");
      out.write("\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("              <ul class=\"navbar-nav mr-auto\">\n");
      out.write("                <li class=\"nav-item active\">\n");
      out.write("                  <a class=\"nav-link\" href=\"#\">Home <span class=\"sr-only\">(current)</span></a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                  <a class=\"nav-link\" href=\"#\">Link</a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"nav-item dropdown\">\n");
      out.write("                  <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                    Dropdown\n");
      out.write("                  </a>\n");
      out.write("                  <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("                    <a class=\"dropdown-item\" href=\"#\">Action</a>\n");
      out.write("                    <a class=\"dropdown-item\" href=\"#\">Another action</a>\n");
      out.write("                    <div class=\"dropdown-divider\"></div>\n");
      out.write("                    <a class=\"dropdown-item\" href=\"#\">Something else here</a>\n");
      out.write("                  </div>            \n");
      out.write("                </li>\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                  <a class=\"nav-link disabled\" href=\"#\">Disabled</a>\n");
      out.write("                </li>\n");
      out.write("              </ul>\n");
      out.write("             \n");
      out.write("            </div>\n");
      out.write("          </nav>\n");
      out.write("       </div>\n");
      out.write("    <!-- Contenedor formulario-->\n");
      out.write("    <div class=\"container\">\n");
      out.write("            <h1>Formulario para la Gestion de clientes</h1>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div id=\"section\">\n");
      out.write("            <form action=\"Sv_clientes\" target=\"\" method=\"Post\" name=\"formDatosPersonales\">\n");
      out.write("                \n");
      out.write("                <div class=\"mb-3\">\n");
      out.write("                        <label for=\"exampleInputEmail1\" class=\"form-label\">Cedula</label>\n");
      out.write("                        <input type=\"text\" name=\"Cedula\" class=\"form-control\" id=\"exampleInputEmail1\" aria-describedby=\"emailHelp\">\n");
      out.write("                        <div id=\"emailHelp\" class=\"form-text\"></div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                        <!--<label for=\"Cedula\">Cedula</label>\n");
      out.write("                        <input type=\"text\" name=\"Cedula\" id=\"nombre\" placeholder=\"Nº Cedula\"/>-->\n");
      out.write("\n");
      out.write("                <div class=\"mb-3\">\n");
      out.write("                        <label for=\"exampleInputEmail1\" class=\"form-label\">Nombre</label>\n");
      out.write("                        <input type=\"text\" name=\"nombre\" class=\"form-control\" id=\"exampleInputEmail1\" aria-describedby=\"emailHelp\">\n");
      out.write("                        <div id=\"emailHelp\" class=\"form-text\"></div>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"mb-3\">\n");
      out.write("                        <label for=\"exampleInputEmail1\" class=\"form-label\">Apellido</label>\n");
      out.write("                        <input type=\"text\" name=\"apellido\" class=\"form-control\" id=\"exampleInputEmail1\" aria-describedby=\"emailHelp\">\n");
      out.write("                        <div id=\"emailHelp\" class=\"form-text\"></div>\n");
      out.write("                </div>\n");
      out.write("                        \n");
      out.write("                <div class=\"mb-3\">\n");
      out.write("                        <label for=\"exampleInputEmail1\" class=\"form-label\">Correo</label>\n");
      out.write("                        <input type=\"email\" name=\"correo\" class=\"form-control\" id=\"exampleInputEmail1\" aria-describedby=\"emailHelp\">\n");
      out.write("                        <div id=\"emailHelp\" class=\"form-text\"></div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"mb-3\">\n");
      out.write("                        <label for=\"exampleInputEmail1\" class=\"form-label\">Direccion</label>\n");
      out.write("                        <input type=\"text\" name=\"direccion\" class=\"form-control\" id=\"exampleInputEmail1\" aria-describedby=\"emailHelp\">\n");
      out.write("                        <div id=\"emailHelp\" class=\"form-text\"></div>\n");
      out.write("                </div>\n");
      out.write("                        \n");
      out.write("                <div class=\"mb-3\">\n");
      out.write("                        <label for=\"exampleInputEmail1\" class=\"form-label\">Telefono</label>\n");
      out.write("                        <input type=\"text\" name=\"telefono\" class=\"form-control\" id=\"exampleInputEmail1\" aria-describedby=\"emailHelp\">\n");
      out.write("                        <div id=\"emailHelp\" class=\"form-text\"></div>\n");
      out.write("                </div>\n");
      out.write("                        \n");
      out.write("                <button type=\"submit\" class=\"btn btn-primary\">Ingresar</button>\n");
      out.write("                <button type=\"submit\" class=\"btn btn-primary\">Modificar</button>\n");
      out.write("                <button type=\"submit\" class=\"btn btn-primary\">Eliminar</button>\n");
      out.write("       \n");
      out.write("                <!--\n");
      out.write("                <label for=\"nombre\">Cedula</label>\n");
      out.write("                <input type=\"text\" name=\"Cedula\" id=\"nombre\" placeholder=\"Nº Cedula\"/>\n");
      out.write("                \n");
      out.write("                <label for=\"nombre\">Nombre</label>\n");
      out.write("                <input type=\"text\" name=\"nombre\" id=\"nombre\" placeholder=\"Nombre\"/>\n");
      out.write("\n");
      out.write("                <label for=\"apellidos\">Apellido</label>\n");
      out.write("                <input type=\"text\" name=\"apellido\" id=\"apellidos\" placeholder=\"Apellido\"/>\n");
      out.write("\n");
      out.write("                <label for=\"email\" />Correo</label>\n");
      out.write("                <input type=\"email\" name=\"correo\" id=\"email\" placeholder=\"Correo\"  />\n");
      out.write("                \n");
      out.write("                <label for=\"Precio_pro\">Direccion</label>\n");
      out.write("                <input type =\"text\" name=\"direccion\" id=\"asunto\" placeholder=\"Direccion\"/>\n");
      out.write("                \n");
      out.write("                <label for=\"asunto\">Telefono</label>\n");
      out.write("                <input type =\"text\" name=\"telefono\" id=\"asunto\" placeholder=\"Telefono\"/>\n");
      out.write("\n");
      out.write("                <input type=\"submit\" name=\"enviar\" value=\"enviar datos\"/>\n");
      out.write("                <input type=\"submit\" name=\"modificar\" value=\"Modificar datos\"/>\n");
      out.write("                <input type=\"submit\" name=\"eliminar\" value=\"eliminar datos\"/>-->\n");
      out.write("                \n");
      out.write("                \n");
      out.write("            </form>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <div id=\"section-tabla\">\n");
      out.write("                <table class=\"table table-hover table-bordered\" >\n");
      out.write("                   <thead>\n");
      out.write("                     <tr>\n");
      out.write("                         <th>Cedula</th>\n");
      out.write("                         <th>Nombre</th>\n");
      out.write("                         <th>apellido_cli</th>\n");
      out.write("                         <th>Correo Electronico</th>\n");
      out.write("                         <th>Direccion_cli</th>\n");
      out.write("                         <th>Telefono</th>\n");
      out.write("                     </tr>     \n");
      out.write("                 </thead>\n");
      out.write("                    ");

         
                        ArrayList<Con_clientes> datosu=new ArrayList<>();
                        
                        Modelos.Mod_Clientes mu=new Mod_Clientes();
                        datosu=mu.consultar_clientes();
                        Con_clientes  u=new Con_clientes();

                        for(int i=0; i<datosu.size(); i++){

                        u=datosu.get(i);


                    
      out.write("\n");
      out.write("                    <tbody>\n");
      out.write("\n");
      out.write("                                <tr>\n");
      out.write("                                    <td>");
      out.print(u.getCedula());
      out.write("</td>\n");
      out.write("                                    <td>");
      out.print(u.getNombre());
      out.write("</td>\n");
      out.write("                                    <td>");
      out.print(u.getApellido());
      out.write("</td>\n");
      out.write("                                    <td>");
      out.print(u.getCorreo());
      out.write("</td>\n");
      out.write("                                    <td>");
      out.print(u.getDireccion());
      out.write("</td>\n");
      out.write("                                    <td>");
      out.print(u.getTelefono());
      out.write("</td>\n");
      out.write("                                </tr>\n");
      out.write("                             </tbody>\n");
      out.write("                             ");

                                 }
                                 
      out.write("\n");
      out.write("                </table>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
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
