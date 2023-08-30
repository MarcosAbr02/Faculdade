package iniciante;

import java.util.Scanner;

public class _049animal {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Vertebrado ou invertebrado?");
		String a = teclado.next();

		String b = "";
		String c = "";

		if (a.toLowerCase().equals("vertebrado")) {
			System.out.println("Ave ou mamífero?");
			b = teclado.next();

			if (b.toLowerCase().equals("ave")) {
				System.out.println("carnivoro ou onivoro?");
				c = teclado.next();
				
				if(c.toLowerCase().equals("carnivoro")) {
					System.out.println("Águia");
				}
				else if(c.toLowerCase().equals("onivoro")) {
					System.out.println("pombo");
				}
				else {
					System.out.println("encerrando programa!");
				}
			} 
			else if (b.toLowerCase().equals("mamifero")) {
				System.out.println("onivoro ou herbivero?");
				c=teclado.next();
				
				if(c.toLowerCase().equals("onivoro")) {
					System.out.println("homem");
				}
				else if(c.toLowerCase().equals("herbivoro")){
					System.out.println("vaca");
				}
				else {
					System.out.println("encerrando programa!");
				}
			}
			else {
				System.out.println("Encerrando o programa!");
			}
		}
		
		else if(a.toLowerCase().equals("invertebrado")) {
			System.out.println("Inseto ou anelideo?");
			b=teclado.next();
			
			if(b.toLowerCase().equals("inseto")){
				System.out.println("hematofago ou herbivoro?");
				c=teclado.next();
				
				if(c.toLowerCase().equals("hematofago")) {
					System.out.println("pulga");
				}
				else if(c.toLowerCase().equals("herbivoro")) {
					System.out.println("lagarta");
				}
				else {
					System.out.println("Encerrando o programa!");
				}
			}
			else if(b.toLowerCase().equals("anelideo")){
				System.out.println("hematofago ou onivoro?");{
					if(c.toLowerCase().equals("hematofago")) {
						System.out.println("sanguessuga");
					}
					else if(c.toLowerCase().equals("onivoro")){
						System.out.println("minhoca");
					}
				}
			}
			else {
				System.out.println("Encerrando o programa!");
			}
		}
		else {
			System.out.println("Encerrando o programa!");
		}
		
		teclado.close();
	}
}
