package br.com.fiap.tds.view;

import javax.swing.JOptionPane;

public class Vogal {

	/*
	 * Crie uma classe teste chamada Vogal que solicite ao usuário uma String e em seguida exiba o 
	 * conteúdo desta String de forma que todas as vogais (a,e,i,o,u) sejam representadas por * 
	 * (asterisco). Por exemplo, se o usuário digitar "cadeira", o programa deverá exibir "c*d**r*".
	 */
	public static void main(String[] args) {
		//Ler uma palavra
		String palavra = JOptionPane.showInputDialog("Digite a palavra:");
		
		String vogais = "aeiou";
		
		//Ocultar as vogais com "*"
		for (int i = 0; i < vogais.length(); i++) {
			palavra = palavra.replace( vogais.charAt(i) , '*');
		}
		
		//Exibir a palavra
		JOptionPane.showMessageDialog(null, palavra);
		
	}
	
}
