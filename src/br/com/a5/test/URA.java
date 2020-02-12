package br.com.a5.test;

import br.com.a5.view.PrincipalView;

public class URA {

	public static void main(String[] args) {
		
		PrincipalView principalView = new PrincipalView();
		
		// validação de cpf
		System.out.println(principalView.insereCpf("49127970817") ? "CPF válido" : "CPF inválido");
		System.out.println(principalView.insereCpf("11111111111") ? "CPF válido" : "CPF inválido");
		System.out.println(principalView.insereCpf("49127970815") ? "CPF válido" : "CPF inválido");
		System.out.println(principalView.insereCpf("12345678910123") ? "CPF válido" : "CPF inválido");
		System.out.println(principalView.insereCpf("12345678") ? "CPF válido" : "CPF inválido");
		System.out.println(principalView.insereCpf("4%&%6!*@#$&") ? "CPF válido" : "CPF inválido");
		
		System.out.println();
		
		// validação de cnpj
		System.out.println(principalView.insereCnpj("01549327000180") ? "CNPJ válido" : "CNPJ inválido");
		System.out.println(principalView.insereCnpj("22646372000122") ? "CNPJ válido" : "CNPJ inválido");
		System.out.println(principalView.insereCnpj("0154932700018080") ? "CNPJ válido" : "CNPJ inválido");
		System.out.println(principalView.insereCnpj("015493270001") ? "CNPJ válido" : "CNPJ inválido");
		System.out.println(principalView.insereCnpj("$%#¨@&*!¨@%#$$") ? "CNPJ válido" : "CNPJ inválido");
		System.out.println(principalView.insereCnpj("11111111111111") ? "CNPJ válido" : "CNPJ inválido");
		
		System.out.println();
		
		// validação de numero de celular
		System.out.println(principalView.insereNumeroTelefone("991046279") ? "Número de celular válido" : "Número de celular inválido");
		System.out.println(principalView.insereNumeroTelefone("991046279") ? "Número de celular válido" : "Número de celular inválido");
		System.out.println(principalView.insereNumeroTelefone("991046279") ? "Número de celular válido" : "Número de celular inválido");
		System.out.println(principalView.insereNumeroTelefone("991046279") ? "Número de celular válido" : "Número de celular inválido");
		System.out.println(principalView.insereNumeroTelefone("991046279") ? "Número de celular válido" : "Número de celular inválido");
		System.out.println(principalView.insereNumeroTelefone("991046279") ? "Número de celular válido" : "Número de celular inválido");
		

	}

}
