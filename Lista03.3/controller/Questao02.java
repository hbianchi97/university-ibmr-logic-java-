package controller;

import util.Teclado;

public class Questao02 {

	/*
	 * Desenvolver um programa que calcule o salário líquido de um professor. Para
	 * elaborar o programa, é necessário possuir alguns dados, tais como: Valor da
	 * hora aula, número de horas trabalhadas no mês e percentual de desconto do
	 * INSS.
	 */
	public static void main(String[] args) {

		double horaAula, hora, inss, salario, desconto, salarioReal;
		
		horaAula = Teclado.lerDouble("Qual o preço da hora aula de determinado professor? ");
		hora = Teclado.lerDouble("Quantas horas ele(a) trabalhou no mês? ");
		inss = Teclado.lerDouble("Qual o percentual do INSS aplicado? ");
		salario = horaAula * hora;
		desconto = salario * inss / 100;
		salarioReal = salario - desconto;
		System.out.println("Trabalhando "+ hora +" horas no mês e recebendo R$"+ horaAula +" hora x aula com os descontos receberá "+ salarioReal);
		
	}

}
