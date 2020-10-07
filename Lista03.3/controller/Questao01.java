package controller;

import util.Teclado;

public class Questao01 {

	/*
	 * Elaborar um programa de computador que pergunte ao usuário o valor do Raio de
	 * um círculo e calcule a área do referido círculo, apresentando o resultado
	 * deste cálculo. Obs: A fórmula da área é 𝒂 = 𝝅𝒓 𝟐 . Considere o valor de
	 * 𝝅 = 𝟑. 𝟏𝟒𝟏𝟓𝟗𝟐𝟔𝟓.
	 */

	public static void main(String[] args) {
		
		double area, resultado;
		
		area = Teclado.lerDouble("Diga o raio do cículo desejado, que direi a área");
		resultado = Math.PI * Math.pow(area, 2);
		System.out.println("A área do círculo é "+ resultado);
	}
}
