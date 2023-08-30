package iniciante;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class _045tiposdetriangulo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		double[] lados = new double[3];
		lados[0] = teclado.nextDouble();
		lados[1] = teclado.nextDouble();
		lados[2] = teclado.nextDouble();
		
		Arrays.sort(lados);
		double A = lados[2];
		double B = lados[1];
		double C = lados[0];
		
		boolean tri = true;

		if (A >= (B + C)) {
			System.out.println("Não forma triângulo!");
			tri = false;

		} else if (A * A == (B * B + C * C)) {
			System.out.println("Triângulo retângulo");
		} else if (A * A > B * B + C * C) {
			System.out.println("Triângulo obtuso");
		} else if (A * A < B * B + C * C) {
			System.out.println("Triângulo acutangulo");
		}

		if (A == B && B == C && tri) {
			System.out.println("Triângulo retângulo");
		}
		else if (A==B || B==C || A==C && tri) {
			System.out.println("Triângulo isóceles");
		}
		
		teclado.close();
	}

}
