package controller;

import util.Teclado;

public class Questao03 {

	public static void main(String [] args) {
		
		double real, dolar;
		
		System.out.println("Bom dia, a cotação do dolar no dia 11 de setembro de 2020 é de R$ 5.54");
		
		real = Teclado.lerDouble("Qual o valor em reais você gostaria de converter? ");
		dolar = real * 5.54;
		
		System.out.println("Na cotação do dolar atual você teria U$ " + dolar);
		
		// perguntar sobre como limitar o nómero de casas decimais. Por exemplo, colocar 2 nesse caso.
		
	}
	
}
