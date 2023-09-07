package careca;

import java.util.Locale;
import java.util.Scanner;

public class _004vetor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		int N = teclado.nextInt();
		
		double[] numeros = new double[N];
		double total = 0.0;
		
		for(int i =0;i<N;i++) {
			numeros[i]=teclado.nextDouble();
			total+=numeros[i];
		}
		
		double media = total/N;
		System.out.printf("%.3f%n",media);
		
		for(double numero : numeros) {
			if(numero<media) {
				System.out.print(numero+" ");
			}
		}
		
		teclado.close();
	}
}
