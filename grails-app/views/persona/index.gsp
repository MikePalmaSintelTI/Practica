<%--
   Created by IntelliJ IDEA.
   User: DELL
   Date: 06/10/2015
   Time: 12:13 PM
   --%>
<%@ page import="primerapp.PersonaController; primerapp.Persona" contentType="text/html;charset=UTF-8" %>
<head>
    <title>Persona</title>
</head>
<label>Buscar: </label><g:form controller="persona" action="buscar">
    <select id="opciones" name="combo" size="1" onchange="buscar">
        <option value="nombre">Nombre</option>
        <option value="apellidoPaterno">Apellido Paterno</option>
        <option value="apellidoMaterno">Apellido Materno</option>
    </select>
    <g:textField name="filtro"/>
</g:form>
<%--<g:buscar name="nombre" apellido="apellidoPaterno"/>--%>
<br>
<h3>Lista</h3>
<table border="1">
    <thead>
    <tr>
        <td>Nombre(s)</td>
        <td>Apellido Paterno</td>
        <td>Apellido Materno</td>
        <td>Fecha de Nacimiento</td>
    </tr>
    </thead>
    <tbody>
    <g:each in="${personas}" var="persona">
        <tr>
            <td>${persona.nombre}</td>
            <td>${persona.apellidoPaterno}</td>
            <td>${persona.apellidoMaterno}</td>
            <td>${persona.fechaDeNacimiento.format("dd/MM/yyyy")}</td>
        </tr>
    </g:each>
    </tbody>
</table>
<br>
<a href="/PrimerApp/persona/create.gsp">Añadir Nueva Persona</a>
</body>
</html>