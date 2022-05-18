# Strategy
 
## Intenção
 
> O Strategy é uma padrão comportamental que define uma **família de algoritmos**, **encapsula cada uma deles** e os **torna intercambiáveis**. O Strategy permite que o algoritmo varia independentemente dos clientes que o utilizam.
 
## Princípios
 
- Encapsule o que varia;
- Dê prioridade à composição em relação a herança;
- Programe para uma interface, não para uma implementação;
 
## Aplicabilidade
 
- Quando muitas classes fazem a mesma coisa de forma diferente
- Quando se necessita de variantes de um mesmo algoritmo (comportamento)
- Quando é necessário evitar a exposição de dados e/ou algoritmos sensíveis. No Strategy o contexto apenas utiliza/conhece a interface Strategy e, não possui acesso ao código das implementações de Strategy.
- Remoção de operadores condicionais
 
