package controller;

import util.Teclado;

public class Questao02 {
	/*
	 * Desenvolver um programa que pergunte cinco elementos de um vetor a. No final,
	 * apresente a soma de todos os elementos deste vetor.
	 */
	public static void main(String[] args) {
		
		int num[] = new int [5];
		int res = 0;
		
		for(int cont = 0; cont <5; cont++) {
			num[cont] = Teclado.lerInt("Diga um número: ");
			res = res + num[cont];
		}
		
		System.out.println("A soma dos valores é: "+res);

	}

}
