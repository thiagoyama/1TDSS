package br.com.fiap.arquivos.exercicio;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Exercicio02 {

	public static void main(String[] args) {
		try {
			//Ler o arquivo
			FileReader input = new FileReader("soma.csv");
			BufferedReader arqLeitura = new BufferedReader(input);
			
			//Objeto para escrever no arquivo
			FileWriter output = new FileWriter("soma-resultado.csv");
			PrintWriter arqEscrita = new PrintWriter(output);
			
			String linha;
			while ((linha = arqLeitura.readLine())!=null) {
				//Obter os números
				//Recupera do começo da string até a ,
				String n1 = linha.substring(0, linha.indexOf(","));
				//Recupera depois da , até o final
				String n2 =	linha.substring(linha.indexOf(",") + 1);	
				//Somar e gravar no arquivo de destino
				int soma = Integer.parseInt(n1) + Integer.parseInt(n2);
				arqEscrita.println(linha + "," + soma);
			}
			//Fechar os recursos
			output.close();
			arqEscrita.close();
			input.close();
			arqLeitura.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}//main
}//class