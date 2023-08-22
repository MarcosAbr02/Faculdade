package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class _005Media1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner teclado = new Scanner(System.in);
		double A = teclado.nextDouble();
		double B = teclado.nextDouble();
		teclado.close();
		
		double mediaPonderada = (A * 3.5 + B * 7.5) / 11;
		System.out.printf("Media = %.5f%n", mediaPonderada);
	}

}
