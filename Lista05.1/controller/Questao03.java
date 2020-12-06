package controller;

public class Questao03 {

	/*
	 * Desenvolver um programa que apresente os quadrados dos números inteiros de 15 a 200
	 */
	
	public static void main(String[] args) {
		
		int cont;
		
		cont = 15;
		
		while(cont <= 200) {
			System.out.println(cont + "Elevado ao quadrado é " +(Math.pow(cont, 2)));
			cont++;
		}

	}

}
