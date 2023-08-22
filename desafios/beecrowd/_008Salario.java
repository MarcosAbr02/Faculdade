package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class _008Salario {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner teclado = new Scanner(System.in);
		int numero = teclado.nextInt();
		int hora = teclado.nextInt();
		double valor = teclado.nextDouble();
		teclado.close();
		
		double salario = hora*valor;
		System.out.println("NUMERO = "+numero);
		System.out.printf("Salário = %.2f",salario);
	}

}
