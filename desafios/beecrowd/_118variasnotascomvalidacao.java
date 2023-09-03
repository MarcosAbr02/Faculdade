package iniciante;

import java.util.Scanner;

public class _118variasnotascomvalidacao {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int opc = 1;

		while (opc == 1) {
			double nota1 = teclado.nextDouble();
			double nota2 = teclado.nextDouble();
			double media = 0;
			if (nota1 < 0 || nota1 > 10 || nota2 < 0 || nota2 > 10) {
				System.out.println("nota inválida");
			}
			else {
				media = (nota1+nota2)/2;
				System.out.printf("Média = %.2f%n",media);
				System.out.println("Novo calculo (1-sim 2-nao)");
				opc = teclado.nextInt();
				while(opc!=1 && opc!=2) {
					System.out.println("selecione uma opção!");
					opc = teclado.nextInt();
				}
			}
		}
		
		teclado.close();
	}
}
