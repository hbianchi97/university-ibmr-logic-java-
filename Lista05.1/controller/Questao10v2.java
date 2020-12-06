package controller;

public class Questao10v2 {

	public static void main(String[] args) {
		
		int cont = 0;
		int acumulador = 1;

		while (cont <= 15) {
			System.out.println("3 elevado a "+cont+" = "+acumulador);
			acumulador *= 3;
			cont++;
		}
		
	}

}
