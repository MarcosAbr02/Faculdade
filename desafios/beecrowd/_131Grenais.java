package iniciante;

import java.util.Scanner;

public class _131Grenais {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int inter = 0;
		int gremio = 0;
		int ginter;
		int ggremio; 
		int opc;
		
		do {
			System.out.println("Quantos gols do inter?");
			ginter = teclado.nextInt();
			System.out.println("Quantos gols do gremio?");
			ggremio = teclado.nextInt();
			if(ginter>ggremio) {
				inter++;
			}
			else if(ggremio>ginter){
				gremio++;
			}
			
			do {
				System.out.println("Novo resultado? 1-sim 2-nao");
				opc = teclado.nextInt();
			}
			while(opc!= 1 && opc != 2);
			
		} while(opc == 1);
		
		System.out.printf("%d vitorias do internacional, %d vitórias do gremio%n",inter,gremio);
		
		
		if(inter>gremio) {
			System.out.println("Internacional ganhou mais!");
		}
		else if(gremio>inter) {
			System.out.println("Grêmio ganhou mais!");
		}
		else {
			System.out.println("Não houve vencedores!");
		}
		
		teclado.close();
	}
}
