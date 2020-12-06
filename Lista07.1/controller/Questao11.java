package controller;

import util.Teclado;

public class Questao11 {
	/*
	 * Crie um vetor a com 10 elementos e pergunte ao usuário 10 números para
	 * preencher este vetor. Ao final, apresente o maior e o menor valor informados,
	 * além da média dos 10 números informados
	 */
	public static void main(String[] args) {
		
		double vetor[] = new double [10];
		double menorValor, maiorValor, soma = 0, media;
		
		for(int cont = 0; cont < 10; cont++) {
			vetor[cont] = Teclado.lerDouble("Diga um número para preencher o vetor: ");
			soma = soma + vetor[cont];
		}
		
		media = soma / 10;
		menorValor = vetor[0];
		maiorValor = vetor[0];
		
		for(int cont = 1; cont < 10; cont++) {
			if(maiorValor < vetor[cont]) {
				maiorValor = vetor[cont];
			}
			if(menorValor > vetor[cont]) {
				menorValor = vetor[cont];
			}
		}
		
		System.out.println("Menor: "+menorValor);
		System.out.println("Maior: "+maiorValor);
		System.out.println("Soma deles é: "+soma);
		System.out.println("Média: "+media);
			
		}

	}


