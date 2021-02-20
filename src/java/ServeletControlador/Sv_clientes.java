/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServeletControlador;

import Constructor.Con_clientes;
import Constructor.Con_productos;
import Modelos.Mod_Clientes;
import Modelos.Modelo_Productos;
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
 * @author Trabajos
 */
@WebServlet(name = "Sv_clientes", urlPatterns = {"/Sv_clientes"})
public class Sv_clientes extends HttpServlet {

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
                String a,b,c,e,f;
                boolean in;
                String d;
                a=request.getParameter("Cedula");
                b=request.getParameter("nombre");
                c=request.getParameter("apellido");
                d=request.getParameter("correo");
                e=request.getParameter("direccion");
                f=request.getParameter("telefono");
                
                Con_clientes con=new Con_clientes(a, b, c, d, e, f);
                Modelos.Mod_Clientes md=new Mod_Clientes();
                
                in=md.insertar_Clientes(con);
           
                if(in){
                    JOptionPane.showMessageDialog(null,"Datos guardados");
                   
                }
                else{
                    JOptionPane.showMessageDialog(null,"Datos NO guardados");

                }
                
                
            }
            if (request.getParameter("modificar")!=null) {
                String a,b,c,e,f;
                boolean in;
                String d;
                a=request.getParameter("Cedula");
                b=request.getParameter("nombre");
                c=request.getParameter("apellido");
                d=request.getParameter("correo");
                e=request.getParameter("direccion");
                f=request.getParameter("telefono");
                
                Con_clientes con=new Con_clientes(a, b, c, d, e, f);
                Modelos.Mod_Clientes md=new Mod_Clientes();
                
                /*Esto esta asi porque copie el modelo de producto paracambiarlo al de 
                    clientes
                */
                in=md.modificar_producto(con);
           
                if(in){
                    JOptionPane.showMessageDialog(null,"Datos modificados");
                   
                }
                else{
                    JOptionPane.showMessageDialog(null,"Datos NO modificados");

                }         
                
            }
            if (request.getParameter("eliminar")!=null) {
                String a,b,c,e,f;
                boolean in;
                String d;
                a=request.getParameter("Cedula");
                b=request.getParameter("nombre");
                c=request.getParameter("apellido");
                d=request.getParameter("correo");
                e=request.getParameter("direccion");
                f=request.getParameter("telefono");
                
                Con_clientes con=new Con_clientes(a, b, c, d, e, f);
                Modelos.Mod_Clientes md=new Mod_Clientes();
                
                 in=md.eliminar_producto(con);
           
                if(in){
                    JOptionPane.showMessageDialog(null,"Datos modificados");
                   
                }
                else{
                    JOptionPane.showMessageDialog(null,"Datos NO modificados");

                }    
                          
                
            }
            response.sendRedirect("formulario_clientes.jsp");
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
