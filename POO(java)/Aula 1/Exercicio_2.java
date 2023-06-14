package aulas;

import java.util.Scanner;

public class Exercicio_2 {

	public static void main(String[] args) {
		//Enquanto o usuário não digitar 10000, continue fornecendo dicas se o valor está abaixo ou acima do valor esperado
		int certo = 10000;
		System.out.println("Adivinhe o valor correto!");
		Scanner teclado = new Scanner(System.in);
		int tentativa = teclado.nextInt();
		while(tentativa != certo) {
			if (tentativa>certo) {
				System.out.println("O valor digitado está acima do correto...");
			}
			else {
				System.out.println("O valor digitado está abaixo do correto...");
			}
			System.out.println("Digite outro palpite!");
			tentativa = teclado.nextInt();
		}
		System.out.println("O valor está correto!");

	}

}
