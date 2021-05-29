package br.com.fiap.tds.exercicio03.bean;

public class ContaBancaria {

	//Atributos
	protected double saldo;
	
	private Titular titular;
	
	private int agencia;
	
	private String numeroConta;
	
	//Construtores
	public ContaBancaria() {}
	
	public ContaBancaria(double saldo, Titular titular, int agencia, String numeroConta) {
		this.saldo = saldo;
		this.titular = titular;
		this.agencia = agencia;
		this.numeroConta = numeroConta;
	}

	//Métodos
	public double exibirSaldo() {
		return saldo;
	}
	
	@Override
	public String toString() {
		return "Saldo: " + saldo + " Titular: " + titular + " Agencia: " + agencia + " Número: " + numeroConta;
	}
	
	public void depositar(double valor) {
		saldo += valor; // saldo = saldo + valor;
	}
	
	public void sacar(double valor) {
		saldo -= valor; // saldo = saldo - valor;
	}

	//Getters e Setters
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Titular getTitular() {
		return titular;
	}

	public void setTitular(Titular titular) {
		this.titular = titular;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public String getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}
	
}
