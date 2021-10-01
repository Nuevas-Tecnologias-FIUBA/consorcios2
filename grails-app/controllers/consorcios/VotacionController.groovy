package consorcios

import java.util.concurrent.atomic.AtomicLong
import grails.converters.*

class VotacionController {

    def votacionService // NO TENGO que hacer new VotacionService

    static AtomicLong CONTADOR_DE_VISITAS_VINTAGE = new AtomicLong(
        new Random().nextLong()
    )

    def index() {
        [
            contadorDeVisitas: CONTADOR_DE_VISITAS_VINTAGE.getAndIncrement(),
            usuarios: Usuario.list(),
            actas: Acta.list(),
        ]
    }

    def votar(Long usuarioId, Long actaId) {
        def voto = votacionService.votar(usuarioId, actaId)
        render "voto: ${voto}"
    }

    def algo() {
        // opcion a)
        render Usuario.list().collect { usuario ->
            [
                id: usuario.id,
                nombre: usuario.nombre,
                apellido: usuario.apellido,
            ]
        } as JSON

        // opcion b)
        // render Usuario.list() as JSON
    }
}
