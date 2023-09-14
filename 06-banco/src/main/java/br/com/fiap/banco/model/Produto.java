package br.com.fiap.banco.model;

public class Produto {

	private int codigo;
	private String nome;
	private int estoque;
	private double valorVenda;
	private double valorCompra;
	
	public Produto() {}

	public Produto(int codigo, String nome, int estoque, double valorVenda, double valorCompra) {
		this.codigo = codigo;
		this.nome = nome;
		this.estoque = estoque;
		this.valorVenda = valorVenda;
		this.valorCompra = valorCompra;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}

	public double getValorVenda() {
		return valorVenda;
	}

	public void setValorVenda(double valorVenda) {
		this.valorVenda = valorVenda;
	}

	public double getValorCompra() {
		return valorCompra;
	}

	public void setValorCompra(double valorCompra) {
		this.valorCompra = valorCompra;
	}

}
