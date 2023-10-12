package br.com.fiap.banco.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.fiap.banco.exception.IdNotFoundException;
import br.com.fiap.banco.model.Categoria;

public class CategoriaDao {

	private Connection conn;
	
	public CategoriaDao(Connection conn) {
		this.conn = conn;
	}

	public Categoria pesquisar(int codigo) throws SQLException, IdNotFoundException {
		PreparedStatement stm = conn.prepareStatement("select * from t_categoria where id = ?");
		stm.setInt(1, codigo);
		
		ResultSet result = stm.executeQuery();
		
		if (!result.next()) {
			throw new IdNotFoundException("Categoria não encontrada");
		}
		
		int id = result.getInt("id");
		String nome = result.getString("nm_categoria");
		boolean perecivel = result.getBoolean("st_perecivel");
		Categoria categoria = new Categoria(id, nome, perecivel);
		
		return categoria;
	}
	
	public void cadastrar(Categoria categoria) throws SQLException {
		PreparedStatement stm = conn.prepareStatement("insert into t_categoria "
				+ "(id, nm_categoria, st_perecivel) values (?, ?, ?)");
		
		stm.setInt(1, categoria.getCodigo());
		stm.setString(2, categoria.getNome());
		stm.setBoolean(3, categoria.isPerecivel());
		
		stm.executeUpdate();
	}
	
}