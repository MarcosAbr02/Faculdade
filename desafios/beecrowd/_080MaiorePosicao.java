package iniciante;

import java.util.Scanner;

public class _080MaiorePosicao {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int maior = 0;
		int posicao = 0;
		
		// subtítuido para 10 números
		for(int i = 0;i<10;i++) {
			int x = teclado.nextInt();
			if(x>maior) {
				maior=x;
				posicao = i+1;
			}
		}
		System.out.println(maior);
		System.out.println(posicao);
		teclado.close();
	}
}
