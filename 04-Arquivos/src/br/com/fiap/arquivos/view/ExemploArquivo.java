package br.com.fiap.arquivos.view;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ExemploArquivo {

	public static void main(String[] args) {
		
		//Criar um objeto que representa um arquivo
		File arquivo = new File("funcionario.csv");
		
		//Validar se o arquivo existe
		if (arquivo.exists()) {
			//Exibir o caminho do arquivo
			System.out.println(arquivo.getAbsolutePath());
			//Exibir o tamanho do arquivo
			System.out.println(arquivo.length() + " bytes");
			//Apagar o arquivo
			arquivo.delete();
		} else {
			try {
				//Criar o arquivo
				arquivo.createNewFile();
				System.out.println("Arquivo criado!");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		try {
			//Escrever no arquivo
			FileWriter output = new FileWriter(arquivo, true);
			//.. igual ao que foi feito
			//Ler do arquivo
			FileReader input = new FileReader(arquivo);
			//.. igual ao que foi feito
			
			input.close();
			output.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}//main
}//class