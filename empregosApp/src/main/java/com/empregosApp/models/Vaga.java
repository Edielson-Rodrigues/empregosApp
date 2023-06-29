package com.empregosApp.models;

public class Vaga {

	private String funcoes;
	private String  requisitos;
	private double salario;
	private String Titulo;

	public Vaga(String funcoes, String requisitos, double salario, String titulo) {
		this.funcoes = funcoes;
		this.requisitos = requisitos;
		this.salario = salario;
		Titulo = titulo;
	}

	public String getFuncoes() {
		return funcoes;
	}

	public void setFuncoes(String funcoes) {
		this.funcoes = funcoes;
	}

	public String getRequisitos() {
		return requisitos;
	}

	public void setRequisitos(String requisitos) {
		this.requisitos = requisitos;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getTitulo() {
		return Titulo;
	}

	public void setTitulo(String titulo) {
		Titulo = titulo;
	}
	
	
}
