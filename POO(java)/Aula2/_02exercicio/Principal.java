package _02exercicio;

public class Principal {

	public static void main(String[] args) {
		Avaliacao matematica = new Avaliacao(10,9,8,7);
		Aluno marcos = new Aluno("Marcos","Ads",matematica);
		marcos.info();
	}

}
