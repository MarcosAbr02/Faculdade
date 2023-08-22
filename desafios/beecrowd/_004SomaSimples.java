package iniciante;

import java.util.Scanner;

public class _004SomaSimples {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int A = teclado.nextInt();
		int B = teclado.nextInt();
		teclado.close();
		
		int soma = A+B;
		System.out.println("Soma = "+soma);
	}

}
