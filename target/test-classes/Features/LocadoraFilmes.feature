# language: pt
Funcionalidade: Alugar filmes
Como um usuário
Eu quero cadastrar aluguéis de filmes para controlar preços e datas de entrega.

Cenário: Alugar filme com sucesso
Dado que há um filme com estoque de 3 unidades
E o valor do aluguel é R$ 3
Quando alugar
Então o preço do aluguel será R$ 3
E a data de entrega será no dia seguinte
E o estoque do filme será de 2 unidade.

Cenário: não deve alugar um filme sem estoque
Dado que há um filme com estoque de 0 unidades
Quando alugar 
Então não será possivel 
E o estoque do filme será de 0 unidade.

Cenário: Deve dar condições especiais para categoria extendida
Dado que há um filme com estoque de 2 unidades
Então o preço do aluguel será R$ 4
Dado que o tipo de aluguel seja R$ seja extendida
Quando alugar
Então o preço do aluguel será R$ 8
E a data de entrega será em 3 dias
E a pontuação será de 2 pontos
