package controller;

import util.Teclado;

public class Questao06 {

	/*
	 * Desenvolver um programa que leia um número n qualquer menor ou igual a 50 e
	 * apresente o valor obtido da multiplicação sucessiva de n por 3 enquanto o
	 * produto for menor que 250. (n x 3; n x 3 x 3; n x 3 x 3 x 3 etc...).
	 * 
	 */

	public static void main(String[] args) {

		int num1, num2;
		
		num1 = Teclado.lerInt("Digite um número menor ou igual a 50 ");
		
		num2 = num1;
		
		if(num1 <= 50 ) {
			while(num2 < 250) {
			System.out.println("Digitou "+num2);
			System.out.println("Então x3 é = "+(num2*3));
			num2 *= 3;
		} 
		} else {
			System.out.println("Digite um número menor que 50!");
		}	
		
		System.out.println("Resultado final é: "+ num2);
	}

}
