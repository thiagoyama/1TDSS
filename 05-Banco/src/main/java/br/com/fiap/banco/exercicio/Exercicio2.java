package br.com.fiap.banco.exercicio;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Exercicio2 {

	//Ler os dados da tabela e gravar em um arquivo
	public static void main(String[] args) {
		try {
			//Abrir a conexão com o banco
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@oracle.fiap.com.br:1521:orcl",
					"pf0392", "fiap");
			
			//Abrir o arquivo de destino
			FileWriter output = new FileWriter("alunos2.csv");
			PrintWriter arquivo = new PrintWriter(output);
			
			//Ler os dados do banco
			Statement stm = conn.createStatement();
			ResultSet result = stm.executeQuery("select * from tb_aluno");
			
			//Gravar o cabeçalho no arquivo
			arquivo.println("RM, Nome, Ativo, Nota1, Nota2");
			
			//Percorrer cada linha encontrada
			while (result.next()) {
				//Recuperar todos os campos da linha da tabela
				int rm = result.getInt("nr_rm");
				String nome = result.getString("nm_aluno");
				boolean ativo = result.getBoolean("st_ativo");
				double nota1 = result.getDouble("vl_nota1");
				double nota2 = result.getDouble("vl_nota2");
				
				//Gravar a linha no arquivo
				arquivo.println(rm + "," + nome + "," + ativo + "," + nota1 + "," + nota2);
			}
			
			System.out.println("Alunos exportados para o arquivo");
			
			//Fechar as paradas
			conn.close();
			output.close();
			arquivo.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}//main	
}//class