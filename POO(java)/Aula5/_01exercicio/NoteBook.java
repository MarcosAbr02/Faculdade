package _01exercicio;

class NoteBook extends Computador {
	int polegadasTela;

	public NoteBook(int gbMemoria, int numProcessadores, int polegadasTela) {
		super(gbMemoria, numProcessadores);
		this.polegadasTela = polegadasTela;
	}
	 @Override
	public double calculaValor() {
		return gbMemoria * 250 + numProcessadores * 500 + polegadasTela * 100;
	}
}
