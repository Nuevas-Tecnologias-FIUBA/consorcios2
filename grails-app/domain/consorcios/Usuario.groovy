package consorcios

class Usuario {

    String nombre
    String apellido
    String email
    String password
    Set<Voto> votos = []

    static hasMany = [
        votos: Voto,
    ]

    static constraints = {
        nombre blank: false, nullable: false
        apellido blank: false, nullable: false
        email blank: false, nullable: false, email: true
        password blank: true, nullable: true
    }

    Voto votar(Acta acta) {
        // 1) que no haya un voto del usuario en el acta
        boolean yaVote = this.votos.any { Voto voto ->
            voto.acta == acta
        }
        if (yaVote) throw new IllegalStateException("el usuario=${this} ya votó en el acta=${acta}")

        // 2) que sea propietario de alguna unidad funcional del consorcio del acta
        boolean soyPropietario = acta.consorcio.unidadesFuncionales.any { UnidadFuncional uf ->
            uf.propietario == this
        }
        if (!soyPropietario) throw new IllegalStateException("el usuario=${this} no es propietario de ninguna uf en el consorcio=${acta.consorcio}")

        Voto voto = new Voto(acta, this)
        this.votos << voto
        voto
    }
}
