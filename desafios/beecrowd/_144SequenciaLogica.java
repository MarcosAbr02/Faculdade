package iniciante;

import java.util.Scanner;

public class _144SequenciaLogica {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a quantidade de linhas desejada: ");
        int quantidade = teclado.nextInt();

        for (int i = 1; i <= quantidade; i++) {
            int iQuadrado = i * i;
            int iCubo = i * i * i;
            
            System.out.printf("%d %d %d%n", i, iQuadrado, iCubo);
            System.out.printf("%d %d %d%n", i, iQuadrado + 1, iCubo + 1);
        }

        teclado.close();
	}
}
