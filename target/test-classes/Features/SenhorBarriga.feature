# language: pt
Funcionalidade: Cadastro de contas

Como um usuário 
Gostaria de cadastrar contas
Para que eu possa distribuir meu dinheiro de uma forma mais organizada

Contexto:
Dado que estou acessando a aplicação
Quando informo o usuário "algumacoisa@gmail.com"
E a senha "123456789"
E seleciono entrar
Então visualizo a página inicial
Quando seleciono Contas
E seleciono Adicionar


Esquema do Cenário: Deve Validar regras cadastros de contas

Quando informo a conta "<conta>"
E seleciono Salvar
Então recebo a mensagem "<mensagem>"



Exemplos:
| 			conta   	 | 			  	mensagem 	   				     |
| conta de testes  |   Conta adicionada com sucesso!   |
|								   |     Informe o nome da conta   		 |
| conta de testes	 | Já existe uma conta com esse nome!|
