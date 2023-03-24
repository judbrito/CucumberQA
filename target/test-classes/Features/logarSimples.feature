# language: pt

Funcionalidade: ação de Login

Cenário: login bem-sucedido com credenciais válidas 
Dado que o usuário navegue na pagina,
Quando digite o login e senha
Então seguida, a mensagem exibida Login com sucesso
 
Cenário: Logout bem-sucedido
Dado que o usuário navegue na pagina,
Quando digite o login e senha
E clicar em sair
Então a mensagem exibida Saiu com sucesso
