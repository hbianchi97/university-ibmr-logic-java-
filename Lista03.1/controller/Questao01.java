package controller;

import util.Teclado;

public class Questao01 {

	public static void main(String[] args) {
		
		String nome, sexo;
		
		nome = Teclado.lerTexto("Informe o nome: ");
		sexo = Teclado.lerTexto("Informe o sexo: ");
		
		System.out.println("Nome: " + nome + " do sexo: " +sexo);

	}

}
