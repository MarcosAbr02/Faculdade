package _01exercicio;

public class Principal {

	public static void main(String[] args) {
		Nota marcos = new Nota();//Instânciando com construtor vazio
		
		Nota luigi = new Nota(7,8,9); //Instânciando preenchendo o constutor
		marcos.setNota1(6);
		marcos.setNota2(8);
		marcos.setFaltas(7);
		marcos.resultado(marcos.getNota1(), marcos.getNota2());
		System.out.println();
		luigi.resultado(luigi.getNota1(),luigi.getNota2());
	}

}
