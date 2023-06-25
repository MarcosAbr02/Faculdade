package _03exercicio;

public class Moeda {
	private String nome;
	private double valor;
	public Moeda(String nome, double valor) {
		this.valor = valor;
		this.nome = nome;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}