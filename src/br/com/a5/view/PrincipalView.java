package br.com.a5.view;

import br.com.a5.bean.PessoaBean;
import br.com.a5.controller.PessoaController;
import br.com.a5.controller.PessoaFisicaController;
import br.com.a5.controller.PessoaJuridicaController;

public class PrincipalView {
	
	public static boolean insereCpf(String cpf) {
		return PessoaFisicaController.insereCpf(cpf);
	}
	
	public static boolean insereCnpj(String cnpj) {
		return PessoaJuridicaController.insereCnpj(cnpj);
	}
	
	public static boolean insereNumeroTelefone(String numeroTelefone) {
		return PessoaController.insereNumeroTelefone(numeroTelefone);
	}

}
