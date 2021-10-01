<%-- 
    Document   : metodo
    Created on : 10 sept 2021, 10:10:22
    Author     : Admin
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
        <form>
            <%  Usuario2 usuario= (Usuario2) request.getSession().getAttribute("usuario");
            String tipo = (String)request.getServletContext().getAttribute("tipo");%>
            <% // TODO combobox%>
            <c:if test="${usuario!=null}">
                <select name="opciones" id="opciones">
                    <option value="paypal">
                        Paypal
                    </option>
                    <option value="tarjeta">
                        Tarjeta
                    </option>
                    <option value="transferencia">
                        Transferencia
                    </option>
                </select>
            </c:if>
            <c:choose>
                <c:when test="${opt=='paypal'}"><%@include  file="paypal.jspf" %></c:when>
            </c:choose>
            
            <% //swicht(combo)que se hara con cssTO DO JS = HIDDEN ALL Y ONCHANGE = MOSTRADO
                //case "1": // %>
            <%@include  file="paypal.jspf" %>
            <% //break;case "2":%>
            <%@include  file="tarjeta.jspf" %>
            <% //break;case "3":%>
            <%@include  file="transferencia.jspf" %>
            <%//break;default:break;%>
            <c:if test="${tipo=='agregar'}">
            <input type="submit" formaction="./PostAnadirServlet" value="agregar">
            </c:if>
            <c:if test="${tipo=='borrar'}">
            <input type="submit" formaction="./PostBorrarServlet" value="Borrar">     
            </c:if>
            <input type="submit" formaction="./datos.jsp" value="cancelar">
        </form>
    </body>
</html>
