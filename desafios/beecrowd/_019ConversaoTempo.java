package iniciante;

import java.util.Scanner;

public class _019ConversaoTempo {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Insira os segundos");
		int seg = teclado.nextInt();
		teclado.close();
		
		int hora=0;
		if (seg >=3600) {
			hora = seg/3600;
			seg = seg-hora*60*60;
		}
		int minuto = 0;
		if (seg>=60) {
			minuto = seg/60;
			seg = seg-minuto*60;
		}
		System.out.println(hora+":"+minuto+":"+seg);;
	}
}