<%--
  Created by IntelliJ IDEA.
  User: jetdr
  Date: 20-06-2022
  Time: 13:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<meta charset="UTF-8">
<html>
<head>
    <title>Pagina Inicio</title>
</head>
<body>


<form:form action="/home/registro" method ="post"> <!--El formulario nos lleva a la ruta de registro-->
    <input type = "submit" value ="Registra tu guitarra">
</form:form>


</body>
</html>