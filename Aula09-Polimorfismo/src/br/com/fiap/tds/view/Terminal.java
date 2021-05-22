package br.com.fiap.tds.view;

import javax.swing.JOptionPane;

import br.com.fiap.tds.bean.Produto;
import br.com.fiap.tds.bean.ProdutoPerecivel;

public class Terminal {
	
	public static void main(String[] args) {
		
		//Ler os dados do produto (nome, quantidade e valor)
		String nome = JOptionPane.showInputDialog("Digite o nome do produto");
		int qtd = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade"));
		double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor"));
		
		//Validar se o produto é perecível
		int perecivel = JOptionPane.showConfirmDialog(null, "É um produto perecível?");
		
		Produto produto; //declaração de uma variável do tipo produto
		
		//Se for, ler a data de validade e instanciar um produto perecivel
		if (perecivel == JOptionPane.YES_OPTION) {
			String dataValidade = JOptionPane.showInputDialog("Digite a data de validade");
			produto = new ProdutoPerecivel(nome, qtd, valor, dataValidade);
		} else {
			//Se não, Instanciar um produto com todos os valores (import CTRL + SHIFT + o)
			produto = new Produto(nome, qtd, valor);
		}
		
		//Exibir todos os dados do produto
		System.out.println(produto);
		
		//Pedir o tipo de desconto que será aplicado (0 - Padrão, 1 - Valor, 2 - Cupom)
		int op = Integer.parseInt(
			JOptionPane.showInputDialog("Digite o tipo de desconto:\n0-Padrão\n1-Valor\n2-Cupom"));
		
		//Calcular e exibir o valor a ser pago
		switch (op) {
		case 0: {
			System.out.println("Desconto padrão, valor: " + produto.calcularDesconto());
			break;
		}
		case 1: {
			float desconto = Float.parseFloat(JOptionPane.showInputDialog("Digite o desconto"));
			System.out.println("Desconto de " + desconto + ", valor: " + produto.calcularDesconto(desconto));
			break;
		}
		case 2:{
			String cupom = JOptionPane.showInputDialog("Digite o cupom");
			System.out.println("Desconto com cupom, valor: " + produto.calcularDesconto(cupom));
			break;
		} 
		default :
			System.out.println("Produto sem desconto: " + produto.getValor());
		}
		
	}//main
}//classe