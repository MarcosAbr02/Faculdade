package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class _009SalarioComBonus {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner teclado = new Scanner(System.in);
		double salario = teclado.nextDouble();
		double vendas = teclado .nextDouble();
		teclado.close();
		
		double total = salario+vendas*0.15;
		System.out.printf("TOTAL = R$ %.2f",total);
	}

}
