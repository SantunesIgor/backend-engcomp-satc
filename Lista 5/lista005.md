# Exercícios: Lista 005 (OOP)

## Exercício 01: Gerador de Personagem

Criar um programa que gere e manipule personagens de jogo usando classes.

## Instruções

* Crie uma classe chamada `Personagem` que implemente os atributos `nome`, `vida` e `ataque`, além de dos métodos `receberDano` e `atacar`;
* O método `receberDano` recebe um parâmetro do tipo `int` que subtrai da `vida` do objeto. Se o valor da `vida` for menor ou igual a zero, o método deve imprimir uma mensagem informando que o personagem foi derrotado;
* O método `atacar` recebe um parâmetro do tipo `Personagem` chamado `alvo` e chama o método `receberDano`, passando o ataque do personagem atacante como parâmetro. Caso a vida do `alvo` seja igual a zero, o método deve imprimir uma mensagem informando que o `ataque falhou`;
* No método `main` da classe principal, crie crie uma lista de `Personagem` chamada de `inimigos` e adicione pelo menos três personagens diferentes;
* Crie um `Personagem` chamado `jogador` e use o método `atacar` passando como parâmetro aleatoriamente um dos personagens da lista `inimigos`. O jogador não deve atacar inimigos com vida igual a 0;
* Após o ataque do jogador, crie um loop que percorre a lista de `inimigos` e chama o método `atacar` de cada um deles passando como parâmetro o `jogador`;
* Repita os dois últimos passos até que o `jogador` ou todos os `inimigos` tenham a vida zerada e imprima o resultado final.

## Entradas (inputs)

````txt
Orc / Vida: 100 / Ataque: 10
Goblin / Vida: 50 / Ataque: 5
Lobo / Vida: 75 / Ataque: 15
Cavaleiro / Vida: 200 / Ataque: 20
Dragão / Vida: 500 / Ataque: 50

Steve / Vida: 100 / Ataque: 20
````

## Saídas (outputs)

````txt
Orc foi derrotado!
Goblin foi derrotado!
Steve foi derrotado!
````

## Exercício 02: Barcos e Portos

Criar um programa que gere e manipule barcos e portos usando classes e herança.

## Instruções

* Crie uma classe chamada `Barco` contendo os atributos `nome` e `tamanho`;
* Crie uma classe chamada `BasePorto` contendo os atributos `nome`, um array de `barcosAtracados` e dois métodos método chamados `atracarBarco` e `desatracarBarco`;
* O método `atracarBarco` recebe um objeto `Barco` e adiciona o barco ao array de `barcosAtracados`;
* O método `desatracarBarco` recebe um objeto `Barco` e remove o barco do array de `barcosAtracados`;
* Crie uma classe  chamada `PortoPequeno` que herda da classe `BasePorto`. Sobreescreva o método `atracarBarcos` para que ele permita apenas a atracagem de barcos com tamanho menor ou igual a 10;
* Crie uma classe  chamada `PortoGrande que herda da classe `BasePorto`. Sobreescreva o método `atracarBarcos` para que ele permita apenas a atracagem de barcos com tamanho maior ou igual a 10;
* No método `main`:
  * Crie uma lista contendo 5 barcos com diferentes tamanhos e dois portos (um pequeno e um grande);
  * Percorra a lista de barcos e use o método `atracarBarco` para atracar cada barco em um dos portos;
  * Os barcos devem tentar ser atracados primeiramente no porto pequeno e, se não puderem, devem ser atracados no porto grande.

## Entradas (inputs)

````txt
Barco 1: Tamanho 2
Barco 2: Tamanho 5
Barco 3: Tamanho 7
Barco 4: Tamanho 12
Barco 5: Tamanho 20
````

## Saídas (outputs)

````txt
Barco 1 atracado no porto pequeno
Barco 2 atracado no porto pequeno
Barco 3 atracado no porto pequeno
Barco 4 atracado no porto grande
Barco 5 atracado no porto grande
````

## Exercício 03: Buscador de Músicas

Crie um programa, utilizando Collections e Exceptions, que seja capaz de armazenar uma lista de músicas e permita o usuário criar playlists.

## Instruções

* Crie uma classe chamada `Musica` com os atributos `titulo` e `artista`.
* Crie uma classe chamada `Playlist` com os atributos `nome` e `musicas`.
* Crie uma classe chamada `MusicCloud` com os atributos `musicasDisponiveis`.
  * 1. Insira diferentes nomes de músicas na lista `musicasDisponiveis`.
  * 2. Crie um método para pesquisar as músicas disponíveis.
* Crie uma classe chamada `Main` para testar o programa.
  * 1. Peça ao usuário para inserir o nome da playlist.
  * 2. Peça ao usuário para inserir o nome da música.
  * 3. Se a música existir, adicione na playlist
  * 4. Se a música não existir, retorne uma mensagem de erro
  * 5. Repita os passos 2 ao 4 até que o usuário decida parar.
  * 6. Imprima a playlist.

## Entradas (inputs)

````txt
Digite o nome da música:
Hino do Real Paulista
````

## Saídas (outputs)

````txt
Você adicionou a música Hino do Real Paulista na playlist.
Você adicionou a música Macarena na playlist.
Você adicionou a música Evidências na playlist.
A música Hino do Real Paulista não foi encontrada no sistema.

Playlist:
- Hino do Real Paulista
- Macarena
- Evidências
````

## Exercício 04: Compartilhar Postagem

Crie um programa, utilizando Interfaces, para implementar o compartilhamento em diferentes plataformas de mídia social.

## Instruções

* Crie uma interface chamada `PlataformaSocial` com os métodos `compartilharPostagem(Postagem postagem)`, `compartilharImagem(Postagem postagem)`, `compartilharVideo(Postagem postagem)`.
* Crie uma classe chamada `MyBook` que implementa a interface `PlataformaSocial`.
* Crie uma classe chamada `Fotogram` que implementa a interface `PlataformaSocial`.
* Crie uma classe chamada `AnyTube` que implementa a interface `PlataformaSocial`.
* Crie uma classe chamada `Postagem` que recebe um `titulo`, `descricao` e `tipo` (`texto, imagem, video`).
* O Fotogram deve gerar uma exceção no método `compartilharPostagem`
* O AnyTube deve gerar uma exceção no método `compartilharImagem`
* O MyBook não gera nenhuma exceção e deve imprimir todos os métodos;
* Crie uma classe chamada `Main` para testar o programa.
  * 1. Crie uma instância da classe `Postagem` e peça ao usuário para inserir o título, descrição e tipo da postagem.
  * 2. Crie uma instância da classe `MyBook` e chame o método `compartilharPostagem` passando a instância da classe `Postagem` como parâmetro.
  * 3. Crie uma instância da classe `Fotogram` e chame o método `compartilharImagem` passando a instância da classe `Postagem` como parâmetro.
  * 4. Crie uma instância da classe `AnyTube` e chame o método `compartilharVideo` passando a instância da classe `Postagem` como parâmetro.

## Entradas (inputs)

````txt
Titulo: Minha primeira postagem
Descrição: Esta é uma descrição da minha primeira postagem.
Tipo: imagem
````

## Saídas (outputs)

````txt
Você compartilhou essa postagem no MyBook.
Você compartilhou essa postagem no Fotogram.
Ocorreu um erro ao compartilhar essa postagem no AnyTube.
````

## Dicas

* Você pode utilizar de [enumeradores](https://jonascarmo.medium.com/java-enum-guia-pr%C3%A1tico-java-8-5d95a93334f4) para representar os tipos de postagem.
* O objetivo é garantir que nenhuma classe compartilhe postagens que incluem tipo de dados que não são suportados pela plataforma. Por isso teste todos os objetos criados no main com diferentes configurações.

## Exercício 05: Ticket do Cinema

Crie um programa, utilizando Exceções e Collections, que permita realizar a compra de tickets para assistir filmes no cinema.

## Instruções

* Crie uma classe chamada `Cliente`, `Cinema`, `Filme` e `Ingresso`.
* Na classe cliente, implemente um POJO contendo os atributos `nome` e 'idade'.
* Na classe `Cinema`, adicione uma collection (sugestão: `ArrayList`) com `filmesDisponiveis` e insira pelo menos 5 filmes.
* Na classe `Cinema`, adicione uma lista com `ingressosVendidos`.
* Na classe `Filme`, adicione os atributos `nome`, `preco`, `idadeMinima`.
* Na classe `Ingresso`, adicione os atributos `cliente`, `filme` e `assento`.
* Crie uma classe `Main` para testar o programa.
  * 1. Crie uma instância da classe `Cinema` e adicione os filmes disponíveis.
  * 2. Crie uma instância da classe `Ingresso` e peça ao usuário para inserir o nome do cliente, o nome do filme e o assento desejado (de A1 a F5).
  * 2.1. O programa deve retornar uma Exception caso o assento não esteja mais disponível ou a idade do cliente não seja compatível com a idade mínima do filme.
  * 3. Adicione o ingresso à lista de ingressos vendidos.
  * 4. Imprima uma mensagem informando que o ingresso foi vendido com sucesso.
  * 5. Repita os passos 2 ao 4 novamente.


## Entradas (inputs)

````txt
Que filme você deseja assistir?
Homen Aranha
Qual assento você deseja?
A1
Qual o seu nome?
Rivelino
Qual a sua idade?
16
````

## Saídas (outputs)

````txt
O ingresso não pode ser vendido pois sua idade não permite!
O ingresso não pode ser vendido pois seu assento não está mais disponível!
Ingresso vendido com sucesso! Homen Aranha - A1 - Rivelino
````