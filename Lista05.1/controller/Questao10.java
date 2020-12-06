package controller;

public class Questao10 {

	/*
	 * Desenvolver um programa que apresente as potências de 3 variando de 0 a 15.
	 * Deve ser considerado que qualquer número elevado a zero é 1, e elevado a 1 é
	 * ele próprio. A apresentação deve observar a seguinte exibição na tela:
	 */

	public static void main(String[] args) {
		
		int cont = 0;
		
		while(cont <= 15) {
			System.out.println("3 elevado a "+cont+" = "+(Math.pow(3, cont)));
			cont++;
		}
		
	}

}
