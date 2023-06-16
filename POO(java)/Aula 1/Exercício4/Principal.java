package Exercício4;

public class Principal {

	public static void main(String[] args) {
		Media marcos = new Media();
		marcos.nota1=9f;
		marcos.nota2=7f;
		marcos.nota3=8.5f;
		
		float resultado = marcos.aritmetica();
		System.out.println("Aritmetica: "+resultado);
		resultado = marcos.ponderada();
		System.out.println("Ponderada: "+resultado);
	}

}
