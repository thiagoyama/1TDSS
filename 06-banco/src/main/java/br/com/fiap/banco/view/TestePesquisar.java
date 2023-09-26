package br.com.fiap.banco.view;

import java.sql.SQLException;

import br.com.fiap.banco.dao.ProdutoDao;
import br.com.fiap.banco.exception.IdNotFoundException;
import br.com.fiap.banco.model.Produto;

public class TestePesquisar {

	public static void main(String[] args) {
		//Instanciar o ProdutoDao
		ProdutoDao dao = new ProdutoDao();
		
		try {
			//Pesquisar por Id
			Produto p = dao.pesquisar(3);
			//Exibir os dados do produto
			System.out.println(p.getCodigo() + " " + p.getNome());
		} catch (IdNotFoundException e) {
			System.err.println(e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}