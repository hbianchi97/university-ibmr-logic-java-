package controller;

import util.Teclado;

public class Questao01 {

	/*
	 * Desenvolver um programa que pergunte o valor da conta a ser paga no restaurante e exiba como resposta o
	 * valor com o acréscimo dos 10% da gorjeta do garçom.
	 */
	public static void main(String[] args) {
		
		double valor, total;
		
		valor = Teclado.lerDouble("Informe o valor de sua conta: ");
		total = valor * 1.1;
		
		System.out.println("Sua conta final ficou estimada em R$"+ total);
		
	}

}
