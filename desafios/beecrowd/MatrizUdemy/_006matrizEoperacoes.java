package careca;

import java.util.Locale;
import java.util.Scanner;

public class _006matrizEoperacoes {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite o tamanho da matriz quadrada:");
		int N = teclado.nextInt();

		double[][] mat = new double[N][N];

		// povoando a matriz
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				mat[i][j] = teclado.nextDouble();
			}
		}

		double soma = 0;

		// acumulando valores positivos
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (mat[i][j] > 0) {
					soma += mat[i][j];
				}
			}
		}

		System.out.println("SOMA DOS VALORES POSITIVOS: " + soma);

		System.out.println("Escolha uma linha:");
		int linha = teclado.nextInt();

		// exibindo elementos da linha escolhida
		System.out.print("LINHA ESCOLHIDA: ");
		for (int j = 0; j < N; j++) {
			System.out.print(mat[linha][j] + " ");
		}

		System.out.println();
		System.out.println("Escolha uma coluna:");
		int coluna = teclado.nextInt();

		// exibindo elementos da colunas escolhida
		System.out.print("COLUNA ESCOLHIDA: ");
		for (int i = 0; i < N; i++) {
			System.out.print(mat[i][coluna]+" ");
		}

		System.out.println();
		System.out.print("DIAGONAL PRINCIPAL: ");
		// imprimir os elementos da diagonal da matriz
		for (int i = 0; i < N; i++) {
			System.out.print(mat[i][i]+" ");
		}
		
		System.out.println();
		
		// Alterando os elementos da matriz
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if(mat[i][j]<0) {
					mat[i][j]=Math.pow(mat[i][j], 2);
				}
			}
		}
		
		// Exibindo matriz alterada
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
		
		teclado.close();
	}
}
