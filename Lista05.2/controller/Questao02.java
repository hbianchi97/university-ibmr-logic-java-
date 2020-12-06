package controller;

public class Questao02 {

	/*
	 * Desenvolver um programa que apresente no final a soma dos valores pares
	 * existentes na faixa de 0 até 500. Utilize um laço que varie de 2 em 2.
	 */

	public static void main(String[] args) {
		
		int a= 0, b= 500, amz= 0;
		
		do {
			if(a % 2 == 0) {
				System.out.println(a);
				amz = amz + a;
			}
			a++;
			} while(a <= b);
			System.out.println("O valor final é "+amz);
		}

	}