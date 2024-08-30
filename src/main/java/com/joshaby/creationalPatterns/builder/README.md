# Builder

O **Builder** é um padrão de projeto criacional que permite a você construir objetos complexos passo a passo. O padrão permite que você produza diferentes tipos e representações de um objeto usando o mesmo código de construção.

## Estrutura

![](https://refactoring.guru/images/patterns/diagrams/builder/structure.png)

## Exemplo

Este exemplo do padrão **Builder** ilustra como você pode reutilizar o mesmo código de construção de objeto quando construindo diferentes tipos de produtos, tais como carros, e como criar manuais correspondentes.

![](https://refactoring.guru/images/patterns/diagrams/builder/example-pt-br.png)

## Aplicabilidade

**Use o padrão Builder para se livrar de um "contrustor telescópico"**

Digamos que você tenha um construtor com dez parâmetos opcionais. Chamar um monstro desses é muito incoveniente; portanto, você sobrecarrega o construttor e cria diversas versões curtas com menos parâmetros. Esses construtores ainda se referem ao principal, passando alguns valores padrão para qualquer parâmetro omitido.

```
class Pizza {
    Pizza(int size) { ... }
    Pizza(int size, boolean cheese) { ... }
    Pizza(int size, boolean cheese, boolean pepperoni) { ... }
    // ...
```

O padrão Builder permite que você construa objetos passo a passo, usando apenas aquelas etapas que você realmente precisa. Após implementas o padrão, você não vai mais precisar amontoar dúzias de parâmetros em seus construtores.

**Use o padrõa Builder quando você quer que seu código seja capas de criar diferentes representações do mesmo produto(por exemplo, casas de pedra e madeira)**

O padrão Builder pode ser aplicado quando a construção de várias representações do produto envolvem etapas similares que diferem apenas nos detalhes.

A interface base do builder define todas as etapas de construção possíveis, e os builders concretos implementam essas etapas para construir representações particulares do produto. Enquanto isso, a classe diretor guia a ordem de construção.

**Use o Builder para construir árvoes Composite ou outros objetos complexos**

O padrão Builder permite que você construa produtos passo a passo. Você pode adiar a execução de algumas etapas sem quebrar o produto final. Você pode até chamar etapas recursivamentes, o que é bem útil quando você precisa construir árvore de objetos.

Um Builder não expõe o produto não finalizado enquando o processo de construção estiver executando etapas. Isso previne o código cliente de obter um resultado incompleto.

## Prós e Contras

:green_circle: Você pode construir objetos passo a passo, adiar as etapas de construção ou rodar etapas recursivamente.

:green_circle: Você pode reutilizar o mesmo código de construção quando construindo várias representações de produtos.

:green_circle: Princípio de responsabilidade única. Você pode isolar um código de construção complexo da lógica de negócio do produto

:red_circle: A complexidade geral do código aumenta uma vez que o padrão exige criar múltiplas classes novas.