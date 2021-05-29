package br.com.empresa.cadastro.entidades;

public class Pessoa {
	
	//Atributos
	private int id;
	
	protected String nome;

	//Construtores
	public Pessoa() {}
	
	public Pessoa(String nome) {
		this.nome = nome;
	}
	
	public Pessoa(int id, String nome) {
		this.id = id;
		this.nome = nome;
	}
	
	//Métodos
	public void exibirNomeFormatado() {
		System.out.println(nome.toUpperCase());
	}
	
	//Getters e Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
