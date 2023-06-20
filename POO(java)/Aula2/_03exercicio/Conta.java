package _03exercicio;

class Conta {
	int numero;
	String titular;
	double saldo;
	double limite;
	
	public Conta(int numero, String titular, double saldo, double limite) {
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
		this.limite = limite;
	}
	boolean sacar(double valor) {
		if(valor>limite || valor >saldo || valor <=0) {
			System.out.println("Operação não permitida!");
			return false;
		}
		saldo -= valor;
		return true;
	}
	boolean depositar(double valor) {
		if(valor<=0) {
			System.out.println("carecagem");
			return false;
		}
		saldo += valor;
		return true;
	}
	void info() {
		System.out.println("Nome: "+titular);
		System.out.println("Numero: "+numero);
		System.out.println("Saldo: "+saldo);
	}
	boolean transferir(Conta outra, double valor){
		if(valor<=0 || valor>limite || valor>saldo) {
			System.out.println("carecagem");
			return false;
		}
		saldo -= valor;
		outra.saldo += valor;
		return true;
	}
}
