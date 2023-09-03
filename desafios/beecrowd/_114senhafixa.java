package iniciante;

import java.util.Scanner;

public class _114senhafixa {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int senha = teclado.nextInt();
		while(senha!=2002) {
			System.out.println("Senha inválida!");
			senha=teclado.nextInt();
		}
		
		System.out.println("Acesso permitido!");
		teclado.close();
	}

}
