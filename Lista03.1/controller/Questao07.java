package controller;

import util.Teclado;

public class Questao07 {
	
	
	public static void main(String[] args) {
		
		int num1, num2, num3, resultado;
		
		num1 = Teclado.lerInt("Digite um número: ");
		num2 = Teclado.lerInt("Digite outro número: ");
		num3 = Teclado.lerInt("Digite mais um número: ");
		
		resultado = (num1 + num2 + num3) / 3;
		
		System.out.println("Uma média arítmética entre os pontos "+ num1 +", "+ num2 +", "+ num3 +" é igual a "+ resultado);
		
	}

}
