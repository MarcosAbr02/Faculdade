package careca;

import java.util.Scanner;

public class _001MatrizNegativos {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Insira o número de linhas:");
		int M = teclado.nextInt();

		System.out.println("Insira o número de colunas:");
		int N = teclado.nextInt();

		int[][] mat = new int[M][N];

		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				mat[i][j] = teclado.nextInt();
			}
		}
		
		System.out.println("VALORES NEGATIVOS:");
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				if(mat[i][j]<0) {
					System.out.println(mat[i][j]);
				}
			}
		}
		
		teclado.close();
	}
}
