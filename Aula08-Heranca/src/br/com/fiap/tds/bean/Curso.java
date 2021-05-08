package br.com.fiap.tds.bean;

public class Curso {

	//Atributos
	private String nome;
	
	private int cargaHoraria;
	
	//Construtores
	public Curso() {}
	
	public Curso(String nome, int cargaHoraria) {
		this.nome = nome;
		this.cargaHoraria = cargaHoraria;
	}

	//Métodos
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
}
