package com.empregosApp.models;

// import java.util.ArrayList;
import org.hibernate.validator.constraints.br.CNPJ;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class Prestador{

	@Id
	private int idPrestador;

	@Column(name = "razao_social", length = 100, nullable = false)
	private String razaoSocial;

	@CNPJ
	@Column(name = "cnpj", length = 18, nullable = false)
	private String cnpj;

	public Prestador(){

	}

	public Prestador(int idPrestador, String razaoSocial, @CNPJ String cnpj) {
		this.idPrestador = idPrestador;
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
	}

	public int getIdPrestador() {
		return idPrestador;
	}

	public void setIdPrestador(int idPrestador) {
		this.idPrestador = idPrestador;
	}
	
	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	//Função para tabela de contratações
	// public ArrayList<Usuario> contrata(Prestador prestador, Candidato candidato) {
	// 	ArrayList<Usuario> usuarios = new ArrayList<>();
	// 	usuarios.add(prestador);
	// 	usuarios.add(candidato);
	// 	return usuarios;
	// }


}
