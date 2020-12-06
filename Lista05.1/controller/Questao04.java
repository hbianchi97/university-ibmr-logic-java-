package controller;

public class Questao04 {

	/*
	 * Desenvolver um programa que apresente o valor da soma dos cem primeiros
	 * números inteiros (1 + 2 + 3 + 4 + ... + 97 + 98 + 99 + 100)
	 */

	public static void main(String[] args) {
		
		int cont, amz;
		
		cont = 1;
		amz = 0;
		while(cont <= 100) {
			System.out.println(cont);
			
			cont++;
			amz = amz + cont;
			
		}
		
		System.out.println(amz);
	}

}
