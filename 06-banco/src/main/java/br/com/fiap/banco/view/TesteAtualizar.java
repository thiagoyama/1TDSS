package br.com.fiap.banco.view;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.fiap.banco.dao.ProdutoDao;
import br.com.fiap.banco.factory.ConnectionFactory;
import br.com.fiap.banco.model.Produto;

public class TesteAtualizar {

	public static void main(String[] args) {

		Connection conn = null;
		try {
			conn = ConnectionFactory.getConnection();
			// Instanciar o ProdutoDao
			ProdutoDao dao = new ProdutoDao(conn);

			// Instanciar um Produto
			Produto produto = new Produto(8, "Bola", 100, 50, 15);

			// Chamar o método atualizar
			dao.atualizar(produto);

			System.out.println("Produto atualizado!");
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