package iniciante;

import java.util.Scanner;

public class _101SequenciadeNumeroseSoma {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Insira um par de números:");
		int x = teclado.nextInt();
		int y = teclado.nextInt();

		while (x > 0 && y > 0) {
			int soma = 0; // reinicia a variável a cada loop

			if (x > y) { // Organiza em ordem crescente os inputs
				int temp = x;
				x = y;
				y = temp;
			}
			for (int i = x; i <= y; i++) {
				System.out.print(i + " ");
				soma += i; // acumula os valores
			}

			System.out.printf("Sum=%d%n", soma);
			System.out.println("Insira um par de números:");
			x = teclado.nextInt();
			y = teclado.nextInt();
		}

		System.out.println("Encerrando o programa!");
		teclado.close();
	}
}
