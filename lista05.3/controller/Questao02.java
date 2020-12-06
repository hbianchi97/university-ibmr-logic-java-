package controller;

import util.Teclado;

public class Questao02 {

	/*
	 * Desenvolver um programa que apresente o total da soma de n números inteiros
	 * do número 1 até n, onde n é um valor informado pelo usuário.
	 */

	public static void main(String[] args) {
		
		int a, b, aux = 0;
		
		b = Teclado.lerInt("Diga um número qualquer: ");
		
		for(a = 1; a <= b; a++) {
			aux = aux + a;	
		}
		
		System.out.println("a soma de todos os valores anteriores é "+aux);

	}

}
