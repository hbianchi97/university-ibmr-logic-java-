package controller;

import util.Teclado;

public class Questao05 {

	public static void main(String[] args) {
		
		double valor1, valor2;
		
		valor1 = Teclado.lerDouble("Sou um gerador de aumento da empresa X, Diga quanto é seu salário atual: ");
		
		valor2 = valor1 * 1.15;
		
		System.out.println("Seu aumento salarial será de 15%, logo seu salário do próximo mês será de R$" + valor2 + " parabéns, pelo aumento");
		
	}
	
}
