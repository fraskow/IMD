<%-- 
    Document   : metodo
    Created on : 10 sept 2021, 10:10:22
    Author     : Admin
--%>

<%@page import="beans.Usuario2"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form>
            <%  Usuario2 usuario= (Usuario2) request.getSession().getAttribute("usuario");
            String tipo = (String)request.getServletContext().getAttribute("tipo");%>
            <% //combobox%>
            <% //swicht(combo)que se hara con css
                //case "1":%>
            <%@include  file="paypal.jspf" %>
            <% //break;case "2":%>
            <%@include  file="tarjeta.jspf" %>
            <% //break;case "3":%>
            <%@include  file="transferencia.jspf" %>
            <%//break;default:break;%>
            <%if(tipo=="agregar") {%>
            <input type="submit" formaction="./PostAnadirServlet" value="agregar">
            <%}else{%>
            <input type="submit" formaction="./PostBorrarServlet" value="Borrar">
            <%}%>
            <input type="submit" formaction="./datos.jsp" value="cancelar">
        </form>
    </body>
</html>
