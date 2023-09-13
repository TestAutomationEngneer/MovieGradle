Movie Service has dependency with Actor service

Prerequisits:

1. Run Actor Service
2. Run Movie Service


swagger
http://localhost:9595/swagger-ui/

Expected results from GET Movie , id = 1

{
"id": 1,
"title": "Forrest Gump",
"director": "Robert Zemeckis",
"actors": [
{
"id": 1,
"firstName": "Tom",
"lastName": "Hanks",
"rating": 1,
"oscarPrized": true
},
{
"id": 3,
"firstName": "Meryl",
"lastName": "Streep",
"rating": 5,
"oscarPrized": true
},
{
"id": 6,
"firstName": "Brad",
"lastName": "Pitt",
"rating": 3,
"oscarPrized": true
}
]
}

PACT
source: https://blog.zephyrok.com/contract-testing-using-pact-with-java/
Pact broker: http://localhost:9292

1. gradle tast - pactPublish
2. new pair - consumer - provider is visible in pactBroker. 