# Exercícios: Lista 003 (Deitel)

## 1. Classe **Fatura**

Crie uma classe em Java chamada `Fatura` para uma loja de suprimentos de informática.

A classe deve conter **quatro variáveis de instância**:

* `numero` (`String`) → número da fatura
* `descricao` (`String`) → descrição do item
* `quantidade` (`Integer`) → quantidade comprada de um item
* `precoPorItem` (`Double`) → preço unitário do item

### Regras:

* Crie um **construtor** que receba todos os atributos.
* Crie métodos *getters* e *setters* para cada atributo.
* Implemente o método `getTotalFatura()` que deve calcular o valor total da fatura (`quantidade × precoPorItem`).

  * Se a **quantidade** ou o **preço por item** forem negativos, eles devem ser ajustados para `0`.

### Teste:

Crie uma classe `FaturaTeste` que:

* Crie dois objetos `Fatura`.
* Exiba as informações de cada fatura e o valor total calculado.

## 2. Classe **Empregado**

Crie uma classe em Java chamada `Empregado` que contém as seguintes variáveis de instância:

* `nome` (`String`)
* `sobrenome` (`String`)
* `salarioMensal` (`Double`)

### Regras:

* Crie um **construtor** que receba os atributos.
* Crie métodos *getters* e *setters* para cada atributo.
* O **salário anual** de um empregado deve ser calculado como `salarioMensal × 13` (considerando o décimo terceiro).

### Teste:

Crie uma classe `EmpregadoTeste` que:

* Instancie **dois empregados**.
* Mostre o salário anual de cada um.
* Dê a cada empregado um **aumento de 10% no salário mensal**.
* Mostre novamente o salário anual após o aumento.

## 3. Classe **Data**

Crie uma classe em Java chamada `Data` que inclui:

* `mes` (`int`)
* `dia` (`int`)
* `ano` (`int`)

### Regras:

* Crie um **construtor** que inicializa as variáveis.
* Crie métodos *getters* e *setters*.
* Faça uma **validação básica** dos valores:

  * O mês deve estar entre `1 e 12`.
  * O dia deve respeitar a quantidade de dias de cada mês.
  * Considere anos bissextos (fevereiro deve ter 29 dias). Para isso, utilize uma biblioteca do Java, como `Year.isLeap(year)` de `java.time`.
* Crie um método `displayData()` que exibe a data no formato:

  ```
  dia/mes/ano
  ```

### Teste:

Crie uma classe `DataTeste` que:

* Instancie **três objetos Data** com valores diferentes.
* Exiba cada data com `displayData()`.
* Mostre o que acontece ao tentar criar datas inválidas.
