package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class _011Esfera {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		final double PI=3.14159;
		
		Scanner teclado = new Scanner(System.in);
		int R = teclado.nextInt();
		teclado.close();
		
		double volume = (4*PI*Math.pow(R, 3))/3;
		System.out.printf("VOLUME = %.3f",volume);
	}

}
