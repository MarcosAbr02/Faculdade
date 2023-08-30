package iniciante;

import java.util.Scanner;

public class _050ddd {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int ddd = teclado.nextInt();
		String cidade ="";
		boolean existe = true;
		
		switch(ddd) {
		
		case 61:
			cidade = "Brasilia";
			break;
		case 71:
			cidade="Salvador";
			break;
		case 11:
			cidade="São Paulo";
			break;
		case 21:
			cidade="Rio de janeiro";
			break;
		case 32:
			cidade="Juiz de fora";
			break;
		case 19:
			cidade="Campinas";
			break;
		case 27:
			cidade="Vitoria";
			break;
		case 31:
			cidade="Bh";
			break;
		default:
			existe=false;
		}
		
		if(existe) {
			System.out.println(cidade);
		}
		else {
			System.out.println("ddd não encontrado!");
		}
		
		teclado.close();
	}
}
