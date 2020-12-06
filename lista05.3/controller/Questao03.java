package controller;

import util.Teclado;

public class Questao03 {

	/*
	 * Desenvolver um programa que apresente os resultados de uma tabuada de um
	 * número qualquer informado pelo usuário.
	 * 
	 */
	public static void main(String[] args) {
		
		int num, cont;
		
		num = Teclado.lerInt("Diga um número o qual você deseja saber a tabuada: ");
		
		for(cont = 1; cont <= 10; cont++) {
			System.out.println(num+" x "+cont+" = "+(num*cont));
		}

	}

}
