package careca;

import java.util.Scanner;

public class _003maiornalinha {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Insira o tamanho da matriz quadrada:");
		int N = teclado.nextInt();

		int[][] mat = new int[N][N];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				mat[i][j] = teclado.nextInt();
			}
		}
		
		int[] vet = new int[N];
		
		
		for(int i =0;i<N;i++) {
			for(int j =0;j<N;j++) {
				if(mat[i][j]>vet[i]) {
					vet[i]=mat[i][j];
				}
			}
		}
		
		for(int i=0;i<N;i++) {
			System.out.print(vet[i]+" ");
		}
		System.out.println();
		
		teclado.close();
	}
}
