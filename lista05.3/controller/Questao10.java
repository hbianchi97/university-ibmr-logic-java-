package controller;

import util.Teclado;

public class Questao10 {

	/*
	 * Desenvolver um programa que apresente o fatorial de um número informado
	 * pelo usuário.
	 */

	public static void main(String[] args) {
		
		int fatorial, res = 1;
		
		fatorial = Teclado.lerInt("Informe um número: ");
		
		for(int cont = 1; cont <= fatorial; cont++) {
			res = res * cont;
		}

		System.out.println("O fatorial do número inaformado é: "+res);
	}

}
