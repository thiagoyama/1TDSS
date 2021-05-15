package br.com.fiap.tds.ltp.pacotes.ex2.produtos;

public class Produto {

	//Atributos
	private int codigo;
	
	private int preco;
	
	//Construtores
	public Produto() {}

	public Produto(int codigo, int preco) {
		super();
		this.codigo = codigo;
		this.preco = preco;
	}

	//Getters e Setters
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getPreco() {
		return preco;
	}

	public void setPreco(int preco) {
		this.preco = preco;
	}
	
}