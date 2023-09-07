package br.com.fiap.banco.view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ExemploCadastro {

	public static void main(String[] args) {

		try {
			// Registrar o driver do banco de dados utilizado
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// Obter a conexão com o banco de dados
			Connection churros = DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:orcl", "pf0392",
					"fiap");

			System.out.println("Conectado!");

			//Cadastrar um produto no banco
			//Obter o objeto que executa comandos SQL
			Statement stm = churros.createStatement();
			//Executar o comando de insert na tabela t_produto
			stm.executeUpdate("INSERT INTO T_PRODUTO (cd_produto, nm_produto, nr_estoque,vl_venda,vl_compra)"
					+ "values (3, 'Churros doce de leite', 20, 12, 5)");
			
			System.out.println("Produto cadastrado!");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}// main
}// class
