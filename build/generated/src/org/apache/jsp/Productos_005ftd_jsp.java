package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import controllers.ControladorProducto;
import javax.swing.JOptionPane;
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
      out.write("\n");
      out.write("\n");
      out.write("<!--Busqueda de datos de los productos-->\n");

           
        controllers.ControladorProducto can=new ControladorProducto();
        
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
      out.write("    \n");
      out.write("       <!--Font-->\n");
      out.write("    \n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\">\n");
      out.write("<link href=\"https://fonts.googleapis.com/css2?family=Fredericka+the+Great&display=swap\" rel=\"stylesheet\">\n");
      out.write("    \n");
      out.write("\n");
      out.write("    <!--CSS-->\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/fonts.css\">\n");
      out.write("\n");
      out.write("    <!--ICONO-->\n");
      out.write("    <link rel=\"icon\" href=\"img/alianza_1.png\">\n");
      out.write("    \n");
      out.write("<<<<<<< Upstream, based on i1/Yopi1\n");
      out.write("\n");
      out.write("    \n");
      out.write("    <title>Formularios de Gestion Clientes</title>\n");
      out.write("=======\n");
      out.write("    <title>Productos</title>\n");
      out.write(">>>>>>> 230e0e0 Nuevas clases para la gestion del carro de compras y js para el boton de eliminar, jsp nuevos para la presentacion del las compras\n");
      out.write("  </head>\n");
      out.write("    <body font-family=\"'Arvo', serif;\">\n");
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
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                              <a class=\"nav-link active\" aria-current=\"page\" href=\"#\">Inicio</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <a class=\"nav-link \" href=\"Formularios de gestion.jsp\">Volver</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <a class=\"nav-link \" href=\"Carrito.jsp\"><img class=\"bi bi-cart\" src=\"img/cart.svg\"></i>Ver carrito</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                              <a class=\"nav-link\" href=\"#\">Cerrar Sesion</a>\n");
      out.write("                            </li>\n");
      out.write("                            \n");
      out.write("                          </ul>\n");
      out.write("                        </div>\n");
      out.write("                    \n");
      out.write("        \n");
      out.write("            </nav>\n");
      out.write("       \n");
      out.write("\t</header>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <section>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <div class=\"container-xl\" id=\"container-first\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <form>\n");
      out.write("                       <div class=\"col-sm-4\">\n");
      out.write("                            ");
      out.print(can.getProductos());
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </form> \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("                    \n");
      out.write("            \n");
      out.write("        </section>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <script>\n");
      out.write("            \n");
      out.write("            \n");
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
