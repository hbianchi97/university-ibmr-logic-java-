package controller;

public class Questao08 {

	/*
	 * Desenvolver um programa que apresente todos os valores numéricos inteiros
	 * ímpares situados na faixa de 0 a 20. Para saber se o número é ímpar, será
	 * necessário verificar essa condição com o comando if. Sendo ímpar, mostre-o;
	 * não sendo, passe para o próximo passo.
	 * 
	 */
	public static void main(String[] args) {

		int num1;
		num1 = 1;
		while(num1 < 20) {
			num1++;
				if (num1 % 2 == 1)
					System.out.println(num1);
		}
	}

}
