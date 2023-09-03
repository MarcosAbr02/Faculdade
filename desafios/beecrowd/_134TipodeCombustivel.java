package iniciante;

import java.util.Scanner;

public class _134TipodeCombustivel {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int x = teclado.nextInt();
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;

		while (x != 4) {
			if (x == 1) {
				alcool++;
			}
			if (x == 2) {
				gasolina++;
			}
			if (x == 3) {
				diesel++;
			}

			x = teclado.nextInt();
		}

		System.out.println("MUITO OBRIGADO!");
		System.out.printf("Alcool: %d%n", alcool);
		System.out.printf("Gasolina: %d%n", gasolina);
		System.out.printf("Diesel: %d%n", diesel);

		teclado.close();
	}
}
