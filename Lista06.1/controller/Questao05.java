package controller;

import util.Teclado;

public class Questao05 {

	/*
	 * Desenvolver um programa que pergunte um número de 1 a 12, e responda o mês
	 * correspondente ao número, ou se o número não corresponde a nenhum dos 12
	 * meses
	 */
	public static void main(String[] args) {
		
		int mes;
		
		mes = Teclado.lerInt("Diga um número entre 1 e 12");
		
		switch(mes) {
		case 1:
			System.out.println("O mês que representa esse número é Janeiro");
			break;
		case 2:
			System.out.println("O mês que representa esse número é Fevereiro");
			break;
		case 3:
			System.out.println("O mês que representa esse número é Março");
			break;
		case 4:
			System.out.println("O mês que representa esse número é Abril");
			break;
		case 5:
			System.out.println("O mês que representa esse número é Maio");
			break;
		case 6:
			System.out.println("O mês que representa esse número é Junho");
			break;
		case 7:
			System.out.println("O mês que representa esse número é Julho");
			break;
		case 8:
			System.out.println("O mês que representa esse número é Agosto");
			break;
		case 9:
			System.out.println("O mês que representa esse número é Setembro");
			break;
		case 10:
			System.out.println("O mês que representa esse número é Outubro");
			break;
		case 11:
			System.out.println("O mês que representa esse número é Novembro");
			break;
		case 12:
			System.out.println("O mês que representa esse número é Dezembro");
			break;
		default:
			System.out.println("Mês invalido, tente novamente");
			break;
		}

	}

}
