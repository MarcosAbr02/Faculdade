package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class _012Área {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		double A = teclado.nextDouble();
		double B = teclado.nextDouble();
		double C = teclado.nextDouble();
		teclado.close();
		final double PI = 3.14159;
		
		double areaTriangulo = (A+B)/2;
		System.out.printf("TRIANGULO: %.3f%n",areaTriangulo);
		
		double areaCirculo = PI*C*C;
		System.out.printf("CIRCULO: %.3f%n",areaCirculo);
		
		double areaTrapezio = (A+B)*C/2;
		System.out.printf("TRAPEZIO: %.3f%n",areaTrapezio);
		
		double areaQuadrado = Math.pow(B, 2.0);
		System.out.printf("QUADRADO: %.3f%n",areaQuadrado);
		
		double areaRetangulo = A*B;
		System.out.printf("RETANGULO: %.3f%n",areaRetangulo);
	}

}
