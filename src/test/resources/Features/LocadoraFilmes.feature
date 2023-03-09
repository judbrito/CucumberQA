# language: pt
Funcionalidade: Alugar filmes
Como um usuário
Eu quero cadastrar aluguéis de filmes para controlar preços e datas de entrega.

Cenário: Alugar filme com sucesso
Dado que há um filme 
| estoque |		 2		   	|
| preço 	|		 3   			|  
| tipo	  |		 comum    |  


Quando alugar
Então o preço do aluguel será R$ 3
E a data de entrega será em 1 dia
E o estoque do filme será de 1 unidade.

Cenário: não deve alugar um filme sem estoque
Dado que há um filme com estoque de 0 unidades
Quando alugar 
Então não será possivel 
E o estoque do filme será de 0 unidade.

Esquema do Cenário: Condições para locar

Dado que há um filme com estoque de 2 unidades
E o valor do aluguel é R$ <preço>
E que o tipo de aluguel seja <tipo>
Quando alugar
Então o preço do aluguel será R$ <valor>
E a data de entrega será em <qtDias> dia
E a pontuação será de <pontuacao> pontos

Exemplos:
| preço |		 tipo   | valor | qtDias | pontuacao |
|  	4  	|	estendido | 	8   |   3  	 |  	 2  	 |
|  	4  	|		comum		| 	4   |   1  	 |  	 1  	 |
|  	10 	| estendido | 	20  |   3 	 |  	 2  	 |
|  	5  	|	 semanal  | 	15  |   7 	 |  	 3  	 |
|  	8  	|	estendido | 	16  |   3 	 |  	 2  	 |
|  	18 	|	semanal   | 	54  |   7 	 |  	 3  	 |
|		20	|		comum		|		20	|		1	   |		 1		 |


