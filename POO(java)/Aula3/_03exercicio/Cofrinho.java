package _03exercicio;

import java.util.ArrayList;

public class Cofrinho {
	private ArrayList<Moeda> moedas = new ArrayList();
	
	void add(Moeda m) {
		moedas.add(m);
	}
	
	double calcularTotal() {
		double total =0;
		for (Moeda m: moedas) {
			total += m.getValor();
		}
		return total;
	}
}
