package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Modelos.Modelo_Productos;
import java.util.ArrayList;
import Constructor.Con_productos;

public final class formulario_005fProductos_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t<title>Formulario Productos</title>\n");
      out.write("\t<meta charset=\"utf-8\"/>\n");
      out.write("\t<meta name=\"description\" content=\"\"/>\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/Styles.css\">\n");
      out.write("\t\n");
      out.write("\n");
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
      out.write("        <div id=\"section\">\n");
      out.write("            <form action=\"Sv_productos\" target=\"\" method=\"Post\" name=\"formDatosPersonales\">\n");
      out.write("\n");
      out.write("                <label for=\"nombre\">Cod_producto</label>\n");
      out.write("                <input type=\"text\" name=\"Codigo_pro\" id=\"nombre\" placeholder=\"Nombre del producto\"/>\n");
      out.write("                \n");
      out.write("                <label for=\"nombre\">Nombre</label>\n");
      out.write("                <input type=\"text\" name=\"nombre\" id=\"nombre\" placeholder=\"Nombre del producto\"/>\n");
      out.write("\n");
      out.write("                <label for=\"apellidos\">Marca del Producto</label>\n");
      out.write("                <input type=\"text\" name=\"Marca\" id=\"apellidos\" placeholder=\"Marca del producto\"/>\n");
      out.write("\n");
      out.write("                <label for=\"email\" />Cantidad disponible</label>\n");
      out.write("                <input type=\"text\" name=\"Cantidad\" id=\"email\" placeholder=\"disponible\" required />\n");
      out.write("\n");
      out.write("                <label for=\"Precio_pro\">Precio del producto</label>\n");
      out.write("                <input type =\"text\" name=\"Precio\" id=\"asunto\" placeholder=\"Precio pro\"/>\n");
      out.write("\n");
      out.write("                <label for=\"asunto\">Descripcion del producto</label>\n");
      out.write("                <input type =\"text\" name=\"Descripcion\" id=\"asunto\" placeholder=\"Descripcion\"/>\n");
      out.write("\n");
      out.write("                <input type=\"submit\" name=\"enviar\" value=\"enviar datos\"/>\n");
      out.write("                <input type=\"submit\" name=\"modificar\" value=\"enviar datos\"/>\n");
      out.write("                <input type=\"submit\" name=\"eliminar\" value=\"enviar datos\"/>\n");
      out.write("            </form>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <div id=\"section-tabla\">\n");
      out.write("                <table>\n");
      out.write("                   <thead>\n");
      out.write("                     <tr>\n");
      out.write("\n");
      out.write("                         <th>Codigo_Producto</th>\n");
      out.write("                         <th>Nombre</th>\n");
      out.write("                         <th>Marca del producto</th>\n");
      out.write("                         <th>Cantidad disponible</th>\n");
      out.write("                         <th>Precio</th>\n");
      out.write("                         <th>Descripcion</th>\n");
      out.write("                     </tr>     \n");
      out.write("                 </thead>\n");
      out.write("                    ");

         
                        ArrayList<Con_productos> datosu=new ArrayList<>();
                        
                        Modelos.Modelo_Productos mu=new Modelo_Productos();
                        datosu=mu.consultarusuarios();
                        Con_productos  u=new Con_productos();

                        for(int i=0; i<datosu.size(); i++){

                        u=datosu.get(i);


                    
      out.write("\n");
      out.write("                    <tbody>\n");
      out.write("\n");
      out.write("                                <tr>\n");
      out.write("                                    <td>");
      out.print(u.getCod_pro());
      out.write("</td>\n");
      out.write("                                    <td>");
      out.print(u.getNombre_pro());
      out.write("</td>\n");
      out.write("                                    <td>");
      out.print(u.getMarca());
      out.write("</td>\n");
      out.write("                                    <td>");
      out.print(u.getDisponibles());
      out.write("</td>\n");
      out.write("                                    <td>");
      out.print(u.getPrecio());
      out.write("</td>\n");
      out.write("                                    <td>");
      out.print(u.getDescripcion());
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
