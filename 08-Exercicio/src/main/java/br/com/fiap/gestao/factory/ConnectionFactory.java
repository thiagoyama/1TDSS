package br.com.fiap.gestao.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//Cria conexoes com o banco de dados
public class ConnectionFactory {

	//static -> metodo pertence a classe e nao ao objeto
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		// Abrir a conexao com o banco
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:orcl", "pf0392",
				"fiap");
		return conn;
	}

}