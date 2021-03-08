package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("         <script src=\"js/jquery-3.5.1.min.js\"></script>\n");
      out.write("        <script src=\"js/doc.js\"></script>\n");
      out.write("        \n");
      out.write("         <!--FONT AWESOME-->\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.13.0/css/all.min.css\">\n");
      out.write("        \n");
      out.write("        <link rel=\"stylesheet\" href=\"css/js.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/tbl.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/log.css\">  \n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>¡Bienvenido al supermercado La Alianza!</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("      \n");
      out.write("        \n");
      out.write("          \n");
      out.write("        <header class=\"header\">\n");
      out.write("            <nav><div id><a href=\"index.jsp\"id=\"log\"></a></div></nav>\n");
      out.write("            <div id=\"menu_s\" class=\"menu\"></div>\n");
      out.write("            <div id=\"contmenu\" class=\"contmenu\">\n");
      out.write("                <div id=\"logo\"></div>\n");
      out.write("               \n");
      out.write("                \n");
      out.write("     \n");
      out.write("            \n");
      out.write("            \n");
      out.write("              <!--<div><img  class=\"logoooo\" src=\"imagenes/\" alt=\"img\"></div>\n");
      out.write("       <h1 id=\"til\">Bienvenido</h1>*/-->\n");
      out.write("        </header>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("       <div id=\"formularios1\"> \n");
      out.write("        <form  id=\"for1\" action=\"Sv_login\" method=\"POST\">\n");
      out.write("            \n");
      out.write("            <legend class=\"udsu\">   INGRESA TUS DATOS</legend>\n");
      out.write("            <input class=\"doc\" type=\"text\" name=\"usu\" placeholder=\"USUARIO\">\n");
      out.write("            <input class=\"doc\" type=\"password\" name=\"pas\" placeholder=\"CONTRASEÑA\">\n");
      out.write("            <input class=\"doc\" id=\"\" type=\"submit\" name=\"btnlog\" value=\"ENVIAR CONSULTA\">\n");
      out.write("            \n");
      out.write("            \n");
      out.write("        </form>\n");
      out.write("       </div>\n");
      out.write("        \n");
      out.write("         <footer>\n");
      out.write("                \n");
      out.write("\n");
      out.write("<footer>\n");
      out.write("        <legend id=\"PiedePagina\">\n");
      out.write("        <ul id=\"abajo\">\n");
      out.write("            <div class=\"as\">CREADO POR BEIRON's COMPANY. TODOS LOS DERECHOS RESERVADOS©</div>  \n");
      out.write("            <nav id=menu_aba>    \n");
      out.write("                <div> <a class=\"asad\" href=\"#\"><img class=\"log\" src=\"img/face.png\" alt=\"facebook\"></a></div>\n");
      out.write("                <div> <a class=\"asad\" href=\"#\"><img class=\"log\" src=\"img/instagram.png\" alt=\"instagram\"></a></div>\n");
      out.write("                <div> <a class=\"asad\" href=\"#\"><img class=\"log\" src=\"img/twitter.png\" alt=\"twitter\"></a></div>\n");
      out.write("            </nav>\n");
      out.write("        </ul>\n");
      out.write("        </legend>\n");
      out.write("\n");
      out.write("            \n");
      out.write("        \n");
      out.write("    </footer>\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("      \n");
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
