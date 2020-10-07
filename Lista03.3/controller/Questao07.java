package controller;

import util.Teclado;

public class Questao07 {

	/*
	 * Fazer um algoritmo que pergunte os valores dos catetos de um triângulo
	 * retângulo e apresente o valor da hipotenusa. Obs: A fórmula é hipotenusa2 =
	 * cateto12 + cateto22 ou, se preferir, hipotenusa = √( cateto12 + cateto22)
	 */

	public static void main(String[] args) {

		double cateto1, cateto2, hipotenusa;
		
		cateto1 = Teclado.lerDouble("Informe o valor do primeiro cateto: ");
		cateto2 = Teclado.lerDouble("Informe o valor do segundo cateto: ");
		
		hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
		
		System.out.println("A hipotenusa vale: "+ hipotenusa);
		
		
	}

}
