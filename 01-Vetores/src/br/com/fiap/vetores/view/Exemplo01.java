package br.com.fiap.vetores.view;

public class Exemplo01 {

	public static void main(String[] args) {
		
		String[] nomes = new String[5];
		//Definir o nome de 5 carros
		nomes[0] = "Corolla";
		nomes[1] = "Santana";
		nomes[2] = "Corsa";
		nomes[3] = "Civic";
		nomes[4] = "Prisma";
		
		//Exibir o nome dos carros
		for (int i = 0; i < nomes.length ; i++ ) {
			System.out.println(nomes[i]);
		}
		
		//Foreach (for ("Tipo de dado" variavel : vetor)
		for (String item : nomes) {
			System.out.println(item);
		}
		
		//Criar um vetor de notas de cp (10, 8, 7)
		float[] notas = {10, 8, 7};
		System.out.println(notas.length); //3
		
		//Exibir a m�dia de cp
		float media = 0;
		for (int i = 0; i < notas.length; i++) {
			media += notas[i]; //somando todas as notas
		}
		media /= notas.length; //calcula a media
		System.out.println("Media de cp: " + media);
		
		//Exibir as notas com foreach
		for (float valor : notas) {
			System.out.println(valor);
		}
		
	}
}