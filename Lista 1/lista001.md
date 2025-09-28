# Exercícios: Lista 001 (Introdução)

## 1. Ambiente de Desenvolvimento

**Exercício:**
Você está começando a usar Java e quer testar se o ambiente está configurado corretamente. No JShell, imprima a mensagem de boas-vindas ao sistema que você está criando, e depois crie um programa `BoasVindas` que imprime:
`Bem-vindo ao Sistema de Geração de Jogadores!`

**Saída esperada:**

```
Bem-vindo ao Sistema de Geração de Jogadores!
```

## 2. Estrutura de um Programa Java

**Exercício:**
Crie um programa que imprima os dados de um funcionário: nome completo, cargo e salário. Use `System.out.println` para cada informação.

**Exemplo de saída:**

```
Nome: Mariana Silva  
Cargo: Analista de Sistemas  
Salário: R$ 4500.00
```

## 3. Tipos Primitivos e Variáveis

**Exercício:**
Você precisa armazenar dados básicos de um produto: nome (``String``), código (``int``), preço unitário (``double``) e se está em promoção (``boolean``). Declare as variáveis, inicialize com valores reais e imprima todas as informações formatadas.

**Exemplo de saída:**

```
Produto: Teclado  
Código: 12345  
Preço: R$ 99.90  
Promoção: true
```

## 4. Operadores

**Exercício:**
Uma loja oferece desconto de 10% para compras acima de R\$ 100. Receba o valor total da compra, calcule e imprima o valor final aplicando o desconto quando for o caso.

**Exemplo:**
**Entrada:** `150`
**Saída:**

```
Valor final com desconto: R$ 135.00
```

**Entrada:** `80`
**Saída:**

```
Valor final sem desconto: R$ 80.00
```

## 5. Controle de Fluxo

**Exercício:**
Faça um programa que leia a idade do usuário e imprima:

* “Categoria: Infantil” se a idade for menor que 12
* “Categoria: Adolescente” se a idade for entre 12 e 17
* “Categoria: Adulto” se a idade for 18 ou mais

**Exemplo:**
**Entrada:** `14`
**Saída:**

```
Categoria: Adolescente
```

---

## 6. Arrays

**Exercício:**
Um professor registrou as notas de 5 alunos em um array. Imprima a lista de notas e, em seguida, calcule e imprima a média das notas.

**Exemplo:**
**Notas:** `[7, 8, 6, 9, 10]`
**Saída:**

```
Notas: 7 8 6 9 10  
Média: 8.0
```

---

## 7. Métodos (Funções)

**Exercício:**
Implemente um método `calcularIMC` que recebe peso (kg) e altura (m) e retorna o IMC (peso / altura²). No `main`, leia valores, chame o método e imprima o resultado com duas casas decimais.

**Exemplo:**
**Entrada:**

```
Peso: 70  
Altura: 1.75
```

**Saída:**

```
IMC calculado: 22.86
```

---

## 8. Trabalhando com Strings

**Exercício:**
Leia o nome completo de um cliente e imprima:

* O número de caracteres (sem espaços)
* O nome todo em maiúsculas
* Se o nome contém a palavra "Silva"

**Exemplo:**
**Entrada:** `Ana Maria Silva`
**Saída:**

```
Número de caracteres: 13  
Maiúsculas: ANA MARIA SILVA  
Contém "Silva": true
```

---

## 9. Git e GitLab/GitHub

**Exercício:**
Você desenvolveu um programa simples de cadastro. Inicialize um repositório Git local no diretório do projeto, crie um `.gitignore` para ignorar arquivos `.class` e pastas `.idea` (use o [gitignore.io](https://gitignore.io)), faça o commit inicial e envie para seu repositório remoto no GitLab/GitHub.

Essa lista deverá ser organizada da seguinte maneira:

```
lista001/
├── exercicio01/
├── exercicio02/
├── exercicio03/
├── ...
lista002/
├── exercicio01/
├── exercicio02/
├── exercicio03/
readme.md
```