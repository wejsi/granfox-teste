# granfox-teste
granfox-teste


# ms-registro-produtos


## Pre - Requisitos
- Java
- [Spring Boot](https://spring.io/projects/spring-boot)
- [Maven](https://maven.apache.org/guides/index.html)
- [Mongo DB](https://docs.mongodb.com/guides/)
- [Lombok](https://objectcomputing.com/resources/publications/sett/january-2010-reducing-boilerplate-code-with-project-lombok)
- [Docker Compose](https://docs.docker.com/compose/)


## Ferramentas
- IntelliJ IDEA
- Maven (version >= 3.6.0)
- Node.js + NPM
- Postman


<br/>


###  Construindo aplicação backend
**$ cd ../granfox-teste/backend/ms-registro-produtos**
> **```mvn clean install```** 


### Docker-compose inicializará os containers
> docker-compose up --force-recreate  

Para se conectar com mongo CLI via terminal execute comandos abaixo
> docker exec -it mongo bash
                                                                                                                                                                                                       |
|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| **_Note_** : Classe main principal `ProdutosApplication.java` |



###  Construindo aplicação frontend com node.js
**$ cd ../granfox-teste/frontend/app-registro-produtos**
> **```npm i```**

### Para iniciar a aplicação
> **```npm start```** 
