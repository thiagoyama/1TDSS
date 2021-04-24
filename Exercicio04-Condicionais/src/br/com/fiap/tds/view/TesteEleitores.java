package br.com.fiap.tds.view;

import javax.swing.JOptionPane;

public class TesteEleitores {
	
	/*
	  Leia a idade de 3 pessoas e informe a sua classe eleitoral:
		• não eleitor (abaixo de 16 anos)
		• eleitor obrigatório (entre 18 e 65 anos)
		• eleitor facultativo (16 , 17 anos ou maior que 65 anos)
	  Ao final da execução exibir o total de eleitores obrigatórios.
	 */
	public static void main(String[] args) {
		
		int qtd = 0;
		
		//Laço de repetição
		//int i = 0;
		//while ( i < 3 ) {
		//	i++;
		for (int i = 0; i < 3; i++) {
			//Ler a idade da pessoa 1
			int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade"));
			
			//Verificar a classe eleitoral
			if (idade < 16) {
				JOptionPane.showMessageDialog(null, "Não eleitor");
			} else if (idade >=18 && idade <=65) {
				JOptionPane.showMessageDialog(null, "Eleitor obrigatório");
				qtd++;
			} else {
				JOptionPane.showMessageDialog(null, "Eleitor facultativo");
			}
		}
		
		//Exibir a quantidade de eleitores obrigatórios
		JOptionPane.showMessageDialog(null, "Eleitores obrigatórios: " + qtd);
		
	}//main
	
}//classe