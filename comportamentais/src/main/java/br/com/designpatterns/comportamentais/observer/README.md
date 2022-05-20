# Observer
 
## Intenção
 
> O Observer é uma padrão comportamental que define uma **dependência um-para-muitos entre objetos**, de modo que quando um **objeto muda seu estado todos os seus dependentes são notificados** e atualizados automaticamente.
 
## Princípios

- Busque projetos levemente ligados (acoplados) entre objetos que interagem
    > Projetos levemente acoplados são muito mais flexivies e faceis de modificar. Podemos adicionar Observadores, assim como criar novos tipos de Observadores a qualquer momento sem precisar modificar o Sujeito. Ambos, sujeito e observador podem ser reutilizados, e alterações em um ou em outro não iram afetá-los desde que cumpram suas obrigações implementar Subject e Observer.

- Encapsule o que varia
    > Estado do sujeito, número de e tipo dos observadores
  
- Dê prioridade à composição em relação a herança;
    >  O sujeito relaciona-se com qualquer tipo e quantidade de obsevadores. Isso occore por meio da composição, onde a interação sujeito e observador acontece em tempo de execução e, não no tempo de compilação se fosse um relacionamento baseado em herança (hierarquia).

- Programe para uma interface, não para uma implementação;
    > Sujeito e Observador usam/são interfaces e isso permmite o baixo acoplamento entre eles.

## Aplicabilidade
 
- Quando uma abstração tem dois aspectos (Subject e Observer), um depeende do outro, e é necessário que eles possam variar e serem reutilizados (contextos diferentes) independentemente.
- Quando um alteração em um objeto requer a alteração de outros, e não se conhece **quantos** objetos precisam ser alterados. 
- Quando um objeto deve ser capaz de noticar outros objetoss sem os conhecer (**não sabe quem**), ou seja, tais objetos não podem ser fortemente acoplados.

