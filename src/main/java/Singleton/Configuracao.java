package Singleton;

import java.util.HashMap;
import java.util.Map;

//Objetivo: Permitir a criação de uma única instância de uma classe e fornecer um modo pararecuperá-la

public class Configuracao {
	private Map<String, String> propriedades;
	private static Configuracao instance;
	
	private Configuracao() {
		this.propriedades = new HashMap<String, String>();
		this.propriedades.put("time-zone", "America/Florianópolis");
		this.propriedades.put("currency-code", "BRL");
	}
	
	public static Configuracao getInstance() {
		if (Configuracao.instance == null) {
			Configuracao.instance = new Configuracao();
		}
		return Configuracao.instance;
	}
	
	public String getPropriedade(String nomeDaPropriedade) {
		return this.propriedades.get(nomeDaPropriedade);
	}
}
