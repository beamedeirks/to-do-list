## 💻 Projeto do curso de Java da RocketSeat

O projeto é uma API de To Do List, onde o usuário poderá cadastrar, alterar e listar suas tarefas.

Foi utilizado as tecnologias:
- Java
- SpringBoot
- H2Database
- Lombok
- Maven
- Bcripty
- entre outros...


# Http Requests
### Create [POST  /users/]

+ Request (application/json)

    + Body


### Create [POST  /users/]
+ Request (application/json)

    + Headers

            Authorization: Basic

    + Body
      {
	"name":"Beatriz Medeiros",
	"username": "bea.medeiros",
	"password":"12345"
}


## Create [POST  /tasks/]
+ Request (application/json)

    + Headers

            Authorization: Basic

    + Body
      {
	"description":"Tarefa para gravar para aula de Tasks do Curso de spring Boot",
	"title":"Gravação de aula",
	"priority":"ALTA",
	"startAt": "2023-10-18T12:30:00",
	"endAt":"2023-10-20T15:30:00"
}

## List [GET  /tasks/]
+ Request (application/json)

    + Headers

           Authorization: Basic

## Update [PUT  /tasks/{id}]
+ Request (application/json)

    + Headers

           Authorization: Basic

    + Body
      {
	title: "Alterando Tit"
}
