Story:
	Como programador eu desejo
	testar a concatena��o de nomes

Narrative:
	Dado que estou na tela de composi��o de nomes
	quando informo "Claudio" como nome
	e informo "Neiva" como sobrenome
	e solicito a composi��o do nome completo
	ent�o � exibido o nome "Claudio Neiva"
	
Scenario: Concatenar dois campos texto

Given informar primeiro e segundo nome
When concatenar os nomes Claudio e Neiva
Then imprimir os nomes concatenados