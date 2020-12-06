package controller;

import util.Teclado;

public class Questao09 {

	/*
	 * Desenvolver um programa que leia 10 nomes de pessoas e armazene no vetor nomes. Em seguida o programa
		deve informar que enquanto o usuário responder SIM, será pedido que ele digite um nome e o programa
		informará se este nome existe ou não no vetor nomes. Em resumo, o programa deverá fazer o seguinte:
		 Solicitar 10 nomes para preencher o vetor nomes
		 Perguntar se o usuário quer fazer uma pesquisa de nomes no vetor nomes.
		 Se a resposta for SIM, perguntar qual o nome.
		 Informar se o nome existe ou não no vetor nomes.
	 */
	public static void main(String[] args) {
		
		String nome[] = new String [10];
		String res, pesquisarNome;
		int totalEncontrados = 0;
		
		for(int cont = 0; cont < 10; cont++) {
			nome[cont]=Teclado.lerTexto("Digite um nome para preencher o vetor: ");
		}
		
		do {
			res = Teclado.lerTexto("Deseja pesquisar um nome no vetor de nomes? (s ou n)");
			
			if (res.equals("s")) {
				pesquisarNome = Teclado.lerTexto("Qual o nome a ser pesquisado? ");
				
				for(int cont = 0; cont < 10; cont++) {
					if(pesquisarNome.equals(nome[cont])) {
						System.out.println("O nome foi encontrado na posição "+cont);
						totalEncontrados++;
					} if(totalEncontrados == 0) {
			
					}
				}
				} else {
					System.out.println("Obrigado, fim do programa.");
					System.exit(0);
				}
			totalEncontrados = 0;
			} while (res.equals("s"));
		} 
}