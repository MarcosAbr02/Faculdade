package iniciante;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class _042sortsimples {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int a = teclado.nextInt();
		int b = teclado.nextInt();
		int c = teclado.nextInt();
		
		ArrayList<Integer> lista = new ArrayList<Integer>();
		lista.add(a);
		lista.add(b);
		lista.add(c);
	
		Collections.sort(lista);
		for(int i=0; i<lista.size();i++) {
			System.out.println(lista.get(i));
		}
		System.out.println();
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		teclado.close();
	}
}
