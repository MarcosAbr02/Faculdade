package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class _021NotaseMoedas {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite um valor com ponto!");
		double num = teclado.nextDouble();
		num *= 100;
		
		System.out.println(num);
		
		int nota100 = 0, nota50 = 0, nota20 = 0, nota10 = 0, nota5 = 0, nota2 = 0;
		int moeda1 = 0;
		int moeda50 = 0, moeda25 = 0, moeda10 = 0, moeda5 = 0, moeda1c = 0;

		if (num >= 10000) {
			nota100 = (int) num / 10000;
			num %= 10000;
		}
		if (num >= 5000) {
			nota50 = (int) num / 5000;
			num %= 5000;
		}
		if (num >= 2000) {
			nota20 = (int) num / 2000;
			num %= 2000;
		}
		if (num >= 1000) {
			nota10 = (int) num / 1000;
			num %= 1000;
		}
		if (num >= 500) {
			nota5 = (int) num / 500;
			num %= 500;
		}
		if (num >= 200) {
			nota2 = (int) num / 200;
			num %= 200;
		}

		if (num >= 100) {
			moeda1 = (int) num / 100;
			num %= 100;
		}
		if (num >= 50) {
			moeda50 = (int) num / 50;
			num %= 50;
		}
		if (num >= 25) {
			moeda25 = (int) num / 25;
			num %= 25;
		}
		if (num >= 10) {
			moeda10 = (int) num / 10;
			num %= 10;
		}
		if (num >= 5) {
			moeda5 = (int) num / 5;
			num %= 5;
		}
		if (num >= 1) {
			moeda1c = (int)num;
		}
		System.out.printf("NOTAS:%n%d nota (s) de R$ 100.00", nota100);
		System.out.printf("%n%d nota (s) de R$ 50.00", nota50);
		System.out.printf("%n%d nota (s) de R$ 20.00", nota20);
		System.out.printf("%n%d nota (s) de R$ 10.00", nota10);
		System.out.printf("%n%d nota (s) de R$ 5.00", nota5);
		System.out.printf("%n%d nota (s) de R$ 2.00%n", nota2);
		System.out.printf("MOEDA:%n%d moeda (s) de R$ 1.00", moeda1);
		System.out.printf("%n%d moeda (s) de R$ 0.50", (int) Math.floor(moeda50));
		System.out.printf("%n%d moeda (s) de R$ 0.25", (int) Math.floor(moeda25));
		System.out.printf("%n%d moeda (s) de R$ 0.10", (int) Math.floor(moeda10));
		System.out.printf("%n%d moeda (s) de R$ 0.05", (int) Math.floor(moeda5));
		System.out.printf("%n%d moeda (s) de R$ 0.01", moeda1c);
		teclado.close();
	}

}
