package primerapp

import java.text.DateFormat

class Persona {
    String nombre
    String apellidoPaterno
    String apellidoMaterno
    Date fechaDeNacimiento
    Integer edad

    static constraints = {
        nombre nullable: true, blank: true
        apellidoPaterno nullable: true, blank: true
        apellidoMaterno nullable: true
        edad nullable: true
        fechaDeNacimiento nullable: true, blank: true
    }
}
