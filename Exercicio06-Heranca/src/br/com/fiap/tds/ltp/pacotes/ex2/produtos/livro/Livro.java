package br.com.fiap.tds.ltp.pacotes.ex2.produtos.livro;

import br.com.fiap.tds.ltp.pacotes.ex2.produtos.Produto;

public class Livro extends Produto {

	//Atributos
	private String autor;
	
	private String titulo;
	
	private String isbn;
	
	//Construtores
	public Livro() {}
	
	public Livro(int codigo, int preco, String autor, String titulo, String isbn) {
		super(codigo, preco);
		this.autor = autor;
		this.titulo = titulo;
		this.isbn = isbn;
	}

	//Getters e Setters
	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
}
