package controller;

import util.Teclado;

public class Questao10 {

	/*
	 * Fazer um algoritmo que solicite a razão de uma pg (Progressão Geométrica) e o
	 * valor do 1º termo. E apresente o 5º termo da série
	 */

	public static void main(String[] args) {
		
		double inicio, razao, calc1;
		
		inicio = Teclado.lerInt("Gostaria de iniciar com qual número?");
		razao = Teclado.lerInt("Com uma razão de? ");	
		calc1 = inicio * Math.pow(razao, 4);
		
		System.out.println("Iniciando por "+ inicio +" com uma razão de "+ razao +" o quinto termo será de "+ calc1);

	}

}
