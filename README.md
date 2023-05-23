# ds-gameList

[![NPM](https://img.shields.io/npm/l/react)](https://github.com/devsuperior/sds1-wmazoni/blob/master/LICENSE) 

# Sobre o projeto



Big Game Survey é uma aplicação full stack web e mobile construída durante a 1ª edição da **Semana DevSuperior** (#sds1), evento organizado pela [DevSuperior](https://devsuperior.com "Site da DevSuperior").

A aplicação consiste em uma pesquisa de preferência de games, onde os dados são coletados no app mobile, e depois são listados no app web, que também apresenta um dashboard com gráficos baseados nestes dados.


## Modelo conceitual
![Modelo Conceitual](https://raw.githubusercontent.com/eltonk2k/ds-gameList/master/src/main/resources/img/dslist-model.png)

# Tecnologias utilizadas
## Back end
- Java
- Spring Boot
- JPA / Hibernate
- Maven

## Implantação em produção
- Back end: Railway
- Banco de dados: Postgresql

# Como executar o projeto

## Back end
Pré-requisitos: Java 17

```bash
# clonar repositório
git clone https://github.com/eltonk2k/ds-gameList.git

# entrar na pasta do projeto back end
cd ds-gameList

# executar o projeto
./mvnw spring-boot:run
```


## Métodos
Requisições para a API devem seguir os padrões:
| Método | Descrição |
|---|---|
| `GET` | Retorna informações de um ou mais registros. |
| `POST` | Utilizado para criar um novo registro. |
| `PUT` | Atualiza dados de um registro ou altera sua situação. |
| `DELETE` | Remove um registro do sistema. |


## Respostas

| Código | Descrição |
|---|---|
| `200` | Requisição executada com sucesso (success).|
| `201` | Requisição foi bem sucedida e que um novo recurso foi criado. (Created).|
| `204` | Requisição foi bem sucedida e o cliente não precisa sair da página atual(No Content).|
| `400` | Erros de validação ou os campos informados não existem no sistema.|
| `401` | Dados de acesso inválidos.|
| `403` | O servidor recebeu a requisição e foi capaz de identificar o autor, porém não autorizou a emissão de um resposta(Forbidden).|
| `404` | Registro pesquisado não encontrado (Not found).|
| `405` | Método não implementado.|
| `410` | Registro pesquisado foi apagado do sistema e não esta mais disponível.|
| `422` | Dados informados estão fora do escopo definido para o campo.|

## Documentação do Swagger

URL da `documentação` http://localhost:8080/swagger-ui.html

## Banco de dados H2

 Ambiente de testes:  `ds-gameList\src\main\resources\application-test` \
 Driver Class:  `org.h2.Driver` \
 JDBC URL:  `jdbc:h2:mem:testdb` \
 User Name:  `sa` \
 Password:    


# Dados dos games [/games]

Buscar detalhes da conta.

### Games (List) [GET /games]

+ Request (application/json)

    + Headers
            Content-Type:  [application/json]


+ Response 200 (application/json)

               {
                   "id": 1,
                   "title": "Mass Effect Trilogy",
                   "year": 2012,
                   "imgUrl": "https://raw.githubusercontent.com/devsuperior/java-spring-dslist/main/resources/1.png",
                   "shortDescription": "Lorem ipsum dolor sit amet consectetur adipisicing elit. Odit esse officiis corrupti unde repellat non quibusdam! Id nihil itaque ipsum!"
                },
                {
                   "id": 2,
                   "title": "Red Dead Redemption 2",
                   "year": 2018,
                   "imgUrl": "https://raw.githubusercontent.com/devsuperior/java-spring-dslist/main/resources/2.png",
                   "shortDescription": "Lorem ipsum dolor sit amet consectetur adipisicing elit. Odit esse officiis corrupti unde repellat non quibusdam! Id nihil itaque ipsum!"
                 },
                 {
                    "id": 3,
                    "title": "The Witcher 3: Wild Hunt",
                    "year": 2014,
                    "imgUrl": "https://raw.githubusercontent.com/devsuperior/java-spring-dslist/main/resources/3.png",
                    "shortDescription": "Lorem ipsum dolor sit amet consectetur adipisicing elit. Odit esse officiis corrupti unde repellat non quibusdam! Id nihil itaque ipsum!"
                 },
                 {
                    "id": 4,
                    "title": "Sekiro: Shadows Die Twice",
                    "year": 2019,
                    "imgUrl": "https://raw.githubusercontent.com/devsuperior/java-spring-dslist/main/resources/4.png",
                    "shortDescription": "Lorem ipsum dolor sit amet consectetur adipisicing elit. Odit esse officiis corrupti unde repellat non quibusdam! Id nihil itaque ipsum!"
                 },
                 {
                    "id": 5,
                    "title": "Ghost of Tsushima",
                    "year": 2012,
                    "imgUrl": "https://raw.githubusercontent.com/devsuperior/java-spring-dslist/main/resources/5.png",
                    "shortDescription": "Lorem ipsum dolor sit amet consectetur adipisicing elit. Odit esse officiis corrupti unde repellat non quibusdam! Id nihil itaque ipsum!"
                  },
                  {
                     "id": 6,
                     "title": "Super Mario World",
                     "year": 1990,
                     "imgUrl": "https://raw.githubusercontent.com/devsuperior/java-spring-dslist/main/resources/6.png",
                     "shortDescription": "Lorem ipsum dolor sit amet consectetur adipisicing elit. Odit esse officiis corrupti unde repellat non quibusdam! Id nihil itaque ipsum!"
                  },
                  {
                      "id": 7,
                      "title": "Hollow Knight",
                      "year": 2017,
                      "imgUrl": "https://raw.githubusercontent.com/devsuperior/java-spring-dslist/main/resources/7.png",
                      "shortDescription": "Lorem ipsum dolor sit amet consectetur adipisicing elit. Odit esse officiis corrupti unde repellat non quibusdam! Id nihil itaque ipsum!"
                   },
                   {
                       "id": 8,
                       "title": "Ori and the Blind Forest",
                       "year": 2015,
                       "imgUrl": "https://raw.githubusercontent.com/devsuperior/java-spring-dslist/main/resources/8.png",
                       "shortDescription": "Lorem ipsum dolor sit amet consectetur adipisicing elit. Odit esse officiis corrupti unde repellat non quibusdam! Id nihil itaque ipsum!"
                    },
                    {
                        "id": 9,
                         "title": "Cuphead",
                         "year": 2017,
                         "imgUrl": "https://raw.githubusercontent.com/devsuperior/java-spring-dslist/main/resources/9.png",
                         "shortDescription": "Lorem ipsum dolor sit amet consectetur adipisicing elit. Odit esse officiis corrupti unde repellat non quibusdam! Id nihil itaque ipsum!"
                     },
                     {
                         "id": 10,
                         "title": "Sonic CD",
                         "year": 1993,
                         "imgUrl": "https://raw.githubusercontent.com/devsuperior/java-spring-dslist/main/resources/10.png",
                         "shortDescription": "Lorem ipsum dolor sit amet consectetur adipisicing elit. Odit esse officiis corrupti unde repellat non quibusdam! Id nihil itaque ipsum!"
                      }
            
            
+ Response 200 (application/json)

          {
             "timestamp": 255 ms,
             "status": 200 OK, 
             "path": "/games"
          }


# Autor

Elielton Silva

https://www.linkedin.com/in/elielton-silva2019/
