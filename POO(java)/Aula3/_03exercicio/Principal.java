package _03exercicio;

public class Principal {

	public static void main(String[] args) {
		Cofrinho c = new Cofrinho();
		
		c.add(new Moeda("Euro",0.5));
		c.add(new Moeda("Euro",1));
		c.add(new Moeda("Euro",0.1));
		c.add(new Moeda("Euro",0.05));
		
		System.out.printf("O total no cofrinho é: %.2f%n",c.calcularTotal());
	}

}
