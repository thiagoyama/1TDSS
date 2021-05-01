package br.com.fiap.tds.bean;

public class Filme {

	//Atributos
	private String titulo;
	
	private int duracao;
	
	private String sinopse;
	
	public Filme(String titulo, int duracao) {
		this(titulo);
		this.duracao = duracao;
	}
	
	//Construtor -> não tem retorno (nem void) e possui o mesmo nome da classe
	public Filme(String titulo) {
		this.titulo = titulo;
	}
	
	public Filme(String titulo, int duracao, String sinopse) {
		this(titulo, duracao);
		this.sinopse = sinopse;
	}
	
	//Construtor padrão -> sem parâmetros
	public Filme() {}

	//Métodos Getters e Setters
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	public String getSinopse() {
		return sinopse;
	}

	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}
	
}
