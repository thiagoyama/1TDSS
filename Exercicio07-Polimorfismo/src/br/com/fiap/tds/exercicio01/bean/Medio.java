package br.com.fiap.tds.exercicio01.bean;

public class Medio extends Formacao {

	//Atributo
	private String tipo;
	
	//Construtores
	public Medio() {}
	
	public Medio(String descricao, int periodo, String tipo) {
		super(descricao, periodo);
		this.tipo = tipo;
	}

	public Medio(String descricao, int periodo, double mensalidade, int duracao, String tipo) {
		super(descricao, periodo, mensalidade, duracao);
		this.tipo = tipo;
	}

	//Método
	public void calcularMensalidade(double fator) {
		mensalidade =  duracao * fator * 500;
	}
	
	@Override
	public String toString() {
		return super.toString() + " Tipo: " + tipo;
	}

	//Getters e Setters
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
}
