package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class _006Media2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		double A = teclado.nextDouble();
		double B = teclado.nextDouble();
		double C = teclado.nextDouble();
		teclado.close();

		double mediaPonderada = (A*2+B*3+C*5)/10;
		System.out.printf("%.1f%n",mediaPonderada);
	}

}
