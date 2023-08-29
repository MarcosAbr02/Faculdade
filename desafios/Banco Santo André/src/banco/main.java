package banco;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Pattern;

public class main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US); // Padronizar double com . ao invés de ,
		ArrayList<cliente> clientes = new ArrayList<cliente>(); // lista de clientes
		Scanner teclado = new Scanner(System.in);

		String nome = "";
		String cpf = "";
		double divida = 0;
		int atraso = 0;
		boolean menu = true; // mantém o menu ativo até o usuário encerrar

		System.out.printf("Bem-Vindo ao banco Santo André%n");
		while (menu) {
			System.out.printf("O que deseja fazer?%n" + "1-Casdastrar novo cliente%n" + "2-Ver clientes cadastrados%n"
					+ "3-Deletar cliente (caso quitado o empréstimo)%n" + "4-Regras de negócio%n"
					+ "5-Encerrar o programa%n");

			String msg = "";
			int opc = validaInt(teclado, msg);// valida opção do usuário

			switch (opc) { // Executa determinado trecho de acordo com a opção
			case 1: // Cadastrar
				System.out.println("Caso mude de idéia, apenas digite 0 em um dos campos!");

				System.out.printf("Nome do cliente:");
				nome = teclado.next();

				if (nome.equals("0")) { // Verifica se o usuário desistiu do cadastro(repetições abaixo)
					System.out.println("Retornando ao início!");
					break;
				}

				System.out.printf("cpf do cliente:");
				cpf = validaCpf(teclado);

				if (cpf.equals("0")) {
					System.out.println("Retornando ao início!");
					break;
				}

				msg = "Digite o valor da divida:";
				divida = validaDouble(teclado, msg);

				if (divida == 0) {
					System.out.println("Retornando ao início!");
					break;
				}

				msg = "Digite os dias de atraso:";
				atraso = validaInt(teclado, msg);

				if (atraso == 0) {
					System.out.println("Retornando ao início!");
					break;
				}

				cliente novo = new cliente(nome, cpf, divida, atraso);
				clientes.add(novo);

				System.out.println("Cadastro concluído com sucesso!");
				System.out.println("------------------------------");
				novo.info();
				System.out.println("------------------------------");
				break;

			case 2: // Listar
				if (clientes.isEmpty()) {
					System.out.printf("Não há clientes a serem exibidos!%n%n");
					break;
				}
				System.out.println("------------------------------");
				int i = 1;
				for (cliente cliente : clientes) {
					System.out.printf("%d - ", i);
					cliente.info();
					i++;
					System.out.println("------------------------------");
				}
				break;

			case 3: // Apagar
				if (clientes.isEmpty()) {
					System.out.printf("Não há clientes a serem deletados!%n%n");
					break;
				}
				System.out.println("Que cliente deseja deletar?(Para desistir, digite 0");
				System.out.println("------------------------------");
				i = 1;
				for (cliente cliente : clientes) {
					System.out.printf("%d - ", i);
					cliente.info();
					i++;
					System.out.println("------------------------------");
				}
				msg = "Digite o digito que corresponde ao cliente:";
				int digito;
				while (true) {
					digito = validaInt(teclado, msg);
					if ((digito) > clientes.size()) { // Verifica se o digito está presente na lista
						System.out.println("Digito não corresponde a um cliente, tente novamente!");
						teclado.nextLine();
						continue;
					}
					break;
				}

				if (digito == 0) {
					System.out.println("Retornando ao início!");
					break;
				}
				clientes.remove(digito - 1);
				break;

			case 4: // Regras
				System.out.println(
						"-----------------------------------------------------------------------------------------------------------------");
				System.out.println("As regras de negócios definidas pelo ciente são:");
				System.out.println("1-Cada dia de atraso corresponde a 2% de juros compostos");
				System.out.println(
						"2-Caso o atraso seja maior que 30 dias, será aplicado um juros de 120% para cada multiplo de 30(60, 90, 120, ...)");
				System.out.println(
						"-----------------------------------------------------------------------------------------------------------------");
				break;

			case 5: // Encerra o programa
				System.out.println("Encerrando o programa, tenha um ótimo dia!");
				menu = false; // Encerra o loop do menu
				break;

			default:
				System.out.println("digite um número de 1 a 5!");
				break; // Retorna ao início caso algo que não seja uma opção seja digitado
			}
		}

		teclado.close();
	}

	public static int validaInt(Scanner teclado, String msg) {
		// valida se o numero é inteiro e se é positivo
		while (true) {
			try {
				System.out.printf(msg); // msg personalizada para que função seja usada em diferentes contextos
				int x = teclado.nextInt();
				if (x < 0) {
					System.out.println("Digite um valor válido!");
					continue;
				}
				return x;
			} catch (InputMismatchException e) {// complilador estava esperando um inteiro e veio uma string, por
												// exemplo
				System.out.println("Digite um valor numérico!");
				teclado.nextLine(); // limpa o "buffer" do Scanner
				continue;
			}
		}
	}

	public static String validaCpf(Scanner teclado) { // Valida se o cpf digitado possui 11 digitos numéricos
		while (true) {

			String x = teclado.next();
			if (x.equals("0")) {
				return x;
			}
			if (x.length() != 11 || !Pattern.matches("\\d+", x)) {
				System.out.println("cpf inválido, favor digitar um número de 11 digitos!");
				teclado.nextLine();
				continue;
			} else {
				return x;
			}
		}
	}

	public static double validaDouble(Scanner teclado, String msg) {// Valida se é um double e se é positivo
		while (true) {
			try {
				System.out.printf(msg);
				double x = teclado.nextDouble();
				if (x < 0) {
					System.out.println("Digite um valor válido!");
					teclado.nextLine();
					continue;
				}
				return x;
			} catch (InputMismatchException e) {
				System.out.println("Digite um valor numérico");
				teclado.nextLine();
				continue;
			}
		}
	}
}
