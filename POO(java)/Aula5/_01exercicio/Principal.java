package _01exercicio;

public class Principal {

	public static void main(String[] args) {
		Computador i5 = new Desktop(16, 6, 200);
		System.out.println(i5.calculaValor());
		i5 = new NoteBook(8, 6, 2);// Polimorfismo, i5 pode assumir a forma de desktop ou notebook
		System.out.println(i5.calculaValor());
		
		Computador i7 = new Desktop(8,6,400);
		
		Computador comp = i5;//Ponteiro
		System.out.println(comp.calculaValor());
		comp = i7; //Apontando para outro objeto
		System.out.println(comp.calculaValor());
		
		
		// Computador i5 = new Computador; // Não se pode instanciar classe abstratas,
		// evitando erros
	}

}
