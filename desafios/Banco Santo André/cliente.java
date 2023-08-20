
public class cliente {
	public String nome;
	public String cpf;
	public Double divida;
	public int atraso;
	
	public cliente(String nome, String cpf, Double divida, int atraso) {
		this.nome = nome;
		this.cpf = cpf;
		this.divida = divida;
		this.atraso = atraso;
	}
	
	public void info() {
		int sobra = atraso;
		double valorJuros = divida;
		
		if (atraso>=30){
			int vezes = atraso/30;
			for(int i=0; i<vezes;i++) {
				valorJuros*=2.2;
			}
			sobra = atraso%30;
		}
		for(int i=0; i<sobra; i++) {
			valorJuros*=1.02;
		}
		System.out.printf("Nome %s CPF %s%nDivida %.2f Atraso %d%nDivida recalculada: %.2f%n",nome, cpf,divida,atraso,valorJuros);
	}
	}
