package controller;

import util.Teclado;

public class Questao08 {
	

	public static void main(String[] args) {
		
		double dist, consumo, resultado;
		
		dist = Teclado.lerDouble("Deseja fazer uma viagem de quantos KM? ");
		consumo = Teclado.lerDouble("Qual o consumo médio de seu carro por litro de gasolina? ");
		resultado = dist / consumo;
		
		System.out.println("Se seu carro faz "+ dist +" com um consumo médio de "+ consumo +"L por hora. Sua viagem irá durar " + resultado +" horas. Boa viagem");

	}

}
