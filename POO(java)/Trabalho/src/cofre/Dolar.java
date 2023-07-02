package cofre;

class Dolar extends Moeda {
	double valor;

	public Dolar(double valor) {
		this.valor = valor;
	}

	public void info() {
		System.out.printf("Moeda: Dólar | Valor: %.2f%n", valor);
	}

	public double converter() {
		return valor * 4.79;
	}

}
