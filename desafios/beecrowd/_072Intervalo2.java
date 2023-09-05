package iniciante;

import java.util.Scanner;

public class _072Intervalo2 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int N = teclado.nextInt();
		int cont = 0;
		
		if(N>0 && N<1000) {
			for(int i =0;i<N;i++) {
				int x = teclado.nextInt();
				if(x>=10 && x<=20) {
					cont++;
				}
			}
			
			System.out.printf("%d in%n%d out",cont,(N-cont));
		}
		else {
			System.out.println("Número digitado fora do intervalo!");
		}
		
		teclado.close();
	}
}
