package _02exercicio;

public class Curso {
	public String nome;
	public double mensalidade;
	
	public Curso(String nome, double mensalidade) {
		this.nome = nome;
		this.mensalidade = mensalidade;
	}

	public void info() {
		System.out.println("Nome do Curso: "+nome);
		System.out.println("Mensalidade do Curso: "+mensalidade);
	}
}