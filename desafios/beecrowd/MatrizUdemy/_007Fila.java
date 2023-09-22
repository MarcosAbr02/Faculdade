package careca;

import java.util.Scanner;

public class _007Fila {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite o numéro de filas:");
		int N = teclado.nextInt();

		System.out.println("Digite o número de soldados por fila:");
		int M = teclado.nextInt();

		int[][] mat = new int[N][M];

		// povoando a matriz
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				mat[i][j] = teclado.nextInt();
			}
		}
		
		// vetor para armazenar a nova fila
		int opc;
		do {
			int[] vet = new int[M];
			System.out.println("Que fila deseja virar? Digite 0 para encerrar");
			opc = teclado.nextInt();
			opc -= 1;
			
			// Encerra o loop
			if(opc==-1) {
				System.out.println("Tenha um bom dia!");
				break;
			}

			//armazenando a nova fila no vetor
			for (int j = 0; j < M; j++) {
				if(j!=M-1) {
				vet[j+1]=mat[opc][j];
				}
				else {
					vet[0]=mat[opc][j];
				}
			}
			
			//passando o vetor para a matriz
			for(int j =0;j<M;j++) {
				mat[opc][j]=vet[j];
			}

			// Imprimindo a matriz com os valores trocados
			for(int i =0;i<N;i++) {
				for(int j =0;j<M;j++) {
					System.out.print(mat[i][j]+" ");
				}
				System.out.println();
			}
			
			teclado.nextLine();
		} while (opc != -1);
		
		teclado.close();
	}
}
