<%--
  Created by IntelliJ IDEA.
  User: jetdr
  Date: 20-06-2022
  Time: 14:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
          rel="stylesheet"
          integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
          crossorigin="anonymous">

    <meta charset="UTF-8">
    <title>Registro de Guitarra</title>
</head>
<body>
<div>
    <c:if test="${msgError != null}">
        <c:out value="${msgError}"></c:out>
    </c:if>
    <%--@elvariable id="guitarra" type=""--%>
    <form:form action="/registro/actualizar/${guitarra.id}" method="post"
               modelAttribute="guitarra"> <!--modelAttribute nos permite comunicarnos con el controlador-->
        <form:label path="marca">Marca:</form:label>
        <form:input type="text" path="marca" />
        <br>
        <form:label path="modelo">Modelo:</form:label>
        <form:input type="text" path="modelo" />
        <br>
        <form:label path="precioCLP">Precio(CLP):</form:label>
        <form:input type="number" path="precioCLP" />
        <br>
        <form:label path="maderatipo">Tipo de madera:</form:label>
        <form:input type="text" path="maderatipo" />
        <br>



        <button type ="submit" class="btn btn-warning">Editar</button>
    </form:form>
</div>
</body>
</html>