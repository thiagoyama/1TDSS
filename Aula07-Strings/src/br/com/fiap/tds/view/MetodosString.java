package br.com.fiap.tds.view;

import javax.swing.JOptionPane;

public class MetodosString {

	public static void main(String[] args) {
		//Ler um nome
		String nome = JOptionPane.showInputDialog("Digite um nome");
		
		//Exibir o nome
		System.out.println(nome);
		
		//Validar se o nome começa com "A"
		if (nome.startsWith("A")) {
			System.out.println("O nome começa com \"A\"");
		} else {
			System.out.println("O nome não começa com \"A\"");
		}
		
		//Validar se o nome termina com "Santos"
		if (nome.endsWith("Santos")) {
			System.out.println("O nome termina com \"Santos\"");
		} else {
			System.out.println("O nome não termina com \"Santos\"");
		}
		
		//Exibir a quantidade de caracteres do nome
		System.out.println("O nome possui: " + nome.length() + " caracteres");
		
		//Obter uma letra de uma string dado a posição (começa do 0)
		char letra = nome.charAt(0);
		System.out.println("A primeira letra do nome: " + letra);
		
		//Exibir o nome na vertical
		//for(variável de controle, condição, passo)
		for (int i=0; i < nome.length() ; i++ ) {
			System.out.println("["+i+"]" + nome.charAt(i));
		}
		
		//Exibir a posição da primeira ocorrencia da letra "a" no nome
		//Quando a palavra/letra não é encontrada o método retorna -1
		int posicao = nome.indexOf("a");
		System.out.println("A posição da primeira letra \"a\" no nome é: " + posicao);
		
		//Validar se o nome possui "Silva"
		if (nome.indexOf("Silva") >= 0 ) {
			System.out.println("O nome possui \"Silva\"");
		} else {
			System.out.println("O nome não possui \"Silva\"");
		}
		
		//Validar se um valor está na String
		// equals() -> valida se duas strings são iguais considerando maiusculas e minusculas
		//equalsIgnoreCase() -> valida se duas strings são iguais não diferenciando maiusculas e minusculas
		// "Anderson".equals("Anderson") -> true | "Anderson".equals("Anderson Silva") -> false
		
		//contains() -> valida se uma string está contida em outra string
		// "Anderson".contains("Anderson") -> true | "Anderson".contains("Anderson Silva") -> true
		if (nome.contains("Silva")) {
			System.out.println("O nome possui \"Silva\"");
		} else {
			System.out.println("O nome não possui \"Silva\"");
		}
		
		//Operador ternário (condicao ? se verdadeiro : se falso)
		System.out.println(nome.contains("Silva") ? "O nome possui \"Silva\"" : "O nome não possui \"Silva\"");
		
		//Exibir a posição da última letra "a"
		System.out.println("A posição da última letra \"a\" é: " + nome.lastIndexOf("a"));
		
		//Exibir as 3 primeiras letras do nome 
		//Criar uma nova string a partir de parte de outra string
		String parteNome = nome.substring(0, 3);
		
		System.out.println("As 3 primeiras letras do nome: " + parteNome);
		
		//Exibir as 3 últimas letras do nome
		System.out.println("As 3 últimas letras do nome: " + nome.substring(nome.length() - 3));
		
		//Exibir o primeiro nome da pessoa (substring da posição 0 até a posição do primeiro espaço)
		System.out.println("O primeiro nome da pessoa é: " + nome.substring(0, nome.indexOf(" ")));
		
		//Exibir o último nome da pessoa (substring da posição do último espaço até o final)
		System.out.println("O último nome da pessoa é: " + nome.substring(nome.lastIndexOf(" ") + 1));
		
		//Exibir o nome em maiúsculo
		System.out.println("Nome em maiusculo: " + nome.toUpperCase());
		
		//Exibir o nome em minúsculo
		System.out.println("Nome em minusculo: " + nome.toLowerCase());
		
		System.out.println(nome);
		
		//Validar se o nome possui "Silva" sem considerar maiusculas e minusculas diferentes
		if (nome.toLowerCase().contains("silva")) {
			System.out.println("Possui Silva");
		} else {
			System.out.println("Não possui Silva");
		}
		
		System.out.println(nome.toUpperCase().contains("SILVA")? "Possui Silva" : "Não possui Silva");
		
		//Substituir um caractere/texto por outro
		//Substituir a letra "a" por "u" e exibir o resultado
		System.out.println("Nome com a letra substituida: " + nome.replace("a", "u"));
		
		//Exibir a quantidade de caracteres do nome sem contar os espaços
		//Tira os espaços em branco do nome
		String nomeSemEspaco = nome.replace(" ", "");
		
		System.out.println("A quantidade de caracteres sem espaço é: " + nomeSemEspaco.length());
		System.out.println(nomeSemEspaco);
		
	}//main
}//classe



