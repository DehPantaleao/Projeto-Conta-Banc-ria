package conta.model;

public class ContaPoupanca extends Conta{

	private int aniversario;

	public ContaPoupanca(int numero, int agencia, int tipo, String titular, float saldo, int aniversario) {
		super(numero, agencia, tipo, titular, saldo);
		this.aniversario = aniversario;
	}

	public int getAniversario() {
		return aniversario;
	}

	public void setAniversario(int aniversario) {
		this.aniversario = aniversario;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("Aniversário da conta: " + this.aniversario);
	}
    
}

/* Criar a Classe ContaPoupanca herdando a Classe Conta

Vamos implementar o código da Classe ContaPoupanca herdando a Classe Conta
Observe que na Classe ContaPoupanca foram declaradas apenas as diferenças (Métodos e Atributos) entre a subclasse e superclasse,
ou seja, o reuso é automático. Além disso, apenas o Método Visualizar foi Sobrescrito.

 */
