package _02exercicio;

public class Aluno {
	String nome;
	String curso;
	Avaliacao nota;
	
	
	public Aluno(String nome, String curso, Avaliacao nota){
		super();
		this.nome = nome;
		this.curso = curso;
		this.nota = nota;
	}

	public void info() {
	    System.out.println("Nome: " + nome);
	    System.out.println("Curso: " + curso);
	    System.out.printf("Notas: %.2f %.2f %.2f %.2f%n",nota.n1,nota.n2,nota.n3,nota.n4);
	}

}
