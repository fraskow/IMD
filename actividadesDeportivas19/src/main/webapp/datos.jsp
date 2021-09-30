<%-- 
    Document   : datos
    Created on : 19 sept 2021, 17:17:11
    Author     : nators
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="beans.Usuario2"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
      <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <title>JSP Page</title>
      </head>
      <body>
                    <% Usuario2 usuario= (Usuario2) request.getSession().getAttribute("usuario");%>
        <form  method="GET">
            <%if(usuario==null){%>
         <%@include  file="formularionick.jspf" %>
         <%}%>
         <%@include  file="formulario_datos.jspf" %>
         <%
             if(usuario==null){
         %>
        
         <%@include  file="paypal.jspf" %>
          <%@include  file="tarjeta.jspf" %>
          <%@include  file="transferencia.jspf" %>
         <%}
         if(usuario==null){%>
         <input type="submit" formaction="PostRegistroServlet" value="registrar">
          <%}else{%> 
          <br>
          <h2>Metodos de pago</h2>
          <input type="submit" formaction="PreMetodoServlet" name="opcion" value="Eliminar">
          <input type="submit" formaction="PreMetodoServlet" name="opcion" value="Agregar">
          <br>
         <input type="submit" formaction="PostModificarServlet" value="modificar">
         <%}%>
         <input type="submit" formaction="index.jsp" value="cancelar">
        </form>
      </body>
</html>
