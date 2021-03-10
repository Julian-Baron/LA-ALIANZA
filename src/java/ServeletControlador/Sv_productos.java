/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServeletControlador;

import Constructor.Con_productos;
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
@WebServlet(name = "Sv_productos", urlPatterns = {"/Sv_productos"})
public class Sv_productos extends HttpServlet {

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
                int d;
                a=request.getParameter("Codigo_pro");
                b=request.getParameter("nombre");
                c=request.getParameter("Marca");
                d=Integer.parseInt(request.getParameter("Cantidad"));
                e=request.getParameter("Precio");
                f=request.getParameter("Descripcion");
                
                Con_productos con=new Con_productos(a, f, d, c, b, e);
                Modelo_Productos md=new Modelo_Productos();
                
                 in=md.insertar_producto(con);
           
                if(in){
                    JOptionPane.showMessageDialog(null,"Datos guardados");
                   
                }
                else{
                    JOptionPane.showMessageDialog(null,"Datos NO guardados");

                }
                 response.sendRedirect("formulario_Productos.jsp");         
                
            }
            if (request.getParameter("modificar")!=null) {
                String a,b,c,e,f;
                boolean in;
                int d;
                a=request.getParameter("Codigo_pro");
                b=request.getParameter("nombre");
                c=request.getParameter("Marca");
                d=Integer.parseInt(request.getParameter("Cantidad"));
                e=request.getParameter("Precio");
                f=request.getParameter("Descripcion");
                
                Con_productos con=new Con_productos(a, f, d, c, b, e);
                Modelo_Productos md=new Modelo_Productos();
                
                 in=md.modificar_producto(con);
           
                if(in){
                    JOptionPane.showMessageDialog(null,"Datos modificados");
                   
                }
                else{
                    JOptionPane.showMessageDialog(null,"Datos NO modificados");

                }
                 response.sendRedirect("formulario_Productos.jsp");         
                
            }
            if (request.getParameter("eliminar")!=null) {
                String a,b,c,e,f;
                boolean in;
                int d;
                a=request.getParameter("Codigo_pro");
               
                
                Con_productos con=new Con_productos(a);
                Modelo_Productos md=new Modelo_Productos();
                
                 in=md.eliminar_producto(con);
           
                if(in){
                    JOptionPane.showMessageDialog(null,"Datos eliminados");
                   
                }
                else{
                    JOptionPane.showMessageDialog(null,"Datos NO eliminados");

                }
                response.sendRedirect("formulario_Productos.jsp");         
                
            }
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
