package controller;

import util.Teclado;

public class Questao14 {
	/*
	 * Desenvolver um programa que pergunte os valores de um vetor a com 15
	 * elementos, construa um vetor b de mesmo tipo, sendo que cada elemento do
	 * vetor b deve ser o fatorial do elemento correspondente no vetor a. Apresentar
	 * como resposta todo o conteúdo do vetor b.
	 * 
	 */
	public static void main(String[] args) {
		
		int a[] = new int[15];
		int b[] = new int[15];
		int fatorial = 1;

		for(int cont = 0; cont < 15 ; cont++) {
			a[cont] = Teclado.lerInt("Informe um valor para a posição "+cont+" do vetor");
			for(int contA = 1; contA <= a[cont]; contA++) {
				fatorial= fatorial * contA;
			}
			b[cont] = fatorial;
			fatorial = 1;
		}
		System.out.print("Os valores do primeiro vetor em fatorial ficaria: ");
		for(int cont = 0; cont < 15 ; cont++) {
			System.out.print(b[cont]+" ");
		}
	}

}
