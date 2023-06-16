package Exercício5;

public class conta {
	String correntista;
	float saldo;
	float limiteSaque;
	void sacar(float valor) {
	if (valor < saldo || valor <= limiteSaque) {
		saldo -= valor;
	}
	else {
		System.out.println("Saque não permitido");
	}
	}
	void depositar(float valor){
		saldo += valor;
	}
	void info() {
		System.out.println("Nome: "+correntista);
		System.out.println("Saldo: "+saldo);
		System.out.println("Limite: "+limiteSaque);
	}
	void transferir(conta outra, float valor) {
		saldo -= valor;
		outra.saldo += valor;
	}
}