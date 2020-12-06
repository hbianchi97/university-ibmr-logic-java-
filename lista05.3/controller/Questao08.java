package controller;

import util.Teclado;

public class Questao08 {
	/*
	 * Desenvolver um programa que pergunte 20 vezes o nome inteiro de uma pessoa,
	 * sexo e idade, e exiba o nome inteiro das pessoas que são do sexo masculino e
	 * possuem 21 anos ou mais.
	 */
	public static void main(String[] args) {

		int idade;
		String sexo, nome;
		
		for(int cont = 1; cont <=20; cont++) {
		System.out.println("======Gerador de ficha cadastral========");
		nome = Teclado.lerTexto("Qual seu nome? ");
		idade = Teclado.lerInt("Qual a sua idade? ");
		sexo = Teclado.lerTexto("Qual o seu sexo?(m ou f) ");

		if ((sexo.contentEquals("m")) && (idade >= 21)) {
			System.out.println("=======Ficha cadastral=======");
			System.out.println(nome);
			System.out.println(idade);
			System.out.println(sexo);
		}
		}

	}

}
