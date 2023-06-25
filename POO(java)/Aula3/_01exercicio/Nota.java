package _01exercicio;

public class Nota {
	private double nota1;
	private double nota2;
	private int faltas;
	
	//Construtor vazio
	public Nota() {	
	}
	
	//Construto com validação
	public Nota(double nota1, double nota2, int faltas) {
		//chamando o metódo set dentro do construtor para validação
		setNota1(nota1);
		setNota2(nota2);
		setFaltas(faltas);
	}
	
	public double getNota1() {
		return nota1;
	}
	public void setNota1(double nota1) {
		if(!(nota1<0 || nota1>10))
			this.nota1 = nota1;
		else
			System.out.println("O primeiro campo de nota está inválido");
	}
	public double getNota2() {
		return nota2;
	}
	public void setNota2(double nota2) {
		if(!(nota2<0 || nota2>10))
			this.nota2 = nota2;
		else
			System.out.println("O segundo campo de nota está inválido");
	}
	public int getFaltas() {
		return faltas;
	}
	public void setFaltas(int faltas) {
		if(!(faltas<0 || faltas>100))
			this.faltas=faltas;
		else
			System.out.println("O campo de faltas está inválido!");
	}
	
	public void resultado(double a,double b) {
		double media = (a+b)/2;
		System.out.printf("A média Aritmética do Aluno foi: %.2f%n",media);
		if (faltas>7)
			System.out.println("Reprovado por faltas!");
		else if (media>=7)
			System.out.println("O aluno está aprovado!");
		else if(media>=2) {
			System.out.println("O aluno está de final!");
			double falta = 7-media;
			System.out.printf("O aluno necessita de mais %.2f ponto(s) para passar!%n",falta);
		}
		else
			System.out.println("O aluno está reprovado!");
	}
}
