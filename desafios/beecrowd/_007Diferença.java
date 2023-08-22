package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class _007Diferença {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner teclado = new Scanner(System.in);
		int A = teclado.nextInt();
		int B = teclado.nextInt();
		int C = teclado.nextInt();
		int D = teclado.nextInt();
		teclado.close();
		
		int diferenca = (A*B-C*D);
		System.out.println("Diferença = "+diferenca);
	}

}
