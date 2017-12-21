package Builder;

import java.util.Calendar;

//Objetivo: Separar o processo de construção de um objeto de sua representação e permitir a sua criação passo-a-passo. 
//Diferentes tipos de objetos podem ser criados com implementações distintas de cada passo.

public interface BoletoBuilder {

	void buildSacado(String sacado);
	void buildCedente(String cedente);
	void buildValor (double valor);
	void buildVencimento(Calendar vencimento);
	void buildNossoNumero(Integer nossoNumero);
	
	Boleto getBoleto();
}
