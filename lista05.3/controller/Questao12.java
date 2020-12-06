package controller;

public class Questao12 {
	/*
	 * Agora faça uma alteração para que sejam apresentados somente os itens acima
	 * da diagonal principal da matriz anterior. No lugar que não é para exibir a
	 * triangulação, deverá aparecer x-x. Deverá aparecer como resposta algo assim
	 * na tela
	 * 
	 * Triangulação de matriz de ordem 10, acima da diagonal principal.
		x-x 1-2 1-3 1-4 1-5 1-6 1-7 1-8 1-9 1-10
		x-x x-x 2-3 2-4 2-5 2-6 2-7 2-8 2-9 2-10
		x-x x-x x-x 3-4 3-5 3-6 3-7 3-8 3-9 3-10
		x-x x-x x-x x-x 4-5 4-6 4-7 4-8 4-9 4-10
		x-x x-x x-x x-x x-x 5-6 5-7 5-8 5-9 5-10
		x-x x-x x-x x-x x-x x-x 6-7 6-8 6-9 6-10
		x-x x-x x-x x-x x-x x-x x-x 7-8 7-9 7-10
		x-x x-x x-x x-x x-x x-x x-x x-x 8-9 8-10
		x-x x-x x-x x-x x-x x-x x-x x-x x-x 9-10
		x-x x-x x-x x-x x-x x-x x-x x-x x-x x-x

	 */
	public static void main(String[] args) {
		
		for(int contA = 1; contA <= 10; contA++) {
			System.out.println("");
			for(int contB= 1; contB <= 10; contB++) {
				if(contA >= contB) {
					System.out.print("x-x ");
				} else {
					System.out.print(contA+"-"+contB+" ");
				}
			}
		}
	}

}
