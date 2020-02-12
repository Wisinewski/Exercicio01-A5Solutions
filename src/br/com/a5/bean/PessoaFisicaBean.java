package br.com.a5.bean;

import java.util.Date;

public class PessoaFisicaBean extends PessoaBean {
	
	private String cpf;
	
	public PessoaFisicaBean(String cpf) {
		this.cpf = cpf;
	}
	
	public PessoaFisicaBean(String cpf, String numeroTelefone, Date anoNascimento) {
		super(numeroTelefone, anoNascimento);
		this.cpf = cpf;
	}
	
	public String getCpf() {
		return this.cpf;
	}

	@Override
	public String toString() {
		return "PessoaFisica [cpf=" + cpf + "]";
	}
	
}
