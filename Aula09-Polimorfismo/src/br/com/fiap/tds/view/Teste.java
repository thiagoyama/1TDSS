package br.com.fiap.tds.view;

import br.com.fiap.tds.bean.Produto;
import br.com.fiap.tds.bean.ProdutoPerecivel;

public class Teste {

	//main CTRL + espaço
	public static void main(String[] args) {
		
		//Instanciar um produto com os dados
		Produto produto = new Produto("Relógio", 10, 100);
		
		//Instanciar um produto perecível com os dados
		ProdutoPerecivel produtoPerecivel = new ProdutoPerecivel("Arroz", 10, 100, "10/10/2022");
		
		//Chamar os métodos
		//sysout -> CTRL + espaço
		System.out.println("Produto:");
		System.out.println(produto.calcularDesconto()); //classe Produto
		System.out.println(produto.calcularDesconto(20)); //classe Produto
		System.out.println(produto.calcularDesconto("LEVA40")); //classe Produto
		
		System.out.println("Produto perecível:");
		System.out.println(produtoPerecivel.calcularDesconto()); //classe ProdutoPerecivel
		System.out.println(produtoPerecivel.calcularDesconto(20));//classe Produto, pois o produto perecível não tem
		System.out.println(produtoPerecivel.calcularDesconto("FIAP20")); //classe ProdutoPerecivel
		
		//O produto perecível é um produto, pois ela é filha de produto
		Produto produto2 = new ProdutoPerecivel("Macarrão", 100, 100, "11/11/2021");
		
		System.out.println("Produto perecível em uma variável do tipo produto:");
		System.out.println(produto2.calcularDesconto());//classe ProdutoPerecivel
		System.out.println(produto2.calcularDesconto("LEVA40"));//classe ProdutoPerecivel
		
		//Validar se a variável produto2 possui uma instância de ProdutoPerecivel
		if (produto2 instanceof ProdutoPerecivel) {
			//Cast -> força um objeto ser de um tipo especifico
			ProdutoPerecivel produtoPerecivel2 = (ProdutoPerecivel) produto2;
			System.out.println(produtoPerecivel2.getDataValidade());
		} else {
			System.out.println("produto2 não é o tipo produto perecível");
		}
		
		//Não compila, pq o produto não é um produto perecível
		//ProdutoPerecivel produtoPerecivel2 = new Produto("TV", 10, 100); 
	}
	
}