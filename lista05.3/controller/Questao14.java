package controller;

import util.Teclado;

public class Questao14 {
	/*
	 * Desenvolver um programa que pergunte nome, nota1 e nota2 de cada um dos 15
	 * alunos de uma turma. E exiba a listagem contendo nome, nota1, nota2, média e
	 * apresente “APROVADO” se a média for maior ou igual a 5, e “REPROVADO” se a
	 * média for menor que 5. Ao final, exibir também a média da turma.
	 */
	public static void main(String[] args) {
		
		String nome;
		int nota1, nota2, media, mediaTotal = 0;
		
		for(int cont = 1; cont <= 15; cont++) {
			nome = Teclado.lerTexto("Diga o nome do aluno "+cont+":");
			nota1 = Teclado.lerInt("Diga a primeira nota do aluno: ");
			nota2 = Teclado.lerInt("Diga a segunda nota do aluno: ");
			media = (nota1 + nota2) / 2;
			mediaTotal = mediaTotal + media;
			if(media >= 5 ) {
				System.out.println("Parabéns o aluno "+nome+ " foi APROVADO!");
			} else {
				System.out.println("O aluno "+nome+ " foi REPROVADO!");
			}
		}
		mediaTotal = mediaTotal / 15;
		System.out.println("A média da turma ficou em: "+mediaTotal);
		
	}
}
