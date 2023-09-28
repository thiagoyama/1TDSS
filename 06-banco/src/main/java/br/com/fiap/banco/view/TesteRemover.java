package br.com.fiap.banco.view;

import br.com.fiap.banco.dao.ProdutoDao;

public class TesteRemover {

	public static void main(String[] args) {
		//Instanciar o ProdutoDao
		ProdutoDao dao = new ProdutoDao();
		
		try {
			//Chamar o remover passando o id
			dao.remover(2);
			System.out.println("Produto removido");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
}