package controller;

import util.Teclado;

public class Questao10 {

	/*
	 * Crie 3 vetores (nomes, telefones, endereços) e pergunte ao usuário o nome,
	 * telefone e endereço de 5 pessoas. Em seguida peça ao usuário para digitar um
	 * número de 1 a 5, e exibir como resposta os dados da pessoa cadastrada no
	 * número informado.
	 */
	public static void main(String[] args) {
		
		String nome[] = new String [5];
		int telefone[] = new int [5];
		String endereco[] = new String [5];
		String confirm;
		int res;
		
		for(int cont = 0; cont < 5; cont++) {
			nome[cont]=Teclado.lerTexto("Diga o nome do cliente: ");
			telefone[cont]=Teclado.lerInt("Diga o telefone: ");
			endereco[cont]=Teclado.lerTexto("Diga o endereço deste: ");
		}
		
			do {
			confirm = "";
			confirm = Teclado.lerTexto("Deseja realizar uma busca? (s ou n)");
			
			if(confirm.contentEquals("s")) {
			
			res = Teclado.lerInt("Diga o número da ficha o qual deseja informações");
			
		switch(res) {
		
		case 1:
			System.out.println("----FICHA 01----");
			System.out.println("Nome: "+nome[0]);
			System.out.println("Telefone: "+telefone[0]);
			System.out.println("Endereço: "+endereco[0]);
		break;
		case 2:
			System.out.println("----FICHA 02----");
			System.out.println("Nome: "+nome[1]);
			System.out.println("Telefone: "+telefone[1]);
			System.out.println("Endereço: "+endereco[1]);
		break;
		case 3:
			System.out.println("----FICHA 03----");
			System.out.println("Nome: "+nome[2]);
			System.out.println("Telefone: "+telefone[2]);
			System.out.println("Endereço: "+endereco[2]);
		break;
		case 4:
			System.out.println("----FICHA 04----");
			System.out.println("Nome: "+nome[3]);
			System.out.println("Telefone: "+telefone[3]);
			System.out.println("Endereço: "+endereco[3]);
		break;
		case 5:
			System.out.println("----FICHA 05----");
			System.out.println("Nome: "+nome[4]);
			System.out.println("Telefone: "+telefone[4]);
			System.out.println("Endereço: "+endereco[4]);
		break;
			}			
		}
			} while (confirm.equals("s"));
			
			if(confirm.equals("n")) {
				System.out.println("Fim do programa!");
				System.exit(0);
			}
	}
}
