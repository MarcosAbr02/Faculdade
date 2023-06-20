package _01exercicio;

public class Principal {

	public static void main(String[] args) {
		Nota matematica = new Nota();
		matematica.nota1=8;
		matematica.nota2=7;
		matematica.nota3=5;
		float mA = matematica.mediaAritmetica();
		System.out.printf("A média aritmética das notas é: %.2f%n",mA);
		float mP = matematica.mediaPonderada();
		System.out.printf("A média ponderada das notas é: %.2f%n",mP);
	}

}
