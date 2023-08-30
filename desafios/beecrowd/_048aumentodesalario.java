package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class _048aumentodesalario {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digita teu salário aí menor!");
		
		double salario = teclado.nextDouble();
		double newSalario = salario;
		int percentual = 0;
		
		if(salario <= 400.00 && salario>0) {
			newSalario += salario*0.15;
			percentual = 15;
		}
		else if (salario > 400.00 && salario <= 800.00){
			newSalario += salario*0.12;
			percentual = 12;
		}
		else if (salario > 800.00 && salario <= 1200.00) {
			newSalario += salario*0.10;
			percentual = 10;
		}
		else if (salario > 1200.00 && salario <= 2000.00) {
			newSalario += salario*0.07;
			percentual = 7;
		}
		else if(salario > 2000.00) {
			newSalario += salario*0.04;
			percentual = 4;
		}
		
		System.out.printf("Novo salário: %.2f%nReajuste de ganho: %.2f%nEm percentual: %d%%",newSalario,(newSalario-salario),percentual);
		teclado.close();
	}

}
