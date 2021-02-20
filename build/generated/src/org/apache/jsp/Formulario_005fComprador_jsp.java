package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Formulario_005fComprador_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\n");
      out.write("\t<title>Introducción formularios web</title>\n");
      out.write("\t<meta charset=\"utf-8\"/>\n");
      out.write("\t<meta name=\"description\" content=\"\"/>\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/Styles.css\">\n");
      out.write("\t\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<form action=\"Sv_compras\" target=\"\" method=\"get\" name=\"formDatosPersonales\">\n");
      out.write("\n");
      out.write("\t<label for=\"nombre\">id_compra</label>\n");
      out.write("\t<input type=\"text\" name=\"id_compra\" id=\"nombre\" placeholder=\"id\"/>\n");
      out.write("\n");
      out.write("\t<label for=\"apellidos\">Codigo_pro</label>\n");
      out.write("\t<input type=\"text\" name=\"Codigo_pro\" id=\"apellidos\" placeholder=\"codigo\"/>\n");
      out.write("\n");
      out.write("\t<label for=\"email\" />Cantidad requerida</label>\n");
      out.write("\t<input type=\"number\" name=\"Cantidad re\" id=\"email\" placeholder=\"disponible\" required />\n");
      out.write("\n");
      out.write("\t<label for=\"Precio_pro\">Cedula del comprador</label>\n");
      out.write("\t<input type =\"text\" name=\"Cedula\" id=\"asunto\" placeholder=\"N°\"/>\n");
      out.write("\n");
      out.write("    \n");
      out.write("\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t<input type=\"submit\" name=\"enviar\" value=\"enviar datos\"/>\n");
      out.write("        <input type=\"submit\" name=\"modificar\" value=\"Modificar datos\"/>\n");
      out.write("        <input type=\"submit\" name=\"eliminar\" value=\"Eliminar datos\"/>\n");
      out.write("</form>\n");
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
