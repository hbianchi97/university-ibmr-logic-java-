package controller;

import util.Teclado;

public class Questao08 {

	/*
	 * Desenvolver um programa que apresente o valor de uma potência de uma base
	 * qualquer elevada a um expoente qualquer, ou seja, de b e . (Não utilize
	 * Math.pow();)
	 */
	public static void main(String[] args) {
		int a, b, res;
		
		a = Teclado.lerInt("Diga a base da potência ");
		b = Teclado.lerInt("Diga o expoente ");
		
		res = a * (a * b);
		
		System.out.println(res);
	}

}
