package br.com.fiap.arquivos.view;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

public class ExemploEscrita {

	public static void main(String[] args) {
		try {
			//Criar o outputstream
			FileWriter outputstream = new FileWriter("churros.txt", true);
			//Objeto para escrever em um arquivo
			PrintWriter arquivo = new PrintWriter(outputstream);
			
			//Escrever no arquivo
			//arquivo.println("Churros de Doce de Leite, R$5,00");
			//arquivo.println("Churros de Chocolate, R$4,00");
			int op;
			do {
				//Pedir para o usuario o texto que será gravado no arquivo
				arquivo.println(JOptionPane.showInputDialog("Digite o que será gravado no arquivo"));
				op = Integer.parseInt(JOptionPane.showInputDialog("1 - Adicionar novamente, 2 - Finalizar"));
			} while(op == 1);
			
			//Fechar os recursos abertos
			arquivo.close();
			outputstream.close();
			
			System.out.println("Escreveu no arquivo!");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}//main	
}//class