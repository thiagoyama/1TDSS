package br.com.fiap.gestao.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;

import br.com.fiap.gestao.model.Usuario;

public class UsuarioDao {

	private Connection conexao;
	
	public UsuarioDao(Connection conexao) {
		this.conexao = conexao;
	}

	public void cadastrar(Usuario usuario) throws SQLException {
		PreparedStatement stm = conexao.prepareStatement("insert into tb_usuario (cd_usuario, "
				+ " nm_usuario, dt_cadastro, dt_nascimento, ds_email, nr_cpf) "
				+ " values (sq_tb_usuario.nextval, ?, sysdate, ?, ?, ?)", new String[] { "cd_usuario" });
		
		stm.setString(1, usuario.getNome());
		usuario.setDataCadastro(LocalDateTime.now()); //cria um objeto com a data atual
		//stm.setDate(2, Date.valueOf(usuario.getDataCadastro().toLocalDate()));
		//stm.setDate(3, Date.valueOf(usuario.getDataNascimento()));
		stm.setObject(2, usuario.getDataNascimento());
		stm.setString(3, usuario.getEmail());
		stm.setString(4, usuario.getCpf());
		
		stm.executeUpdate();
		
		//Recuperar o valor gerado pela sequence, o codigo do usuario
		ResultSet result = stm.getGeneratedKeys();
		result.next();
		int codigo = result.getInt(1);
		usuario.setId(codigo);
		
	}
	
}