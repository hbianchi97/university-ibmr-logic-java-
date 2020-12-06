package controller;

import util.Teclado;

public class Questao03 {

	/*
	 * Desenvolver um programa que pergunte cinco elementos de um vetor a. No final,
	 * apresente a soma de todos os elementos que sejam ímpares.
	 */
	public static void main(String[] args) {
		
		int num[] = new int [5];
		int res = 0;
		
		for(int cont = 0; cont < 5; cont++) {
			num[cont] = Teclado.lerInt("Diga um número qualquer: ");
			if (num[cont] % 2 == 1) {
				res = res + num[cont];
			}
		}
		System.out.println("A soma dos números ímpares são: "+res);
		

	}

}
