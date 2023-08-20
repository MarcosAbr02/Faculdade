import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class main {
	
	public static double validaDouble(Scanner teclado, String msg) {
		while (true) {
		try {
			System.out.printf(msg);
			double x = teclado.nextDouble();
			if(x<=0) {
				System.out.println("Digite um valor válido!");
				continue;
			}
			return x;
		}
		catch (InputMismatchException e) {// complilador estava esperando um inteiro e veio uma string, por exemplo
			System.out.println("Digite um valor numérico");
			teclado.nextLine();
			continue;
		}
		}
	}
	
	public static int validaInt(Scanner teclado, String msg) {
		while (true) {
		try {
			System.out.printf(msg);
			int x = teclado.nextInt();
			if(x<=0) {
				System.out.println("Digite um valor válido!");
				continue;
			}
			return x;
		}
		catch (InputMismatchException e) {// complilador estava esperando um inteiro e veio uma string, por exemplo
			System.out.println("Digite um valor numérico");
			teclado.nextLine();
			continue;
		}
		}
	}
	public static void main(String[] args) {
		Locale.setDefault(Locale.US); //Padronizar double com . ao invés de ,
		ArrayList<cliente> clientes = new ArrayList<cliente>();
		Scanner teclado = new Scanner(System.in);
		String nome = "";
	    String cpf = "";
	    double divida = 0;
	    int atraso = 0;
		boolean menu = true;
		
		System.out.printf("Bem-Vindo ao banco santo andré%n");
		while(menu) {
			System.out.printf(
		"O que deseja fazer?%n"+
		"1-Casdastrar novo cliente%n"+
		"2-Ver clientes cadastrados%n"+
		"3-Deletar cliente (caso quitado o empréstimo)%n"
		+ "4-Regras de negócio%n"+"5-Encerrar o programa%n");
		
		String msg = "";
		int opc = validaInt(teclado, msg);
		switch (opc) {
		case 1:
			System.out.printf("Nome do cliente:");
			nome = teclado.next();
			
			System.out.printf("cpf do cliente:");
			cpf = teclado.next();
			if(cpf.isEmpty() || (cpf.length()!=11)) {
				System.out.println("cpf incorreto, retornando ao início!");
				teclado.nextLine();
				break;}
			
			msg = "Digite o valor da divida:";
			divida = validaDouble(teclado,msg);
			
			msg = "Digite os dias de atraso:";
			atraso = validaInt(teclado, msg);
			
			cliente novo = new cliente(nome, cpf, divida, atraso);
			clientes.add(novo);
			break;
		case 2:
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
			
		case 3:
			if (clientes.isEmpty()) {
				System.out.printf("Não há clientes a serem deletados!%n%n");
				break;
			}
			System.out.println("Que cliente deseja deletar?");
			System.out.println("------------------------------");
			i = 1;
			for (cliente cliente : clientes) {
				System.out.printf("%d - ", i);
				cliente.info();
				i++;
				System.out.println("------------------------------");
			}
			msg = "Digite o digito que corresponde ao cliente:";
			int digito = 0;
			while(true) {
				digito = validaInt(teclado, msg);
				if((digito)>clientes.size() || digito<=0) {
					System.out.println("Digito não corresponde a um cliente, tente novamente!");
					teclado.nextLine();
					continue;
				}
				break;
			}
			clientes.remove(digito-1);
			break;
		case 4:
			System.out.println("As regras de negócios definidas pelo ciente são:");
			System.out.println("1-A cada 30 dias, um juros composto de 120% é adicionado ao valor da dívida.");
			System.out.println("2-Pro restante dos dias, um juros composto de 2% é adicionado ao valor da dívida.");
			break;
			
		case 5:
			System.out.println("Encerrando o programa, tenha um ótimo dia!");
			menu = false;
			break;
			}
		}
		teclado.close();
	}

}