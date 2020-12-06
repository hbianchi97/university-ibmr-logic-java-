package controller;

public class Questao13 {
	
	/*
	 * Desenvolver um programa que imprima a tabuada de 3 a 6
	 */

	public static void main(String[] args) {
		
		int cont, b=3;
		
		while(b<=6) {
			cont = 0;
		while(cont<=10) {
			System.out.println(cont+" x "+b+" = "+(cont*b));
			cont++;
		}
		b++;
		}
		
	}
}