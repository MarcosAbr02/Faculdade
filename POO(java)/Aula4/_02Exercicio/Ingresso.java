package _02Exercicio;

public class Ingresso {
	public String nomeEvento;
	public double valor;
	
	public Ingresso(String nomeEvento, double valor) {
		super();
		this.nomeEvento = nomeEvento;
		this.valor = valor;
	}

	public void imprimir() {
		System.out.println("Evento: "+nomeEvento);
		System.out.println("Valor: "+valor);
	}
}
