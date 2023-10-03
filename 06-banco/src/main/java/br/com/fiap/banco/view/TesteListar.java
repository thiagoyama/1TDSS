package br.com.fiap.banco.view;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.fiap.banco.dao.ProdutoDao;
import br.com.fiap.banco.factory.ConnectionFactory;
import br.com.fiap.banco.model.Produto;

public class TesteListar {

	public static void main(String[] args) {

		Connection conn = null;
		try {
			conn = ConnectionFactory.getConnection();
			// Instanciar o ProdutoDao
			ProdutoDao dao = new ProdutoDao(conn);
			// Chamar o listar
			List<Produto> lista = dao.listar();
			// Exibir todos os produtos encontrados
			for (Produto p : lista) {
				System.out.println(p.getCodigo() + " " + p.getNome() + " " + p.getEstoque() + p.getValorCompra() + " "
						+ p.getValorVenda());
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (conn != null)
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
	}
}