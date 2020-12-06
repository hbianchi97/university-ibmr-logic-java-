package controller;

import util.Teclado;

public class Questao15 {
	/*
	 * Desenvolver um programa que leia um vetor a com 15 elementos inteiros.
	 * Construir um vetor b de mesmo tipo, sendo cada um dos elementos do vetor b
	 * ordenados de forma decrescente.
	 */
	public static void main(String[] args) {
		
		int a[] = new int[15];
		int b[] = new int[15];
		String res;
		
		for(int cont = 0; cont < 15;cont++) {
			a[cont] = Teclado.lerInt("Diga o algarismo da posição "+cont+": ");
			b[cont] = a[cont];
		}
		
		res = Teclado.lerTexto("Deseja colocar os algarismos e ordem? (s ou n)");
		
		if(res.equals("s")) {
			for(int x = 0; x < 14;x++) {
				for(int y = x + 1; y < 15; y++) {
					if(b[x] < b[y]) {
						int aux = b[x];
						b[x] = b[y];
						b[y] = aux;
					}
				}
			}
			
			System.out.print("Os algarismos do vetor a: ");
			for(int cont = 0; cont < 15;cont++) {
				System.out.print(a[cont]+" ");
			}
			
			System.out.print("Os algarismos do vetor b: ");
			for(int cont = 0; cont < 15;cont++) {
				System.out.print(b[cont]+" ");
			}
			
		}

	}

}
