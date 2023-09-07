package careca;

import java.util.Scanner;

public class _003vetores {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int N = teclado.nextInt();
		
		int[] A = new int[N];
		int[] B = new int[N];
		int[] C = new int[N];
		
		for(int i =0;i<N;i++) {
			A[i]=teclado.nextInt();
		}
		for(int i =0;i<N;i++) {
			B[i]=teclado.nextInt();
		}
		for(int i =0;i<N;i++) {
			C[i]=A[i]+B[i];
		}
		
		for(int numero:C) {
			System.out.print(numero+" ");
		}
		
		teclado.close();
	}
}
