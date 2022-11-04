# Pontos importantes
Entender o problema

## O que fazer
	Domínio Bancário
	Deve ser conhecimento sobre assunto

	Banco Oferece tipos de conta (Corrente e Poupança)
		Possuem funcionalidades de deposito e saque

Para isso Abstrair os conceitos
	Ignorar as características diferenciais, focar no problema maior

Sempre que definir Atributos, deixar como privados

Deposi de abstrair
### Pensar em Encapsulamento
Esconder implementações do objeto que não fazem sentido, para melhor entendimento 
		Criar interface assertiva, sem expor mais que o necessário
			GETS E SETS

### Polimorfismo
	O mesmo objeto pode ser referenciado em várias formas
		Capacidade de manipulação dos objetos dentro da classe
		Podendo utilizar as classes e subclasses
Aquilo que só o pai sabe, é PRIVATE; o que ele contou para os filhos, é PROTECTED; o que ele contou aos vizinhos, é PUBLIC 
~Thiago Oliveira

## Composição
	Quando não há herança
		Mas sim, uma classe Cliente, compõe uma classe Conta
	Desse modo, elas não herdam, mas se completam
 
## Sucesso 
Bancario.RunApplication
=== Extrato Conta Corrente ===
Titular: André
Agencia: 8969
Conta: 1111111
Saldo: -50,00
=== Extrato Conta Poupança ===
Titular: André
Agencia: 8969
Conta: 1111112
Saldo: 170,00

Process finished with exit code 0
 
	




