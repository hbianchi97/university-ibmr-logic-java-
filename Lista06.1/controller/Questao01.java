package controller;

import util.Teclado;

public class Questao01 {

	/*
	 * Desenvolver um programa que mostre o menu de opções da tabela abaixo e peça o código desejado. Mostre
		como resposta uma mensagem confirmando a escolha do usuário, ou que o número digitado não existe no
		menu de opções.
		Código Opção
		1 Incluir
		2 Alterar
		3 Excluir
		4 Pesquisar
		5 Sair
	 */

	public static void main(String[] args) {
		
		int codigo;
		
		System.out.println("Dadas as opções abaixo escolha uma ação:");
		System.out.println("1 - Incluir");
		System.out.println("2 - Alterar");
		System.out.println("3 - Excluir");
		System.out.println("4 - Pesquisar");
		System.out.println("5 - Sair");
		
		codigo = Teclado.lerInt("Diga qual ação desejada: ");
		
		switch (codigo) {
		case 1:
			System.out.println("Vocẽ escolheu incluir");
		break;
		case 2:
			System.out.println("Você escolheu alterar");
		break;
		case 3:
			System.out.println("Vocẽ escolheu excluir");
		break;
		case 4:
			System.out.println("Você escolheu pesquisar");
		break;
		case 5:
			System.out.println("Você escolheu sair");
		break;
		}
		
	}

}
