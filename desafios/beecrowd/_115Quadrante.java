package iniciante;

import java.util.Scanner;

public class _115Quadrante {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int x = teclado.nextInt();
		int y = teclado.nextInt();

		while (x != 0 && y != 0) {
			if (x > 0) {
				if (y > 0) {
					System.out.println("primeiro");
				} else {
					System.out.println("quarto");
				}
			} else {
				if (y > 0) {
					System.out.println("segundo");
				} else {
					System.out.println("terceiro");
				}
			}

			x = teclado.nextInt();
			y = teclado.nextInt();
		}

		teclado.close();
	}

}
