package controller;

public class Questao03 {

	/*
	 * Desenvolver um programa que apresente o total da soma dos cinco primeiros números inteiros.
	 */
	
	public static void main(String[] args) {
		
		int a = 1, b = 5, aux = 0;
		
		do {
			aux = aux + a;
			a++;
		} while (a <= b);
		
		System.out.println("A soma de 0 a 5 é igual a " +aux);
		
	}

}
