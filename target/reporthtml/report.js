$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/logarSimples.feature");
formatter.feature({
  "name": "ação de Login",
  "description": "",
  "keyword": "Funcionalidade"
});
formatter.scenario({
  "name": "login bem-sucedido com credenciais válidas",
  "description": "",
  "keyword": "Cenário"
});
formatter.step({
  "name": "que o usuário navegue na pagina,",
  "keyword": "Dado "
});
formatter.match({
  "location": "Logando.queOUsuárioNavegueNaPagina()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "digite o login e senha",
  "keyword": "Quando "
});
formatter.match({
  "location": "Logando.digiteOLoginESenha()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "seguida, a mensagem exibida Login com sucesso",
  "keyword": "Então "
});
formatter.match({
  "location": "Logando.seguidaAMensagemExibidaLoginComSucesso()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Logout bem-sucedido",
  "description": "",
  "keyword": "Cenário"
});
formatter.step({
  "name": "que o usuário navegue na pagina,",
  "keyword": "Dado "
});
formatter.match({
  "location": "Logando.queOUsuárioNavegueNaPagina()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "digite o login e senha",
  "keyword": "Quando "
});
formatter.match({
  "location": "Logando.digiteOLoginESenha()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicar em sair",
  "keyword": "E "
});
formatter.match({
  "location": "Logando.clicarEmSair()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "a mensagem exibida Saiu com sucesso",
  "keyword": "Então "
});
formatter.match({
  "location": "Logando.aMensagemExibidaSaiuComSucesso()"
});
formatter.result({
  "status": "passed"
});
});