# language: pt
Funcionalidade: Alugar filmes Null
Como um usuário
Eu quero cadastrar aluguéis de filmes para controlar preços e datas de entrega.

Cenário: Alugar filme  com sucesso Null
Dado que há um filme com estoque de 2 unidades
E o valor do aluguel é R$ 3
Quando alugar
Então o preço do aluguel será R$ 3
E a data de entrega será em 1 dia
E o estoque do filme será de 1 unidade.
