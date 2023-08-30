package iniciante;

import java.util.ArrayList;
import java.util.Scanner;

public class _066pares_impares_positivos_negativos {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int a = teclado.nextInt();
		int b = teclado.nextInt();
		int c = teclado.nextInt();
		int d = teclado.nextInt();
		int e = teclado.nextInt();
		
		ArrayList<Integer> lista = new ArrayList<>();
		lista.add(a);
		lista.add(b);
		lista.add(c);
		lista.add(d);
		lista.add(e);
		int positivos = 0;
		int negativos = 0;
		int pares = 0;
		int impares = 5;
		
		for(int i = 0 ; i < lista.size();i++) {
			if(lista.get(i)>0) {
				positivos++;
			}
			else if(lista.get(i)<0) {
				negativos++;
			}
			
			if(lista.get(i)%2==0) {
				pares++;
			}
		}
		impares-=pares;
		
		System.out.printf("%d valor(es) par(es)%n%d valor(es) impar"
				+ "(es)%n%d valor(es) positivo(s)%n%d valor(es) negativos%n",pares, impares, positivos, negativos);
		teclado.close();
	}
}
