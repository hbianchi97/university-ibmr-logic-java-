package controller;

import util.Teclado;

public class Questao09 {
	

	public static void main(String[] args) {
		
		int num1, quadrado, raizquad;
		
		num1 = Teclado.lerInt("Diga um número inteiro: ");
		
		raizquad = (int) Math.sqrt(num1);
		quadrado = (int) Math.pow(num1, 2);
		
		System.out.println("Esse número ao quadrado fica "+ quadrado + " e a raiz quadrada dele é "+ raizquad);

	}

}
