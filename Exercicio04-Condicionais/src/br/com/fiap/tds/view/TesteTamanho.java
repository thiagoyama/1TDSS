package br.com.fiap.tds.view;

import javax.swing.JOptionPane;

public class TesteTamanho {

	/*
	 * Crie uma classe TesteTamanho em Java que peça o nome, 
	 * a altura e o peso de 2 pessoas e apresente o nome da mais pesada 
	 * e o nome da mais alta.
	 */
	public static void main(String[] args) {
		//Ler o nome, altura e peso da pessoa 1
		String nome1 = JOptionPane.showInputDialog("Digite o nome:");
		float altura1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a altura:"));
		float peso1 = Float.parseFloat(JOptionPane.showInputDialog("Digite o peso:"));
		
		//Ler o nome, altura e peso da pessoa 2
		String nome2 = JOptionPane.showInputDialog("Digite o nome:");
		float altura2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a altura:"));
		float peso2 = Float.parseFloat(JOptionPane.showInputDialog("Digite o peso:"));
		
		//Exibir os dados
		System.out.println(nome1 + " altura: " + altura1 + " peso: " + peso1);
		System.out.println(nome2 + " altura: " + altura2 + " peso: " + peso2);
		
		//Comparar o peso das duas pessoas e apresentar o nome da mais pesada
		if (peso1 > peso2) {
			JOptionPane.showMessageDialog(null, "Mais pesado: " +  nome1);
		} else if (peso2 > peso1) {
			JOptionPane.showMessageDialog(null, "Mais pesado: " + nome2);
		} else {
			JOptionPane.showMessageDialog(null, "Possuem o mesmo peso");
		}
		
		//Comparar a altura das duas pessoas e apresentar o nome da mais alta
		if (altura1 > altura2)
			JOptionPane.showMessageDialog(null, "Mais alto: " + nome1);
		else if (altura1 < altura2)
			JOptionPane.showMessageDialog(null, "Mais alto: " + nome2);
		else
			JOptionPane.showMessageDialog(null, "Possuem a mesma altura");
		
	}//main
}//classe