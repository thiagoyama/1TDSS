package br.com.fiap.banco.model;

public class Categoria {

	private int codigo;
	
	private String nome;
	
	private boolean perecivel;

	public Categoria() {}
	
	public Categoria(int codigo, String nome, boolean perecivel) {
		this.codigo = codigo;
		this.nome = nome;
		this.perecivel = perecivel;
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

	public boolean isPerecivel() {
		return perecivel;
	}

	public void setPerecivel(boolean perecivel) {
		this.perecivel = perecivel;
	}
	
}
