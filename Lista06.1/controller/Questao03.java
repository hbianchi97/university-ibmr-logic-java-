package controller;

import util.Teclado;

public class Questao03 {

	/*
	 * Desenvolver um programa que pergunte um número e informe como resposta se o
	 * número informado é par ou é ímpar.
	 */

	public static void main(String[] args) {

		int num;
		
		num = Teclado.lerInt("Diga um número: ");
		
		switch(num % 2) {
		case 0:
			System.out.println("O número informado é um número par");
		break;
		case 1:
			System.out.println("O número informado é um número impar");
		break;
		}
		
	}

}
