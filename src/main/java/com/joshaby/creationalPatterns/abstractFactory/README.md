# Abstract Factory

É um padrão de projeto criacional que permite que você produza familias de objetos relacionados sem ter que especificar suas classes concretas

## Estrutura

![](https://refactoring.guru/images/patterns/diagrams/abstract-factory/structure.png)

## Aplicabilidade

Use o Abstract Factory quando seu código precisa trabalhar com diversas famílias de produtos relacionados, mas que vocẽ não quer depender de classes concretas daqueles produtos, eles podem ser desconhecidos de antemão ou você simplesmente quer permitir uma futura escalabilidade.

O Abstract Factory fornece a você uma interface para a criação de objetos de cada classe das famílias de produtos. Desde que seu código crie objetos a partir dessas interfaces, você não precisará se preocupar em criar uma variante errada de um produto que não coincida com produtos já criados por sua aplicação.

Considere implementar o Abstract Factory quando você tem uma classe com um conjunto de métodos fábrica que desfoquem sua responsabilidade principal.

Em um programa bem desenvolvido cada classe é responsável por apenas uma coisa. Quando uma classe lida com múltiplos tipos de produto, pode valer a pena extrair seus métodos fábrica em uma classe fábrica solitária ou uma implementação plena do Abstract Factory.

## Prós e Contras

:green_circle: Você pode ter certeza que os produtos que você obtém de uma fábrica são compativeis entre si

:green_circle: Você evita um vínculo forte entre produtos concretos e o código cliente.

:green_circle: _Princípio de responsabilidade única_. Você pode extrair o código de criação do produto para um lugar, fazendo o código ser de fácil manutenção

:green_circle: _Princípio aberto/fechado_. Você pode introduzir novas variantes de produtos sem quebrar o código cliente existente.

:red_circle: O código pode tornar-se mais complicado do que deveria ser, uma vez que muitas novas interfaces e classes introduzidas junto com o padrão.