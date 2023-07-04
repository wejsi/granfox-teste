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

### Para queira se conectar com mongo CLI via terminal execute comandos abaixo
> docker exec -it mongo bash
                                                                                                                                          
### Classe Main
> ProdutosApplication.java



###  Construindo aplicação frontend com node.js
**$ cd ../granfox-teste/frontend/app-registro-produtos**
> **```npm i```**

### Para iniciar a aplicação
> **```npm start```**

## Jenkins CI/CD
> Note que existe o arquivo script Jenkinsfile com a pepiline definindo os Stages principais sendo um para  build e execução de testes unitarios , outro para testes integração e sonar scan e por seguinte o stage para deploy da imagem gerada.
> Para execução o pepiline seria ativado sempre que houver versionamento na main de forma a ser configurado na ferramenta(Jenskins).

### GITFlow 
> Por se tratar de uma pessoa apenas desenvolvendo não foi utilizado gitFlow no processo de CD mas para que seja mantido por uma equipe seria importante criar uma branches features para manutenção assim iniciando gitFlow basico realizando codereview e gestão atravez dos pull requests ou merge requests dependendo da ferramente de SCM.

