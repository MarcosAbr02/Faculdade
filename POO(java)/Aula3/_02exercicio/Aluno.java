package _02exercicio;

public class Aluno {
	String nome;
	int matricula;
	double desconto;
	Curso curso;
	
	public Aluno(String nome, int matricula, double desconto, Curso curso) {
		this.nome = nome;
		this.matricula = matricula;
		this.desconto = desconto;
		this.curso = curso;
	}
	public void info() {
		System.out.println("Nome do Aluno: "+nome);
		System.out.println("Matricula do Aluno: "+matricula);
		System.out.println("Desconto do Aluno: "+desconto);
		System.out.println("Curso do Aluno: "+curso.nome);
		curso.info();
		pagamento();
	}
	public void pagamento() {
		double descontado = curso.mensalidade*(1-desconto);
		System.out.println("Mensalidade depois do desconto é: "+descontado);
	}
}