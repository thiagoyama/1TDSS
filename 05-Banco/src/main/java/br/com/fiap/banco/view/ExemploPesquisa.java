package br.com.fiap.banco.view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ExemploPesquisa {

	public static void main(String[] args) {
		// Conectar no banco de dados
		try {
			// Registrar o driver do banco de dados utilizado
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// Obter a conexão com o banco de dados
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:orcl", "pf0392",
					"fiap");

			System.out.println("Conectado!");

			//Pesquisar os Produtos
			Statement stm = conn.createStatement();
			ResultSet result = stm.executeQuery("SELECT * FROM T_PRODUTO");
			
			//Percorrer todos os registros encontrados
			while (result.next()) {
				//Recuperar os valores dos campos de cada registro
				int codigo = result.getInt("cd_produto");
				String nome = result.getString("nm_produto");
				int estoque = result.getInt("nr_estoque");
				double venda = result.getDouble("vl_venda");
				double compra = result.getDouble("vl_compra");
				
				//Imprimir os valores
				System.out.println(codigo + " " + nome + 
						" estoque: " + estoque + " Vl Compra: " + compra 
						+ " Vl Venda: " + venda);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}//main
}//class
