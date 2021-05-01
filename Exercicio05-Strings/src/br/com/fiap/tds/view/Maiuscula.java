package br.com.fiap.tds.view;

import javax.swing.JOptionPane;

public class Maiuscula {

	public static void main(String[] args) {
		
		//Ler uma String
		String palavra = JOptionPane.showInputDialog("Digite uma palavra:");
		
		//Transformar em maiúscula
		String palavraMaiscula = palavra.toUpperCase();
		
		//Exibir
		JOptionPane.showMessageDialog(null, palavraMaiscula);
		
	}
	
}
