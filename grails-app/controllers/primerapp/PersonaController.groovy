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
                println("consulta: " + resultadoBusqueda.nombre + " " + resultadoBusqueda.apellidoPaterno + " " + resultadoBusqueda.apellidoMaterno + " " + resultadoBusqueda.fechaNacimiento)
                render(view: 'index', template: 'detalles', model: [personas: resultadoBusqueda])
                break
            case 'apellidoPaterno':
                resultadoBusqueda = Persona.findAllByApellidoPaterno(filtro)
                println("consulta: " + resultadoBusqueda.nombre + " " + resultadoBusqueda.apellidoPaterno + " " + resultadoBusqueda.apellidoMaterno + " " + resultadoBusqueda.fechaNacimiento)
                render(view: 'index', template: 'detalles', model: [personas: resultadoBusqueda])
                break
            case 'fechaNacimiento':
                resultadoBusqueda = Persona.findAllByFechaDeNacimiento()
                println("consulta: " + resultadoBusqueda.nombre + " " + resultadoBusqueda.apellidoPaterno + " " + resultadoBusqueda.apellidoMaterno + " " + resultadoBusqueda.fechaNacimiento)
                render(view: 'index', template: 'detalles', model: [personas: resultadoBusqueda])
                break
        }
        println("Presionaste " + opciones)
        println("params: "+params)
    }
}