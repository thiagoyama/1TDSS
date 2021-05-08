package br.com.fiap.tds.bean;

public class Pessoa {

	//Atributos
	protected String nome;
	
	private String cpf;
	
	//Construtores
	public Pessoa() {}
	
	public Pessoa(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	
	//Métodos
	public String formartarCpf() {
		return cpf.replace(".", "").replace("-", "");
	}

	//Getters/Setters CTRL + 3 -> ggas
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
}