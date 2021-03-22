/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServeletControlador;

import Constructor.Con_carrito;
import Constructor.Con_productos;
import Modelos.Modelo_Productos;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author jyopa
 */
@WebServlet(name = "Sv_comprasCarrito", urlPatterns = {"/Sv_comprasCarrito"})
public class Sv_comprasCarrito extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    
    Con_productos conp=new Con_productos();
    Modelos.Modelo_Productos mod=new Modelo_Productos();
    ArrayList<Con_productos> listarproductos=new ArrayList<>();
    ArrayList<Con_carrito> listacarrito=new ArrayList<>();
    int item;
    
    double totalapagar;
    int cantidad=1;
    
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        
        String accion=request.getParameter("accion");
        listarproductos=mod.consultarusuarios();
        switch (accion){
            case "agregar":
                item=item+1;
                String idp=request.getParameter("id");
                conp=mod.listar(idp);
                Con_carrito cpro=new Con_carrito();
                
                cpro.setItem(item);
                cpro.setCod_pro(conp.getCod_pro());
                cpro.setNombre(conp.getNombre_pro());
               
                cpro.setCantidad(cantidad);
                cpro.setPreciodecompra(conp.getPrecio());
                cpro.setDescripcion(conp.getDescripcion());
                
                cpro.setPreciodecompra(cantidad*(conp.getPrecio()));
                
                listacarrito.add(cpro);
                request.setAttribute("contador",listacarrito.size());
                request.getRequestDispatcher("Productos_td.jsp").forward(request, response);
                break;
            case "comprar":
                
                
                
                break;
            default:
                request.setAttribute("productos", listarproductos);
                request.getRequestDispatcher("Productos_td.jsp");
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
