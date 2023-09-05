package iniciante;

import java.util.Scanner;

public class _142PUM {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int N = teclado.nextInt();
		int a = 1;
		int b = 2;
		int c = 3;
		
		for(int i = 0;i<N;i++) {
			System.out.printf("%d %d %d PUM%n",a,b,c);
			a+=4;
			b+=4;
			c+=4;
		}
		
		teclado.close();
	}
}
