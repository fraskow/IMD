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

        <form  method="GET">

            <c:if test="${usuario==null}">
                <%@include  file="formularionick.jspf" %>
            </c:if>
            <%@include  file="formulario_datos.jspf" %>
            <c:if test="${usuario==null}">
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

            <c:if test="${usuario==null}">
                <input type="submit" formaction="PostRegistroServlet" value="registrar">
            </c:if>
            <c:if test="${usuario!=null}">
                <br>
                <h2>Metodos de pago</h2>
                <input type="submit" formaction="PreMetodoServlet" name="opcion" value="Eliminar">
                <input type="submit" formaction="PreMetodoServlet" name="opcion" value="Agregar">
                <br>
                <input type="submit" formaction="PostModificarServlet" value="modificar">
            </c:if>
            <input type="submit" formaction="index.jsp" value="cancelar">
        </form>
    </body>
</html>
