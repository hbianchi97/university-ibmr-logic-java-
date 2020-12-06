package controller;

import util.Teclado;

public class Questao04 {

	/*
	 * Desenvolver um programa que apresente os resultados de uma tabuada de um
	 * número n qualquer a ser perguntado ao usuário (n x 1, n x 2, n x 3, ... , n x
	 * 9, n x 10) 
	 */
	
	public static void main(String[] args) {
		
		int a, b = 1;
		
		a = Teclado.lerInt("Diga um núumero o qual deseja saber a tabuada");
		
		do {
			System.out.println(a + " x " + b +" = "+ (a*b));
			b++;
		} while(b <= 10);
		

	}

}
