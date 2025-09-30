# Exercícios: Lista 004 (Biogerador)

> Um biogerador é um dispositivo que produz energia a partir da decomposição de resíduos orgânicos. O Etanol é um exemplo de biocombustível gerado a partir de matérias orgânicas como cana-de-açúcar, beterraba e milho. Você vai implementar um programa que simula um biogerador e deve ser capaz de calcular a quantidade de etanol produzida a partir de uma determinada quantidade de matéria orgânica de diferentes origens.

---

## Classe `Biogerador`

Crie uma classe chamada `Biogerador` com os seguintes atributos:

* `potenciaAtual` (`float`)
* `cargaAtual` (`float`)
* `cargaMaxima` (`float`) – valor fixo igual a `5`

### Métodos obrigatórios:

* **Construtor vazio** que inicializa a potência e carga com `0` e a carga máxima com `5`.
* Métodos *getters* e *setters* para cada atributo.
* `carregar(Biocombustivel b)`

  * Deve chamar o método `processar()` do biocombustível recebido.
  * O valor retornado pelo processamento deve ser multiplicado por `2,36` para calcular a potência gerada.
  * Essa potência deve ser **somada à potência atual**.
  * A cada chamada, a **carga atual é incrementada em 1**, até o limite da carga máxima (`5`).
  * Se o biogerador já estiver cheio, deve ser lançada uma exceção customizada (`GeradorCheioException`).
* `esvaziar()` – zera a carga e a potência atuais.

---

## Classe `Biocombustivel`

Classe base para todos os biocombustíveis.

### Atributos:

* `quilogramas` (`float`) – valor padrão `1000`.

### Métodos obrigatórios:

* Construtor que inicializa `quilogramas`. Se não for informado, use o valor padrão (`1000`).
* `processar()` – retorna um valor do tipo `float`, calculado como:

  * `quilogramas × n`, onde `n` é um número aleatório **entre 1 e 3** (use `java.util.Random`).

---

## Classes especializadas

Crie três classes que herdam de `Biocombustivel` e sobrescrevem o método `processar()`:

* **CanaAcucar**

  * Retorna `quilogramas × 3,5`.
* **Beterraba**

  * Retorna `(quilogramas × 1,2) + 1000`.
* **Milho**

  * Retorna `quilogramas + 1000`.

---

## Exceção customizada

Crie uma exceção chamada `GeradorCheioException` que será lançada quando o método `carregar` for chamado com o gerador cheio.

---

## Aplicativo de teste: `BiogeradorTeste`

Crie uma classe `BiogeradorTeste` que demonstre as capacidades do biogerador.

1. Crie uma lista de biocombustíveis:

   ```java
   ArrayList<Biocombustivel> combustiveis = new ArrayList<>();
   combustiveis.add(new CanaAcucar(2000));
   combustiveis.add(new Beterraba(3000));
   combustiveis.add(new Milho(1500));
   combustiveis.add(new Beterraba(3500));
   combustiveis.add(new Beterraba(2000));
   ```
2. Crie um objeto `Biogerador`.
3. Percorra a lista de biocombustíveis chamando `carregar()` para cada um.

   * Caso o gerador fique cheio, capture a exceção e interrompa o laço.
4. Exiba no final:

   * A potência total gerada.
   * A carga atual.

Exemplo esperado de saída (os valores vão variar conforme os cálculos):

```
Potência gerada no gerador 01: 45231.65
Carga atual do gerador 01: 5
```