Feature: Aprender Cucumber 
	como um aluno
	eu quero aprender a utilizar Cucumber 
	para que que eu possa automatizar criterios de aceitacao
	
Scenario: Deve executar especificacao
	Given que criei arquivo corretamente
	When executa-lo
	Then especificacao deve finalizar com sucesso 
	
Scenario: Deve incrementar
	Given O valor do contador e 15
	When Eu incremento 30
	Then o valor contador sera 45
	
Scenario: Deve calcular atraso na entrega
	Given Que a entrega e 10/02/2023
	When Entrega e de 2 dias
	Then A entrega sera dia 12/02/2023
	
	
Scenario: Deve criar steps genéricos para estes passos
    Given que o ticket é AF345
    Given que o valor da passagem é R$ 230,45
    Given que o nome do passageiro é "Fulano da Silva"
    Given que o telefone do passageiro é 9999-9999
    When criar os steps
    Then o teste vai funcionar

Scenario: Deve reaproveitar os steps "Given" do Scenario anterior
    Given que o ticket é AB167
    Given que o ticket especial é AB167
    Given que o valor da passagem é R$ 1120,23
    Given que o nome do passageiro é "Cicrano de Oliveira"
    Given que o telefone do passageiro é 9888-8888

Scenario: Deve negar todos os steps "Given" dos Scenarios anteriores
    Given que o ticket é CD123
    Given que o ticket é AG1234
    Given que o valor da passagem é R$ 1.1345,56
    Given que o nome do passageiro é "Beltrano Souza Matos de Alcântara Azevedo"
    Given que o telefone do passageiro é 1234-5678
    Given que o telefone do passageiro é 999-2223 
	