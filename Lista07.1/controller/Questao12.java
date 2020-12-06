package controller;

import util.Teclado;

public class Questao12 {
	/*
	 * ) Crie dois vetores a e b com 5 elementos cada e preencha-os com números
	 * informados pelo usuário. Ao final apresente os números que existem repetidos
	 * entre os 2 vetores.
	 */
	public static void main(String[] args) {
		
		int a[] = new int [5];
		int b[] = new int [5];
		
		for(int cont = 0; cont < 5; cont++) {
			a[cont] = Teclado.lerInt("preencha o vetor a com valores: ");
			}
	
		for(int cont = 0; cont < 5; cont++) {
			b[cont] = Teclado.lerInt("Preencha o vetor b com valores: ");
			}
		
		System.out.print("Os números repetidos nos 2 vetores são: ");
		
		for(int contA = 0; contA < 5; contA++) {
			for(int contB = 0; contB < 5; contB++) {
				if(a[contA] == b[contB]) {
					System.out.print(a[contA]+" ");
				}
			}
		}
		
		}
	}


