<%-- 
    Document   : inscribir
    Created on : 10 sept 2021, 10:03:35
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inscripcion</title>
    </head>
    <body>
        <h1>APUNTATE!</h1>
        <form method="GET" action="./PostInscribirServlet">
        <table>
            <tr>
                <td colspan="2">
        <label><%//titulo de la actividad%> actividad</label>
                </td>
        </tr>
        <tr>
            <td>
               <%//monitor%> monitor 
            </td>
            <td>
               <%//horario%> horario 
            </td>
        </tr>
        <tr>
            <td colspan="2">
               <%//descripcion%> descripcion 
            </td>
                    </tr>
                 <tr>
            <td>
               <%//combobox%> combobox 
            </td>
            <td>
                <%//aplicar%> <input type="submit" value="APUNTATE!!!"  >
            </td>
        </tr>   
        </table>
    </form>
    </body>
</html>
