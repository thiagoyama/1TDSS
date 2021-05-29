package br.com.fiap.tds.exercicio01.bean;

public class Bacharelado extends Formacao {

	// Atributos
	private String projetoConclusao;

	private int cargaHorariaEstagio;
	
	// Construtores
	public Bacharelado() {}
	
	public Bacharelado(String descricao, int periodo, String projetoConclusao, int cargaHorariaEstagio) {
		super(descricao, periodo);
		this.projetoConclusao = projetoConclusao;
		this.cargaHorariaEstagio = cargaHorariaEstagio;
	}

	public Bacharelado(String descricao, int periodo, double mensalidade, int duracao, 
											String projetoConclusao, int cargaHorariaEstagio) {
		super(descricao, periodo, mensalidade, duracao);
		this.projetoConclusao = projetoConclusao;
		this.cargaHorariaEstagio = cargaHorariaEstagio;
	}

	// Métodos
	public void calcularMensalidade(double fator) {
		mensalidade = duracao * fator * 600 + cargaHorariaEstagio * 12;
	}
	
	@Override
	public String toString() {
		return super.toString() + " Projeto TCC: " 
					+ projetoConclusao + " Carga horária estágio: " + cargaHorariaEstagio;
	}

	// Getters e Setters
	public String getProjetoConclusao() {
		return projetoConclusao;
	}

	public void setProjetoConclusao(String projetoConclusao) {
		this.projetoConclusao = projetoConclusao;
	}

	public int getCargaHorariaEstagio() {
		return cargaHorariaEstagio;
	}

	public void setCargaHorariaEstagio(int cargaHorariaEstagio) {
		this.cargaHorariaEstagio = cargaHorariaEstagio;
	}

}
