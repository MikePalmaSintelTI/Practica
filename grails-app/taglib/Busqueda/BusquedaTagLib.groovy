package Busqueda

class BusquedaTagLib {
    //static defaultEncodeAs = [taglib: 'html']
    static encodeAsForTags = [tagName: [taglib:'html'], otherTagName: [taglib:'none']]

    def buscar={ attrs->
        out << render(template:'/persona/busqueda', model:[idNombre: attrs.name,
                                                           nombreTxt: attrs.nombreTxt,
                                                           idApellido: attrs.apellido])
    }
}