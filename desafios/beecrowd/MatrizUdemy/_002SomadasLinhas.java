package careca;

import java.util.Scanner;

public class _002SomadasLinhas {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Insira um número:");
		int N = teclado.nextInt();
		
		int[][] mat = new int[N][N];
		int[] vet = new int[N];
		
		for(int i =0;i<N;i++) {
			for(int j=0;j<N;j++) {
				mat[i][j]=teclado.nextInt();
				vet[i] += mat[i][j];
			}
		}
		
		for(int i =0;i<N;i++) {
			System.out.println(vet[i]);
		}
		
		
		teclado.close();
	}
}
