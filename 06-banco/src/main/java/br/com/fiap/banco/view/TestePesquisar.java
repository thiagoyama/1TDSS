package br.com.fiap.banco.view;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.fiap.banco.dao.ProdutoDao;
import br.com.fiap.banco.exception.IdNotFoundException;
import br.com.fiap.banco.factory.ConnectionFactory;
import br.com.fiap.banco.model.Produto;

public class TestePesquisar {

	public static void main(String[] args) {
		Connection conn = null;
		try {
			conn = ConnectionFactory.getConnection();
			// Instanciar o ProdutoDao
			ProdutoDao dao = new ProdutoDao(conn);
			// Pesquisar por Id
			Produto p = dao.pesquisar(8);
			// Exibir os dados do produto
			System.out.println(p.getCodigo() + " " + p.getNome());
		} catch (IdNotFoundException e) {
			System.err.println(e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
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