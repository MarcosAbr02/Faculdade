package _01Exercicio;

public class LivroFisico extends Livro {
	private int tiragem;
	private int peso;
	
	public LivroFisico(String titulo, Autor autor, String genero, int edicao, int tiragem, int peso) {
		super(titulo, autor, genero, edicao);
		setTiragem(tiragem);
		setPeso(peso);
	}
	
	public int getTiragem() {
		return tiragem;
	}
	public void setTiragem(int tiragem) {
		this.tiragem = tiragem;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}	
	
	@Override
	public void info() {
		super.info();
		System.out.println("Peso do livro: "+peso);
		System.out.println("Tiragem do livro"+tiragem);
		super.infoA();
		}
}