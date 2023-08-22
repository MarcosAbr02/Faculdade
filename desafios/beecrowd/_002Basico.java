package iniciante;

import java.util.Scanner;

public class _002Basico {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int A = teclado.nextInt();
		int B = teclado.nextInt();
		teclado.close();
		int x = A+B;
		System.out.println(x);
	}

}
