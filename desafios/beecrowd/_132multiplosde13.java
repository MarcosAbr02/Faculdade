package iniciante;

import java.util.Scanner;

public class _132multiplosde13 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int x = teclado.nextInt();
		int y = teclado.nextInt();
		int soma = 0;

		if (x > y) {
			int temp = x;
			x = y;
			y = temp;
		}

		for (int i = x; i <= y; i++) {
			if (i % 13 != 0) {
				soma += i;
			}
		}

		System.out.println(soma);
		teclado.close();
	}
}
