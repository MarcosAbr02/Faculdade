package cofre;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Principal {
	public static int validaIntPositivo(Scanner teclado, String msg, int limite)
	// Valida se o número é um inteiro, se é positivo e se ultrapassa um certo
	// limite passado por parâmetro
	{
		int x = 0;
		while (true) {
			try {
				x = teclado.nextInt();
				if (x < 0) {
					throw new Exception("Por favor, vamos nos limitar a apenas valores positivos, "
							+ "você não vai a feira e pede -2 duas laranjas");
				}
				if (x > limite || x == 0) {
					throw new Exception("Por favor, digite um valor cabível dentro das opções");
				}
				break;// encerrar o loop
			} catch (InputMismatchException e) {// complilador estava esperando um inteiro e veio uma string, por exemplo
				System.out.println("Digite um valor numérico inteiro!");
				System.out.println(msg);
				teclado.nextLine();
				
			} catch (Exception e) {
				System.out.printf(e.getMessage());
				System.out.printf(" (Digite de 1 a %d)%n", limite);
				System.out.println(msg);
				teclado.nextLine();
			}
		}
		return x;
	}

	
	public static double validaDoublePositivo(Scanner teclado, String msg) {
		// Valida se o número é um Double e se é positivo
		double x = 0;
		while (true) {
			try {
				x = teclado.nextDouble();
				if (x < 0) {
					throw new Exception();
				}
				break;
				
			} catch (InputMismatchException e) {
				System.out.println("Digite um valor numérico!");
				System.out.println(msg);
				teclado.nextLine(); 
				
			} catch (Exception e) {
				System.out.println("Nós estamos muito felizes com a sua descoberta de moedas com valores negativos!\n"
						+ "Mas que tal deixá-las para um cofre de massa negativa?");
				System.out.println();
				System.out.println(msg);
				teclado.nextLine();
			}
		}
		return x;
	}

	
	public static String validaMoeda(Scanner teclado, String msg){
		// Permite ao usuário digitar a moeda sem se preocupar com caracteres maiúsculos/ minúsculos
		String opcMoeda;
		while (true) {
			opcMoeda = teclado.next();
			opcMoeda = opcMoeda.toLowerCase();
			if (!(opcMoeda.equals("dolar") || opcMoeda.equals("real") || opcMoeda.equals("euro"))) {
				System.out.println("Digite uma opção! Não se preocupe com letras maiúsculas/minúsculas");
				System.out.println(msg);
				continue;
			}
			break;
		}
		return opcMoeda;
	}
	
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);// Agora as entradas e saída de double estão padronizadas.

		Scanner teclado = new Scanner(System.in);
		Cofrinho c1 = new Cofrinho(); 

		
		System.out.println("Olá, o que gostaria de fazer?");
		
		boolean a = true;// Mantém o loop do menu
		while (a) {
			String msg = "1-Adicionar Moedas\n2-Remover Moedas\n" // Reutilização de msg durante o código
					+ "3-Listar todas as moedas\n4-Total em real\n5-fechar o programa";
			System.out.println(msg);

			int opc = validaIntPositivo(teclado, msg, 5);// Limite de 5 (opções)

			
			switch (opc) {
			case 1:// Instancia moedas pedindo o tipo da moeda e o valor
				System.out.println("Qual o tipo de moeda?");
				msg = ("Dolar\nReal\nEuro");System.out.println(msg);
				
				String opcMoeda =  validaMoeda(teclado, msg);
				
				msg = "Qual o valor da moeda? Use ponto no lugar da vírgula!";System.out.println(msg);
				
				double valor = validaDoublePositivo(teclado, msg);
				
				Moeda x;
				if (opcMoeda.equals("dolar")) {
					x = new Dolar(valor);
					c1.adicionar(x);
				}
				if (opcMoeda.equals("real")) {
					x = new Real(valor);
					c1.adicionar(x);
				}
				if (opcMoeda.equals("euro")) {
					x = new Euro(valor);
					c1.adicionar(x);
				}
				break; // Quebra do switch

				
			case 2: // Remove moedas através do índice no ArrayList
				// Verifica se o Array está vazio
				if (c1.vazio()) {
					System.out.println("Não há moedas a serem removidas!");
					break;
				}
				c1.listagemMoedas();
				msg = "Digite o índice para realizar a remoção!";
				System.out.println(msg);
				

				opc = validaIntPositivo(teclado, msg, c1.tamanho());
																		
				c1.remover(opc);
				break;

				
			case 3:// Invoca o método que exibe as moedas
				if (c1.vazio()) {
					System.out.println("Não há moedas a serem exibidas!");
					break;
				}
				c1.listagemMoedas();
				break;

				
			case 4:// Calcula o valor total convertido em Real
				if (c1.vazio()) {
					System.out.println("Não há moedas para que possa ser calculado um valor!");
					break;
				}
				double totalConvertido = c1.totalConvertido();
				System.out.printf("O valor total dentro do cofre convertido em real é: %.2f%n", totalConvertido);
				totalConvertido = 0;
				break;

				
			case 5:
				System.out.println("Encerrando o programa, tenha um ótimo dia!");
				a = false; // Encerra o loop principal (menu)
				teclado.close();
			}
		}
	}
}
