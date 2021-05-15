package br.com.fiap.tds.exercicio01.bean;

public class Lancha extends Veiculo {

	//Atributo
	private int quantidadeMotores;
	
	//Construtores
	public Lancha() {}
	
	public Lancha(String modelo, int quantidadeLugares, double comprimento, int anoFabricacao, Cor cor,
			int quantidadeMotores) {
		super(modelo, quantidadeLugares, comprimento, anoFabricacao, cor);
		this.quantidadeMotores = quantidadeMotores;
	}

	//Getter e Setter
	public void setQuantidadeMotores(int quantidadeMotores) {
		this.quantidadeMotores = quantidadeMotores;
	}
	
	public int getQuantidadeMotores() {
		return quantidadeMotores;
	}
	
}