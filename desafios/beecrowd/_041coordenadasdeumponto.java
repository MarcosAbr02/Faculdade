package iniciante;

import java.util.Scanner;

public class _041coordenadasdeumponto {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int x = teclado.nextInt();
		int y = teclado.nextInt();
		
		if (x==0 || y == 0) {
			if(x==0 && y==0) {
				System.out.println("Origem");
			}
			else {
				System.out.println("Não foi possível determinar um quadrante");
			}
		}
		else if(x>0) {
			if(y>0) {
				System.out.println("Q1");
			}
			else {
				System.out.println("Q4");
			}
		}
		else{
			if(y>0) {
				System.out.println("Q2");
			}
			else {
				System.out.println("Q3");
			}
		}
		
		teclado.close();
	}
}


