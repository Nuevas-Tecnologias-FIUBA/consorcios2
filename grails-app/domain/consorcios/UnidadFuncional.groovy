package consorcios

class UnidadFuncional {

    Consorcio consorcio
    Integer piso
    String departamento

    Usuario propietario
    Usuario inquilino

    static constraints = {
        consorcio nullable: false
        piso nullable: false
        departamento blank: false, nullable: false

        propietario nullable: false
        inquilino nullable: true
    }
}