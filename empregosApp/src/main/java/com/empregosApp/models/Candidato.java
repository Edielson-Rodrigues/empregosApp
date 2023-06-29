package com.empregosApp.models;

import org.hibernate.validator.constraints.br.CPF;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Candidato{

	@Id
	private int idCandidato;

	@Column(name = "curriculo", columnDefinition = "text")
	private String curriculo;

	@CPF
	@Column(name = "cpf", length = 14, nullable = false)
	private String cpf;

	@Column(name = "data_de_nascimento", columnDefinition = "date", nullable = false)
	private String dataDeNascimento;
	
	public Candidato(){

	}

	public Candidato(int idCandidato, String curriculo, String cpf, String dataDeNascimento) {
		this.idCandidato = idCandidato;
		this.curriculo = curriculo;
		this.cpf = cpf;
		this.dataDeNascimento = dataDeNascimento;
	}

	public int getIdCandidato() {
		return idCandidato;
	}

	public void setIdCandidato(int idCandidato) {
		this.idCandidato = idCandidato;
	}

	public String getCurriculo() {
		return curriculo;
	}

	public void setCurriculo(String curriculo) {
		this.curriculo = curriculo;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(String dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
	
}
