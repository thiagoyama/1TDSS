package br.com.fiap.banco.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import br.com.fiap.banco.model.Produto;

//Realiza as ações de CRUD (Create, Read, Update, Delete) no banco de dados
public class ProdutoDao {

	public void cadastrar(Produto produto) throws ClassNotFoundException, SQLException  {
		//Abrir a conexão com o banco
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection(
				"jdbc:oracle:thin:@oracle.fiap.com.br:1521:orcl",
				"pf0392", "fiap");
		
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
	
	public List<Produto> listar(){
		//Criar a conexão com o banco de dados
		
		//Criar o comando SQL
		
		//Executar o comando SQL
		
		//Criar a lista de produtos
		
		//Percorrer todos os registros encontrados
			//Recuperar os valores das colunas
			//Instanciar um produto com esses valores
			//Adicionar na lista
		
		//Retornar a lista de produto
		return null;
	}
	
	//Deixar para depois
	public Produto pesquisar(int id) {
		return null;
	}
	
}