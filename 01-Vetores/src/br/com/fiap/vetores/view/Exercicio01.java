package br.com.fiap.vetores.view;

import javax.swing.JOptionPane;

import br.com.fiap.vetores.model.Produto;

public class Exercicio01 {

	public static void main(String[] args) {
		//Ler a quantidade de produtos
		int qtd = Integer.parseInt(JOptionPane
			.showInputDialog("Digite a quantidade"));
		
		//Criar um vetor de produto
		Produto[] vetor = new Produto[qtd]; 
		
		//Ler as informações dos produtos
		for (int i =0; i < vetor.length; i++) {
			//Ler a qtd, preço e desconto
			int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade"));
			double preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço"));
			double desconto = Double.parseDouble(JOptionPane.showInputDialog("Digite o desconto"));
			
			//Instanciar o produto com os valores
			Produto p = new Produto(quantidade, preco, desconto);
			
			//Adicionar o produto no vetor
			vetor[i] = p;
		}
		
		//Calcular o valor a ser pago
		double total = 0;
		for (Produto p : vetor) {			
			total += p.getQuantidade() * (p.getPreco() - p.getDesconto());
		}
		
		//Informar para o usuário
		System.out.println("TOTAL: " + total);
	}
}