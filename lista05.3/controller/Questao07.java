package controller;

public class Questao07 {

	/*
	 * Desenvolver um programa que apresente no final a soma dos valores pares
	 * existentes na faixa de 3 até 21
	 */

	public static void main(String[] args) {
		
		int a,aux = 0;
		
		for(a=3; a<= 21; a++) {
			if(a%2==0) {
				aux = aux + a;
			}
		}
		System.out.println("A soma dos valores pares é "+aux);
		
	}

}
