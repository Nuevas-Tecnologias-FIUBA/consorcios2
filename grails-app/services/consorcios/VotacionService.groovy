package consorcios

import grails.gorm.transactions.Transactional

@Transactional
class VotacionService {

    Voto votar(long usuarioId, long actaId) {
        Usuario usuario = Usuario.get(usuarioId)
        Acta acta = Acta.get(actaId)
        usuario.votar(acta).save()
    }
}
