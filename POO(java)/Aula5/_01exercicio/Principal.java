package _01exercicio;

public class Principal {

	public static void main(String[] args) {
		Computador i5 = new Desktop(500, 6, 400);
		System.out.println(i5.calculaValor());
		i5 = new NoteBook(1000, 6, 0);// Polimorfismo, i5 pode assumir a forma de desktop ou notebook
		System.out.println(i5.calculaValor());
		
		// Computador i5 = new Computador; // Não se pode instanciar classe abstratas,
		// evitando erros
	}

}
