package consorcios

import java.time.*

class Acta {

    Consorcio consorcio
    String asunto
    String contenido
    LocalDate fecha
    Set<Voto> votos = []

    static hasMany = [
        votos: Voto,
    ]

    static constraints = {
        consorcio nullable: false
        asunto nullable: false, blank: false
        contenido nullable: false, blank: false
        fecha nullable: false
    }
}
