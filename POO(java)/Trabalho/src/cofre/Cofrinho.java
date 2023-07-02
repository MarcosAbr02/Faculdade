package cofre;

import java.util.ArrayList;

public class Cofrinho {
	private ArrayList<Moeda> listaMoedas = new ArrayList<Moeda>();

	
	// Adiciona uma instância de moeda no Array
	public void adicionar(Moeda moeda) {
		listaMoedas.add(moeda);
		System.out.println("Moeda adicionada com sucesso!");
		moeda.info();
	}

	
	// Remove uma instância de moeda através do índice
	public void remover(int i) {
		Moeda removida = listaMoedas.get(i-1);
		System.out.println("Moeda removida com sucesso: ");
		removida.info();
		listaMoedas.remove(removida);
	}

	
	// Lista as moedas de maneira polimórfica (info())
	public void listagemMoedas() {
		System.out.println("------------------------------");
		int i = 1;
		for (Moeda moeda : listaMoedas) {
			System.out.printf("%d - ", i);
			moeda.info();
			i++;
		}
		System.out.println("------------------------------");
	}

	
	// Converte todas as moedas através da função polimórfica converter()
	public double totalConvertido() {
		double total = 0;
		for (Moeda moeda : listaMoedas) {
			total += moeda.converter();
		}
		return total; //Retorna valor já convertido
	}

	
	public int tamanho() {
		return listaMoedas.size();
	}

	public boolean vazio() {
		return listaMoedas.isEmpty();
	}

}
