package controller;

import util.Teclado;

public class Questao01 {

	/*
	 * Desenvolver um programa que pergunte um número. Se este número for maior que
	 * 20, então ele deverá exibir a metade deste número, senão, ele deverá exibir o
	 * número sem alterações.
	 */

	public static void main(String[] args) {
		
		int num1, res;
		
		num1 = Teclado.lerInt("Diga um número: ");
		
		if (num1 > 20) {
			res = num1 / 2;
			System.out.println("Sua resposta é: "+ res);
		} else {
			System.out.println("Sua resposta é: "+ num1);
		}
		
		
		
	}

}
