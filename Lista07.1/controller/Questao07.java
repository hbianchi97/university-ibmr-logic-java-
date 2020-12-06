package controller;

import util.Teclado;

public class Questao07 {

	/*
	 * Crie um vetor chamado semana com 7 elementos já contendo todos os nomes por
	 * extenso dos dias da semana. Em seguida pergunte ao usuário um número e
	 * apresente o dia correspondente ao número no vetor, ou exiba a mensagem
	 * “Número não corresponde a um dia da semana.”
	 */
	public static void main(String[] args) {
		
		int cont;
		String semana[] = { "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sabado", "Domingo" };
		
		cont = Teclado.lerInt("Digite um número entre 1 e 7, te direi um dia da semana ");
		
		switch(cont) {
		case 1:
			System.out.println("O dia da semana representante será: "+semana[cont - 1]);
			break;
		case 2:
			System.out.println("O dia da semana representante será: "+semana[cont - 1]);
			break;
		case 3:
			System.out.println("O dia da semana representante será: "+semana[cont - 1]);
			break;
		case 4:
			System.out.println("O dia da semana representante será: "+semana[cont - 1]);
			break;
		case 5:
			System.out.println("O dia da semana representante será: "+semana[cont - 1]);
			break;
		case 6:
			System.out.println("O dia da semana representante será: "+semana[cont - 1]);
			break;
		case 7:
			System.out.println("O dia da semana representante será: "+semana[cont - 1]);
			break;
		default:
			System.out.println("Número invalido, tente novemente!");
			break;
		}

	}

}
