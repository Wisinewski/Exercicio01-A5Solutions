package br.com.a5.controller;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import br.com.a5.bean.PessoaBean;

public class PessoaController {

	private PessoaBean pessoaBean;

	public PessoaController() {
	}

	public boolean insereNumeroTelefone(String numeroTelefone) {
		if (validaNumeroTelefone(numeroTelefone)) {
			return true;
		}
		return false;
	}

	private boolean validaNumeroTelefone(String numeroTelefone) {
		/*
		// verifica se est� vazio ou se � n�mero p�blico
		if (numeroTelefone.length() == 0 || numeroTelefone.length() == 3) {
			return false;
		}

		// verifica se tem c�digo do pa�s
		if (numeroTelefone.subSequence(0, 2) == "+55") {
			numero = numeroTelefone.subSequence(0, 2);
		}

		// Verificar se menos que 12 digitos
		if (numero.length() < 12) {
			return false;
		}

		// Verificar se cont�m 13 digitos
		if (continuar && numero.length === 13) {
			alert("N�mero m�vel");
			continuar = false;
		}

	  // Verificar se o 5� digito
	  var digitoControlo = numero.charAt(4);

	  if (continuar) {

	    if (digitoControlo >= 2 && digitoControlo <= 5) {
	      alert("N�mero fixo");
	    } else if (digitoControlo >= 6 && digitoControlo <= 9) {
	      alert("N�mero m�vel");
	    } else {
	      alert("N�mero especial");
	    }
	  }
	}
	*/
		return true;
	}
}
