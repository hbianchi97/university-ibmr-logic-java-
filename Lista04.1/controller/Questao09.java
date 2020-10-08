package controller;

import util.Teclado;

public class Questao09 {

	/*
	 * Fazer um algoritmo que solicite a razão de uma pa (Progressão Aritmética) e o
	 * valor do 1º termo. E apresente o 10º termo da série
	 */

	public static void main(String[] args) {
		
		int inicio, razao, pa;
		
		inicio = Teclado.lerInt("Deseja começar por qual número?");
		razao = Teclado.lerInt("Com uma razão de: ");
		
		pa = razao * 9 + inicio;
		
		System.out.println("Iniciando por "+ inicio +" com uma razão de "+ razao +" o decimo número dessa progressão será "+ pa);
	}

}
