package controller;

public class Questao14 {

	/*
	 * Desenvolver um programa que calcule o fatorial do número 5, ou seja, 5!.
	 * Desta forma, temos que 5! = 5 . 4 . 3 . 2 . 1 ou 5! = 1 . 2 . 3 . 4 . 5,
	 * equivalente a 120.
	 */

	public static void main(String[] args) {
		
		int fatorial =1, cont =1;
		
		while (cont <= 5) {
			fatorial = fatorial * cont;
			cont++;
		}
		
		System.out.println("Fatorial de 5 é "+fatorial);
		

	}

}
