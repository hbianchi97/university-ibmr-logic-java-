package controller;

import util.Teclado;

public class Questao13 {
	/*
	 * Desenvolver um programa que armazene nome e salário de 20 pessoas, calcule e
	 * armazene o novo salário sabendo-se que houve um reajuste de 8%. Exibir uma
	 * listagem numerada com nome e novo salário.
	 */
	public static void main(String[] args) {
		
		String nome[] = new String[20];
		double salario[] = new double [20];
		String res;
		
		for(int cont = 0; cont < 2; cont++) {
			nome[cont] = Teclado.lerTexto("Diga o nome do funcionario "+cont+":");
			salario[cont] = Teclado.lerDouble("Agora diga o salario referente ao mesmo: ");
		}
		
		res = Teclado.lerTexto("Deseja receber a listagem de reajuste? (s ou n)");
		
		if(res.equals("s")) {
			for(int cont = 0; cont < 2; cont++) {
				System.out.println("-------Funcionário "+(cont+1)+"-------");
				System.out.println("Nomee: "+nome[cont]);
				System.out.println("Salário: R$"+(salario[cont]*1.08));
		}

	}
	}
}
