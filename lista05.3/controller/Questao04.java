package controller;

public class Questao04 {

	/*
	 * Desenvolver um programa que apresente todos os números divisíveis por 5 que sejam menores que 50.
	 */
	public static void main(String[] args) {
		
		int a;
		
		for(a = 1; a <= 50; a++ ) {
			if(a % 5 == 0) {
				System.out.println(a);
			}
		}
	}
}
