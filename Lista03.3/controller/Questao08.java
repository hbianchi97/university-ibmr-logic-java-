package controller;

import util.Teclado;

public class Questao08 {

	/*
	 * Fazer um algoritmo que pergunte a base e a altura de um retângulo, e
	 * apresente: 
	 * a) O perímetro deste retângulo 
	 * b) A área deste retângulo 
	 * c) A diagonal deste retângulo Eis as fórmulas: 
	 * perímetro = Soma de todos os lados do retângulo. 
	 * área = Base x Altura diagonal 2 = base2 + altura2 ou, se
	 * preferir, diagonal = √(base2 + altura2).
	 */

	public static void main(String[] args) {

		double base, altura, area, diagonal, calc1;
		
		base = Teclado.lerDouble("Qual a base do triangulo: ");
		altura = Teclado.lerDouble("Qual a altura? ");
		area = base * altura;
		diagonal = Math.sqrt(Math.pow(base, 2)+Math.pow(altura, 2));
		calc1 = base * 2 + altura * 2;
		
		System.out.println("Area: "+ area);
		System.out.println("Perímetro: "+ calc1);
		System.out.println("Diagonal: "+ diagonal);
		
	}

}
