package iniciante;

import java.util.Scanner;

public class _159SomadeParesConsecutivos {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int num = teclado.nextInt();
		

		while (num > 0) {
			int soma = 0;
			int cont = 0;

			
			while (cont < 5) {
				if (num % 2 == 0) {
					soma += num;
					cont++;
				}
				num++;
			}
			System.out.println(soma);
			num = teclado.nextInt();
		}

		teclado.close();
	}
}
