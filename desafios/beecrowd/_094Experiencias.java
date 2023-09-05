package iniciante;

import java.util.Scanner;

public class _094Experiencias {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int N = teclado.nextInt();
		int C = 0;
		int R = 0;
		int S = 0;
		int total = 0;
		
		for(int i = 0;i<N;i++) {
			System.out.println("Quantidade de coelhos?");
			C+=teclado.nextInt();
			System.out.println("Quantidade de ratos?");
			R+=teclado.nextInt();
			System.out.println("Quantidade de sapos?");
			S+=teclado.nextInt();
		}
		total+=C+R+S;
		
		double porcentC = (double) C*100/total;
		double porcentR = (double) R*100/total;
		double porcentS = (double) S*100/total;
		
		System.out.printf("Total : %d cobaias%n",total);
		System.out.printf("Total de coelhos: %d%n",C);
		System.out.printf("Total de ratos: %d%n",R);
		System.out.printf("Total de sapos: %d%n",S);
		
		System.out.printf("Percentual de coelhos: %.2f%%%n",porcentC);
		System.out.printf("Percentual de ratos: %.2f%%%n",porcentR);
		System.out.printf("Percentual de sapos: %.2f%%%n",porcentS);
		teclado.close();
	}
}
