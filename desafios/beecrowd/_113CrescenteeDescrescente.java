package iniciante;

import java.util.Scanner;

public class _113CrescenteeDescrescente {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int x = teclado.nextInt();
		int y = teclado.nextInt();
		
		while(x != y) {
			if(x>y) {
				System.out.println("Decrescente");
			}
			else {
				System.out.println("Crescente");
			}
			
			x = teclado.nextInt();
			y = teclado.nextInt();
			
			teclado.close();
		}
	}
}
