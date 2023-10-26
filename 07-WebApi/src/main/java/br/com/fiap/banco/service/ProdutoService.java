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
		validar(produto);
		produtoDao.cadastrar(produto);
	}

	private void validar(Produto produto) throws BadInfoException {
		//Implementar algumas regras:
		//Nome obrigatorio e nao pode ter mais do que 50 caracteres
		if (produto.getNome() == null || produto.getNome().length() > 50) {
			throw new BadInfoException("Nome invalido, nao pode ser nulo e no maximo 50 caracteres");
		}
		//Estoque, Valor de Compra e Venda tem que ser maiores do que 0
		if (produto.getValorCompra() < 0) {
			throw new BadInfoException("Valor de compra precisa que ser positivo");
		}
		if (produto.getEstoque() < 0) {
			throw new BadInfoException("Estoque precisa ser positivo");
		}
		if (produto.getValorVenda() < 0) {
			throw new BadInfoException("Valor de venda precisa ser positivo");
		}
	}
	
	public void atualizar(Produto produto) throws ClassNotFoundException, SQLException, IdNotFoundException, BadInfoException {
		validar(produto);
		produtoDao.atualizar(produto);
	}
	
	public void remover(int codigo) throws ClassNotFoundException, SQLException, IdNotFoundException {
		produtoDao.remover(codigo);
	}
	
	public List<Produto> listar() throws ClassNotFoundException, SQLException{
		return produtoDao.listar();
	}
	
	public List<Produto> pesquisarPorNome(String nome) throws SQLException{
		return produtoDao.pesquisarPorNome(nome);
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