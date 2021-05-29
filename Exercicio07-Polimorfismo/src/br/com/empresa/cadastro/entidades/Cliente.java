package br.com.empresa.cadastro.entidades;

public class Cliente extends Pessoa {
	
	//Atributos
	private String titulo;
	
	//Construtores
	public Cliente() {}
	
	public Cliente(String titulo, String nome) {
		super(nome);
		this.titulo = titulo;
	}

	public Cliente(int id, String nome, String titulo) {
		super(id, nome);
		this.titulo = titulo;
	}
	
	//Métodos
	@Override
	public void exibirNomeFormatado() {
		System.out.print(titulo.toUpperCase() + " - ");
		super.exibirNomeFormatado();
	}

	//Getters e Setters
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

}
