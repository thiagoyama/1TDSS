package br.com.fiap.tds.bean;

public class ProdutoPerecivel extends Produto {

	private String dataValidade;
	
	//Sobrescrita de método (Override):
	//Criar o mesmo método do pai na classe filha
	
	//Calcula o valor com desconto de acordo com a quantidade em estoque
	// Desconto de 20% se tiver mais de 100 produtos ou 10% caso contrário
	@Override //Anotação -> adiciona mais informações no elemento da classe
	public double calcularDesconto() {
		/*if (quantidade > 100)
			return valor * 0.8;
		else
			return valor * 0.9;
		*/
		//Ternário (condicao ? se verdadeiro : se falso)
		return quantidade > 100 ? valor * 0.8 : valor * 0.9;
	}
	
	//Sobrescrever o método calcular desconto do cupom
	//Adicionar o cupom LEVA40 -> dá 40% de desconto, além do cupom FIAPXX
	@Override
	public double calcularDesconto(String cupom) {
		/*if (cupom.equals("LEVA40"))
			return valor * 0.6;
		else
			//super para referenciar o método do pai
			return super.calcularDesconto(cupom);
		*/
		return cupom.equals("LEVA40") ? valor * 0.6 : super.calcularDesconto(cupom);
	}

	public String getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(String dataValidade) {
		this.dataValidade = dataValidade;
	}
	
}