package br.com.fiap.tds.bean;

public class Produto {

	//Atributos
	private String nome;
	
	protected int quantidade; //Classes filhas e do mesmo pacote possuem acesso
	
	protected double valor;
	
	//Métodos com sobrecarga (Overload):
	//Métodos com mesmo nome e parâmetros diferentes
	//Calcula o valor com desconto padrão
	public double calcularDesconto() {
		return valor * 0.95;
	}
	
	//Calcular o valor com desconto passado no parâmetro
	public double calcularDesconto(float porcentagem) {
		return valor - valor * porcentagem/100;
	}
	
	//Calcular o valor com os cupons de descontos: FIAPXX -> XX% 
	public double calcularDesconto(String cupom) {
		//Valida se o cupom começa com FIAP e possui 6 caracteres
		if (cupom.startsWith("FIAP") && cupom.length() == 6) {
			//Obter os dois últimos caracteres do cupom
			int desconto = Integer.parseInt(cupom.substring(4));
			//Calcular o valor do produto com desconto
			return valor - valor * desconto/100;
		}
		return valor;
	}
	
	//Sobrescrever o método toString() para determinar o que será exibido no print do objeto
	@Override
	public String toString() {
		return "Nome: " + nome + ", Quantidade: " + quantidade + ", Valor: " + valor;
	}
	
	//Construtores -> CTRL + 3 gcuf
	public Produto() {}
	
	public Produto(String nome, int quantidade, double valor) {
		this.nome = nome;
		this.quantidade = quantidade;
		this.valor = valor;
	}

	//Getters e Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
}