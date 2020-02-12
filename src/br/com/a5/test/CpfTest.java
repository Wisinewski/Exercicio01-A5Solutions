package br.com.a5.test;

import br.com.a5.view.PrincipalView;

public class CpfTest {

	public static void main(String[] args) {
		
		System.out.println(PrincipalView.insereCpf("49127970817") ? "CPF válido" : "CPF inválido");
		System.out.println(PrincipalView.insereCpf("11111111111") ? "CPF válido" : "CPF inválido");
		System.out.println(PrincipalView.insereCpf("49127970815") ? "CPF válido" : "CPF inválido");
		System.out.println(PrincipalView.insereCpf("12345678910123") ? "CPF válido" : "CPF inválido");
		System.out.println(PrincipalView.insereCpf("12345678") ? "CPF válido" : "CPF inválido");
		System.out.println(PrincipalView.insereCpf("4%&%6!*@#$&") ? "CPF válido" : "CPF inválido");

	}

}
