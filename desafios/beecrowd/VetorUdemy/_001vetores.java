package careca;

import java.util.Locale;
import java.util.Scanner;

public class _001vetores {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);

		System.out.println("Quantos números deseja ler?");
		int N = teclado.nextInt();

		int[] numeros = new int[N];
		int maior = 0;
		int posicao = 0;
		
		for(int i = 0;i<N;i++) {
			numeros[i]=teclado.nextInt();
		}

		for (int i=0;i<N;i++) {
			if (numeros[i] > maior) {
				maior = numeros[i];
				posicao=i;
			}
		}

		System.out.println(maior);
		System.out.println(posicao);
		teclado.close();
	}

}
