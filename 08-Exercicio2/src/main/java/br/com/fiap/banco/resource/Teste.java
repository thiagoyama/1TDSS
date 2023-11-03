package br.com.fiap.banco.resource;

import java.sql.SQLException;

import br.com.fiap.gestao.dao.UsuarioDao;
import br.com.fiap.gestao.factory.ConnectionFactory;
import br.com.fiap.gestao.model.Usuario;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.UriBuilder;
import jakarta.ws.rs.core.UriInfo;

@Path("/teste")
public class Teste {

	private UsuarioDao dao;
	
	public Teste() throws ClassNotFoundException, SQLException {
		dao = new UsuarioDao(ConnectionFactory.getConnection());// TODO Auto-generated constructor stub
	}
	
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response cadastrar(Usuario usuario, @Context UriInfo uri) throws SQLException {
		dao.cadastrar(usuario);
		
		UriBuilder url = uri.getAbsolutePathBuilder();
		url.path(String.valueOf(usuario.getId()));
		
		return Response.created(url.build()).build();
	}
	
}