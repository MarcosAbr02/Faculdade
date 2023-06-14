package aulas;

import java.util.Scanner;

public class Exercicio_1 {

	public static void main(String[] args) {
		//Obtenha a entrada padrão de peso (int), a altura (double) e imprima o IMC.
		System.out.println("Digite o peso;");
		Scanner teclado = new Scanner(System.in);
		int peso = teclado.nextInt();
		System.out.println("Digite a altura;");
		double altura = teclado.nextDouble();
		double IMC = peso/(altura*altura);
		System.out.printf("O seu IMC é igual a %.2f",IMC);
	}

}
