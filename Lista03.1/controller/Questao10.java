package controller;

import util.Teclado;

public class Questao10 {

	
	public static void main(String[] args) {
		
		double prestacao, valor, taxa, tempoDias;
		
		valor = Teclado.lerDouble("Sou uma calculadora de juros, qual o valor da sua prestação? ");
		taxa = Teclado.lerDouble("De quanto é a taxa da loja? ");
		tempoDias = Teclado.lerDouble("Seu atraso é de quantos dias? ");
		
		prestacao = valor + (valor * (taxa / 100) * tempoDias);
		
		System.out.println("O valor da prestação acrscida do juros do mês, ficaria em R$"+ prestacao);

	}

}
