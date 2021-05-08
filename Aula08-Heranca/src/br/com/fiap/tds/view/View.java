package br.com.fiap.tds.view;

import javax.swing.JOptionPane;

import br.com.fiap.tds.bean.Aluno;
import br.com.fiap.tds.bean.Curso;
import br.com.fiap.tds.bean.Pessoa;
import br.com.fiap.tds.bean.Professor;

public class View {

	//main -> CTRL + espaço
	public static void main(String[] args) {
		
		//Instaciar uma Pessoa
		Pessoa pessoa = new Pessoa("Luiz", "123.232.2323-22");
		
		//Instanciar um Aluno
		Aluno aluno = new Aluno();
		
		//Instanciar um Professor
		Professor prof = new Professor();
		
		//Ler as informações do aluno (Pedir para o usuário)
		String nome = JOptionPane.showInputDialog("Digite o nome");
		String cpf = JOptionPane.showInputDialog("Digite o CPF");
		int matricula = Integer.parseInt(JOptionPane.showInputDialog("Digite a matricula"));
		
		String nomeCurso = JOptionPane.showInputDialog("Digite o nome do curso");
		int cargaHoraria = Integer.parseInt(JOptionPane.showInputDialog("Digite a carga horária"));
		
		//Instanciar um Aluno com as informações
		
		//Curso curso = new Curso(nomeCurso, cargaHoraria);
		//Aluno aluno2 = new Aluno(nome, cpf, matricula, curso);
		Aluno aluno2 = new Aluno(nome, cpf, matricula, new Curso(nomeCurso, cargaHoraria));
		
		//Exibir a assinatura de E-mail e o cpf formatado
		System.out.println("Assinatura: " + aluno2.gerarAssinatura());
		System.out.println("Cpf formatado: " + aluno2.formartarCpf());
		
		//Exibir o nome do curso e carga horária (Utilizando o objeto aluno2)
		System.out.println("Curso: " + aluno2.getCurso().getNome() 
				+ "\nCarga horária: " + aluno2.getCurso().getCargaHoraria());
		
		
	}//main
	
}//classe