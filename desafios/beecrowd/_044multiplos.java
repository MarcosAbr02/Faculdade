package iniciante;

import java.util.Scanner;

public class _044multiplos {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int A = teclado.nextInt();
		int B = teclado.nextInt();
		
		for(int i = 0; i>=0; i++) {
			if(A*i==B) {
				System.out.println("São múltiplos");
				break;
			}
			if(A*i>B) {
				System.out.println("Não são multiplos");
				break;
			}
		}
		
		teclado.close();
	}

}
