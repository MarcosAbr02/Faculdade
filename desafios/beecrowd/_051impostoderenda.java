package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class _051impostoderenda {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);

		System.out.println("Quanto tu recebe?");
		double salario = teclado.nextDouble();
		double imposto;

		if (salario <= 2000.00) {
			System.out.println("Isento");
		} 
		else if (salario > 2000.00 && salario <= 3000.00) {
			imposto = salario - 2000;
			imposto = imposto * 8 / 100;
			
			System.out.printf("R$ %.2f", imposto);
		} 
		else if (salario > 3000.00 && salario <= 4500.00) {
			imposto = salario - 3000;
			imposto = imposto * 18 / 100;
			imposto += 80; // imposto de 8% sobre 1000
			
			System.out.printf("R$ %.2f", imposto);
		} 
		else if (salario > 4500) {
			imposto = salario - 4500;
			imposto = imposto * 28/100;
			imposto+=270; // imposto de 18% sobre 1500
			imposto+=80; // imposto de 8% sobre 1000
			
			System.out.printf("R$ %.2f", imposto);
		}
		else {
			System.out.println("insira um valor válido!");
		}
		
		teclado.close();
	}
}
