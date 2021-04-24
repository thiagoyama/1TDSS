package br.com.fiap.tds.view;

import javax.swing.JOptionPane;
import br.com.fiap.tds.bean.Elevador;

public class TesteElevador {

	public static void main(String[] args) {
		
		//Pedir para o usuário o total de andares e a capacidade
		int totalAndares = Integer.parseInt(JOptionPane.showInputDialog("Qual o total de andares?"));
		int capacidade = Integer.parseInt(JOptionPane.showInputDialog("Qual a capacidade do elevador?"));
		
		//Instanciar um elevador com os dados informados
		Elevador elevador = new Elevador(capacidade, totalAndares);
		
		int op;
		
		do {
		//while (op != 0) {
		
			//Pedir uma opção para o usuário
			// 1 - Subir um andar, exibir o andar atual
			// 2 - Descer um andar, exibir o andar atual
			// 3 - Entrar com x pessoas, exibir a qtd de pessoas no elevador
			// 4 - Sair com x pessoas, exibir a qtd de pessoas no elevador
			// 0 - Sair do programa
			op = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção: \n"
					+ "1-Subir \n"
					+ "2-Descer \n"
					+ "3-Entrar no elevador \n"
					+ "4-Sair do elevador \n"
					+ "0-Encerrar"));
			
			switch (op) {
			case 1: {
				//Chama o método para subir um andar
				elevador.sobe();
				//Exibe o andar atual para o usuário
				JOptionPane.showMessageDialog(null, "Andar atual: " + elevador.getAndarAtual());
				break;
			}
			case 2: {
				//Chama o método para descer um andar
				elevador.desce();
				//Exibe o andar atual para o usuário
				JOptionPane.showMessageDialog(null, "Andar atual: " + elevador.getAndarAtual());
				break;
			}
			case 3: {
				//Ler a quantidade de pessoas que querem entrar no elevador
				int qtd = Integer.parseInt(JOptionPane.showInputDialog("Quantas pessoas vão entrar?"));
				//Chama o método para entrar e exibe a quantidade de pessoas no elevador
				JOptionPane.showMessageDialog(null, "Pessoas no elevador: " + elevador.entra(qtd));
				break;
			}
			case 4 : {
				//Ler a quantidade de pessoas que querem sair do elevador
				int qtd = Integer.parseInt(JOptionPane.showInputDialog("Quantas pessoas vão sair?"));
				//Chama o método para sair e exibe a qtd de pessoas no elevador
				JOptionPane.showMessageDialog(null, "Pessoas no elevador: " + elevador.sai(qtd));
				break;
			}
			case 0 : {
				JOptionPane.showMessageDialog(null, "Programa encerrando.. obrigado!");
				break;
			}
			default:
				JOptionPane.showMessageDialog(null, "Opção inválida");
			}
		
		} while(op != 0); //while 
		
	}// main

}// classe