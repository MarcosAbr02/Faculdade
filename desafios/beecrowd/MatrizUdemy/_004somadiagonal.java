package careca;

import java.util.Scanner;

public class _004somadiagonal {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int N = teclado.nextInt();
		int [][] mat = new int[N][N];
		
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				mat[i][j] = teclado.nextInt();
			}
		}
		
		int somaDiagonal = 0;
		
		for(int i =0;i<N;i++) {
			somaDiagonal+=mat[i][i];
		}
		
		System.out.println(somaDiagonal);
		teclado.close();
	}
}
