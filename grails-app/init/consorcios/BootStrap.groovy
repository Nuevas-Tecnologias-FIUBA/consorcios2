package consorcios

import java.time.*

class BootStrap {

    def init = { servletContext ->

        def mauro = new Usuario(
            nombre: 'mauro',
            apellido: 'ciancio',
            email: 'mauro@mauro.com',
        ).save()

        def fiuba = new Consorcio(
            nombre: 'fiuba',
            direccion: 'paseo colon',
            administrador: mauro,
        ).save()

        def pablo = new Usuario(
            nombre: 'pablo',
            apellido: 'pablo',
            email: 'pablo@pablo.com',
        ).save()
        def marcos = new Usuario(
            nombre: 'marcos',
            apellido: 'marcos',
            email: 'marcos@marcos.com',
        ).save()
        def juancito = new Usuario(
            nombre: 'juancito',
            apellido: 'juancito',
            email: 'juancito@juancito.com',
        ).save()

        new UnidadFuncional(
            consorcio: fiuba,
            piso: 1,
            departamento: 'A',
            propietario: pablo,
        ).save()
        new UnidadFuncional(
            consorcio: fiuba,
            piso: 1,
            departamento: 'B',
            propietario: marcos,
        ).save()
        new UnidadFuncional(
            consorcio: fiuba,
            piso: 1,
            departamento: 'C',
            propietario: juancito,
        ).save()

        new Acta(
            consorcio: fiuba,
            asunto: "tienen que funcionar los ascensores?",
            contenido: "eso",
            fecha: LocalDate.now()
        ).save()

    }
    def destroy = {
    }
}
