# control-hospital-api

# Executar Projeto

Se for realizar a instalação do `banco manualmente`, voce deve lembrar de passar o `user` e `senha` do banco nas configs da api, caso for executar pelo docker-compose, você pode ignorar esse passo.

Na raiz do projeto:<br>
 - mvn clean install (Instala as dependências, rodar na raiz)<br>
 - docker-compose up -d (caso for usar docker compose)<br>
 - mvn spring-boot:run -PDev (executa api, rodar na raiz)<br>
 - nohup mvn spring-boot:run & (executa a api em background)
 - http://IP:8080/swagger-ui.html# (acessar documentação pelo Swagger) 

## Arquitetura
<br/>

## Class
![control-hospital-diagram](https://user-images.githubusercontent.com/31020103/180861358-0a5fc77d-0e3c-4d4f-9d5a-f36bf6f209bb.jpg)

## EER
![control-hospital-EER](https://user-images.githubusercontent.com/31020103/180861481-d0e3f5d4-0806-441b-bb13-8083b57edae5.png)

#### Principais bibiliotecas utilizadas

* [Spring Web](https://mvnrepository.com/artifact/org.springframework/spring-web)
* [Spring Boot Starter Data JPA](https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-data-jpa)
* [Spring Boot DevTools](https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-devtools)
* [Hibernate Validator](https://hibernate.org/validator/)
* [Loombok](https://mvnrepository.com/artifact/org.projectlombok/lombok)
* [Swagger](https://swagger.io/)
* [MySQL Connector/J](https://mvnrepository.com/artifact/mysql/mysql-connector-java)
* [JWT](https://jwt.io/introduction)
* [Docker](https://docs.docker.com/)
* [UUID](https://docs.oracle.com/javase/7/docs/api/java/util/UUID.html)

#### AUTOR

- [Elias Borges](https://www.linkedin.com/in/eliasborges)
