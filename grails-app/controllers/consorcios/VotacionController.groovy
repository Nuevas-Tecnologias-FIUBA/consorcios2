package consorcios

import java.util.concurrent.atomic.AtomicLong

class VotacionController {

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

        Usuario usuario = Usuario.get(usuarioId)
        Acta acta = Acta.get(actaId)
        def voto = usuario.votar(acta).save()

        render "voto: ${voto}"
    }
}
