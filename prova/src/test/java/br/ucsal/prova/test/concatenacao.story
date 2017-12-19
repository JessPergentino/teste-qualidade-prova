Story:
	Como programador eu desejo
	testar a concatenação de nomes

Narrative:
	Dado que estou na tela de composição de nomes
	quando informo "Claudio" como nome
	e informo "Neiva" como sobrenome
	e solicito a composição do nome completo
	então é exibido o nome "Claudio Neiva"
	
Scenario: Concatenar dois campos texto

Given informar primeiro e segundo nome
When concatenar os nomes Claudio e Neiva
Then imprimir os nomes concatenados