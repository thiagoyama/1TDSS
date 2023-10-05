package br.com.fiap.banco.resource;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.fiap.banco.dao.ProdutoDao;
import br.com.fiap.banco.exception.IdNotFoundException;
import br.com.fiap.banco.factory.ConnectionFactory;
import br.com.fiap.banco.model.Produto;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.UriBuilder;
import jakarta.ws.rs.core.UriInfo;

@Path("/produto") //http://localhost:8080/07-WebApi/api/produto
public class ProdutoResource {

	private ProdutoDao dao;
	
	public ProdutoResource() throws ClassNotFoundException, SQLException {
		Connection conn = ConnectionFactory.getConnection();
		dao = new ProdutoDao(conn);
	}
	
	//GET http://localhost:8080/07-WebApi/api/produto (Listar todos os produtos)
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Produto> lista() throws ClassNotFoundException, SQLException {
		return dao.listar();
	}
	
	//GET http://localhost:8080/07-WebApi/api/produto/1 (Pesquisar pelo Id)
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Produto busca(@PathParam("id") int codigo) throws ClassNotFoundException, SQLException, IdNotFoundException {
		return dao.pesquisar(codigo);
	}
	
	//POST http://localhost:8080/07-WebApi/api/produto/ (Cadastrar um produto)
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response cadastrar(Produto produto, @Context UriInfo uri) throws ClassNotFoundException, SQLException {
		dao.cadastrar(produto);
		//Recupera o path (URL atual(http://localhost:8080/07-WebApi/api/produto/))
		UriBuilder uriBuilder = uri.getAbsolutePathBuilder();
		//Adiciona o id do produto que foi criado na URL
		uriBuilder.path(String.valueOf(produto.getCodigo()));
		//Retornar o status 201 com a URL para acessar o produto criado
		return Response.created(uriBuilder.build()).build();
	}
	
	//PUT http://localhost:8080/07-WebApi/api/produto/1 (Atualizar um produto)
	@PUT
	@Path("/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response atualizar(Produto produto, @PathParam("id") int codigo) throws ClassNotFoundException, SQLException, IdNotFoundException {
		produto.setCodigo(codigo);
		dao.atualizar(produto);
		return Response.ok().build();
	}

}





