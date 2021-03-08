package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Formularios_0020de_0020gestion_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!doctype html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <!-- Required meta tags -->\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\n");
      out.write("    <!-- Bootstrap CSS -->\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl\" crossorigin=\"anonymous\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/styles_header.css\">\n");
      out.write("    \n");
      out.write("    <title>Formularios de Gestion</title>\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("    \n");
      out.write("\n");
      out.write("    <!-- Optional JavaScript; choose one of the two! -->\n");
      out.write("\n");
      out.write("    <!-- Option 1: Bootstrap Bundle with Popper -->\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-b5kHyXgcpbZJO/tY9Ul7kGkf1S0CWuKcCD38l8YkeH8z8QjE0GmW1gYU5S9FOnJ0\" crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("    <!-- Option 2: Separate Popper and Bootstrap JS -->\n");
      out.write("    <!--\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.6.0/dist/umd/popper.min.js\" integrity=\"sha384-KsvD1yqQ1/1+IA7gi3P0tyJcT3vR+NdBTt13hSJ2lnve8agRGXTTyNaBYmCR/Nwi\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.min.js\" integrity=\"sha384-nsg8ua9HAw1y0W1btsyWgBklPnCUAFLuTMS2G72MMONqmOymq585AcH49TLBQObG\" crossorigin=\"anonymous\"></script>\n");
      out.write("    -->\n");
      out.write("    <!-- inicio de la cabecera-->\n");
      out.write("    <div class=\"container-fluid\">\n");
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <a class=\"navbar-brand\" href=\"#\">Navbar</a>\n");
      out.write("            <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarNavDropdown\" aria-controls=\"navbarNavDropdown\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("              <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("            </button>\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"navbarNavDropdown\">\n");
      out.write("              <ul class=\"navbar-nav\">\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                  <a class=\"nav-link active\" aria-current=\"page\" href=\"#\">Home</a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                  <a class=\"nav-link\" href=\"#\">Features</a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                  <a class=\"nav-link\" href=\"#\">Pricing</a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"nav-item dropdown\">\n");
      out.write("                  <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdownMenuLink\" role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\n");
      out.write("                    Dropdown link\n");
      out.write("                  </a>\n");
      out.write("                  <ul class=\"dropdown-menu\" aria-labelledby=\"navbarDropdownMenuLink\">\n");
      out.write("                    <li><a class=\"dropdown-item\" href=\"#\">Action</a></li>\n");
      out.write("                    <li><a class=\"dropdown-item\" href=\"#\">Another action</a></li>\n");
      out.write("                    <li><a class=\"dropdown-item\" href=\"#\">Something else here</a></li>\n");
      out.write("                  </ul>\n");
      out.write("                </li>\n");
      out.write("              </ul>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("    </nav>\n");
      out.write("    </div>\n");
      out.write("    <header>\n");
      out.write("\t\t<div class=\"wrapper\">\n");
      out.write("\t\t\t<div class=\"logo\">Supermercado la Alianza</div>\n");
      out.write("\t\t\t<!--\n");
      out.write("\t\t\t<nav>\n");
      out.write("\t\t\t\t<a href=\"Formulario_Comprador.jsp\">Formulario Comprador</a>\n");
      out.write("\t\t\t\t<a href=\"Formulario_Domicilios.jsp\">Formulario Domicilios</a>\n");
      out.write("\t\t\t\t<a href=\"Formulario_FActuras.jsp\">Formulario Facturas</a>\n");
      out.write("\t\t\t\t<a href=\"Formulario_empleados.jsp\">Formulario empleados</a>\n");
      out.write("                                <a href=\"Formulario_usuarios.jsp\">Formulario usuarios</a>\n");
      out.write("                                <a href=\"formulario_Productos.jsp\">Gestion productos</a>\n");
      out.write("                                <a href=\"formulario_clientes.jsp\">Gestion Clientes</a>\n");
      out.write("\t\t\t</nav>-->\n");
      out.write("\t\t</div>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("    </header>\n");
      out.write("    \n");
      out.write("    <div class=\"container-xl px-4\">\n");
      out.write("        <div class=\"row text-center align-self-center \">   \n");
      out.write("            <div class=\"card\" style=\"width: 20rem; margin: 20px; padding: 0px\">\n");
      out.write("                <img src=\"img/avatar-2155431_640.png\" class=\"card-img-top\" alt=\"...\" style=\"height: 240px\">\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                    <a href=\"formulario_clientes.jsp\" style=\"text-decoration: none\"><h5 class=\"card-title\">Formularios clientes</h5></a>\n");
      out.write("                  <p class=\"card-text\">Gestion de clientes que se han registradro.</p>\n");
      out.write("                  <a href=\"formulario_clientes.jsp\" class=\"btn btn-primary\">Dirijirse...</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"card\" style=\"width: 20rem; margin: 20px;\">\n");
      out.write("                <img src=\"img/home-304190_1280.png\" class=\"card-img-top\" alt=\"...\" >\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                    <a href=\"Formulario_Domicilios.jsp\" style=\"text-decoration: none\"><h5 class=\"card-title\">Formularios Domicilios</h5></a>\n");
      out.write("                  <p class=\"card-text\">Gestion de domicilios que se han registradro.</p>\n");
      out.write("                  <a href=\"Formulario_Domicilios.jsp\" class=\"btn btn-primary\">Dirijirse...</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"card\" style=\"width: 20rem; margin: 20px;\">\n");
      out.write("                <img src=\"img/store-4156934_1280.png\" class=\"card-img-top\" alt=\"...\" style=\"height: 240px;\">\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                    <a href=\"Formulario_Comprador.jsp\" style=\"text-decoration: none\"><h5 class=\"card-title\">Formularios gestion de compras</h5></a>\n");
      out.write("                  <p class=\"card-text\">Gestion de compras que se han registradro.</p>\n");
      out.write("                  <a href=\"Formulario_Comprador.jsp\" class=\"btn btn-primary\">Dirijirse...</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"card\" style=\"width: 20rem; margin: 20px;\">\n");
      out.write("                <img src=\"img/usuarios.png\" class=\"card-img-top\" alt=\"...\" >\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                    <a href=\"Formulario_usuarios.jsp\" style=\"text-decoration: none\"><h5 class=\"card-title\">Formularios gestion de Usuarios</h5></a>\n");
      out.write("                  <p class=\"card-text\">Gestion de usuarios que se han registradro.</p>\n");
      out.write("                  <a href=\"Formulario_usuarios.jsp\" class=\"btn btn-primary\">Dirijirse...</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!--<div class=\"card\" style=\"width: 18rem; margin: 40px;\">\n");
      out.write("                <img src=\"...\" class=\"card-img-top\" alt=\"...\" >\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                    <a href=\"\" style=\"text-decoration: none\"><h5 class=\"card-title\">Formularios gestion de Usuarios</h5></a>\n");
      out.write("                  <p class=\"card-text\">Gestion de empleados que se han registradro.</p>\n");
      out.write("                  <a href=\"#\" class=\"btn btn-primary\">Dirijirse...</a>\n");
      out.write("                </div>\n");
      out.write("            </div>-->\n");
      out.write("            <div class=\"card\" style=\"width: 20rem; margin: 20px;\">\n");
      out.write("                <img src=\"img/Facturas.jpg\" class=\"card-img-top\" alt=\"...\" style=\"height: 293px\">\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                    <a href=\"Formulario_FActuras.jsp\" style=\"text-decoration: none\"><h5 class=\"card-title\">Formularios gestion de Facturas</h5></a>\n");
      out.write("                  <p class=\"card-text\">Gestion de Facturas que se han registradro.</p>\n");
      out.write("                  <a href=\"Formulario_FActuras.jsp\" class=\"btn btn-primary\">Dirijirse...</a>\n");
      out.write("                </div>\n");
      out.write("            </div>  \n");
      out.write("            <div class=\"card\" style=\"width: 20rem; margin: 20px;\">\n");
      out.write("                <img src=\"img/supermarket-shelf-1094817_1920.png\" class=\"card-img-top\" alt=\"...\" >\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                    <a href=\"formulario_Productos.jsp\" style=\"text-decoration: none\"><h5 class=\"card-title\">Formularios gestion de Productos</h5></a>\n");
      out.write("                  <p class=\"card-text\">Gestion de Productos que se han registradro.</p>\n");
      out.write("                  <a href=\"formulario_Productos.jsp\" class=\"btn btn-primary\">Dirijirse...</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
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
