# SAMPLE-SERVICE

Projeto de exemplo pré configurado

### Pré-Requisitos

Compilar e executar o projeto **https://github.com/clinicaodontoweb/arquitetura**

### Instalação

Para compilar o projeto rode o seguinte comando:

`gradle clean build`

Para iniciar o serviço rode o seguinte comando na raiz do projeto:

`java -jar build\libs\sample-service-1.x.x.jar`

Para iniciar o serviço pela IDE apenas rode a classe **com.odontoweb.microservice.Application.java**

### Acessando o serviço

Acesse a url: `http://localhost:3333/sample/v1/helloworld`
Header Authorization: `Bearer eyJ0eXBlIjoiSldUIiwiYWxnIjoiSFM1MTIifQ.eyJzdWIiOiJhbmRyZSIsInRlbmFudCI6InRlbmFudC1hbmRyZSIsImlhdCI6MTQ2MjMyNzE2NX0.h1qKMOhU5phnK9ldXxKW7Fgg-2MERByRosv6_cpvlXhbkzb17ApoxmWqHwmvCBewLeOuOlzBOFw-seNFQsbPfA`