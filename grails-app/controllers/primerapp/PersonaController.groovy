package primerapp

class PersonaController {

    def personaService

    def index() {
        List<Persona> personas = personaService.listaPersonas(params)
        render(view: '/persona/index', template: 'tabla', model: [personas: personas])
    }

    def create() {
        //List<Persona> persona = PersonaService.guardarPersona(params)
        render(view: '/persona/create')
    }

    def buscar() {

        def opciones = params.combo
        def resultadoBusqueda
        def filtro = params.filtro

        switch (opciones) {
            case 'nombre':
                resultadoBusqueda = Persona.findByNombre(filtro)
                if (resultadoBusqueda != null) {
                    println("consulta: " + resultadoBusqueda.nombre + " " + resultadoBusqueda.apellidoPaterno + " " + resultadoBusqueda.apellidoMaterno + " " + resultadoBusqueda.fechaDeNacimiento)
                    render(view: '/persona/index', template: 'detalles', model: [personas: resultadoBusqueda])
                } else {
                    render(view: '/persona/error')
                }

                break
            case 'apellidoPaterno':
                resultadoBusqueda = Persona.findAllByApellidoPaterno(filtro)
                if(resultadoBusqueda != null) {
                    println("consulta: " + resultadoBusqueda.nombre + " " + resultadoBusqueda.apellidoPaterno + " " + resultadoBusqueda.apellidoMaterno + " " + resultadoBusqueda.fechaDeNacimiento)
                    render(view: '/persona/index', template: 'detalles', model: [personas: resultadoBusqueda])
                } else {
                    render(view: '/persona/error')
                }
                break
            case 'fechaNacimiento':
                resultadoBusqueda = Persona.findAllByFechaDeNacimiento(filtro)
                if(resultadoBusqueda != null) {
                    println("consulta: " + resultadoBusqueda.nombre + " " + resultadoBusqueda.apellidoPaterno + " " + resultadoBusqueda.apellidoMaterno + " " + resultadoBusqueda.fechaDeNacimiento)
                    render(view: '/persona/index', template: 'detalles', model: [personas: resultadoBusqueda])
                } else {
                    render(view: '/persona/error')
                }
                break
        }
        println("Presionaste " + opciones)
        println("params: "+params)
    }
}