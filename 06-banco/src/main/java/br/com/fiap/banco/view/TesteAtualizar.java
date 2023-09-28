package br.com.fiap.banco.view;

import br.com.fiap.banco.dao.ProdutoDao;
import br.com.fiap.banco.model.Produto;

public class TesteAtualizar {

	public static void main(String[] args) {

		//Instanciar o ProdutoDao
		ProdutoDao dao = new ProdutoDao();
		
		//Instanciar um Produto
		Produto produto = new Produto(1, "Bola", 100, 50, 15);
		
		try {
			//Chamar o método atualizar
			dao.atualizar(produto);
			
			System.out.println("Produto atualizado!");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
}