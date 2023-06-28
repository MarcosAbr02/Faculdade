package _01exercicio;

class Desktop extends Computador {
	double acessorios;

	public Desktop(int GbMemoria, int numProcessadores, double acessorios) {
		super(GbMemoria, numProcessadores);
		this.acessorios = acessorios;
	}

	// Classe filhas necessariamente precisam herdar metódos que forem declarados
	// como abstratos
	@Override
	public double calculaValor() {
		return GbMemoria * 200 + numProcessadores * 400 + acessorios;
	}
}
