package br.com.fiap.banco.service;

import java.sql.Connection;
import java.sql.SQLException;
import br.com.fiap.banco.dao.ProdutoDao;
import br.com.fiap.banco.exception.IdNotFoundException;
import br.com.fiap.banco.factory.ConnectionFactory;
import br.com.fiap.banco.model.Produto;

public class ProdutoService {

	private ProdutoDao produtoDao;
	
	public ProdutoService() throws ClassNotFoundException, SQLException {
		Connection conn = ConnectionFactory.getConnection();
		produtoDao = new ProdutoDao(conn);
	}
	
	public Produto pesquisar(int codigo) throws ClassNotFoundException, SQLException, IdNotFoundException{
		Produto p = produtoDao.pesquisar(codigo);
		//Recuperar a categoria do produto, se existir
		return p;
	}
	
}