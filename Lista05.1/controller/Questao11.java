package controller;

import util.Teclado;

public class Questao11 {
	/*
	 * Elaborar um programa que apresente o valor de uma potência de uma base
	 * qualquer (Variável b) elevada a um expoente qualquer (Variável e), ou seja,
	 * de b e . (Sem usar Math.pow();)
	 */
	public static void main(String[] args) {

		double b, e;
		double potencia = 1;
		int cont = 1;
		
		b = Teclado.lerInt("Digite um número para a base de potência ");
		e = Teclado.lerInt("Digite um número para o expoente da potência ");
		
		while(cont <= e) {
			potencia = potencia * b;
			
			cont++;			
		}
		System.out.println(b+" elevado a "+e+" é igual a "+potencia);	
		
		}
	}
