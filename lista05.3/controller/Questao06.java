package controller;

import util.Teclado;

public class Questao06 {

	/*
	 * Desenvolver um programa que apresente o valor de uma potência de uma base
	 * qualquer elevada a um expoente qualquer, ou seja, de b e , onde os valores de
	 * b e e são fornecidos pelo usuário, sem utilizar Math.pow().
	 * 
	 */

	public static void main(String[] args) {
		
		int a, b, aux = 1;
		
		a = Teclado.lerInt("Diga a base da potência: ");
		
		b = Teclado.lerInt("Agora diga o expoente: ");
		
		for(int cont = 1; cont <= b; cont++) {
			aux = aux * a;	
		};
		System.out.println("De acordo com minhas contas a resposta é: "+a+" elevado a " +b+" é igual a " +aux);
	}

}
