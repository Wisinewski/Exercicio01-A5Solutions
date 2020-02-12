package br.com.a5.view;

import br.com.a5.bean.PessoaBean;
import br.com.a5.controller.PessoaController;
import br.com.a5.controller.PessoaFisicaController;
import br.com.a5.controller.PessoaJuridicaController;

public class PrincipalView {
	/*
	public PessoaBean pessoaBean;
	
	public PrincipalView(PessoaBean pessoaBean) {
		this.pessoaBean = pessoaBean;
	}
	*/

	private PessoaController pessoaController = new PessoaController();
	private PessoaFisicaController pessoaFisicaController = new PessoaFisicaController();
	private PessoaJuridicaController pessoaJuridicaController = new PessoaJuridicaController();
	
	public boolean insereCpf(String cpf) {
		return pessoaFisicaController.insereCpf(cpf);
	}
	
	public boolean insereCnpj(String cnpj) {
		return pessoaJuridicaController.insereCnpj(cnpj);
	}
	
	public boolean insereNumeroTelefone(String numeroTelefone) {
		return pessoaController.insereNumeroTelefone(numeroTelefone);
	}

}
