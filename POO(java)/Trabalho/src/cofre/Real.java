package cofre;

class Real extends Moeda {
	double valor;

	public Real(double valor) {
		this.valor = valor;
	}

	public void info() {
		System.out.printf("Moeda: Real  | Valor: %.2f%n", valor);
	}

	public double converter() {
		return valor * 1;
	}

}
