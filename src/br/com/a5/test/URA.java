package br.com.a5.test;

import br.com.a5.view.PrincipalView;

public class URA {

	public static void main(String[] args) {
		
		PrincipalView principalView = new PrincipalView();
		
		// valida��o de cpf
		System.out.println(principalView.insereCpf("49127970817") ? "CPF v�lido" : "CPF inv�lido");
		System.out.println(principalView.insereCpf("11111111111") ? "CPF v�lido" : "CPF inv�lido");
		System.out.println(principalView.insereCpf("49127970815") ? "CPF v�lido" : "CPF inv�lido");
		System.out.println(principalView.insereCpf("12345678910123") ? "CPF v�lido" : "CPF inv�lido");
		System.out.println(principalView.insereCpf("12345678") ? "CPF v�lido" : "CPF inv�lido");
		System.out.println(principalView.insereCpf("4%&%6!*@#$&") ? "CPF v�lido" : "CPF inv�lido");
		
		System.out.println();
		
		// valida��o de cnpj
		System.out.println(principalView.insereCnpj("01549327000180") ? "CNPJ v�lido" : "CNPJ inv�lido");
		System.out.println(principalView.insereCnpj("22646372000122") ? "CNPJ v�lido" : "CNPJ inv�lido");
		System.out.println(principalView.insereCnpj("0154932700018080") ? "CNPJ v�lido" : "CNPJ inv�lido");
		System.out.println(principalView.insereCnpj("015493270001") ? "CNPJ v�lido" : "CNPJ inv�lido");
		System.out.println(principalView.insereCnpj("$%#�@&*!�@%#$$") ? "CNPJ v�lido" : "CNPJ inv�lido");
		System.out.println(principalView.insereCnpj("11111111111111") ? "CNPJ v�lido" : "CNPJ inv�lido");
		
		System.out.println();
		
		// valida��o de numero de celular
		System.out.println(principalView.insereNumeroTelefone("991046279") ? "N�mero de celular v�lido" : "N�mero de celular inv�lido");
		System.out.println(principalView.insereNumeroTelefone("991046279") ? "N�mero de celular v�lido" : "N�mero de celular inv�lido");
		System.out.println(principalView.insereNumeroTelefone("991046279") ? "N�mero de celular v�lido" : "N�mero de celular inv�lido");
		System.out.println(principalView.insereNumeroTelefone("991046279") ? "N�mero de celular v�lido" : "N�mero de celular inv�lido");
		System.out.println(principalView.insereNumeroTelefone("991046279") ? "N�mero de celular v�lido" : "N�mero de celular inv�lido");
		System.out.println(principalView.insereNumeroTelefone("991046279") ? "N�mero de celular v�lido" : "N�mero de celular inv�lido");
		

	}

}
