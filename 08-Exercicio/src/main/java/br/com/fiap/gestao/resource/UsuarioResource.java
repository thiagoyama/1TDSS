package br.com.fiap.gestao.resource;

import java.sql.SQLException;
import java.util.List;

import br.com.fiap.gestao.exception.BadInfoException;
import br.com.fiap.gestao.exception.IdNotFoundException;
import br.com.fiap.gestao.model.Usuario;
import br.com.fiap.gestao.service.UsuarioService;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
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
	
	//GET/Id
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response pesquisar(@PathParam("id") int id) throws SQLException {
		try {
			return Response.ok(service.pesquisar(id)).build();
		} catch (IdNotFoundException e) {
			return Response.status(Status.NOT_FOUND).build();
		}
	}
	
	//PUT/Id
	@PUT
	@Path("/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response atualizar(@PathParam("id") int id, Usuario usuario) throws SQLException, BadInfoException {
		try {
			usuario.setId(id);
			service.atualizar(usuario);
			return Response.ok().build();
		}catch(IdNotFoundException e) {
			return Response.status(Status.NOT_FOUND).build();
		}
	}
	
	//DELETE/Id
	@DELETE
	@Path("/{id}")
	public Response remover(@PathParam("id") int id) throws SQLException {
		service.remover(id);
		return Response.noContent().build();
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