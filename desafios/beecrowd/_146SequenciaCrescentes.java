package iniciante;

import java.util.Scanner;

public class _146SequenciaCrescentes {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int numero;
		// executa pelo menos uma vez
		do {
			System.out.println("Digite um número!");
			numero = teclado.nextInt();
			for (int i = 1; i <= numero; i++) {
				System.out.print(i + " ");
			}
			System.out.println();
		} // encerra quando o numero digitado for 0 ou menor
		while (numero > 0);
		
		System.out.println("Encerrando o programa!");
		teclado.close();
	}
}
