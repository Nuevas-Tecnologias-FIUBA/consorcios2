package consorcios

class UrlMappings {

    static mappings = {
        "/mi-pagina-principal"(controller: 'votacion', action: 'index')

        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(view:"/index")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
