package iniciante;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class _043triangulo {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int a = teclado.nextInt();
		int b = teclado.nextInt();
		int c = teclado.nextInt();
		double area;
		int perimetro;
		
		ArrayList<Integer> lista = new ArrayList<>();
		lista.add(a);
		lista.add(b);
		lista.add(c);
		Collections.sort(lista);
		
		if(lista.get(0)>=(lista.get(1)+lista.get(2))) {
			area = (a+b*c)/2;
			System.out.printf("Area = %.2f%n",area);
		}
		else {
			perimetro = a+b+c;
			System.out.printf("Perimetro = %d",perimetro);
		}
		
		teclado.close();
	}
}
