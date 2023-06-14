package aulas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercicio_3 {

	public static void main(String[] args) {
		//Leia uma sequência de N strings e as imprima em ordem reversa. Utilize um método.
		
		Scanner teclado = new Scanner(System.in);
		
		ArrayList<Integer> megaSena = new ArrayList<Integer>();
		ArrayList<String> listaNomes = new ArrayList<String>();
		System.out.println("Digite a quantidade de nomes: ");
		int qtd = teclado.nextInt();
		String nome;
		for (int i=0;i<qtd;i++) {
			nome = teclado.next();
			listaNomes.add(nome);
			System.out.println(listaNomes);
		}
		for(int i=qtd-1;i>=0;i--) {
			System.out.println(listaNomes.get(i));
		}
		Collections.reverse(listaNomes);
		System.out.println(listaNomes);
	}

}
