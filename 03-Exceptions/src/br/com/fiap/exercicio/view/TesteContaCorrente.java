package br.com.fiap.exercicio.view;

import javax.swing.JOptionPane;

import br.com.fiap.exercicio.model.ContaCorrente;

public class TesteContaCorrente {

	public static void main(String[] args) {
		//Instanciar uma ContaCorrente com valor e limite
		ContaCorrente cc = new ContaCorrente(200, 5000);
		
		//Setar o limite
		try {
			cc.setLimite(1000);
			System.out.println("Novo limite: " + cc.getLimite());
		}catch(Exception e) {
			System.err.println(e.getMessage());
		}
		
		//Depositar na conta
		try {
			double valor = Double.parseDouble(JOptionPane
						.showInputDialog("Valor para depósito"));
			cc.depositar(valor);
			System.out.println("Novo saldo: " + cc.getSaldo());
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
		//Sacar da conta
		try {
			double valor = Double.parseDouble(JOptionPane
					.showInputDialog("Valor para s"));
			cc.sacar(valor);
			System.out.println("Novo saldo: " + cc.getSaldo());
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
	}//main
}//class