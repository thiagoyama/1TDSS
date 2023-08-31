package br.com.fiap.arquivos.view;

import java.io.File;
import java.io.IOException;

public class ExemploDiretorio {
	
	public static void main(String[] args) {
		
		//Criar um objeto que representa um diretório
		File pasta = new File("empresa");
		
		//Validar se o diretório existe
		if (pasta.exists()) {
			//Exibir o caminho do diretório
			System.out.println(pasta.getAbsolutePath());
			
			//Renomear o diretorio para "departamento"
			pasta.renameTo(new File("departamento"));
			
			//Criar um arquivo "orcamento.csv" dentro do diretório departamento
			File arquivo = new File(pasta, "orcamento.csv");
			if (!arquivo.exists()) {
				try {
					arquivo.createNewFile();
					System.out.println("Arquivo criado!");
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}else {
			//Se não existir, criar o diretório
			pasta.mkdir();
			System.out.println("Diretório criado!");
		}
		
	}//main
}//class