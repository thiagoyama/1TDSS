package br.com.fiap.exceptions.model;

public class Produto {

	private String nome;
	
	private double preco;

	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	//Retornar o valor do imposto do produto
	public double calcularImposto(double imposto) {
		//Se o imposto for menor do que 0, lançar uma RuntimeException
		return preco * (imposto / 100);
	}
	
	//Retornar o valor total dos produtos de acordo com a qtd
	public double calcularValorTotal(int quantidade) {
		//Se a quatidade for menor ou igual a zero, lançar uma RuntimeException
		return preco * quantidade;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
}