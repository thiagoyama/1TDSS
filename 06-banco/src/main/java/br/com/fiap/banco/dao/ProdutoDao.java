package br.com.fiap.banco.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.banco.exception.IdNotFoundException;
import br.com.fiap.banco.factory.ConnectionFactory;
import br.com.fiap.banco.model.Produto;

//Realiza as ações de CRUD (Create, Read, Update, Delete) no banco de dados
public class ProdutoDao {

	public void cadastrar(Produto produto) throws ClassNotFoundException, SQLException  {

		Connection conn = ConnectionFactory.getConnection();
		
		//Criar o objeto com o comando SQL configurável
		PreparedStatement stm = conn.prepareStatement("INSERT INTO"
				+ " T_PRODUTO (cd_produto, nm_produto, nr_estoque,"
				+ " vl_venda, vl_compra) values (?, ?, ?, ?, ?)");
		
		//Setar os valores no comando SQL
		stm.setInt(1, produto.getCodigo());
		stm.setString(2, produto.getNome());
		stm.setInt(3, produto.getEstoque());
		stm.setDouble(4, produto.getValorVenda());
		stm.setDouble(5, produto.getValorCompra());
		
		//Executar o comando SQL
		stm.executeUpdate();
	}
	
	public List<Produto> listar() throws ClassNotFoundException, SQLException{
		//Criar a conexão com o banco de dados
		Connection conn = ConnectionFactory.getConnection();
		
		//Criar o comando SQL
		PreparedStatement stm = conn
				.prepareStatement("select * from t_produto");
		
		//Executar o comando SQL
		ResultSet result = stm.executeQuery();
		
		//Criar a lista de produtos
		List<Produto> lista = new ArrayList<Produto>();
		
		//Percorrer todos os registros encontrados
		while (result.next()) {
			//Recuperar os valores das colunas
			int codigo = result.getInt("cd_produto");
			String nome = result.getString("nm_produto");
			int estoque = result.getInt("nr_estoque");
			double venda = result.getDouble("vl_venda");
			double compra = result.getDouble("vl_compra");
			//Instanciar um produto com esses valores
			Produto prod = new Produto(codigo, nome, estoque, 
														venda, compra);
			//Adicionar na lista
			lista.add(prod);
		}
		//Retornar a lista de produto
		return lista;
	}
	
	public Produto pesquisar(int id) throws ClassNotFoundException, SQLException, IdNotFoundException {
		//Conexão
		Connection conn = ConnectionFactory.getConnection();
		
		//PreparedStatement (com select)
		PreparedStatement stm = conn.prepareStatement("select * from"
				+ " t_produto where cd_produto = ?");
		
		//Setar o id no comando sql (select)
		stm.setInt(1, id);
		
		//Executar o comando SQL
		ResultSet result = stm.executeQuery();
		
		//Verifica se encontrou o produto
		if (!result.next()){
			//Lança uma exception pois o produto não foi encontrado
			throw new IdNotFoundException("Produto não encontrado");
		}
		//Obter os valores do produto
		int codigo = result.getInt("cd_produto");
		String nome = result.getString("nm_produto");
		int estoque = result.getInt("nr_estoque");
		double venda = result.getDouble("vl_venda");
		double compra = result.getDouble("vl_compra");
		//Instanciar o produto com os valores
		Produto produto = new Produto(codigo, nome, estoque, 
				venda, compra);
		//Retornar o produto
		return produto;
	}
}