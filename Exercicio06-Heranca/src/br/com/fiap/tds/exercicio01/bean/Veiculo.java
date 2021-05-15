package br.com.fiap.tds.exercicio01.bean;

public class Veiculo {
	
	//Atributos
	private String modelo;
	
	private int quantidadeLugares;
	
	private double comprimento;
	
	private int anoFabricacao;
	
	private Cor cor;

	//Construtores
	//CTRL + 3 -> gcuf
	public Veiculo() {}
	
	public Veiculo(String modelo, int quantidadeLugares, double comprimento, int anoFabricacao, Cor cor) {
		super();
		this.modelo = modelo;
		this.quantidadeLugares = quantidadeLugares;
		this.comprimento = comprimento;
		this.anoFabricacao = anoFabricacao;
		this.cor = cor;
	}

	//Getters e Setters
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getQuantidadeLugares() {
		return quantidadeLugares;
	}

	public void setQuantidadeLugares(int quantidadeLugares) {
		this.quantidadeLugares = quantidadeLugares;
	}

	public double getComprimento() {
		return comprimento;
	}

	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}

	public int getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	public Cor getCor() {
		return cor;
	}

	public void setCor(Cor cor) {
		this.cor = cor;
	}
	
}
