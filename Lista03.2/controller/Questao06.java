package controller;

import util.Teclado;

public class Questao06 {
	
	
	public static void main(String[] args) {
		
		double celsius, fire;
		
		fire = Teclado.lerDouble("Dê uma temperatura em graus fahrenheit: ");
		
		celsius = (fire - 32) * 5 / 9;
		
		System.out.println("A temperatura em graus celsius é de " + celsius);
		
	}

}
