package br.com.fiap.tds.bean;

public class Aluno extends Pessoa {

	//Atributos
	private int matricula;
	
	private Curso curso;
	
	//Construtores
	public Aluno() {}
	
	public Aluno(String nome, String cpf, int matricula, Curso curso) {
		super(nome, cpf);
		this.matricula = matricula;
		this.curso = curso;
	}
	
	//Métodos
	/**
	 * Nome - RMXXXXX
	 * FIAP - 2021
	 */
	public String gerarAssinatura() {
		return nome + " - RM" + matricula + "\nFIAP - 2021";
	}

	//Getters/Setters
	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	
}