package careca;

import java.util.Scanner;

public class _005somadeMatrizes {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Insira a quantidade de linhas");
		int M = teclado.nextInt();
		
		System.out.println("Insira a quantidade de colunas:");
		int N = teclado.nextInt();
		
		System.out.println("Prencha duas matrizes:");
		int[][] A = new int[M][N];
		int[][] B = new int[M][N];
		
		for(int i=0;i<M;i++	) {
			for(int j =0;j<N;j++) {
				A[i][j] = teclado.nextInt();
			}
		}
		
		for(int i=0;i<M;i++	) {
			for(int j =0;j<N;j++) {
				B[i][j] = teclado.nextInt();
			}
		}
		
		int[][] C = new int [M][N];
		
		for(int i =0;i<M;i++) {
			for(int j=0;j<N;j++) {
				C[i][j]=A[i][j]+B[i][j];
			}
		}
		
		for(int i =0;i<M;i++) {
			for(int j=0;j<N;j++) {
				System.out.print(C[i][j]+" ");
			}
			System.out.println();
		}
		
		teclado.close();
	}
}
