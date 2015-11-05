<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 07/10/2015
  Time: 11:03 AM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title></title>
</head>
<body>
<h2>Añadir Nueva Persona</h2>
<br>
    <g:form controller="persona" action="index">
        <label>Nombre(s)*:</label>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
        <g:textField name="nombre"></g:textField>
        <br>
        <br>
        <label>Apellido Paterno*:</label>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
        <g:textField name="apellidoPaterno"></g:textField>
        <br>
        <br>
        <label>Apellido Materno:</label>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
        <g:textField name="apellidoMaterno"></g:textField>
        <br>
        <br>
        <label>Fecha de Nacimiento*:</label>
        <g:datePicker name="fechaDeNacimiento" precision="day" hour="null" minute="null" years="${1915..2015}"></g:datePicker>
        <br>
        <br>
        <g:remoteFunction controller="persona" action="edadPersona"/>
        &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
        <button type="submit">Guardar</button>&nbsp&nbsp&nbsp&nbsp&nbsp
        <button type="reset">Limpiar Campos</button>
    </g:form>
<br>
<p>Los campos marcados con "*" son obligatorios</p>
</body>
</html>