/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.jc.controladores;

import com.jc.model.Guardarlaboratorio;
import com.jc.model.Laboratorio;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Deyanira
 */
public class Servletguardarlaboratorio extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String mensaje="no guardado";
        
        int Id_laboratorio=   Integer.parseInt(request.getParameter("Id_laboratorio"));
    int Id_medicamento=  Integer.parseInt(request.getParameter("Id_medicamento"));
    String nombre=    request.getParameter("nombre");
    
    Laboratorio u=new Laboratorio(Id_laboratorio,Id_medicamento,nombre);
   u.setID_laboratorio(Id_laboratorio);
   u.setID_medicamento(Id_medicamento);
   u.setNombre(nombre);
   
   Guardarlaboratorio gu=new Guardarlaboratorio();
   try {
            gu.insertar(u);
            mensaje=" guardado con exito : )";
        } catch (Exception ex) {
   mensaje=ex.getMessage();
        }
              out.println(mensaje);
    }
}
