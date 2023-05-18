package conta.model;

public class ContaCorrente extends Conta{

	private float limite;

	public ContaCorrente(int numero, int agencia, int tipo, String titular, float saldo, float limite) {
		super(numero, agencia, tipo, titular, saldo);
		this.limite = limite;
	}
	
	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}

	@Override
	public boolean sacar(float valor) { 
		
		if(this.getSaldo() + this.getLimite() < valor) {
			System.out.println("\n Saldo Insuficiente!");
			return false;
		}
		
		this.setSaldo(this.getSaldo() - valor);
		return true;
		
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("Limite de Crédito: " + this.limite);
	}
    
}

/*
Linha 3: Na assinatura da Classe ContaCorrente, vamos adicionar a palavra reservada extends e na sequência a Classe que será 
herdada (Conta). Observe que será exibido um erro na Classe ContaCorrente (indicado pela linha verde no código).

Linha 5: O Método Construtor foi criado com o mesmo nome da Classe (ContaCorrente) e com os respectivos parâmetros herdados da Classe Conta. Observe que as variáveis inseridas possuem o mesmo nome e tipo dos Atributos da Classe Conta. Ao instanciar uma novo Objeto, o Método Construtor receberá todos os dados do Objeto através deste parâmetros, que serão atribuídos aos Atributos do Objeto

Linha 6: Observe que os Atributos da Classe Conta são acessados e modificados através do Método super(). Nos argumentos do Método super(), foram adicionados os parâmetros do Método Construtor ContaCorrente, que serão enviados para o Método Construtor da Classe Conta. A reutilização do código da Classe Conta, na Classe ContaCorrente é possível graças ao conceito de Herança.

Linha 5: Vamos adicionar a variável limite, que representa um Atributo específico da Classe ContaCorrente, que foram definidos no Diagrama de Classes acima. Observe que o Atributo possue o modificador de acesso private, ou seja, é acessível apenas dentro da Classe ContaCorrente.

Linha 7: Vamos adicionar no Método Construtor ContaCorrente o parâmetro limite. Observe que a variável possui o mesmo nome e tipo do Atributo limite da Classe. Ao instanciar um novo Objeto da Classe ContaCorrente, o Método Construtor receberá todos os dados da Classe Conta através do Método super() e o valor do limite será recebido através do parâmetro limite, que foi adicionado na assinatura do Método Construtor da Classe ContaCorrente.

Linha 9: Os dados recebidos no parâmetro limite do Método Construtor da Classe ContaCorrente será atribuído ao Atributo limite da Classe ContaCorrente. Como o parâmetro possui o mesmo nome do Atributo da Classe, foi utilizada a palavra reservada this para diferenciar o Atributo da Classe ContaCorrente do parâmetro do Método Construtor ContaCorrente.

Criar os Métodos Get e Set

Criar os Métodos Específicos

Linha 20: Foi adicionado na assinatura do Método a anotação @Override, indicando que o Método foi sobrescrito. Esta anotação é opcional.

Linha 23: O Método sacar da Classe ContaCorrente é praticamente igual ao Método sacar da Classe Conta. A única mudança será no laço condicional if, que verifica se o valor do saque é menor do que o saldo disponível na conta. Numa Conta Corrente, para obter o saldo atual da conta, será necessário somar o saldo e o limite. Observe que foram utilizados os métodos getSaldo() e getLimite() para obter os valores de ambos os Atributos e posteriormente somar. A palavra reservada this foi utilizada para fazer referência ao Objeto que está executando os Métodos.

Linha34: Foi adicionado o comando super.visualizar(), que executa o Método visualizar da Classe Conta. O comando super pode ser utilizado na Classe filha pra chamar qualquer Método da Classe pai.

Linha 35: Através do comando de Saída System.out.println(), foi adicionado o Atributo limite. Para obter os dados do Atributo limite da Classe ContaCorrente, foi utilizada a palavra reservada this, para fazer referência ao Objeto que exibirá os dados no console, seguido do nome do Atributo que será exibido em cada linha.

 */
