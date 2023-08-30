package iniciante;

import java.util.Scanner;

public class _046tempodejogo {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int hinicial = teclado.nextInt();
		int hfinal = teclado.nextInt();
		int duracao = 0;
		
		if (hfinal<hinicial) {
			duracao = 24+hfinal-hinicial;
			System.out.printf("O JOGO DUROU %d HORA (S)",duracao);
		}
		else if(hfinal==hinicial) {
			duracao = 24;
			System.out.printf("O JOGO DUROU %d HORA (S)",duracao);
		}
		else {
			duracao = hfinal-hinicial;
			System.out.printf("O JOGO DUROU %d HORA (S)",duracao);
		}
		
		teclado.close();
	}

}
