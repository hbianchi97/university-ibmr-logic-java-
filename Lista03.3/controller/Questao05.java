package controller;

import util.Teclado;

public class Questao05 {

	/*
	 * Fazer um algoritmo que calcule e apresente o valor do volume de uma lata de
	 * óleo, utilizando a fórmula v = 𝝅𝒓 𝟐𝒉 . Onde v=Volume, 
	 * 𝝅 = 𝟑.𝟏𝟒𝟏𝟓𝟗𝟐𝟔𝟓, r = raio e h = altura.
	 */

	public static void main(String[] args) {
		double raio, altura, calc;
		
		raio = Teclado.lerDouble("Qual o raio da lata: ");
		altura = Teclado.lerDouble("Qual a altura? ");
		
		calc = Math.PI * Math.pow(raio, 2) * altura;
		
		System.out.println("O volume da lata é de "+ calc);
	}

}
