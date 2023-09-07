package careca;

import java.util.Locale;
import java.util.Scanner;

public class _007vetrores {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		
		int N = teclado.nextInt();
		
		String[] nomes = new String[N];
		double[] nota1 = new double[N];		
		double[] nota2 = new double[N];
		
		double[] media = new double[N];
		
		for(int i = 0;i<N;i++) {
			nomes[i]=teclado.next();
			nota1[i]=teclado.nextDouble();
			nota2[i]=teclado.nextDouble();
	
			System.out.println("Alunos aprovados:");
			media[i]=(nota1[i]+nota2[i])/2;
			
			if(media[i]>=6) {
				System.out.println();
			}
		}
		
		teclado.close();
	}
}
