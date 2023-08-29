package iniciante;

import java.util.Scanner;

public class _038lanche {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Bem vindo a lanchonete!");
		System.out.printf("1   Cachorro Quente   R$ 4.00%n"
				+         "2   X-Salada          R$ 4.50%n"
				+         "3   X-Bacon           R$ 5.00%n"
				+         "4   Torrada simples   R$ 2.00%n"
				+         "5   Refrigerante      R$ 1.50%n");
		
		int item = teclado.nextInt();
		int quantidade = teclado.nextInt();
		double valor = 0;
		
		switch (item) {
		case 1:
			valor=4.0;
			break;
		case 2:
			valor=4.5;
			break;
		case 3:
			valor = 5.0;
			break;
		case 4:
			valor = 2.0;
			break;
		case 5:
			valor = 1.5;
			break;
		}
		
		double pagamento=quantidade*valor;
		System.out.printf("Total: R$ %.2f%n",pagamento);
		
		teclado.close();
	}
}
