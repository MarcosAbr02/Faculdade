package _03exercicio;

public class Principal {

	public static void main(String[] args) {
		Conta c1 = new Conta(909,"Mario",2000,500);
		Conta c2 = new Conta(901,"Luigi",300,500);
		
		c1.info();
		if(!c1.sacar(200)) {
			System.out.println("Problema ao sacar!");
		}
		if(!c1.depositar(500)){
			System.out.println("Problema ao depositar!");
		}
		c1.info();
		c2.info();
		if(!c1.transferir(c2, 400)) {
			System.out.println("Problema ao transferir!");
		}
		c1.info();
		c2.info();
	}

}
