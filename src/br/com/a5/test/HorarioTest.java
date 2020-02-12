package br.com.a5.test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import br.com.a5.util.HorarioUtil;
import br.com.a5.util.Propriedade;
import br.com.a5.util.Propriedade.EnumPropriedade;

public class HorarioTest {

	public static void main(String[] args) throws IOException {

		HorarioUtil.verificaHorarioAtendimento();
		/*
		Propriedade prop = new Propriedade(EnumPropriedade.Feriados);
		String[] testee = prop.getValor("janeiro").split(";");
		List<String> lista = new ArrayList<String>();
		
		for(int i = 0; i < testee.length; i++) {
			lista.add(testee[i]);
		}
		
		System.out.println(lista.contains("99"));
		
		*/
		
//		Propriedade prop = new Propriedade(EnumPropriedade.Horario);
//		System.out.println(prop.getValor("mensagem"));
//		
//		Propriedade propDatabase = new Propriedade(EnumPropriedade.Database);
//		System.out.println(propDatabase.getValor("host"));
//		System.out.println(propDatabase.getValor("port"));
		
//		HorarioUtil horarioUtil = new HorarioUtil();
		
//		horarioUtil.verificaHorarioAtendimento();

	}

}
