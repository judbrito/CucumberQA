# language: pt
Funcionalidade: Alugar filmes
Como um usuário
Eu quero cadastrar aluguéis de filmes para controlar preços e datas de entrega.

Cenário: Alugar filme com sucesso
Dado que há um filme com estoque de 2 unidades
E o valor do aluguel é R$ 3
Quando eu alugar
Então o preço do aluguel será R$ 3
E a data de entrega será no dia seguinte
E o estoque do filme será de 1 unidade.

Cenário: não deve alugar um filme sem estoque
Dado que filme tem o estoque  0 unidades
Quando Alugar 
Então não será possivel 
E estoque do filme é 0 unidade

	