package controller;

import util.Teclado;

public class Questao06 {

	/*
	 * Fazer um algoritmo que pergunte dois valores a e b, efetue a troca dos
	 * valores, de forma que a variável a passe a possuir o valor da variável b, e
	 * que a variável b passe a possuir o valor da variável a, e apresente os
	 * valores trocados.
	 */

	public static void main(String[] args) {

		int a, b, aux;
		
		a = Teclado.lerInt("Informe um valor para a: ");
		b = Teclado.lerInt("Informe um valor para b: ");
		
		aux = a;
		a = b;
		b = aux;
		
		System.out.println("Valor de a: " +a);
		System.out.println("Valor de b: "+ b);
		
	}
}
