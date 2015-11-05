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
            <td>${persona.fechaDeNacimiento}</td>
        </tr>
    </g:each>
    </tbody>
</table>