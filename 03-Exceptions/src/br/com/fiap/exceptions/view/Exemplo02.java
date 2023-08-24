package br.com.fiap.exceptions.view;

import javax.swing.JOptionPane;

import br.com.fiap.exceptions.exception.ImpostoInvalidoException;
import br.com.fiap.exceptions.exception.QuantidadeInvalidaException;
import br.com.fiap.exceptions.model.Produto;

public class Exemplo02 {
	
	public static void main(String[] args) {
		//Instanciar um produto com valores
		Produto feijao = new Produto("Feijao", 3.5);
		
		try {
			//Ler o imposto
			double imposto = Double.parseDouble(JOptionPane
					.showInputDialog("Digite o imposto"));
			
			//Calcular e exibir o imposto
			double valor = feijao.calcularImposto(imposto);
			System.out.println(valor);
			
			//Ler a quantidade
			int qtd = Integer.parseInt(JOptionPane
					.showInputDialog("Digite a quantidade"));
			
			//Calcular o valor total
			double valorTotal = feijao.calcularValorTotal(qtd);
			System.out.println(valorTotal);
			
		} catch (NumberFormatException e) {
			System.err.println("Imposto deve ser um número");
		} catch (ImpostoInvalidoException e) {
			System.err.println(e.getMessage());
		} catch (QuantidadeInvalidaException e) {
			System.err.println(e.getMessage());
		}
		
	}//main
}//class