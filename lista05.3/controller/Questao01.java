package controller;

public class Questao01 {
	/*
	 * Desenvolver um programa que apresente todos os valores numéricos inteiros
	 * ímpares situados na faixa de 1000 a 1500.
	 */
	public static void main(String[] args) {
		int a;
		
		for(a = 1000; a <= 1500; a++) {
			if (a % 2 == 1) {
			System.out.println(a);
		};
		}
	}

}
