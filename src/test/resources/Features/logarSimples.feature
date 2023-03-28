# language: pt

Funcionalidade: ação de Login

Esquema do Cenário: login bem-sucedido com credenciais válidas 
Dado que o usuário navegue na pagina
Quando digite o "<email>" e "<senha>"
Então seguida a mensagem exibida Login com sucesso

Exemplos:
    |          email 						   |			senha		  	   |
    | amazonclientevip@yahoo.com   | 123456789241307Jb@  |
 

Esquema do Cenário: Logout bem-sucedido
Dado que o usuário navegue na pagina
Quando digite o "<email>" e "<senha>"
E clicar em sair
Então a mensagem exibida Saiu com sucesso
Exemplos:
    |          email 						   |			senha		  	   |
    | amazonclientevip@yahoo.com   | 123456789241307Jb@  |