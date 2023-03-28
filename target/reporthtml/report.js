$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/logarSimples.feature");
formatter.feature({
  "name": "ação de Login",
  "description": "",
  "keyword": "Funcionalidade"
});
formatter.scenarioOutline({
  "name": "login bem-sucedido com credenciais válidas",
  "description": "",
  "keyword": "Esquema do Cenário"
});
formatter.step({
  "name": "que o usuário navegue na pagina",
  "keyword": "Dado "
});
formatter.step({
  "name": "digite o \"\u003cemail\u003e\" e \"\u003csenha\u003e\"",
  "keyword": "Quando "
});
formatter.step({
  "name": "seguida a mensagem exibida Login com sucesso",
  "keyword": "Então "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Exemplos",
  "rows": [
    {
      "cells": [
        "email",
        "senha"
      ]
    },
    {
      "cells": [
        "amazonclientevip@yahoo.com",
        "123456789241307Jb@"
      ]
    }
  ]
});
formatter.scenario({
  "name": "login bem-sucedido com credenciais válidas",
  "description": "",
  "keyword": "Esquema do Cenário"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "que o usuário navegue na pagina",
  "keyword": "Dado "
});
formatter.match({
  "location": "Logando.queOUsuárioNavegueNaPagina()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "digite o \"amazonclientevip@yahoo.com\" e \"123456789241307Jb@\"",
  "keyword": "Quando "
});
formatter.match({
  "location": "Logando.digiteOE(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "seguida a mensagem exibida Login com sucesso",
  "keyword": "Então "
});
formatter.match({
  "location": "Logando.seguidaAMensagemExibidaLoginComSucesso()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Logout bem-sucedido",
  "description": "",
  "keyword": "Esquema do Cenário"
});
formatter.step({
  "name": "que o usuário navegue na pagina",
  "keyword": "Dado "
});
formatter.step({
  "name": "digite o \"\u003cemail\u003e\" e \"\u003csenha\u003e\"",
  "keyword": "Quando "
});
formatter.step({
  "name": "clicar em sair",
  "keyword": "E "
});
formatter.step({
  "name": "a mensagem exibida Saiu com sucesso",
  "keyword": "Então "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Exemplos",
  "rows": [
    {
      "cells": [
        "email",
        "senha"
      ]
    },
    {
      "cells": [
        "amazonclientevip@yahoo.com",
        "123456789241307Jb@"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Logout bem-sucedido",
  "description": "",
  "keyword": "Esquema do Cenário"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "que o usuário navegue na pagina",
  "keyword": "Dado "
});
formatter.match({
  "location": "Logando.queOUsuárioNavegueNaPagina()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "digite o \"amazonclientevip@yahoo.com\" e \"123456789241307Jb@\"",
  "keyword": "Quando "
});
formatter.match({
  "location": "Logando.digiteOE(String,String)"
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
formatter.after({
  "status": "passed"
});
});