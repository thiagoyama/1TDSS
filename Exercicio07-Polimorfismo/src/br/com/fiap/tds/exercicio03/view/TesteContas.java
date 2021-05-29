package br.com.fiap.tds.exercicio03.view;

import javax.swing.JOptionPane;

import br.com.fiap.tds.exercicio03.bean.ContaCorrente;
import br.com.fiap.tds.exercicio03.bean.ContaPoupanca;
import br.com.fiap.tds.exercicio03.bean.Titular;

public class TesteContas {
	
	public static void main(String[] args) {
		
		//Ler os dados do titular (nome e cpf)
		String nome = JOptionPane.showInputDialog("Digite o nome");
		String cpf = JOptionPane.showInputDialog("Digite o CPF");
		
		//Instanciar um Titular
		Titular titular = new Titular(nome, cpf);
		
		//Ler os dados da conta corrente (saldo, agencia, numero conta, limite credito)
		double saldoCc = Double.parseDouble(JOptionPane.showInputDialog("Digite o saldo da cc"));
		int agenciaCc = Integer.parseInt(JOptionPane.showInputDialog("Digite a agencia da cc"));
		String numeroCc = JOptionPane.showInputDialog("Digite o número da cc");
		double limite = Double.parseDouble(JOptionPane.showInputDialog("Digite o limite de crédito"));
		
		//Instanciar uma conta corrente
		ContaCorrente cc = new ContaCorrente(saldoCc, titular, agenciaCc, numeroCc, limite);
		
		//Ler os dados da conta poupança (saldo, agencia, numero conta, taxa juros)
		double saldoPoupanca = Double.parseDouble(JOptionPane.showInputDialog("Digite o saldo da poupança"));
		int agenciaPoupanca = Integer.parseInt(JOptionPane.showInputDialog("Digite a agencia da poupança"));
		String numeroPoupanca = JOptionPane.showInputDialog("Digite o número da conta poupança");
		double taxa = Double.parseDouble(JOptionPane.showInputDialog("Digite a taxa de juros"));
		
		//Instanciar uma conta poupança
		ContaPoupanca cp = new ContaPoupanca(saldoPoupanca, titular, agenciaPoupanca, numeroPoupanca, taxa);
		
		//Exibir os dados da conta corrente
		JOptionPane.showMessageDialog(null, "Conta Corrente: " + cc);
		
		//Exibir os dados da conta poupança
		JOptionPane.showMessageDialog(null, "Poupança " +  cp);
		
		//Pedir o valor para sacar
		double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor para saque"));
		
		//Sacar das contas
		cc.sacar(valor);
		cp.sacar(valor);
		
		//Exibir os dados das contas
		JOptionPane.showMessageDialog(null, "Conta Corrente: " + cc);
		JOptionPane.showMessageDialog(null, "Poupança: " + cp);
		
		//Pedir o o valor para depositar
		valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor para depósito"));
		
		//Depositar nas contas
		cc.depositar(valor);
		cp.depositar(valor);
		
		//Exibir os dados das contas
		JOptionPane.showMessageDialog(null, "Conta Corrente: " + cc);
		JOptionPane.showMessageDialog(null, "Poupança: " + cp);
		
		//Exibir os saldos (através do método exibirSaldo)
		JOptionPane.showMessageDialog(null, "Saldo da cc com limite: " +  cc.exibirSaldo());
		
	}
}
