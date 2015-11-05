package primerapp

import grails.transaction.Transactional

@Transactional
class PersonaService {


    Persona guardarPersona(params){
        Persona persona = new Persona(params)
        persona.save(flush: true, failOnError: true)
        persona //lo ultimo que lee grails con groovy es el return que va a tener
    }
    /**Persona consultarPersona(String nombre){
        Persona persona = Persona.get(listaPersonas().nombre)
        persona
    }*/
    List<Persona> listaPersonas(params){
        guardarPersona(params)
        List<Persona> listaPersonas = Persona.list()
        listaPersonas
    }
}