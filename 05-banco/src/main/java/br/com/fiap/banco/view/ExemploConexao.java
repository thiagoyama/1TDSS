package br.com.fiap.banco.view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ExemploConexao {

	public static void main(String[] args) {
		
		//Conectar no banco de dados
		try {
			//Registrar o driver do banco de dados utilizado
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//Obter a conexão com o banco de dados
			Connection conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@oracle.fiap.com.br:1521:orcl",
					"pf0392", "fiap");
			
			System.out.println("Conectado!");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}//main
}//class
