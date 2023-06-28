package _01exercicio;

class NoteBook extends Computador {
	int polegadasTela;

	public NoteBook(int GbMemoria, int numProcessadores, int polegadasTela) {
		super(GbMemoria, numProcessadores);
		this.polegadasTela = polegadasTela;
	}

	public double calculaValor() {
		return GbMemoria * 250 + numProcessadores * 500 + polegadasTela * 100;
	}
}
