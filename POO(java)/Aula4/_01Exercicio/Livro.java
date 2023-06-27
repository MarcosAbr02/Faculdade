package _01Exercicio;

public class Livro {
	private String titulo;
	private Autor autor;
	private String genero;
	private int edicao;
	
	public Livro(String titulo, Autor autor, String genero, int edicao) {
		setTitulo(titulo);
		setAutor(autor);
		setGenero(genero);
		setEdicao(edicao);
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Autor getAutor() {
		return autor;
	}
	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public int getEdicao() {
		return edicao;
	}
	public void setEdicao(int edicao) {
		this.edicao = edicao;
	}

	public void info() {
		System.out.println("Título do livro: "+titulo);
		System.out.println("Genêro do livro: "+genero);
		System.out.println("Edição do livro: "+edicao);
	}
	//Preferi exibir o autor após as informações do livro
	public void infoA() {
		System.out.println("Nome do Autor: "+autor.getNome());
		System.out.println("Email: "+autor.getEmail());
		System.out.println("Naacionalidade: "+autor.getNacionalidade());
	}
}
