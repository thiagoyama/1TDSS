package br.com.fiap.banco.resource;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.fiap.banco.dao.CategoriaDao;
import br.com.fiap.banco.factory.ConnectionFactory;
import br.com.fiap.banco.model.Categoria;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.UriBuilder;
import jakarta.ws.rs.core.UriInfo;

@Path("/categoria")
public class CategoriaResource {

	private CategoriaDao dao;
	
	public CategoriaResource() throws ClassNotFoundException, SQLException {
		Connection conn = ConnectionFactory.getConnection();
		dao = new CategoriaDao(conn);
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response cadastrar(Categoria categoria, @Context UriInfo uri) throws SQLException {
		dao.cadastrar(categoria);
		
		UriBuilder url = uri.getAbsolutePathBuilder();
		url.path(String.valueOf(categoria.getCodigo()));
		
		return Response.created(url.build()).build();
	}
	
	
	
}
