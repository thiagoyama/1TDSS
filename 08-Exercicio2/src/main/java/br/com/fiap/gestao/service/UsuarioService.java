package br.com.fiap.gestao.service;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.fiap.gestao.dao.UsuarioDao;
import br.com.fiap.gestao.exception.BadInfoException;
import br.com.fiap.gestao.factory.ConnectionFactory;
import br.com.fiap.gestao.model.Usuario;
import br.com.fiap.gestao.util.StringUtils;

public class UsuarioService {

	private UsuarioDao dao;
	
	public UsuarioService() throws SQLException, ClassNotFoundException {
		Connection conexao = ConnectionFactory.getConnection();
		dao = new UsuarioDao(conexao);
	}
	
	public void cadastrar(Usuario usuario) throws SQLException, BadInfoException {
		//validacoes
		if (StringUtils.isNullOrEmptyOrHasMoreThan(usuario.getNome(), 100))
			throw new BadInfoException("Nome invalido");
		if (StringUtils.isNullOrEmptyOrHasMoreThan(usuario.getEmail(), 100))	
			throw new BadInfoException("Email invalido");
		if (StringUtils.isNullOrEmpty(usuario.getCpf()) || !StringUtils.has(usuario.getCpf(), 11))	
			throw new BadInfoException("CPF invalido");
		dao.cadastrar(usuario);
	}
	
}