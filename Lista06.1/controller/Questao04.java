package controller;

import util.Teclado;

public class Questao04 {

	/*
	 * Desenvolver um programa que pergunte a sigla do estado onde a pessoa reside,
	 * e apresente uma das seguintes alternativas como resposta: Carioca, Paulista,
	 * Mineiro, Outros Estados.
	 */

	public static void main(String[] args) {

		String estado;
		
		estado = Teclado.lerTexto("Diga o estado onde reside");
		
		switch(estado) {
		case "rj":
		case "RJ":
		case "Rj":
			System.out.println("Você é carioca!");
		break;
		case "sp":
		case "SP":
		case "Sp":
			System.out.println("Vocẽ é paulista");
		break;
		case "mg":
		case "Mg":
		case "MG":
			System.out.println("Você é mineiro");
		break;
		default:
			System.out.println("Você é qualquer outra coisa aí");
		break;
		}

	}

}
