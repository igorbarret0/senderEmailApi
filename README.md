<h1 align="center">
  SENDER EMAIL API
</h1>

API para envio de email (CRUD)

## Tecnologias

- [Spring Boot](https://spring.io/projects/spring-boot)
- [Spring MVC](https://spring.io/guides/gs/serving-web-content/)
- [Java Mail Sender](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/mail/javamail/JavaMailSender.html)

## Práticas adotadas

- DRY
- API REST
- Injeção de Dependências

## Como Executar

- Clonar repositório git
```
git clone git@github.com:igorbarret0/senderEmailApi.git
```

- Construir o projeto:
```
./mvnw clean package
```


A API poderá ser acessada em [localhost:8080](http://localhost:8080).
O Swagger poderá ser visualizado em [localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)

## API Endpoints

Para fazer as requisições HTTP abaixo, foi utilizada a ferramenta [Postman](https://www.postman.com/)

- Enviar email
```
$ POST http://localhost:8080/email

[
  {
    "to": "user@email.com",
    "subject": "demo spring email",
    "body": "sender email"
  }
]
```
