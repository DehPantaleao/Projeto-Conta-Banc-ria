package conta.model;

public abstract class Conta {
    
    private int numero;
	private int agencia;
	private int tipo;
	private String titular;
	private float saldo;

	public Conta(int numero, int agencia, int tipo, String titular, float saldo) {
		this.numero = numero;
		this.agencia = agencia;
		this.tipo = tipo;
		this.titular = titular;
		this.saldo = saldo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public boolean sacar(float valor) { 
		
		if(this.getSaldo() < valor) {
			System.out.println("\n Saldo Insuficiente!");
			return false;
		}
			
		this.setSaldo(this.getSaldo() - valor);
		return true;
	}

	public void depositar(float valor) {

		this.setSaldo(this.getSaldo() + valor);

	}
	
	public void visualizar() {

		String tipo = "";
		
		switch(this.tipo) {
		case 1:
			tipo = "Conta Corrente";
		break;
		case 2:
			tipo = "Conta Poupança";
		break;
		}
		
		System.out.println("\n\n*********************************************************************");
		System.out.println("Dados da Conta:");
		System.out.println("*********************************************************************");
		System.out.println("Numero da Conta: " + this.numero);
		System.out.println("Agência: " + this.agencia);
		System.out.println("Tipo da Conta: " + tipo);
		System.out.println("Titular: " + this.titular);
		System.out.println("Saldo: " + this.saldo);

	}
    
}

/* Criar a Classe Conta no Pacote model.

Linhas 5 a 9: Criamos as variáveis que representam os Atributos da Classe Conta, que foram definidos no Diagrama de
Classes acima. Observe que todos os Atributos possuem o modificador de acesso private, ou seja, são acessíveis apenas 
dentro da Classe Conta. Eles foram criados desta forma para implementar o Encapsulamento, ou seja, os dados de um 
Objeto somente poderão ser alterados e recuperados por uma outra Classe através dos Métodos GET e SET, que serão 
criados logo abaixo.

Linha 11: O Método Construtor foi criado com o mesmo nome da Classe (conta) e com os respectivos parâmetros. 
Observe que as variáveis inseridas possuem os mesmos nomes e tipos dos Atributos da Classe Conta. Ao instanciar 
uma novo Objeto, o Método Construtor receberá todos os dados do Objeto através deste parâmetros, que serão atribuídos 
aos Atributos do Objeto da Classe Conta.

Linhas 12 a 16: Os dados recebidos nos parâmetros do Método Construtor são atribuídos aos respectivos Atributos da Classe
Conta. Como os parâmetros possuem os mesmos nomes do Atributos da Classe, foi utilizada a palavra reservada this para 
diferenciar o Atributo da Classe Conta do parâmetro do Método Construtor da Classe Conta.

Linha 59: O Método sacar, do tipo boolean, foi criado contendo o parâmetro float valor, que receberá o valor a ser sacado 
da conta. O parâmetro valor é do tipo float porquê o Atributo saldo é do tipo float.

Linha 61: Através do laço condicional if, verifica se o valor do saque é menor do que o saldo disponível na conta. 
Para obter o saldo atual da conta, foi utilizado o método getSaldo(). A palavra reservada this foi utilizada para fazer 
referência ao Objeto que está executando o Método getSaldo().

Linha 62: Caso o saldo seja insuficiente, será exibida a mensagem de Saldo Insuficiente no console.

Linha 63: Como se trata de um Método do tipo boolean, é necessário retornar uma resposta true ou false. 
Como o saque nesta condição não pode ser efetuada, retornaremos false. O comando return tem a função de retornar um valor 
após o Método finalizar o processamento.

Linha 66: Caso a condição anterior seja falsa (o saldo é suficiente), o saque será efetuado. Para atualizar o saldo,
foi utilizado o método setSaldo(float saldo). Como parâmetro do Método, foi enviada a operação saldo - valor, onde o saldo atual da conta foi obtido através do método getSaldo(). A palavra reservada this foi utilizada para fazer referência ao Objeto que está executando o Método getSaldo(). O Método setSaldo(float saldo) irá atualizar o Atributo saldo do Objeto com o resultado da subtração (saldo - valor).

Linha 67: Como o saque foi efetuado, retornaremos true.

Linha 70: O Método depositar, do tipo void, foi criado contendo o parâmetro float valor, que receberá o valor a ser 
depositado na conta. O parâmetro valor é do tipo float porquê o Atributo saldo é do tipo float. O Método depositar foi 
definido como void porquê ele não precisa retornar uma confirmação, pois diferente do Método sacar, não é necessário 
efetuar nenhuma verificação no saldo da conta antes de efetuar o depósito.

Linha 72: Para atualizar o saldo, foi utilizado o método setSaldo(float saldo). Como parâmetro do Método, foi enviada a 
operação saldo + valor, onde o saldo atual da conta foi obtido através do método getSaldo(). A palavra reservada this foi 
utilizada para fazer referência ao Objeto que está executando o Método getSaldo(). O Método setSaldo(float saldo) irá 
atualizar o Atributo saldo do Objeto com o resultado da soma (saldo + valor).

Linha 76: O Método visualizar, do tipo void, foi criado sem parâmetros. O Método visualizar foi definido como void porquê 
ele não precisa retornar uma confirmação, apenas exibir os dados de um Objeto conta no console.

Linha 78: Foi criada a variável String, chamada tipo, para receber textualmente o tipo da Conta. Como o Atributo tipo 
armazena um numero inteiro (int), que representa o código do tipo da conta, vamos criar um laço condicional para ao invés 
de exibir no console o código numérico, vamos exibir uma descrição para o código.

Linhas 80 a 87: Através do laço condicional case, vamos checar se o tipo da conta é 1 ou 2. Caso seja 1, exibe 
Conta Corrente, caso seja 2 exibe Conta Poupança. Como parâmetro do comando switch, foi passado o Atributo tipo. 
A palavra reservada this foi utilizada para fazer referência ao Atributo tipo.

Linhas 89 a 96: Através do comando de Saída System.out.println(), foi construída a exibição dos dados do Objeto Conta 
no console. Para obter os dados de cada Atributo do Objeto conta, foi utilizada a palavra reservada this, para fazer 
referência ao Objeto que exibirá os dados no console, seguido do nome do Atributo que será exibido em cada linha. 
Observe que na linha 94, foi inserida a variável String tipo, contendo a descrição do tipo da conta, ao invés do Atributo
tipo, que possui o código numérico do tipo da conta.
*/
