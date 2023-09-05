package iniciante;

import java.util.Scanner;

public class _074ParouImpar {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int N = teclado.nextInt();
		
		if(N>0 && N<1000) {
			for(int i =0;i<N;i++) {
				int x = teclado.nextInt();
				if(x==0) {
					System.out.println("NULL");
				}
				else if(x>0) {
					if(x%2==0) {
						System.out.println("EVEN POSITIVE");
					}
					else {
						System.out.println("ODD POSITIVE");
					}
				}
				else {
					if(x%2==0) {
						System.out.println("EVEN NEGATIVE");
					}
					else {
						System.out.println("ODD NEGATIVE");
					}
				}
			}
		}
		
		teclado.close();
	}
}
