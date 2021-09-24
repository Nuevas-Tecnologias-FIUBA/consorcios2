package consorcios

class Voto {

    Acta acta
    Usuario usuario

    static constraints = {
        acta nullable: false
        usuario nullable: false
    }

    Voto(Acta acta, Usuario usuario) {
        this.acta = acta
        this.usuario = usuario
    }
}
