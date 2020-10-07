package controller;

import util.Teclado;

public class Questao04 {
	
	public static void main(String[] args) {
		
		int num1, ante, sucess;
		
		num1 = Teclado.lerInt("Digite um número inteiro ");
		
		ante = num1 - 1;
		sucess = num1 + 1;
		
		System.out.println("O número escolhido foi " + num1 + " e seu sucessor é " + sucess + " e atencessor é " 
		+ ante + ".");
		
	}

}
