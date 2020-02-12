package br.com.a5.bean;

import java.util.Date;

public abstract class PessoaBean {

	private String numeroTelefone;
	private Date anoNascimento;
	
	public PessoaBean() {
	}
	
	public PessoaBean(String numeroTelefone, Date anoNascimento) {
		this.numeroTelefone = numeroTelefone;
		this.anoNascimento = anoNascimento;
	}

	public String getNumeroTelefone() {
		return numeroTelefone;
	}
	
	public void setNumeroTelefone(String numeroTelefone) {
		this.numeroTelefone = numeroTelefone;
	}
	
	public Date getAnoNascimento() {
		return this.anoNascimento;
	}
	
	public void setAnoNascimento(Date anoNascimento) {
		this.anoNascimento = anoNascimento;
	}

	@Override
	public String toString() {
		return "Pessoa [numeroTelefone=" + numeroTelefone + ", anoNascimento=" + anoNascimento + "]";
	}
	
}
