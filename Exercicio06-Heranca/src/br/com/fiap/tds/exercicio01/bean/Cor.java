package br.com.fiap.tds.exercicio01.bean;

public class Cor {

	//Atributos
	private String nome;
	
	private int r, g, b;
	
	//Construtores
	public Cor() {}
	
	public Cor(String nome, int r, int g, int b) {
		this.nome = nome;
		this.r = r;
		this.g = g;
		this.b = b;
	}
	
	public Cor(int r, int g, int b) {
		this.r = r;
		this.g = g;
		this.b = b;
	}
	
	//Getters e Setters
	//CTRL + 3 -> ggas
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	public int getG() {
		return g;
	}

	public void setG(int g) {
		this.g = g;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
	
}
