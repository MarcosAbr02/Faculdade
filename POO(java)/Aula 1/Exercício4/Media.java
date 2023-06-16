package Exercício4;

public class Media {
	float nota1, nota2, nota3;
	float aritmetica() {
		return (nota1+nota2+nota3)/3;
	}
	float ponderada() {
		return (nota1*2+nota2*3+nota3*4)/9;
	}
}