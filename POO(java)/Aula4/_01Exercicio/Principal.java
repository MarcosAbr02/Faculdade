package _01Exercicio;

public class Principal {
	//getters e setters são para futuras validações quaisquer.
	public static void main(String[] args) {
		LivroDigital ld = new LivroDigital("Segunda-Feira",
				new Autor("Marcos","Brasileiro","marcos@gmail.com"),
				"Terror",1,1000,14.3);
		
		ld.info();
		
		LivroFisico lf = new LivroFisico("Domingo",ld.getAutor(),"Slice of life",2,200,5);
		
		lf.info();
	}
}
