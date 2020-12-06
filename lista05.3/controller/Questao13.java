package controller;

import util.Teclado;

public class Questao13 {
	/*
	 * Sabendo-se que uma Polegada equivale a 2,54 centímetros, desenvolver um
	 * programa que exiba uma tabela de conversões de polegadas para centímetros, de
	 * 1 polegada até um valor inteiro de polegada inserido pelo usuário.
	 */
	public static void main(String[] args) {
		
		double valor;
		
		System.out.println("----Tabela de conversões----");
		System.out.println("1 polegada = 2,54");
		System.out.println("2 polegada = "+(2*2.54));
		System.out.println("3 polegada = "+(3*2.54));
		System.out.println("5 polegada = "+(5*2.54));
		System.out.println("10 polegada = "+(10*2.54));
		System.out.println("15 polegada = "+(15*2.54));
		
		valor = Teclado.lerDouble("Digite um número de polegadas e irei entregar em centímetro: ");
		
		for(int cont = 1; cont <= valor; cont++) {
			System.out.println(cont+" polegada é igual a : "+(cont*2.54));
		}
	}

}
