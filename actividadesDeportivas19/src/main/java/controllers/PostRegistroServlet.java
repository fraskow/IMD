/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import beans.Usuario2;
import interfacesService.UsuarioService;
import java.io.IOException;
import java.io.PrintWriter;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author nators
 */
@WebServlet(name = "PostRegistroServlet", urlPatterns = {"/PostRegistroServlet"})
public class PostRegistroServlet extends HttpServlet {

      @Inject
      private UsuarioService usuarioService;

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
            String nick = request.getParameter("nick");
            String password = request.getParameter("password");
            String validatePassword = request.getParameter("validatePassword");

            if (password.equals(validatePassword)) {
                  Usuario2 usuario2 = new Usuario2();
                  usuario2.setNick(request.getParameter("nick"));
                  usuario2.setPassword(request.getParameter("password"));
//                  Usuario2 usuarioBueno = ;
                  if (usuarioService.findUsuario2ByNombre(usuario2)!=null) {
                        request.getRequestDispatcher("./datos.jsp").forward(request, response);
                  } else {
                        usuario2.setNombre(request.getParameter("nombre"));
                        usuario2.setPrimerApellido(request.getParameter("primerapellido"));
                        usuario2.setSegundoApellido(request.getParameter("segundopellido"));
                        usuario2.setEmail(request.getParameter("email"));
                        usuario2.setTelefono(request.getParameter("telefono"));
                        usuarioService.addUsuario2(usuario2);
                        response.sendRedirect("./index.jsp");
                  }
            } else {

                  response.sendRedirect("./datos.jsp");

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
