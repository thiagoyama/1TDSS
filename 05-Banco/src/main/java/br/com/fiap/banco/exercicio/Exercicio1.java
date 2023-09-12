package br.com.fiap.banco.exercicio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Exercicio1 {

	//Ler o arquivo alunos.csv e cadastrar no banco
	public static void main(String[] args) {
		try {
			//Abrir a conexão com o banco
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@oracle.fiap.com.br:1521:orcl",
					"pf0392", "fiap");
			
			//Abrir o arquivo
			FileReader input = new FileReader("alunos.csv");
			BufferedReader arquivo = new BufferedReader(input);
			
			String linha;
			arquivo.readLine(); //pular a primeira linha 
			//Ler as linhas do arquivo
			while ((linha = arquivo.readLine()) != null) {
				//Recupera os valores da linha separando pela ,
				String[] valores = linha.split(",");
				//Faz o insert no banco
				Statement stm = conn.createStatement();
				stm.executeUpdate("insert into tb_aluno (nr_rm, "
						+ "nm_aluno, st_ativo, vl_nota1, vl_nota2) "
						+ "values ("+ valores[0] + ",'" + valores[1] +"', "
						+ (valores[2].equalsIgnoreCase("true")?1:0) + ", " 
						+ valores[3] + "," + valores[4] +")");
			}
			
			System.out.println("Banco populado com sucesso!");
			//Fechar a conexão e o arquivo
			conn.close();
			arquivo.close();
			input.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}//main	
}//class