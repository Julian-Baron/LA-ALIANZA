package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Modelos.Mod_Domicilios;
import java.util.ArrayList;
import Constructor.Con_Domicilios;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <!-- Required meta tags -->\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\n");
      out.write("    <!-- Bootstrap CSS -->\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl\" crossorigin=\"anonymous\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/styles_header.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/Style_index.css\">\n");
      out.write("    \n");
      out.write("    <title>Formularios de Gestion Clientes</title>\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("    \n");
      out.write("\n");
      out.write("    <!-- Option 1: Bootstrap Bundle with Popper -->\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-b5kHyXgcpbZJO/tY9Ul7kGkf1S0CWuKcCD38l8YkeH8z8QjE0GmW1gYU5S9FOnJ0\" crossorigin=\"anonymous\"></script>\n");
      out.write("    \n");
      out.write("       <!-- inicio de la cabecera-->\n");
      out.write("        <header>\n");
      out.write("\t\t<!--<div class=\"wrapper\">-->\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<!--<nav>\n");
      out.write("\t\t\t\t<a href=\"Formulario_Comprador.jsp\">Formulario Comprador</a>\n");
      out.write("\t\t\t\t<a href=\"Formulario_Domicilios.jsp\">Formulario Domicilios</a>\n");
      out.write("\t\t\t\t<a href=\"Formulario_FActuras.jsp\">Formulario Facturas</a>\n");
      out.write("\t\t\t\t<a href=\"Formulario_empleados.jsp\">Formulario empleados</a>\n");
      out.write("                                <a href=\"Formulario_usuarios.jsp\">Formulario usuarios</a>\n");
      out.write("                                <a href=\"formulario_Productos.jsp\">Gestion productos</a>\n");
      out.write("                                <a href=\"formulario_clientes.jsp\">Gestion Clientes</a>\n");
      out.write("\t\t\t</nav>-->\n");
      out.write("                            \n");
      out.write("        \n");
      out.write("             <!--</div>-->\n");
      out.write("                <nav class=\"navbar navbar-expand-lg fixed-top navbar-light bg\" style=\"background: #DEB916\">\n");
      out.write("                    <div class=\"logo\">Supermercado la Alianza                       \n");
      out.write("                            <img src=\"img/shopping-cart-2020929_640.png \" class=\"\" >\n");
      out.write("                            </div>\n");
      out.write("                    <div class=\"container-fluid\"> \n");
      out.write("                            \n");
      out.write("                        <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarNavDropdown\" aria-controls=\"navbarNavDropdown\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                            <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("                          </button>\n");
      out.write("                        <div class=\"collapse navbar-collapse\" id=\"navbarNavDropdown\">\n");
      out.write("                          <ul class=\"navbar-nav\">\n");
      out.write("                              <li class=\"nav-item\">\n");
      out.write("                              <a class=\"nav-link active\" aria-current=\"page\" href=\"#\">Inicio</a>\n");
      out.write("                            </li>\n");
      out.write("                              <li class=\"nav-item dropdown\">\n");
      out.write("                              <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdownMenuLink\" role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\n");
      out.write("                                  Formularios\n");
      out.write("                              </a>\n");
      out.write("                              <ul class=\"dropdown-menu\" aria-labelledby=\"navbarDropdownMenuLink\">\n");
      out.write("                                <li><a class=\"dropdown-item nav-link \" href=\"#\">Formularios Clientes</a></li>\n");
      out.write("                                <li><a class=\"dropdown-item nav-link\" href=\"formulario_Productos.jsp\">Formularios Productos</a></li>\n");
      out.write("                                <li><a class=\"dropdown-item nav-link active\" href=\"#\">Formularios Domicilios</a></li>\n");
      out.write("                                <li><a class=\"dropdown-item nav-link\" href=\"Formulario_usuarios.jsp\">Formularios Usuarios</a></li>\n");
      out.write("                                <li><a class=\"dropdown-item nav-link\" href=\"Formulario_FActuras.jsp\">Formularios Facturas</a></li>\n");
      out.write("                                <li><a class=\"dropdown-item nav-link\" href=\"Formulario_Comprador.jsp\">Formularios Compras</a></li>\n");
      out.write("                              </ul>\n");
      out.write("                            </li>                                               \n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                              <a class=\"nav-link active\" aria-current=\"page\" href=\"#\">Inicio</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <a class=\"nav-link \" href=\"Formularios de gestion.jsp\">Volver</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                              <a class=\"nav-link\" href=\"#\">Cerrar Sesion</a>\n");
      out.write("                            </li>\n");
      out.write("                            \n");
      out.write("                          </ul>\n");
      out.write("                        </div>\n");
      out.write("        \n");
      out.write("            </nav>\n");
      out.write("       \n");
      out.write("\t</header>\n");
      out.write("       <!--Contenedor principal que mostrara imagen de bienbenida-->\n");
      out.write("       \n");
      out.write("       <div class=\"conteiner-sm\">\n");
      out.write("            \n");
      out.write("           <div class=\"row\">\n");
      out.write("               \n");
      out.write("               <div class=\"contenedor\">\n");
      out.write("                   <img class=\"img-fluid img-principal\" src=\"img/supermercado_paginaprincipal.jpg\" />\n");
      out.write("               \n");
      out.write("                   <div class=\"centrado\">BIENVENIDO A LA PAGINA DE SUPERMERCADOS LA ALIANZA</div>\n");
      out.write("                   \n");
      out.write("                   <div class=\"centrado-abajo\">\n");
      out.write("                    <button type=\"button\" class=\"btn btn-light\">SABER MÁS...</button>\n");
      out.write("\n");
      out.write("                   </div>\n");
      out.write("            </div>\n");
      out.write("               \n");
      out.write("           </div>\n");
      out.write("            <!--Contenedor de la pagina despues de la imagen. Almacenara toda la informacion correspondiente-->\n");
      out.write("            <div class=\"container-md\">\n");
      out.write("            <section>\n");
      out.write("                <div class=\"container-md\">\n");
      out.write("                    <div class=\"container \" style=\"transform: translateX(20%)\">\n");
      out.write("                            <h1>Los mejores productos de calidad</h1>\n");
      out.write("                        </div>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        \n");
      out.write("                    <div class=\"col-1 position-relative\">\n");
      out.write("                    <img src=\"img/face.png\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-10\"><p>\n");
      out.write("                        Esto es así porque los navegadores no reconocen un salto de línea, a no ser que se lo indiquemos específicamente. Para ello, empleamos otro tag nuevo. Se trata de <br>. Este tag no recibe ningún tipo de atributo y no tiene cierre, es decir, no existe </br>. Esto último es así porque, a diferencia de otros tags, este no establece un efecto sobre la página (como hace, por ejemplo, body, que tiene que marcar el principio y el final de los contenidos), sino que este tag ejecuta una acción puntual (un salto de línea). Veamos un ejemplo, modificación del código anterior. Tecléelo y guárdelo como salto_de_linea.htm.\n");
      out.write("                    </p>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </section>\n");
      out.write("            </div>    \n");
      out.write("            \n");
      out.write("  </body>\n");
      out.write("</html>");
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
