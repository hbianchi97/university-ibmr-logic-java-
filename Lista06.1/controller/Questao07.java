package controller;

import util.Teclado;

public class Questao07 {

	/*
	 * Elabore um programa que pergunte dois números e também qual operação a ser
	 * realizada com estes dois números de acordo com a tabela abaixo (esta tabela
	 * deve aparecer como menu de escolha para o usuário). Caso o usuário digite um
	 * código que não esteja na tabela, informar que o código inserido está errado
	 * Código Operação
		a 		Média aritmética entre os números digitados
		b 		Diferença do maior pelo menor
		c 		Produto entre os números digitados
		d 		Divisão do primeiro pelo segundo
	 */
	
	public static void main(String[] args) {
		
		int num1, num2;
		String op;
		
		num1 = Teclado.lerInt("Digite o primeiro operador: ");
		num2 = Teclado.lerInt("Digite o segundo operador");
		
		System.out.println("=========================");
		System.out.println("Código    Operação");
		System.out.println("a 		Média aritmética entre os números digitados");
		System.out.println("b 		Diferença do maior pelo menor");
		System.out.println("c 		Produto entre os números digitados");
		System.out.println("d 		Divisão do primeiro pelo segundo");
		
		op = Teclado.lerTexto("Qual o código da operação a qual deseja realizar?: ");
		
		switch(op) {
		case "a":
			System.out.println("A média entre eles é igual a: "+((num1+num2)/2));
			break;
		case "b":
			if(num1>num2) {
				System.out.println("A diferença entré o maior e o menor é de: "+(num1-num2));
			} else {
				System.out.println("A diferença entré o maior e o menor é de: "+(num2-num1));
			}
			break;
		case "c":
			System.out.println("O produto entre os dois números digtados é: "+(num1*num2));
			break;
		case "d":
			System.out.println("A divisão entre eles é de: "+(num1/num2));
			break;
		default:
			System.out.println("Código incorreto digite novamente");
			break;
		}

	}

}
