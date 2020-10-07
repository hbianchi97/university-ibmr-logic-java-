package controller;

import util.Teclado;

public class Questao02 {
	
	public static void main(String[] args) {
	
		int valor1, valor2, valor3, valor4, resultado1, resultado2;
		
		valor1 = Teclado.lerInt("Me dê um valor real: ");
		valor2 = Teclado.lerInt("Me dê outro valor real: ");
		valor3 = Teclado.lerInt("Me dê outro valor real: ");
		valor4 = Teclado.lerInt("Me dê outro valor real: ");
		
		resultado1 = valor1 + valor2;
		resultado2 = valor3 * valor4;
		
		System.out.println("A soma entre " + valor1 + " + " + valor2 + " = " + resultado1);
		System.out.println("A multiplicação entre " + valor3 + " x " + valor4 + " = " + resultado2);
	}
}
