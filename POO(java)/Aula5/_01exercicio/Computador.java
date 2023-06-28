package _01exercicio;

abstract class Computador {
	int gbMemoria;
	int numProcessadores;

	public Computador(int gbMemoria, int numProcessadores) {
		this.gbMemoria = gbMemoria;
		this.numProcessadores = numProcessadores;
	}

	public abstract double calculaValor();
}
