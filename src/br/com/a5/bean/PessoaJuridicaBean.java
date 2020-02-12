package br.com.a5.bean;

import java.util.Date;

public class PessoaJuridicaBean extends PessoaBean {
	
	private String cnpj;
	
	public PessoaJuridicaBean(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public PessoaJuridicaBean(String cnpj, String numeroTelefone, Date anoNascimento) {
		super(numeroTelefone, anoNascimento);
		this.cnpj = cnpj;
	}
	
	public String getCpf() {
		return this.cnpj;
	}

	@Override
	public String toString() {
		return "PessoaJuridica [cnpj=" + cnpj + "]";
	}
	
}
