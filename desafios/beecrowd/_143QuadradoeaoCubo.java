package iniciante;

import java.util.Scanner;

public class _143QuadradoeaoCubo {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int N = teclado.nextInt();
	
		for (int i = 1; i <= N; i++) {
			System.out.printf("%d %d %d%n",i,(int)Math.pow(i, 2),(int)Math.pow(i, 3));
		}
		
		teclado.close();
	}
}
