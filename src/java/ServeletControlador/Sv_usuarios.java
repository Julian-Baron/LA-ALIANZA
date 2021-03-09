/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServeletControlador;

import Constructor.Con_usuarios;
import Modelos.Mod_usuarios;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

/**
 *
 * @author Personal
 */
@WebServlet(name = "Sv_usuarios", urlPatterns = {"/Sv_usuarios"})
public class Sv_usuarios extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
                
            if (request.getParameter("enviar")!=null) {
                String a,b,ef,d,e;
                boolean an=false;
                
                a=request.getParameter("Cedula");
                b=request.getParameter("nombre");
                ef=request.getParameter("contrasena");
                d=request.getParameter("rol");
                e=request.getParameter("sexo");
                
               
                Con_usuarios con=new Con_usuarios(a, b, ef, d, e);
                Modelos.Mod_usuarios mu=new Mod_usuarios();
                
                an=mu.insertar_usuarios(con);
                
                if(an){
                    JOptionPane.showMessageDialog(null, "Datos guardados correctamente");
                }
                else{
                    JOptionPane.showMessageDialog(null, "Datos no guardados ");
                }
                
                
                
            }
            if (request.getParameter("modificar")!=null) {
                String a,b,ef,d,e;
                boolean an=false;
                
                
                a=request.getParameter("Cedula");
                b=request.getParameter("nombre");
                ef=request.getParameter("contrasena");
                d=request.getParameter("rol");
                e=request.getParameter("sexo");
                
                JOptionPane.showMessageDialog(null,"Cedula"+ a);
                Con_usuarios con=new Con_usuarios(a, b, ef, d, e);
                Modelos.Mod_usuarios mu=new Mod_usuarios();
                
                an=mu.Modificar_usuarios(con);
                
                if(an){
                    JOptionPane.showMessageDialog(null, "Datos modificados correctamente");
                }
                else{
                    JOptionPane.showMessageDialog(null, "Datos no modificados ");
                }
                
                
                
            }
            if (request.getParameter("eliminar")!=null) {
                String a,b,ef,d,e;
                boolean an=false;
                
                a=request.getParameter("Cedula");
                b=request.getParameter("nombre");
                ef=request.getParameter("contrasena");
                d=request.getParameter("rol");
                e=request.getParameter("sexo");
                
                Con_usuarios con=new Con_usuarios(a, b, ef, d, e);
                Modelos.Mod_usuarios mu=new Mod_usuarios();
                
                an=mu.eliminar_usuarios(con);
                
                if(an){
                    JOptionPane.showMessageDialog(null, "Datos eliminados correctamente");
                }
                else{
                    JOptionPane.showMessageDialog(null, "Datos no eliminados ");
                }
                
                
                
            }
 
           response.sendRedirect("Formulario_usuarios.jsp");
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
