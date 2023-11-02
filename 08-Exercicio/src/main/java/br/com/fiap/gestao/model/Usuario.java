package br.com.fiap.gestao.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Usuario {

	private int id;
	
	private String nome;
	
	private String email;
	
	private String cpf;
	
	private LocalDateTime dataCadastro;
	
	private LocalDate dataNascimento;
	
	public Usuario(String nome, String email, String cpf, LocalDate dataNascimento) {
		super();
		this.nome = nome;
		this.email = email;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
	}

	public Usuario(int id, String nome, String email, String cpf, LocalDateTime dataCadastro,
			LocalDate dataNascimento) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.cpf = cpf;
		this.dataCadastro = dataCadastro;
		this.dataNascimento = dataNascimento;
	}

	public Usuario() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public LocalDateTime getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(LocalDateTime dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
}