package _01exercicio;

abstract class Computador {
	int GbMemoria;
	int numProcessadores;

	public Computador(int GbMemoria, int numProcessadores) {
		this.GbMemoria = GbMemoria;
		this.numProcessadores = numProcessadores;
	}

	public abstract double calculaValor();
}
