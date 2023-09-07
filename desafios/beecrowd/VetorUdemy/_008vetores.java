package careca;

import java.util.Locale;
import java.util.Scanner;

public class _008vetores {
	public static void main(String[] agrs) {
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);

		int N = teclado.nextInt();

		double[] altura = new double[N];
		String[] sexo = new String[N];

		for (int i = 0; i < N; i++) {
			altura[i] = teclado.nextDouble();
			sexo[i] = teclado.next();
		}

		double menor = 100;
		double maior = 0;

		for (double alt : altura) {
			if (alt < menor) {
				menor = alt;
			}
			if (alt > maior) {
				maior = alt;
			}
		}

		double alturaMulher = 0;
		double quantMulher = 0;
		for (int i = 0; i < N; i++) {
			if (sexo[i].toLowerCase().equals("f")) {
				alturaMulher += altura[i];
				quantMulher++;
			}
		}

		double media = alturaMulher / quantMulher;
		System.out.println("Menor altura: "+menor);
		System.out.println("Maior altura: "+maior);
		System.out.printf("Altura média das mulheres: %.2f%n", media);
		System.out.println("Número de homens: " + (N - quantMulher));

		teclado.close();
	}
}
