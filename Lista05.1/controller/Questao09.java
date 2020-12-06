package controller;

public class Questao09 {

	/*
	 * Elaborar um programa que apresente no final a soma dos valores pares
	 * existentes na faixa de 0 até 500. Utilize um laço que efetue a variação de 2
	 * em 2.
	 */
	public static void main(String[] args) {

		int num1, amz;
		
		num1 = 1;
		amz = num1;
		
		while (num1 <= 500) {
			if(num1 % 2 ==0) {
				System.out.println(num1);
				amz = amz + num1;
			}
		}
		System.out.println("A soma será de: "+amz);
	}

}
