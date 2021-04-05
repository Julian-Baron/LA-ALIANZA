package ServeletControlador;

import Constructor.Con_login;
import Modelos.Mod_login;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;


/**
 *
 * @author Personal
 */

@WebServlet(name = "Sv_login", urlPatterns = {"/Sv_login"})
public class Sv_login extends HttpServlet {
    
    private static String nombre_usu, rol, cedula, contraseña, sexo, nombre_cli;
    
    
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */ 
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
            
        if(request.getParameter("btnlog")!=null){
            ArrayList<Constructor.Con_login> dat=new ArrayList<>();
            /*Variables que almacenaran el usuario y contraseña
              Array el cual me generara la consulta de datos con respecto a el usuario y contraseña
            */
            String nom,con;                                 
                
            nom=request.getParameter("usu");
            con=request.getParameter("pas");
            
            
            Constructor.Con_login md=new Con_login(nom,con);
            Mod_login mod=new Mod_login();
            
            dat=mod.loginusu(md);
            
            for (int i = 0; i < dat.size(); i++) {
                md=dat.get(i);
                nombre_usu=md.getNombre_usu();
                cedula=md.getCedula();
                contraseña=md.getContraseña();
                rol=md.getRol();
                sexo=md.getSexo();
                nombre_cli=md.getNombre_cliente();
                
                if(nom.equals(nombre_usu) &&  con.equals(contraseña)){
                        
                        HttpSession ses=request.getSession();
                        ses.setAttribute("Documento", cedula);
                        ses.setAttribute("usuario", nombre_usu);
                        ses.setAttribute("clave", contraseña);
                        ses.setAttribute("rol", rol);
                        ses.setAttribute("sexo", sexo);
                        ses.setAttribute("Nombre_cli", nombre_cli);
                        
                       if(rol.equalsIgnoreCase("empleado")){
                            JOptionPane.showMessageDialog(null, "Bienvenido");
                            response.sendRedirect("Formularios de gestion.jsp");
                             }
                        
                       if(rol.equalsIgnoreCase("cliente")){
                            JOptionPane.showMessageDialog(null, "Bienvenido");
                            response.sendRedirect("index.jsp");
                             }
                        
                        if (rol.equalsIgnoreCase("administrador")){
                          JOptionPane.showMessageDialog(null, "Bienvenido");
                            response.sendRedirect(".jsp");
                         }
                       
                     }
                   else{
                    JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos 123");
                    response.sendRedirect("Login.jsp");
                        }
                    }
                }
              else{
                    JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos");
                    response.sendRedirect("Login.jsp");
                } 
                
                
                
            
            
        
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
