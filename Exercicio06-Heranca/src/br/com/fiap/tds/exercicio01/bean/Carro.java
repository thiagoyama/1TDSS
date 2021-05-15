package br.com.fiap.tds.exercicio01.bean;

public class Carro extends Veiculo {

	//Atributos
	private int quantidadePortas;
	
	private String placa;
	
	private float motor = 1;

	//Construtor
	public Carro() {}

	public Carro(String modelo, int quantidadeLugares, double comprimento, int anoFabricacao, Cor cor,
			int quantidadePortas, String placa, float motor) {
		super(modelo, quantidadeLugares, comprimento, anoFabricacao, cor);
		this.quantidadePortas = quantidadePortas;
		this.placa = placa;
		this.motor = motor;
	}

	//Getters e Setters
	public int getQuantidadePortas() {
		return quantidadePortas;
	}

	public void setQuantidadePortas(int quantidadePortas) {
		this.quantidadePortas = quantidadePortas;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public float getMotor() {
		return motor;
	}

	public void setMotor(float motor) {
		this.motor = motor;
	}

}