# Factory Method

Fornece uma interface/método para criar objetos em uma superclasse, mas permite que as subclasses alterem o tipo de objetos que serão criados

## Estrutura

![](https://refactoring.guru/images/patterns/diagrams/factory-method/structure.png)

## Exemplo

Este exemplo ilustra como o **Factory Method** pode ser usado para criar elementos de interface de usuário multiplataforma sem acoplar o código do cliente às classes de UI concretas.

![](https://refactoring.guru/images/patterns/diagrams/factory-method/example.png)

## Aplicabilidade

Use o Factory Method quando não souber de antemão os tipos e dependências exatas dos objetos com os quais seu código deve funcionar.

Use o Factory Method quando desejar fornecer aos usuários da sua biblioteca ou framework uma maneira de estender seus componentes internos.

Use o Factory Method quando deseja economizar recursos do sistema reutilizando objetos existentes em vez de recriá-los sempre.

## Prós e Contras

:green_circle: Você evita acoplamentos firmes entre o criador e os produtos concretos.

:green_circle: _Princípio de responsabilidade única_. Você pode mover código de criação do produto para um único local do programma, facilitando a manutenção de código.

:green_circle: _Princípio aberto/fechado_. Você pode introduzir novos tipos de produtos no programa sem quebrar o código existente.

:red_circle: O código pode ser tornar mais complicado, pois você precisa introduzir muitas subclasses novas para implementas o padrão. O melhor cenário é quando você está introduzindo o padrão em uma hierarquia existente de classes criadoras.