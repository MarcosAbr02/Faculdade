package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class _117validacaodeNota {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);

		double x = teclado.nextDouble();
		double y = teclado.nextDouble();

		while (x < 0 || x > 10 || y < 0 || y > 10) {
			System.out.println("nota inválida");
			x = teclado.nextDouble();
			y = teclado.nextDouble();
		}
		double media = (x+y)/2;
		System.out.printf("media = %.2f",media);
		teclado.close();
	}
}
