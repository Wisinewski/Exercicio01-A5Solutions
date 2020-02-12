package br.com.a5.util;

import java.io.FileInputStream;
import java.util.Properties;

public class Propriedade {

	public enum EnumPropriedade {
		Horario, Database, Feriados
	}

	private static final String HORARIO = "horarioAtendimento.properties";
	private static final String DATABASE = "databaseConfig.properties";
	private static final String FERIADOS = "feriados.properties";

	private Properties properties;

	private static String path = "C:\\Users\\ggomes\\eclipse-workspace\\Exercicio01\\properties\\";
	private String arquivo;

	public Propriedade(EnumPropriedade tipo) {

		switch (tipo) {
		case Horario:
			arquivo = HORARIO;
			try {
				FileInputStream fis = new FileInputStream(path + arquivo);
				properties = new Properties();
				properties.load(fis);
				fis.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
		case Database:
			arquivo = DATABASE;
			try {
				FileInputStream fis = new FileInputStream(path + arquivo);
				properties = new Properties();
				properties.load(fis);
				fis.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
		case Feriados:
			arquivo = FERIADOS;
			try {
				FileInputStream fis = new FileInputStream(path + arquivo);
				properties = new Properties();
				properties.load(fis);
				fis.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
		default:
			break;
		}
	}

	public String getValor(String propriedade) {
		String valor = properties.getProperty(propriedade);
		return valor;
	}

}
