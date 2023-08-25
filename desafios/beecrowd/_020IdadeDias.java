package iniciante;

import java.util.Scanner;

public class _020IdadeDias {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int dias = teclado.nextInt();
		int ano=0,mes=0,dia=0;
		
		if (dias>=365) {
			ano = dias/365;
			dias-=ano*365;
		}
		if (dias>=30) {
			mes=dias/30;
			dias-=mes*30;
		}
		if (dias>=1) {
			dia=dias;
		}
		
		System.out.printf("%d ano (s)%n",ano);
		System.out.printf("%d mes (s)%n",mes);
		System.out.printf("%d dia (s)%n",dia);
		
		teclado.close();
	}

}
