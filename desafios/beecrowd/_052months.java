package iniciante;

import java.util.Scanner;

public class _052months {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int mes = teclado.nextInt();
		String month = "";
		boolean existe = true;
		
		switch (mes){
		case 1:
			month="January";
			break;
		case 2:
			month="February";
			break;
		case 3:
			month="March";
			break;
		case 4:
			month="April";
			break;
		case 5:
			month="May";
			break;
		case 6:
			month="June";
			break;
		case 7:
			month="July";
			break;
		case 8:
			month="August";
			break;
		case 9:
			month="September";
			break;
		case 10:
			month="October";
			break;
		case 11:
			month="November";
			break;
		case 12:
			month="December";
			break;
		default:
			existe = false;
		}
		
		if(existe) {
			System.out.printf("%s",month);
		}
		else {
			System.out.println("Mês não encontrado!");
		}
		
		teclado.close();
	}
}
