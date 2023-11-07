package br.com.fiap.gestao.resource;

import java.sql.SQLException;
import java.util.List;

import br.com.fiap.gestao.exception.BadInfoException;
import br.com.fiap.gestao.model.Usuario;
import br.com.fiap.gestao.service.UsuarioService;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.Response.Status;
import jakarta.ws.rs.core.UriBuilder;
import jakarta.ws.rs.core.UriInfo;

@Path("/usuarios")
public class UsuarioResource {

	private UsuarioService service;
	
	public UsuarioResource() throws ClassNotFoundException, SQLException {
		service = new UsuarioService();
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Usuario> listar() throws SQLException{
		return service.listar();
	}
	
	//POST
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response cadastrar(Usuario usuario,
						@Context UriInfo uri) throws SQLException {
		try {
			service.cadastrar(usuario);
			UriBuilder builder = uri.getAbsolutePathBuilder()
					.path(String.valueOf(usuario.getId()));
			return Response.created(builder.build()).build();
		} catch (BadInfoException e) {
			return Response.status(Status.BAD_REQUEST)
				.entity(e.getMessage()).build();
		} 
	}
	
}