package br.com.a5.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import br.com.a5.util.Propriedade.EnumPropriedade;

public class HorarioUtil {
	
	public boolean verificaSeFuncionando() {
		if(verificaSeFeriado() || verificaHorarioAtendimento()) {
			return false;
		}
		return true;
	}
	
	public Integer verificaPeriodo() {
		return 1;
	}
	
	private boolean verificaSeFeriado() {
		return true;
	}
	
	public static boolean verificaHorarioAtendimento() {
		Propriedade prop = new Propriedade(EnumPropriedade.Horario);
		
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");	
		
		//Date horarioAtual = sdf.parse();
		
		try {
			Date horarioAbertura = sdf.parse(prop.getValor("horarioAbertura"));
			Date horarioFechamento = sdf.parse(prop.getValor("horarioFechamento"));
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		return true;
	}	
}
