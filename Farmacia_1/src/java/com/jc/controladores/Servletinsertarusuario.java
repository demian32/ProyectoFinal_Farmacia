/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.jc.controladores;

import com.jc.model.InsertarUsuario;
import com.jc.model.Usuarios;
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
public class Servletinsertarusuario extends HttpServlet {

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
        
        int Id_usuario=   Integer.parseInt(request.getParameter("Id_usuario"));
    String login = request.getParameter("login");
    String password=    request.getParameter("password");
    
    Usuarios u=new Usuarios(Id_usuario,login,password);
   u.setID_usuario(Id_usuario);
   u.setLogin(login);
   u.setPassword(password);
   
   InsertarUsuario gu=new InsertarUsuario();
   try {
            gu.insertar(u);
            mensaje=" Usuario insertado con exito : )";
        } catch (Exception ex) {
   mensaje=ex.getMessage();
        }
              out.println(mensaje);
    }
}

