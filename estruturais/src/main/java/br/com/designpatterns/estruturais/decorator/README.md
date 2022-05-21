# Decorator
 
## Intenção
 
> O Decorator é uma padrão estrutural que **anexa responsabilidades adicionais a um objeto dinamicamente**. Os decoradores fornecem uma alternativa flexível ao uso de subclasses para extensão de funcionalidades.
 
## Princípios

- Princípio Aberto-Fechado
    > As classes devem estar abertas para a extensão, mas fechadas para a modificação.

## Aplicabilidade
 
- Quando for necessário adicionar comportamentos a **objetos individuais** de forma dinâmica e transparente, sem afetar outros objetos. *Obs: O uso da herança afetaria outros objetos de forma, até mesmo, inapropriada.*
- Ao implementar comportamentos que podem ser fundamentais para determinados objetos e ao mesmo tempo desnecessários ou inapropriados a outros.
- Quando um grande número de extensões (subclassificações) produziria uma grande quantidade de subclasses (explosão de classes) para suportar todas as combinações de comportamentos possíveis. Ou Se, seria realizada uma uma individualização de comportamentos no nível de classes, o que poderia levar a uma explosão de classes dado o número de combinações possíveis.
- Quando uma definição de classes estiver oculta ou indisponível para subclassificação


