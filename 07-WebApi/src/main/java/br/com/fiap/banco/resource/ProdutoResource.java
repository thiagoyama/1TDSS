package br.com.fiap.banco.resource;

import java.sql.SQLException;
import java.util.List;

import br.com.fiap.banco.exception.BadInfoException;
import br.com.fiap.banco.exception.IdNotFoundException;
import br.com.fiap.banco.model.Produto;
import br.com.fiap.banco.service.ProdutoService;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.Response.Status;
import jakarta.ws.rs.core.UriBuilder;
import jakarta.ws.rs.core.UriInfo;

@Path("/produto") //http://localhost:8080/07-WebApi/api/produto
public class ProdutoResource {

	private ProdutoService service;
	
	public ProdutoResource() throws ClassNotFoundException, SQLException {
		service = new ProdutoService();
	}
	
	//GET http://localhost:8080/07-WebApi/api/produto/query?nome=aaa(Pesquisar por nome)
	@GET
	@Path("/query")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Produto> pesquisar(@QueryParam("nome") String pesquisa) throws SQLException{
		return service.pesquisarPorNome(pesquisa);
	}
	
	//GET http://localhost:8080/07-WebApi/api/produto (Listar todos os produtos)
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Produto> lista() throws ClassNotFoundException, SQLException {
		return service.listar();
	}
	
	//GET http://localhost:8080/07-WebApi/api/produto/1 (Pesquisar pelo Id)
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response busca(@PathParam("id") int codigo) throws ClassNotFoundException, SQLException {
		try {
			return Response.ok(service.pesquisar(codigo)).build();
		} catch (IdNotFoundException e) {
			//Retornar 404 caso o produto não exista
			return Response.status(Status.NOT_FOUND).build();
		}
	}
	
	//POST http://localhost:8080/07-WebApi/api/produto/ (Cadastrar um produto)
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response cadastrar(Produto produto, @Context UriInfo uri) throws ClassNotFoundException, SQLException {
		try {
			service.cadastrar(produto);
			//Recupera o path (URL atual(http://localhost:8080/07-WebApi/api/produto/))
			UriBuilder uriBuilder = uri.getAbsolutePathBuilder();
			//Adiciona o id do produto que foi criado na URL
			uriBuilder.path(String.valueOf(produto.getCodigo()));
			//Retornar o status 201 com a URL para acessar o produto criado
			return Response.created(uriBuilder.build()).build();
		} catch (BadInfoException e) {
			e.printStackTrace();
			//Retornar o status 400 bad request
			return Response.status(Status.BAD_REQUEST)
								.entity(e.getMessage()).build();
		}
	}

	
	//PUT http://localhost:8080/07-WebApi/api/produto/1 (Atualizar um produto)
	@PUT
	@Path("/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response atualizar(Produto produto, @PathParam("id") int codigo) throws ClassNotFoundException, SQLException {
		try {
			produto.setCodigo(codigo);
			service.atualizar(produto);
			return Response.ok().build();
		} catch (IdNotFoundException e) {
			return Response.status(Status.NOT_FOUND).build();
		} catch (BadInfoException e) {
			return Response.status(Status.BAD_REQUEST).entity(e.getMessage()).build();
		}
	}
	
	//DELETE http://localhost:8080/07-WebApi/api/produto/1 (Apagar um produto)
	@DELETE
	@Path("/{id}")
	public Response remover(@PathParam("id") int id) throws ClassNotFoundException, SQLException {
		try {
			service.remover(id);
			return Response.noContent().build();
		} catch (IdNotFoundException e) {
			return Response.status(Status.NOT_FOUND).build();
		}
	}
	
}





