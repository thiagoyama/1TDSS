package br.com.fiap.banco.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.fiap.banco.dao.CategoriaDao;
import br.com.fiap.banco.dao.ProdutoDao;
import br.com.fiap.banco.exception.BadInfoException;
import br.com.fiap.banco.exception.IdNotFoundException;
import br.com.fiap.banco.factory.ConnectionFactory;
import br.com.fiap.banco.model.Categoria;
import br.com.fiap.banco.model.Produto;

public class ProdutoService {

	private ProdutoDao produtoDao;
	private CategoriaDao categoriaDao;
	
	public ProdutoService() throws ClassNotFoundException, SQLException {
		Connection conn = ConnectionFactory.getConnection();
		produtoDao = new ProdutoDao(conn);
		categoriaDao = new CategoriaDao(conn);
	}
	
	public void cadastrar(Produto produto) throws ClassNotFoundException, SQLException, BadInfoException {
		//Implementar algumas regras:
		//Nome é obrigatório e não pode ter mais do que 50 caracteres
		if (produto.getNome() == null || produto.getNome().length() > 50) {
			throw new BadInfoException("Nome inválido, não pode ser nulo e no máximo 50 caracteres");
		}
		//Estoque, Valor de Compra e Venda tem que ser maiores do que 0
		
		
		produtoDao.cadastrar(produto);
	}
	
	public void atualizar(Produto produto) throws ClassNotFoundException, SQLException, IdNotFoundException {
		produtoDao.atualizar(produto);
	}
	
	public void remover(int codigo) throws ClassNotFoundException, SQLException, IdNotFoundException {
		produtoDao.remover(codigo);
	}
	
	public List<Produto> listar() throws ClassNotFoundException, SQLException{
		return produtoDao.listar();
	}
	
	public Produto pesquisar(int codigo) throws ClassNotFoundException, SQLException, IdNotFoundException{
		Produto p = produtoDao.pesquisar(codigo);
		//Recuperar a categoria do produto, se existir
		if (p.getCategoria() != null) {
			Categoria c = categoriaDao.pesquisar(p.getCategoria().getCodigo());
			p.setCategoria(c);
		}
		return p;
	}
	
}