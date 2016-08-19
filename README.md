# SAMPLE-SERVICE

Projeto de exemplo pr� configurado

### Pr�-Requisitos

Compilar e executar o projeto **https://github.com/clinicaodontoweb/arquitetura**

### Instala��o

Para compilar o projeto rode o seguinte comando:

`gradle clean build`

Para iniciar o servi�o rode o seguinte comando na raiz do projeto:

`java -jar build\libs\sample-service-1.x.x.jar`

Para iniciar o servi�o pela IDE apenas rode a classe **com.odontoweb.microservice.Application.java**

### Lista de servi�os:

#### Autentica��o (POST)

```
http://localhost:3333/sample-service/auth
```

**Request**

```
{
  "email": "andre@gmail.com",
  "senha": "123456"
}
```

--------------------------------------------


#### Lista de roles (GET)

```
http://localhost:3333/sample-service/protected
```

**Request Header**

`
X-Auth-Token : {token}
`

--------------------------------------------