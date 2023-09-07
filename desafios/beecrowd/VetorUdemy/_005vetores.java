package careca;

import java.util.Scanner;

public class _005vetores {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int N = teclado.nextInt();
		
		int[] numeros = new int[N];
		
		for(int i = 0;i<N;i++) {
			numeros[i]=teclado.nextInt();
		}
		
		int totalPar = 0;
		int contPar = 0;
		
		for(int numero : numeros) {
			if(numero%2==0) {
				totalPar+=numero;
				contPar++;
			}
		}
		double media = (double) totalPar/contPar;
		System.out.printf("%.1f%n",media);
		teclado.close();
	}
}
