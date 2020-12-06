package controller;

public class Questao05 {

	/*
	 * Desenvolver um programa que apresente as potências de 2, variando de 0 a 10
	 */
	public static void main (String[] args ) {
		
		int cont;
		
		for (cont = 1; cont <= 10; cont++) {
			System.out.println("2 elevado a "+cont+" = "+(Math.pow(2, cont)));
		}
	}
	
}
