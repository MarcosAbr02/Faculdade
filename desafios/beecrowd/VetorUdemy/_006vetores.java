package careca;

import java.util.Scanner;

public class _006vetores {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int N = teclado.nextInt();

		String[] nomes = new String[N];
		int[] numeros = new int[N];

		for (int i = 0; i < N; i++) {
			nomes[i]=teclado.next();
			numeros[i]=teclado.nextInt();
		}
		
		int posicao = 0;
		int maior = 0;
		for (int i = 0;i<N;i++) {
			if(numeros[i]>maior) {
				maior = numeros[i];
				posicao = i;
			}
		}
		
		
		System.out.println("Pessoa mais velha: "+nomes[posicao]);
		teclado.close();
	}
}
