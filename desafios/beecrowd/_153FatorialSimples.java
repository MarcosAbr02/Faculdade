package iniciante;

import java.util.Scanner;

public class _153FatorialSimples {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int N = teclado.nextInt();
		int soma = 0;
		
		if(N>0 && N<13) {
			for(int i = N-1;i>0;i--) {
				soma += N*i;
			}
		}
		
		System.out.println(soma);
		teclado.close();
	}
}
