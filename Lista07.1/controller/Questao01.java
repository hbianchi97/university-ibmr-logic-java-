package controller;

import util.Teclado;

public class Questao01 {
	/*
	 * Crie 2 vetores chamados nome e profissao, cada um com 5 elementos. Pergunte
	 * ao usuário o nome e a profissão de 5 pessoas e preencha estes vetores. Ao
	 * final exiba um relatório apontando o nome e a profissão de cada uma das 5
	 * pessoas cadastradas.
	 */
	public static void main(String[] args) {
		
		String nome[] = new String[5];
		String profissao[] = new String[5];
		
		for(int cont = 0; cont < 5; cont++) {
			nome[cont] = Teclado.lerTexto("Diga o nome de um profissional ");
			profissao[cont] = Teclado.lerTexto("Diga a profissão do mesmo ");
		}
		
		System.out.println("======================================");
		
		for(int cont = 0; cont < 5; cont++) {
			System.out.println("=======Ficha "+cont+"========");
			System.out.println("Nome: "+nome[cont]);
			System.out.println("Profissional da área de: "+profissao[cont]);
		}

	}

}
