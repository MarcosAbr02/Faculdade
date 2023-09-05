package iniciante;

import java.util.Scanner;

public class _078tabuada {
public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int N = teclado.nextInt();
		
		for(int i = 1;i<=10;i++) {
			System.out.printf("%d x %d = %d%n",i,N,(N*i));
		}
		
		teclado.close();
	}
}
