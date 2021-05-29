package br.com.fiap.tds.exercicio01.bean;

public class Tecnologo extends Formacao {

	//Atributos
	private boolean planoEstendido;

	//Construtores (gcuf)
	public Tecnologo() {}
	
	public Tecnologo(String descricao, int periodo, boolean planoEstendido) {
		super(descricao, periodo);
		this.planoEstendido = planoEstendido;
	}
	
	public Tecnologo(String descricao, int periodo, double mensalidade, 
												int duracao, boolean planoEstendido) {
		super(descricao, periodo, mensalidade, duracao);
		this.planoEstendido = planoEstendido;
	}
	
	//Métodos
	public void calcularMensalidade(double fator) {
		mensalidade = duracao * fator * 600;
	}
	
	@Override
	public String toString() {
		return super.toString() + " Plano estendido: " + planoEstendido;
	}

	//Getters e Settes (ggas)
	public boolean isPlanoEstendido() {
		return planoEstendido;
	}

	public void setPlanoEstendido(boolean planoEstendido) {
		this.planoEstendido = planoEstendido;
	}	
}
