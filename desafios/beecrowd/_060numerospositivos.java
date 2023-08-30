package iniciante;

import java.util.ArrayList;
import java.util.Scanner;

public class _060numerospositivos {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int a = teclado.nextInt();
		int b = teclado.nextInt();
		int c = teclado.nextInt();
		int d = teclado.nextInt();
		int e = teclado.nextInt();
		int f = teclado.nextInt();
		int positivos = 0;

		ArrayList<Integer> lista = new ArrayList<>();
		lista.add(a);
		lista.add(b);
		lista.add(c);
		lista.add(d);
		lista.add(e);
		lista.add(f);

		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i) > 0) {
				positivos++;
			}
		}

		System.out.printf("%d valores positivos",positivos);
		teclado.close();
	}
}
