package iniciante;

import java.util.Scanner;

public class _158somaimparesconsecutivosIII {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.print("Digite o número de casos:");
		int casos = teclado.nextInt();

		for (int i = 0; i < casos; i++) {

			System.out.println("Digite o número de início:");
			int inicio = teclado.nextInt();

			System.out.println("Digite o número de ímpares a serem somados:");
			int impares = teclado.nextInt();

			int soma = 0;
			int imparesEncontrados = 0;
			// executa até que o número de ímpares solicitados seja atigindo
			while (imparesEncontrados < impares) {
				// verifica se é impar
				if (inicio % 2 != 0) {
					soma += inicio;
					imparesEncontrados++;
				}
				// testa o próximo número
				inicio++;
			}
			System.out.println(soma);
		}

		System.out.println("Encerrando o programa!");
		teclado.close();
	}
}
