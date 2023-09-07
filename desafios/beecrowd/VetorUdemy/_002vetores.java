package careca;

import java.util.Scanner;

public class _002vetores {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		
		int N = teclado.nextInt();
		
		int[] numeros = new int[N];
		
		for (int i =0;i<N;i++) {
			numeros[i]=teclado.nextInt();
		}
		
		int quantidade =0;
		
		for(int numero : numeros) {
			if(numero%2==0) {
				System.out.print(numero+" ");
				quantidade++;
			}
		}
		
		System.out.printf("%n%d",quantidade);
		teclado.close();
	}

}
