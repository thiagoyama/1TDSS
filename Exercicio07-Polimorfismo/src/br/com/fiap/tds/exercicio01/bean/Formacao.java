package br.com.fiap.tds.exercicio01.bean;

public class Formacao {
	
	//Atributos
	private String descricao;
	
	private int periodo;
	
	protected double mensalidade;
	
	protected int duracao;
	
	//Construtores
	public Formacao() {}
	
	public Formacao(String descricao, int periodo) {
		this.descricao = descricao;
		this.periodo = periodo;
	}

	public Formacao(String descricao, int periodo, double mensalidade, int duracao) {
		this.descricao = descricao;
		this.periodo = periodo;
		this.mensalidade = mensalidade;
		this.duracao = duracao;
	}
	
	//Métodos
	public void definirDuracao() {
		// objeto instanceof Classe -> verifica se o objeto é uma instancia da Classe
		// this -> representa o objeto atual
		if (this instanceof Tecnologo) {
			duracao = 24;
		} else if (this instanceof Medio) {
			duracao = 36;
		} else if (this instanceof Bacharelado) {
			//verifica se a descricao não está vazia
			if (descricao != null && descricao.toUpperCase().contains("ENGENHARIA")) {
				duracao = 60;
			} else {
				duracao = 48;
			}
		} 
	}
	
	public double exibirMedia(double ps1, double ps2) {
		return (ps1 + ps2)/2;
	}
	
	public double exibirMedia(double ps1, double ps2, double nac1, double nac2) {
		return exibirMedia(exibirMedia(ps1, ps2), exibirMedia(nac1, nac2));
		//return ((ps1 + ps2)/2 + (nac1 + nac2)/2)/2;
		//return (ps1 + ps2 + nac1 + nac2)/4;
	}
	
	public double exibirMedia(double ps1, double ps2, double nac1, double nac2,
																double am1, double am2) {
		//return (ps1 + ps2)/2 * 0.5 + (nac1 + nac2)/2 * 0.2 + (am1 + am2)/2 * 0.3;
		return exibirMedia(ps1, ps2) * 0.5 + exibirMedia(nac1, nac2) * 0.2 + exibirMedia(am1, am2) * 0.3;
	}
	
	@Override
	public String toString() {
		return "Descrição: " + descricao + " Período: " + periodo + 
						" Mensalidade: " + mensalidade + " Duração: " + duracao;
	}
	
	//Getters e Setters
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getPeriodo() {
		return periodo;
	}

	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}

	public double getMensalidade() {
		return mensalidade;
	}

	public void setMensalidade(double mensalidade) {
		this.mensalidade = mensalidade;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

}
