package controller;

import util.Teclado;

public class Questao08 {

	/*
	 * Desenvolver um programa que armazene nome e nota das PR1 e PR2 de 15 alunos,
	 * calcule e armazene a média, armazene também a situação do aluno (AP ou RP).
	 * Exibir ao final uma listagem contendo nomes, notas, médias e situação de cada
	 * aluno.
	 */
	public static void main(String[] args) {
		
		String nome[] = new String [2];
		int nota[] = new int [2];
		
		for(int cont = 0; cont < 2; cont++) {
			nome[cont] = Teclado.lerTexto("Diga o nome do aluno: ");
			nota[cont] = Teclado.lerInt("Agora diga a nota do mesmo: ");
		}
		
		for(int cont = 0; cont < 2; cont++) {
			System.out.println("----SITUAÇÃO DO ALUNO "+(cont+1)+"----");
			System.out.println("nome "+nome[cont]);
			System.out.println("nota "+nota[cont]);
			if(nota[cont] >= 6) {
				System.out.println("situação APROVADO");
			} else {
				System.out.println("situação REPROVADO");
			}
		}

	}

}
