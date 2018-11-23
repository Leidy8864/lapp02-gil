<%-- 
    Document   : ocupacion
    Created on : 19/11/2018, 11:24:58 AM
    Author     : Leidy88
--%>

<%@page import="java.util.List"%>
<%@page import="java.util.Map"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    
    <h1>Cantidad de empleados por ocupacion</h1>	
    <table border="1">
        <thead>
            <tr>
                <th>Ocupacion</th>
                <th>Cantidad</th>
            </tr>
        </thead>
        <c:forEach var="listValue" items="${cantOcupacion}">
        <tbody>
            <tr>
                <td>${listValue.ocupacion}</td>
                <td>${listValue.numero}</td>
            </tr>
        </tbody>
        </c:forEach>
    </table>
  </body>
</html>
