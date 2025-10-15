# Lista de Exercícios 009

## Exercício 01 - Tabela FIPE

### Objetivo

Utilizando o framework Spring Web, implemente um controlador e um método que receba um objeto JSON no corpo da requisição contendo uma marca, modelo e ano de um carro e retorne o valor de tabela FIPE para esse carro. Utilize esta API como referência: https://deividfortuna.github.io/fipe/

### Instruções

* Crie um novo projeto Spring Boot usando o Spring Initializr.
* Defina uma classe de controlador com a anotação `@RestController`.
* Crie um método que receba um objeto JSON no corpo da requisição contendo uma marca, modelo e ano de um carro e retorne o valor de tabela FIPE para esse carro.
* Use o RestClient para fazer a requisição à [API da Tabela FIPE](https://deividfortuna.github.io/fipe/).


### Entradas (inputs)

````txt
{
  "marca": "Fiat",
  "modelo": "Uno",
  "ano": 2023
}
````

### Saídas (outputs)

````txt
{
  "valor": 50000.0
  "mes": "Setembro de 2024"
}
````

## Exercício 02 - API com ``apikey``

### Objetivo

Pesquise por uma API em https://github.com/public-apis/public-apis que necessite de uma ``apiKey`` para autenticação e implemente um controlador que faça uma requisição a essa API utilizando o ``RestClient`` do Spring. Você deve retornar o resultado da requisição ao cliente sem nenhuma chave, manipulando os dados de resposta de alguma forma criativa.

> Você também pode tentar APIs públicas e gratuitas de serviços populares, como: Gemini, Spotify, OpenWeather, NewsAPI, etc.

### Instruções

* Escolha uma API que necessite de uma ``apiKey`` para autenticação.
* Crie uma nova conta na API escolhida e obtenha uma ``apiKey``.
* Crie um novo projeto que realize uma requisição a essa API utilizando o ``RestClient`` do Spring.
* Manipule os dados e entregue uma resposta criativa ao cliente.

### Entradas (inputs)

````txt
http://localhost:8080/sua-rota
````

### Saídas (outputs)

````txt
{
  "sua_resposta_criativa": "aqui"
}
````