package br.com.a5.test;

import br.com.a5.view.PrincipalView;

public class CnpjTest {

	public static void main(String[] args) {

		System.out.println(PrincipalView.insereCnpj("01549327000180") ? "CNPJ válido" : "CNPJ inválido");
		System.out.println(PrincipalView.insereCnpj("22646372000122") ? "CNPJ válido" : "CNPJ inválido");
		System.out.println(PrincipalView.insereCnpj("0154932700018080") ? "CNPJ válido" : "CNPJ inválido");
		System.out.println(PrincipalView.insereCnpj("015493270001") ? "CNPJ válido" : "CNPJ inválido");
		System.out.println(PrincipalView.insereCnpj("$%#¨@&*!¨@%#$$") ? "CNPJ válido" : "CNPJ inválido");
		System.out.println(PrincipalView.insereCnpj("11111111111111") ? "CNPJ válido" : "CNPJ inválido");
		
	}

}
