# Lista de Exercícios 007 (HTTP e REST)

## Exercício 1 – Time de Futebol (PUT + GET)

Simule a substituição de jogadores em um time de futebol. Para isso você deve criar um serviço que inicialize uma única lista de jogadores que contenha os titulares (0-10) e os jogadores reservas (11-20). O cliente poderá substituir um jogador por outro usando a rota `PUT`.

### Requisitos:

* Inicialize um time principal (11 jogadores) e uma lista de 5 reservas.
* **GET `/principal`** → lista os jogadores titulares e suas posições.
* **GET `/reservas`** → lista os jogadores reservas.
* **PUT `/jogador/{posicao}`** → substitui o jogador da posição informada por um da lista de reservas.
* Armazene tudo em uma única **lista em memória** (ex.: um array, um map, etc).

**Atributos do jogador:**

* `nome`
* `posicao`
* `idade`

## Exercício 2 – Biblioteca (POST + DELETE + GET)

Implemente um sistema de empréstimo de livros. Para isso você deve criar um serviço que inicialize uma lista de livros disponíveis e uma lista de empréstimos ativos. o cliente poderá realizar o empréstimo de um livro usando a rota `POST` e remover o empréstimo usando a rota `DELETE`. Utilize o `UUID` para identificar os livros e os empréstimos.

### Requisitos:

* Inicialize uma lista de **livros disponíveis** e outra de **empréstimos**.
* **GET `/livros`** → lista livros disponíveis.
* **GET `/emprestados`** → lista os empréstimos ativos.
* **POST `/emprestados`** → cria um novo empréstimo recebendo `livroId` e `usuarioId`.
  * Gerar `emprestimoId` com **UUID**.
  * Remover o livro da lista de disponíveis.
* **DELETE `/emprestados/{emprestimoId}`** → devolve o livro, movendo-o de volta para disponíveis.

**Atributos do livro:**

* `id` (UUID)
* `titulo`
* `autor`

**Atributos do empréstimo:**

* `emprestimoId` (UUID)
* `livroId`
* `usuarioId`
* `dataEmprestimo`

## Exercício 3 – Usuários e Tweets (POST + PATCH + DELETE + GET)

Simule uma mini rede social de tweets. Inicialize uma lista de usuários. O cliente poderá criar um novo tweet para um usuário usando a rota `POST`, atualizar a mensagem de um tweet usando a rota `PATCH` e remover um tweet usando a rota `DELETE`.

### Requisitos:

* Inicialize uma lista de usuários (id, nome, email).
* **GET `/usuarios`** → lista todos os usuários.
* **GET `/usuarios/{id}/tweets`** → lista todos os tweets do usuário.
* **POST `/usuarios/{id}/tweets`** → cria um tweet para o usuário.
  * Tweet deve ter `tweetId` (UUID), mensagem e data.
* **PATCH `/usuarios/{id}/tweets/{tweetId}`** → atualiza a mensagem do tweet. Deve ser marcado como editado.
* **DELETE `/usuarios/{id}/tweets/{tweetId}`** → remove o tweet do usuário.

**Atributos do usuário:**

* `id` (UUID)
* `nome`
* `email`

**Atributos do tweet:**

* `tweetId` (UUID)
* `mensagem`
* `editado` (boolean)
* `dataCriacao`

## Exercício 4 – Cinema (CRUD + Endpoints Aninhados)

Gerencie filmes e compra de ingressos. O cliente poderá listar, criar, editar e remover um filme. Também poderá adicionar ingressos e remover ingressos. Para cada ingresso comprado, o número de assentos ocupados deve ser atualizado.

### Requisitos:

* Cada filme deve ter: `id` (UUID), `titulo`, `genero`, `capacidade`, `assentosOcupados`.
* CRUD de filmes:

  * **GET `/filmes`**, **POST `/filmes`**, **PATCH `/filmes/{id}`**, **DELETE `/filmes/{id}`**.
* Ingressos:

  * **POST `/filmes/{id}/ingressos`** → compra ingresso, verifica capacidade, gera `ingressoId` (UUID).
  * **DELETE `/filmes/{id}/ingressos/{ingressoId}`** → devolve ingresso e libera assento.

**Atributos do filme:**

* `id` (UUID)
* `titulo`
* `genero`
* `capacidade`
* `assentosOcupados`

**Atributos do ingresso:**

* `ingressoId` (UUID)
* `filmeId`
* `assentoNumero`
