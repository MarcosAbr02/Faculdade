package _02Exercicio;

public class Principal {

	public static void main(String[] args) {
		Ingresso ing = new Ingresso("Palhaçada",14.5);
		ing.imprimir();
		
		IngressoVip vip = new IngressoVip("Palhaçada pro", 14.5, 5);
		vip.imprimir();
	}

}
