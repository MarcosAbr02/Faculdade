package iniciante;

import java.util.Scanner;

public class _070seisnumerospares {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int x = teclado.nextInt();

		if (x % 2 == 0) {
			x++;
		}
		for (int i = 0; i < 6; i++) {
			System.out.println(x);
			x += 2;
		}

		teclado.close();
	}
}
