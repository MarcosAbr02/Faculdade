package iniciante;

import java.util.Scanner;

public class _116dividindoXporY {
	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		
		int N = teclado.nextInt();
		
		for(int i = 0;i<N;i++) {
			int x = teclado.nextInt();
			int y = teclado.nextInt();
			if(y==0) {
				System.out.println("Divisão impossível!");
			}
			else {
				double res = (double) x/y;
				System.out.println(res);
			}
		}
		
		teclado.close();
	}
}
