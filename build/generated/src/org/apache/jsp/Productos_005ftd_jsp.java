package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Modelos.Modelo_Productos;
import Constructor.Con_productos;
import java.util.ArrayList;

public final class Productos_005ftd_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!--Busqueda de datos de los productos-->\n");

            ArrayList<Constructor.Con_productos> data=new ArrayList<>();
            Constructor.Con_productos con=new Con_productos();
            Modelos.Modelo_Productos mod=new Modelo_Productos();
            
        
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("    <!-- Required meta tags -->\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\n");
      out.write("    <!-- Bootstrap CSS -->\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl\" crossorigin=\"anonymous\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/styles_header.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/Style_index.css\">\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\">\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Arvo&display=swap\" rel=\"stylesheet\">\n");
      out.write("    <title>Formularios de Gestion Clientes</title>\n");
      out.write("  </head>\n");
      out.write("    <body font-family: 'Arvo', serif;>\n");
      out.write("        \n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-b5kHyXgcpbZJO/tY9Ul7kGkf1S0CWuKcCD38l8YkeH8z8QjE0GmW1gYU5S9FOnJ0\" crossorigin=\"anonymous\"></script>\n");
      out.write("        \n");
      out.write("        <header>\n");
      out.write("\t\t<!-- cabecera de la pagina-->\n");
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
      out.write("        \n");
      out.write("        \n");
      out.write("        <section>\n");
      out.write("            ");
 /*Inicio de bucle para la busqueda de productos*/
                data=mod.consultarusuarios();
                for (int i = 0; i < data.size(); i++) {
                        con=data.get(i);
                                            
            
      out.write("\n");
      out.write("            <div class=\"container-xl px-4\">\n");
      out.write("                <div class=\"row text-center align-self-center \">   \n");
      out.write("                            <div class=\"card\" style=\"width: 18rem;\">\n");
      out.write("                                <img src=\"");
      out.print(con.getImg());
      out.write("\" class=\"card-img-top\" alt=\"...\">\n");
      out.write("                                    <div class=\"card-body\">\n");
      out.write("                                      <h5 class=\"card-title\">");
      out.print(con.getNombre_pro());
      out.write("</h5>\n");
      out.write("                                      <p class=\"card-text\">Some quick example text to build on the card title and make up the bulk of the card's content.</p>\n");
      out.write("                                      <a href=\"#\" class=\"btn btn-primary\">Go somewhere</a>\n");
      out.write("                                   </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"card\" style=\"width: 20rem; margin: 20px; padding: 0px\">\n");
      out.write("                                <img src=\"img/avatar-2155431_640.png\" class=\"card-img-top\" alt=\"...\" style=\"height: 240px\">\n");
      out.write("                                <div class=\"card-body\">\n");
      out.write("                                    <a href=\"formulario_clientes.jsp\" style=\"text-decoration: none\"><h5 class=\"card-title\">Formularios clientes</h5></a>\n");
      out.write("                                  <p class=\"card-text\">Gestion de clientes que se han registradro.</p>\n");
      out.write("                                  <a href=\"formulario_clientes.jsp\" class=\"btn btn-primary\">Dirijirse...</a>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("            </div>\n");
      out.write("            ");

            }
            /*Final del bucle*/
            
      out.write("\n");
      out.write("        </section>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <script>\n");
      out.write("            \n");
      out.write("            $(function () {\n");
      out.write("                $('[data-toggle=\"popover\"]').popover()\n");
      out.write("            });\n");
      out.write("        </script>\n");
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
