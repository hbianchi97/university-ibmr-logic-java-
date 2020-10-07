package controller;

import util.Teclado;

public class Questao03 {

	/*
	 * Fazer um programa que pergunte dois valores reais e apresente o primeiro com
	 * acréscimo de 30% e o segundo com desconto de 25%
	 */

	public static void main(String[] args) {
		
		double valor1, valor2, calc1, calc2;
		
		valor1 = Teclado.lerDouble("Diga um valor real: ");
		valor2 = Teclado.lerDouble("Diga outro valor real: ");
		calc1 = valor1 +(valor1 * 30 / 100);
		calc2 = valor2 -(valor2 * 25 / 100);
		System.out.println("O primmeiro com acrescimo fica R$"+ calc1 +" e o segundo com desconto R$"+ calc2);
		

	}

}
