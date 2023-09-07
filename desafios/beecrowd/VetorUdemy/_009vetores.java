package careca;

import java.util.Locale;
import java.util.Scanner;

public class _009vetores {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);

		int N = teclado.nextInt();

		String[] produto = new String[N];
		double[] preco = new double[N];
		double[] venda = new double[N];
		double[] lucro = new double[N];

		int abaixo10 = 0;
		int entre10e20 = 0;
		int acima20 = 0;
		double totalCompra = 0;
		double totalVenda = 0;

		for (int i = 0; i < N; i++) {
			produto[i] = teclado.next();
			
			preco[i] = teclado.nextDouble();
			totalCompra+=preco[i];
			
			venda[i] = teclado.nextDouble();
			totalVenda+=venda[i];

			lucro[i] += venda[i] - preco[i];
			// Calcula se o lucro é menor que 10%
			if (lucro[i] < venda[i] * 10 / 100) {
				abaixo10++;
			} else if (lucro[i] < venda[i] * 20 / 100) {
				entre10e20++;
			} else {
				acima20++;
			}
		}

		System.out.printf("Lucro abaixo de 10%%: %d%n", abaixo10);
		System.out.printf("Lucro entre de 10%% e 20%%: %d%n", entre10e20);
		System.out.printf("Lucro acima 20%%: %d%n", acima20);
		System.out.printf("Valor total de compra: %.2f%n", totalCompra);
		System.out.printf("Valor total de venda: %.2f%n", totalVenda);
		System.out.printf("Lucro total: %.2f%n",totalVenda-totalCompra);
		
		teclado.close();
	}

}
