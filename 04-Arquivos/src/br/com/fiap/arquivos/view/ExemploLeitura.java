package br.com.fiap.arquivos.view;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExemploLeitura {

	public static void main(String[] args) {
		try {
			//Abrir o fluxo de entrada
			FileReader inputStream = new FileReader("churros.txt");
			//Objeto para ler o arquivo
			BufferedReader arquivo = new BufferedReader(inputStream);
			
			//Variavel para receber cada linha do arquivo
			String linha;
			StringBuffer texto = new StringBuffer();
			//Laço para ler todas as linhas do arquivo
			while ((linha = arquivo.readLine()) != null) {
				texto.append(linha).append("\n");
			}
			System.out.println(texto);
			//Fechar os recursos abertos
			arquivo.close();
			inputStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
	}//main
}//class