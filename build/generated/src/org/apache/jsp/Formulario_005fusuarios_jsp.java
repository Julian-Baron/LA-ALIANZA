package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import Modelos.Mod_usuarios;
import Constructor.Con_usuarios;

public final class Formulario_005fusuarios_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl\" crossorigin=\"anonymous\">\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-b5kHyXgcpbZJO/tY9Ul7kGkf1S0CWuKcCD38l8YkeH8z8QjE0GmW1gYU5S9FOnJ0\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/styles_header.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <header>\n");
      out.write("\t\t<div class=\"wrapper\">\n");
      out.write("\t\t\t<div class=\"logo\">Supermercado la Alianza</div>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<nav>\n");
      out.write("\t\t\t\t<a href=\"#\">Inicio</a>\n");
      out.write("\t\t\t\t<a href=\"#\">Servicios</a>\n");
      out.write("\t\t\t\t<a href=\"#\">Proyectos</a>\n");
      out.write("\t\t\t\t<a href=\"#\">Contacto</a>\n");
      out.write("\t\t\t</nav>\n");
      out.write("\t\t</div>\n");
      out.write("\t</header>    \n");
      out.write("        <div class=\"container\">\n");
      out.write("            <h1>Formulario para la Gestion de usuarios</h1>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div id=\"section\">\n");
      out.write("                    <form action=\"Sv_usuarios\" target=\"\" method=\"Post\" name=\"formDatosPersonales\">\n");
      out.write("\n");
      out.write("                        <div class=\"mb-3\">\n");
      out.write("                        <label for=\"exampleInputEmail1\" class=\"form-label\">Cedula</label>\n");
      out.write("                        <input type=\"text\" name=\"Cedula\" class=\"form-control\" id=\"exampleInputEmail1\" aria-describedby=\"emailHelp\">\n");
      out.write("                        <div id=\"emailHelp\" class=\"form-text\"></div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <!--<label for=\"Cedula\">Cedula</label>\n");
      out.write("                        <input type=\"text\" name=\"Cedula\" id=\"nombre\" placeholder=\"Nº Cedula\"/>-->\n");
      out.write("\n");
      out.write("                        <div class=\"mb-3\">\n");
      out.write("                        <label for=\"exampleInputEmail1\" class=\"form-label\">Nombre de usuario</label>\n");
      out.write("                        <input type=\"text\" name=\"nombre\" class=\"form-control\" id=\"exampleInputEmail1\" aria-describedby=\"emailHelp\">\n");
      out.write("                        <div id=\"emailHelp\" class=\"form-text\"></div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <!--<label for=\"nombre\">Nombre de usuario</label>\n");
      out.write("                        <input type=\"text\" name=\"nombre\" id=\"nombre\" placeholder=\"Nombre\"/>-->\n");
      out.write("\n");
      out.write("                        <div class=\"mb-3\">\n");
      out.write("                        <label for=\"exampleInputEmail1\" class=\"form-label\">Contraseña</label>\n");
      out.write("                        <input type=\"password\" name=\"contraseña\" class=\"form-control\" id=\"exampleInputEmail1\" aria-describedby=\"emailHelp\">\n");
      out.write("                        <div id=\"emailHelp\" class=\"form-text\"></div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <!--<label for=\"apellidos\">Contraseña</label>\n");
      out.write("                        <input type=\"text\" name=\"contraseña\" id=\"apellidos\" placeholder=\"Apellido\"/>\n");
      out.write("                        -->\n");
      out.write("\n");
      out.write("                        <div class=\"col-auto\">\n");
      out.write("\n");
      out.write("                        <select class=\"form-select\" id=\"autoSizingSelect\" name=\"rol\">\n");
      out.write("                            <option selected>Escoger...</option>\n");
      out.write("                            <option value=\"1\">Administrador</option>\n");
      out.write("                            <option value=\"2\">Empleado</option>\n");
      out.write("                            <option value=\"3\">Cliente</option>\n");
      out.write("                        </select>\n");
      out.write("                        </div>\n");
      out.write("                        </br>\n");
      out.write("                        <!--<label for=\"telefono\">Rol</label>\n");
      out.write("                        <input type=\"email\" name=\"rol\" id=\"email\" placeholder=\"Correo\"  />\n");
      out.write("\n");
      out.write("                        <label for=\"Codigo del empleado\">sexo</label>\n");
      out.write("                        <input type =\"text\" name=\"codigo\" id=\"asunto\" placeholder=\"Codigo_empleado\"/>\n");
      out.write("                        -->\n");
      out.write("                        \n");
      out.write("                        <div class=\"col-auto\">\n");
      out.write("\n");
      out.write("                        <select class=\"form-select\" id=\"autoSizingSelect\" name=\"sexo\">\n");
      out.write("                            <option selected>Sexo...</option>\n");
      out.write("                            <option value=\"1\">Masculino</option>\n");
      out.write("                            <option value=\"2\">Femenino</option>\n");
      out.write("                            <option value=\"3\">Otro..</option>\n");
      out.write("                        </select>\n");
      out.write("                        </div>\n");
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
      out.write("\n");
      out.write("                    </br>\n");
      out.write("                    </br>\n");
      out.write("                    </br>\n");
      out.write("                    <div id=\"section-tabla\">\n");
      out.write("                        <table class=\"table\">\n");
      out.write("                           <thead>\n");
      out.write("                             <tr>\n");
      out.write("                                 <th>Cedula</th>\n");
      out.write("                                 <th>Nombre de Usuario</th>\n");
      out.write("                                 <th>Contraseña</th>\n");
      out.write("                                 <th>rol</th>\n");
      out.write("                                 <th>Sexo</th>\n");
      out.write("                                 \n");
      out.write("                             </tr>     \n");
      out.write("                         </thead>\n");
      out.write("                            ");


                                ArrayList<Con_usuarios> datosu=new ArrayList<>();

                                Modelos.Mod_usuarios mu=new Mod_usuarios();
                                datosu=mu.consultar_usuarios();
                                Con_usuarios  u=new Con_usuarios();

                                for(int i=0; i<datosu.size(); i++){

                                u=datosu.get(i);


                            
      out.write("\n");
      out.write("                            <tbody>\n");
      out.write("\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td>");
      out.print(u.getCedula());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print(u.getNombre_usu());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print(u.getContraseña());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print(u.getRol());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print(u.getSexo());
      out.write("</td>\n");
      out.write("\n");
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
      out.write("                        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("<!--<form>\n");
      out.write("  <div class=\"mb-3\">\n");
      out.write("    <label for=\"exampleInputEmail1\" class=\"form-label\">Email address</label>\n");
      out.write("    <input type=\"email\" class=\"form-control\" id=\"exampleInputEmail1\" aria-describedby=\"emailHelp\">\n");
      out.write("    <div id=\"emailHelp\" class=\"form-text\">We'll never share your email with anyone else.</div>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"mb-3\">\n");
      out.write("    <label for=\"exampleInputPassword1\" class=\"form-label\">Password</label>\n");
      out.write("    <input type=\"password\" class=\"form-control\" id=\"exampleInputPassword1\">\n");
      out.write("  </div>\n");
      out.write("  <div class=\"mb-3 form-check\">\n");
      out.write("    <input type=\"checkbox\" class=\"form-check-input\" id=\"exampleCheck1\">\n");
      out.write("    <label class=\"form-check-label\" for=\"exampleCheck1\">Check me out</label>\n");
      out.write("  </div>\n");
      out.write("  <button type=\"submit\" class=\"btn btn-primary\">Submit</button>\n");
      out.write("</form>-->");
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
