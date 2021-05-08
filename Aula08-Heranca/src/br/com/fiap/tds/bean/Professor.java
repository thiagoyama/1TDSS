package br.com.fiap.tds.bean;

public class Professor extends Pessoa {

	//Atributos
	private String materia;
	
	private int numeroAulas;
	
	private double valorAula;
	
	//Construtores
	public Professor() {}
	
	public Professor(String nome, String cpf, String materia, int numeroAulas, double valorAula) {
		super(nome, cpf);
		this.materia = materia;
		this.numeroAulas = numeroAulas;
		this.valorAula = valorAula;
	}
	
	//Métodos
	public double calcularSalario() {
		return numeroAulas * valorAula;
	}

	//Getters e Setters
	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public int getNumeroAulas() {
		return numeroAulas;
	}

	public void setNumeroAulas(int numeroAulas) {
		this.numeroAulas = numeroAulas;
	}

	public double getValorAula() {
		return valorAula;
	}

	public void setValorAula(double valorAula) {
		this.valorAula = valorAula;
	}
	
}