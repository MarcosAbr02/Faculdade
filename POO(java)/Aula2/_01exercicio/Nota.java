package _01exercicio;

public class Nota {
	float nota1;
	float nota2;
	float nota3;
	
	public float mediaAritmetica() {
		 float media = (nota1+nota2+nota3)/3;
		 return media;
	}
	public float mediaPonderada() {
		float media = (nota1*2+nota2*3+nota3*4)/9;
		return media;
	}
}
