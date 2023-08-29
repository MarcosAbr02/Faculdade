package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class _040media3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);

		float N1 = teclado.nextFloat();
		float N2 = teclado.nextFloat();
		float N3 = teclado.nextFloat();
		float N4 = teclado.nextFloat();
		float exame = 0;
		float mediaFinal = 0;

		float media = (2 * N1 + 3 * N2 + 4 * N3 + N4) / 10;
		System.out.println("Media:" + media);
		if(media<5.0) {
			System.out.println("Aluno reprovado!");
			System.out.println("Média final: "+media);
		}
		else if(media>=5.0 && media<=6.9){
			System.out.println("Aluno em exame");
			exame = teclado.nextFloat();
			mediaFinal = (exame+media)/2;
			if(mediaFinal>=5.0) {
				System.out.println("Aluno aprovado");
				System.out.println("Média final: "+mediaFinal);
			}
			else {
				System.out.println("Aluno reprovado");
				System.out.println("Média final: "+mediaFinal);
			}
		}
		else if(media<=10) {
			System.out.println("Aluno aprovado");
			System.out.println("Média final: "+media);
		}
		else {
			System.out.println("Deixa de ser mentiroso!");
		}
		
		teclado.close();
	}

}
