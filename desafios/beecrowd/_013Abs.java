package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class _013Abs {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		int a = teclado.nextInt();
		int b = teclado.nextInt();
		int c = teclado.nextInt();
		teclado.close();

		int maior = Math.max(a, Math.max(b, c));
		
		System.out.println(maior + " eh o maior");
	}
}