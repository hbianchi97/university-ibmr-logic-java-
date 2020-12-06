package controller;

import util.Teclado;

public class Questao12 {
	/*
	 * Desenvolver um programa que peça ao usuário para digitar diversos números
	 * reais, e ao final, exibir o maior e o menor número que foram digitados, além
	 * da média entre TODOS os números digitados pelo usuário. A inserção de números
	 * deve parar quando o usuário digitar o número -1, e este número -1 não deve
	 * ser considerado nem como maior, nem como menor, e nem na contagem da média.
	 */
	public static void main(String[] args) {
		
		int num, menor, maior, cont = 1, soma = 0, media;
		
		num = Teclado.lerInt("Digite um número aleatório e digite o -1 para parar a execução.");
		
		maior = num;
		menor = num;
		while(num != -1) {
			if(menor > num) {
				menor = num;
			}
			if(maior < num) {
				maior = num;
			}
			soma = soma + num;
			
			num = Teclado.lerInt("Digite um número aleatório e digite o -1 para parar a execução.");
			
			cont++;
		}
			
			media = soma / (cont -1);
		
			System.out.println("O menor é: "+menor);
			System.out.println("E o maior é: "+maior);
			System.out.println("E a média entre eles é: "+media);
	}

}
