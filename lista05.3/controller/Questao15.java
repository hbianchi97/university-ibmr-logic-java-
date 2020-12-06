package controller;

import util.Teclado;

public class Questao15 {
	/*
	 * Desenvolver um programa que pergunte o nome e o salário bruto de 10 pessoas,
	 * e exiba nome, valor da alíquota do imposto de renda, e o salário já com o
	 * desconto realizado, sabendo-se que:
	 * Salário Bruto 													Alíquota
	 * Salário menor que R$ 600,00		 								Isento
		Salário entre R$ 600,00 e R$ 1499,99 						10 % do salário bruto
		Salário a partir de R$ 1500,00 								15 % do salário bruto
	 */
	public static void main(String[] args) {
		
		String nome;
		double salario;
		
		System.out.println("-----Calculadora de imposto de renda-----");
		for (int cont = 1; cont <= 10; cont++) {
			nome = Teclado.lerTexto("Digite o nome do funcionario: ");
			salario = Teclado.lerDouble("Digite o valor do salário da pessoa "+cont+":");
			System.out.println("------GERADOR DE CALCULO DE IMPOSTO------");
			System.out.println("Nome: "+nome);
			if(salario < 600) {
				System.out.println("isento do imposto");
			} if(salario <1500) {
				System.out.println("O valor do imposto fica em 10%, logo você receberá apenas: "+(salario-salario*0.10));
			} else {
				System.out.println("O valor do imposto fica em 10%, logo você receberá apenas: "+(salario-salario*0.15));
			}
		}

	}

}
