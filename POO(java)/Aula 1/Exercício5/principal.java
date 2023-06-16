package Exercício5;

public class principal {

	public static void main(String[] args) {
		conta marcos = new conta();
		conta luigi = new conta();
		
		marcos.correntista="Marcos";
		marcos.saldo=1000;
		marcos.limiteSaque=200;
		
		luigi.correntista="Luigi";
		luigi.saldo=2000;
		luigi.limiteSaque=200;
		
		marcos.transferir(luigi, 150);
		marcos.info();
		luigi.info();
	}
}