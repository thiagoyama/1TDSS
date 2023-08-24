package br.com.fiap.exercicio.model;

public class ContaCorrente {

	private double saldo;
	private double limite;

	public ContaCorrente() {}
	
	public ContaCorrente(double saldo, double limite) {
		this.saldo = saldo;
		this.limite = limite;
	}
	
	public void sacar(double valor) throws Exception {
		if (valor < 0) {
			throw new Exception("Valor deve ser maior do que zero");
		}
		if (valor > limite) {
			throw new Exception("Limite não permitido, valor máximo: " + limite);
		}
		saldo -= valor;
	}
	
	public void depositar(double valor) throws Exception {
		if (valor < 0) {
			throw new Exception("Valor deve ser maior do que zero");
		}
		saldo += valor;
	}

	public void setLimite(double limite) throws Exception {
		if (limite < 0) {
			throw new Exception("Limite deve ser maior do que zero");
		}
		this.limite = limite;
	}
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getLimite() {
		return limite;
	}

	

}
