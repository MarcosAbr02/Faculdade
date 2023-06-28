package _01exercicio;

class Desktop extends Computador {
	double acessorios;

	public Desktop(int gbMemoria, int numProcessadores, double acessorios) {
		super(gbMemoria, numProcessadores);
		this.acessorios = acessorios;
	}

	// Classe filhas necessariamente precisam herdar metódos que forem declarados
	// como abstratos
	@Override
	public double calculaValor() {
		return gbMemoria * 200 + numProcessadores * 400 + acessorios;
	}
}
