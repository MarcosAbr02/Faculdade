package iniciante;

import java.util.Scanner;

public class _154Idades {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int idade = teclado.nextInt();
		int cont = 0;
		int soma = 0;

		while (idade >= 0) {
			cont++;
			soma += idade;
			idade = teclado.nextInt();
		}

		if (cont == 0) {
			System.out.println("Impossível calcular");
		} else {
			double media = (double) soma / cont;
			System.out.println(media);
		}

		teclado.close();
	}
}
