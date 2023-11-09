package br.com.fiap.gestao.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.gestao.exception.IdNotFoundException;
import br.com.fiap.gestao.model.Usuario;

public class UsuarioDao {

	private Connection conexao;
	
	public UsuarioDao(Connection conexao) {
		this.conexao = conexao;
	}
	
	public void remover(int id) throws SQLException {
		PreparedStatement stm = conexao.prepareStatement("delete from tb_usuario where cd_usuario = ?");
		stm.setInt(1, id);
		stm.executeUpdate();
	}
	
	public void atualizar(Usuario usuario) throws SQLException, IdNotFoundException {
		PreparedStatement stm = conexao.prepareStatement("update tb_usuario set nm_usuario = ?, nr_cpf = ?,"
				+ " ds_email = ?, dt_nascimento = ? where cd_usuario = ?");
		
		stm.setString(1, usuario.getNome());
		stm.setString(2, usuario.getCpf());
		stm.setString(3, usuario.getEmail());
		stm.setObject(4, usuario.getDataNascimento());
		stm.setInt(5, usuario.getId());
		
		int x = stm.executeUpdate();
		
		if (x == 0)
			throw new IdNotFoundException("Usuario nao encontrado");
		
	}
	
	public Usuario pesquisar(int id) throws SQLException, IdNotFoundException {
		
		PreparedStatement stm = conexao
				.prepareStatement("select * from tb_usuario where cd_usuario = ?");
		
		stm.setInt(1, id);
		
		ResultSet result = stm.executeQuery();
	
		if (!result.next()) {
			throw new IdNotFoundException("Usuário nao encontrado");
		} 

		Usuario usuario = parseUsuario(result);
		return usuario;
	}
	
	public List<Usuario> listar() throws SQLException{
		PreparedStatement stm = conexao
				.prepareStatement("select * from tb_usuario");
		
		ResultSet result = stm.executeQuery();
		
		List<Usuario> lista = new ArrayList<>();
		
		while (result.next()) {
			Usuario usuario = parseUsuario(result);
			lista.add(usuario);
		}
		return lista;
	}

	private Usuario parseUsuario(ResultSet result) throws SQLException {
		int codigo = result.getInt("cd_usuario");
		String nome = result.getString("nm_usuario");
		Timestamp dataNasc = result.getTimestamp("dt_nascimento");
		LocalDateTime dataCadastro = 
				result.getObject("dt_cadastro", LocalDateTime.class);
		String cpf = result.getString("nr_cpf");
		String email = result.getString("ds_email");
		
		Usuario usuario = new Usuario(codigo, nome, 
				email, cpf,	dataCadastro, 
				dataNasc.toLocalDateTime().toLocalDate());
		return usuario;
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