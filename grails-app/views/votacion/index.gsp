<html>
    <head>
        <meta name="layout" content="main"/>
        <style>
            body {
                background-color: #1c8385;
            }

            table {
                width: 100%;
            }
            table tr th {
                border: 1px solid red;
            }
            table tr td {
                border: 1px solid black;
            }
        </style>
    </head>
    <body>

        <g:form action="votar">

            <p>
                elegí un usuario:
            </p>
            <p>
                <g:select
                    noSelection="['': '(elegí una opción)']"
                    optionKey="id"
                    optionValue="nombre"
                    name="usuarioId"
                    from="${usuarios}"
                    />
            </p>

            <p>
                elegí un acta:
            </p>
            <p>
                <g:select
                    noSelection="['': '(elegí una opción)']"
                    optionKey="id"
                    optionValue="asunto"
                    name="actaId"
                    from="${actas}"
                    />
            </p>


            <button type="submit">enviar</button>
        </g:form>



        <h1>hola esto es una página</h1>

        <marquee>bienvenidos a mi página web</marquee>
        <p>son las ${new Date()}</p>
        <p>sos el visitante numero: ${contadorDeVisitas}</p>

        <p>
            listado de usuarios:
        </p>

        <table>
            <thead>
                <tr>
                    <th>id</th>
                    <th>nombre</th>
                    <th>apellido</th>
                </tr>
            </thead>
            <tbody>
                <g:each in="${usuarios}" var="usuario">
                    <tr>
                        <td>${usuario.id}</td>
                        <td>${usuario.nombre}</td>
                        <td>${usuario.apellido}</td>
                    </tr>
                </g:each>
            </tbody>
        </table>


        <p>
            listado de actas:
        </p>

        <table>
            <thead>
                <tr>
                    <th>id</th>
                    <th>asunto</th>
                </tr>
            </thead>
            <tbody>
                <g:each in="${actas}" var="acta">
                    <tr>
                        <td>${acta.id}</td>
                        <td>${acta.asunto}</td>
                    </tr>
                </g:each>
            </tbody>
        </table>

    </body>
</html>