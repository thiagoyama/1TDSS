package br.com.empresa.cadastro.view;

import javax.swing.JOptionPane;
import br.com.empresa.cadastro.entidades.Cliente;

public class TesteCliente {

	public static void main(String[] args) {
		
		//Ler os dados do cliente
		int codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o código"));
		String nome = JOptionPane.showInputDialog("Digite o nome");
		String titulo = JOptionPane.showInputDialog("Digite o título");
		
		//Instanciar um cliente
		Cliente cliente = new Cliente(codigo, nome, titulo);
		
		//Exibir o nome cadastro do cliente
		cliente.exibirNomeFormatado();
		
	}
	
}
