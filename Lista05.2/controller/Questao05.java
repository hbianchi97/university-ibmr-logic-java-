package controller;

public class Questao05 {

	/*
	 * Desenvolver um programa que apresente todos os números divisíveis por 4 que sejam menores que 20.
	 */
	
	public static void main(String[] args) {
		
		int num = 1;
		
		do  {
			if (num % 4 == 0) {
				System.out.println(num);
			}
			num++;
		} while (num < 20);

	}

}
