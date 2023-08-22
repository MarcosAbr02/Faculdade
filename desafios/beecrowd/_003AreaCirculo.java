package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class _003AreaCirculo {

	public static void main(String[] args) {
		final double PI = 3.141549;
		Scanner teclado = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double raio = teclado.nextDouble();
		double area = PI * raio * raio;
		System.out.printf("%.2f", area);
		
		teclado.close();
	}

}
