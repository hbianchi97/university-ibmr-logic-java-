package controller;

import util.Teclado;

public class Questao09 {
	/*
	 * Desenvolver um programa que pergunte um número inteiro e exiba os números que
	 * são, ao mesmo tempo, múltiplos de 3 e 5, na sequência de 1 até o número
	 * informado pelo usuário.
	 */
	public static void main(String[] args) {

		int res, resto3, resto5;
		
		res = Teclado.lerInt("Diga um número inteiro: ");
		
		for(int cont = 1; cont <= res; cont++) {
			resto3 = cont % 3;
			resto5 = cont % 5;
			if((resto3==0)&&(resto5==0)) {
				System.out.println(cont+" é multiplo 3 e 5 ao mesmo tempo");
			}
		
		}
	}

}
