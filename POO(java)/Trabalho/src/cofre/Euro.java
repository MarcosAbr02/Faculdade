package cofre;

class Euro extends Moeda {
	double valor;

	public Euro(double valor) {
		this.valor = valor;
	}

	public void info() {
		System.out.printf("Moeda: Euro  | Valor: %.2f%n", valor);
	}

	public double converter() {
		return valor * 5.23;
	}

}
