package consorcios

class Consorcio {

    String nombre
    String direccion
    Set<UnidadFuncional> unidadesFuncionales = []
    Usuario administrador

    static hasMany = [
        unidadesFuncionales: UnidadFuncional,
    ]

    static constraints = {
        nombre blank: false, nullable: false
        direccion blank: false, nullable: false
        administrador nullable: false
    }
}
