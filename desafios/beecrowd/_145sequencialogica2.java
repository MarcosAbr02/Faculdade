package iniciante;

import java.util.Scanner;

public class _145sequencialogica2 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int linhas = teclado.nextInt();
		int limite = teclado.nextInt();
		int i = 1;
		while (i <= limite) {
			for (int j = 1; j <= linhas; j++) {
				System.out.print(i+" ");
				i++;
			}
			System.out.println();
		}
		
		teclado.close();
	}
}
