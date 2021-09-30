<%-- 
    Document   : index
    Created on : 19 sept 2021, 16:59:52
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
          <h1>Test</h1>
            <form><table style="width:100%">
                <c:if test="${usuario==null}">
                    <tr>
                        <td><input type="submit" formaction="login.jsp" value="iniciar sesion"></td> 
                        <td><input type="submit" formaction="datos.jsp" value="registrarse"></td>
                    </tr>
                </c:if>
                <c:if test="${usuario!=null}">                
                    <tr>
                        <td><input type="submit" formaction="datos.jsp" value="modificar perfil"> </td>
                        <td> <input type="submit" formaction="./PostCerrarSesionServlet" value="cerrar sesion"> </td>
                    </tr>
                </c:if>
                <%//aqui va un for%>
                <tr>
                    <td>
                        <label>actividad 1</label>
                    </td> 
                    <c:if test="${usuario!=null}">                   
                        <td>
                            <input type="submit" formaction="./PreInscribirServlet" value="apuntarse">
                        </td>
                    </tr>
                </c:if>
            </table>
        </form>
      </body>
</html>
