package br.com.fiap.banco.view;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.fiap.banco.dao.ProdutoDao;
import br.com.fiap.banco.factory.ConnectionFactory;
import br.com.fiap.banco.model.Produto;

//View
public class TesteCadastrar {

	public static void main(String[] args) {

		// Instanciar um produto (a ideia eh que o usuário informe os dados)
		Produto produto = new Produto(8, "Fone de ouvido", 100, 20, 40);

		Connection conn = null;
		try {
			conn = ConnectionFactory.getConnection();
			// Instanciar o objeto que é capaz de realizar as açoes no banco de dados
			ProdutoDao dao = new ProdutoDao(conn);
			// Gravar no banco
			dao.cadastrar(produto);
			System.out.println("Gravado!");
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