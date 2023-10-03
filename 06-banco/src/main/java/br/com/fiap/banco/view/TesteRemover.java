package br.com.fiap.banco.view;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.fiap.banco.dao.ProdutoDao;
import br.com.fiap.banco.factory.ConnectionFactory;

public class TesteRemover {

	public static void main(String[] args) {
		Connection conn = null;
		try {
			conn = ConnectionFactory.getConnection();
			// Instanciar o ProdutoDao

			ProdutoDao dao = new ProdutoDao(conn);
			// Chamar o remover passando o id
			dao.remover(2);
			System.out.println("Produto removido");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}