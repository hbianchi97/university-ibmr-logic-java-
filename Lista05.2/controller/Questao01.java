package controller;

public class Questao01 {

	/*
	 * Desenvolver um programa que apresente todos os valores numéricos inteiros
	 * pares situados na faixa de 100 a 200.
	 */

	public static void main(String[] args) {
		
		int a= 100, b= 200;
		
		do {
			if(a % 2 == 0) {
				System.out.println(a);
			}
			a++;
		} while (a <= b);

	}

}
