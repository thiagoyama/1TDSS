package br.com.fiap.tds.view;

public class TesteString {
	
	public static void main(String[] args) {
		
		//\t -> tabulacao \" -> exibe as " \n -> quebra de linha
		System.out.println("\t\"Análise de Sistemas\" \n\tFIAP");
		
		//Declarar uma variavel para armzenar um nome
		String nome = "Gondo";
		
		//Cria uma nova String e associa a variavel nome
		//nome = nome + " Eduardo"; 
		
		String nome2 = "Gondo";
		
		//Colocar o nome completo
		nome2 += " Eduardo";  //nome2 = nome2 + "Eduardo";
		System.out.println(nome2);
		
		//Concaternar com o método .concat
		nome = nome.concat(" eduardo");
		System.out.println(nome);
		
		//Comparar duas strings SEMPRE UTILIZAR .equals()
		//Compara duas strings sem diferenciar maiusculas das minusculas
		if (nome.equalsIgnoreCase(nome2)) {
			System.out.println("Nomes são iguais!");
		} else {
			System.out.println("Nomes são diferentes!");
		}
		
		//Compara duas strings diferenciado maiusculas das minusculas
		if (nome.equals(nome2)) {
			System.out.println("Nomes são iguais!");
		} else {
			System.out.println("Nomes são diferentes!");
		}
		
	}//main
}//classe