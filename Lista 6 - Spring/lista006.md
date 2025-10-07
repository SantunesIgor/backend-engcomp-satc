## Exercício: Recomendador de Viagem

### Descrição

Utilizando o framework Spring Web, implemente um controlador que receba clima e estilo de viagem por query strings e retorne uma recomendação de destino.

### Requisitos e Instruções

* Crie um novo projeto Spring Boot usando o Spring Initializr.
* Defina uma classe de controlador com a anotação `@RestController`.
* Crie um método que receba uma entrada por query strings e retorne uma resposta.
* Gere pelo menos 4 combinações de clima e estilo, retornando um destino diferente para cada combinação.

### Entrada

````txt
http://localhost:8080/recomendar?clima=calor&estilo=natureza
````

### Saída

````txt
Rio de Janeiro
````

## Exercício: Gerador de Jogador

### Descrição

Utilizando o framework Spring Web, implemente um controlador que recebe o nome do time e a posição no caminho URL e gera um jogador de futebol aleatório.

### Requisitos e Instruções

* Crie um novo projeto Spring Boot usando o Spring Initializr.
* Defina uma classe de controlador com a anotação `@RestController`.
* Crie um método que receba time e posição pelo caminho usando o ``@PathVariable``.
* Crie um service chamado ``JogadorService`` que contém um método responsável por gerar um jogador aleatório.
    * O método deve retornar um objeto do tipo ``Jogador``, que contém os atributos: ``nome``, ``sobrenome``, ``idade``, ``posicao`` e ``time``.
    * O método deve criar um novo jogador aleatoriamente usando as listas de nomes, sobrenomes, posições.

### Entrada

````txt
http://localhost:8080/jogador/criciuma/goleiro/
````

### Saída

````txt
{
        "nome": "Ronaldo",
        "sobrenome": "Fenômeno",
        "idade": 32,
        "posicao": "Goleiro",
        "time": "Criciúma"
}
````

## Exercício: Estudantes

### Descrição

Crie um projeto Spring Boot que receba e armazene uma lista de estudantes.

### Requisitos e Instruções

* Deve possuir um endpoint do tipo ``POST`` que recebe um JSON com os dados de um estudante e o salva em memória.
* Deve possuir um endpoint do tipo ``GET`` que retorna todos os estudantes cadastrados.
* Deve possuir um endpoint do tipo ``GET`` que retorna um estudante pelo seu ``codigo``.

### Entrada

#### Modelo Estudante

````json
{
        "nome": "Rivaldo",
        "codigo": 123456,
        "curso": "Engenharia de Software",
        "email": "rivaldo@email.com",
        "telefone": "11999999999"
}
````

### Saída

* Retorno do estudante cadastrado ou lista de estudantes conforme o endpoint utilizado.

## Exercício: Playlist Web

### Descrição

Crie um projeto Spring Boot que permita criar, listar, atualizar diferentes playlists de músicas.

### Requisitos e Instruções

* Deve possuir um endpoint do tipo ``POST`` que cria uma nova playlist, retornando o ID da playlist criada.
* Deve possuir um endpoint do tipo ``POST`` que permite adicionar uma música a uma playlist existente, passando como parâmetro o ID da playlist e os dados da música.
* Deve possuir um endpoint do tipo ``GET`` que retorna uma lista de todas as playlists.
* Deve possuir um endpoint do tipo ``GET`` que retorna uma lista de todas as músicas de uma playlist específica.

### Entrada

#### Modelo Playlist

````json
{
        "id": 1,
        "nome": "Rock Anos 80"
}
````

#### Modelo Música

````json
{
        "id": 1,
        "nome": "Sweet Child O' Mine",
        "artista": "Guns N' Roses",
        "album": "Appetite for Destruction",
        "duracao": 254,
        "genero": "Rock"
}
````

### Saída

* Retorno do ID da playlist criada, confirmação de adição de música, lista de playlists ou lista de músicas conforme o endpoint utilizado.Lista 006 - Spring Web
