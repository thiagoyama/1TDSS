package br.com.fiap.tds.exercicio03.bean;

public class ContaCorrente extends ContaBancaria {

	//Atributo
	private double limiteCredito;
	
	//Construtores
	public ContaCorrente() {}

	public ContaCorrente(double saldo, Titular titular, int agencia, String numeroConta, double limiteCredito) {
		super(saldo, titular, agencia, numeroConta);
		this.limiteCredito = limiteCredito;
	}

	//Métodos
	@Override
	public String toString() {
		return super.toString() + " Limite: " + limiteCredito;
	}
	
	@Override
	public double exibirSaldo() {
		return super.exibirSaldo() + limiteCredito;
	}
	
	//Getters e Setters
	@Override
	public double getSaldo() {
		return super.getSaldo() + limiteCredito;
	}
	
	public double getLimiteCredito() {
		return limiteCredito;
	}

	public void setLimiteCredito(double limiteCredito) {
		this.limiteCredito = limiteCredito;
	}
	
}
