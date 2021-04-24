package br.com.fiap.tds.bean;

public class Elevador {

	//Atributos
	private int andarAtual, totalAndares, capacidade, qtdAtualPessoas;
	
	//Construtor com os valores para capacidade e totalAndares
	public Elevador(int capacidade, int totalAndares) {
		this.capacidade = capacidade;
		this.totalAndares = totalAndares;
	}
	
	//Adiciona uma pessoa no elevador, se possível
	public int entra() {
//		if (1 + qtdAtualPessoas <= capacidade)
//			qtdAtualPessoas++;
//		
//		return qtdAtualPessoas;
		return entra(1); //Chama o método entra com o qtd = 1
	}
	
	/*
	 * O método entra() deve adicionar o valor passado como parâmetro ao atributo quantidadeAtualPessoas, 
	 * desde que a capacidade do elevador não seja excedida. Após executar o procedimento citado, 
	 * o método deve retornar a valor do atributo quantidadeAtualPessoas;
	 */
	public int entra(int qtd) {
		if (qtd + qtdAtualPessoas <= capacidade)
			qtdAtualPessoas += qtd; // qtdAtualPessoas = qtdAtualPessoas + qtd;

		return qtdAtualPessoas;
	}
	
	//Retira uma pessoa do elevador, se possível
	public int sai() {
//		if (qtdAtualPessoas - 1 >= 0)
//			qtdAtualPessoas--;
//		
//		return qtdAtualPessoas;
		return sai(1); //Chama o método sai com qtd = 1
	}
	
	/*
	 * O método sai() deve subtrair do atributo quantidadeAtualPessoas o valor passado como parâmetro, 
	 * desde que o resultado desta operação seja um número maior ou igual a 0. 
	 * Após executar o procedimento citado, o método deve retornar a quantidade de pessoas restantes 
	 * no elevador;
	 */
	public int sai(int qtd) {
		if (qtdAtualPessoas - qtd >= 0)
			qtdAtualPessoas -= qtd; // qtdAtualPessoas = qtdAtualPessoas - qtd;
		
		return qtdAtualPessoas;
	}
	
	/*
	 * O método sobe() deve adicionar 1 ao atributo andarAtual, desde que o resultado desta operação não
	 *  seja maior que o valor do atributo totalAndares. Após executar o procedimento citado, 
	 *  o método deve retornar o valor true quando o valor for adicionado e false no caso contrário;
	 */
	public boolean sobe() {
		if (andarAtual == totalAndares) 
			return false;
		
		andarAtual++;
		return true;
	}
	
	/*
	 * O método desce() deve subtrair 1 do atributo andarAtual, desde que o resultado desta operação não 
	 * seja menor que 0 (zero). Após executar o procedimento citado, o método deve retornar o valor 
	 * true quando o valor for subtraído e false no caso contrário;
	 */
	public boolean desce() {
		if (andarAtual > 0) {
			andarAtual--;
			return true;
		} 
		return false;
	}

	//Getters
	public int getAndarAtual() {
		return andarAtual;
	}

	public int getTotalAndares() {
		return totalAndares;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public int getQtdAtualPessoas() {
		return qtdAtualPessoas;
	}
	
}
