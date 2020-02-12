package br.com.a5.test;

import br.com.a5.view.PrincipalView;

public class CpfTest {

	public static void main(String[] args) {
		
		System.out.println(PrincipalView.insereCpf("49127970817") ? "CPF v�lido" : "CPF inv�lido");
		System.out.println(PrincipalView.insereCpf("11111111111") ? "CPF v�lido" : "CPF inv�lido");
		System.out.println(PrincipalView.insereCpf("49127970815") ? "CPF v�lido" : "CPF inv�lido");
		System.out.println(PrincipalView.insereCpf("12345678910123") ? "CPF v�lido" : "CPF inv�lido");
		System.out.println(PrincipalView.insereCpf("12345678") ? "CPF v�lido" : "CPF inv�lido");
		System.out.println(PrincipalView.insereCpf("4%&%6!*@#$&") ? "CPF v�lido" : "CPF inv�lido");

	}

}
