package iniciante;

import java.util.Scanner;

public class _067numerosimpares {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int x = teclado.nextInt();

		if (x >= 1 && x <= 1000) {
			for (int i = 1; i <= x; i++) {
				if (i % 2 != 0) {
					System.out.println(i);
				}
			}
		} else {
			System.out.println("Número digitado foge ao intervalo!");
		}
		teclado.close();
	}
}
