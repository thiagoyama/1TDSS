package br.com.fiap.banco.teste;

import java.util.List;

import br.com.fiap.banco.model.Produto;
import br.com.fiap.banco.service.ProdutoService;

public class TestePesquisaPorNome {

	//Testar a pesquisa por nome
	public static void main(String[] args) {
		try {
			ProdutoService service = new ProdutoService();
			
			//Pesquisar os produtos por nome
			List<Produto> lista = service.pesquisarPorNome("Toal");
			
			//Exibir todos os nomes dos produtos retornados
			for (Produto item : lista)
				System.out.println(item.getNome());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}