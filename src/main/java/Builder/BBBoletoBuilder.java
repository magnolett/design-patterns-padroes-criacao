package Builder;

import java.util.Calendar;

public class BBBoletoBuilder implements BoletoBuilder {
	private String sacado;
	private String cedente;
	private double valor;
	private Calendar vencimento;
	private Integer nossoNumero;
	
	
	
	public void buildSacado(String sacado) {
		this.sacado = sacado;
	}

	public void buildCedente(String cedente) {
		this.cedente = cedente;
	}

	public void buildValor(double valor) {
		this.valor = valor;
	}

	public void buildVencimento(Calendar vencimento) {
		this.vencimento = vencimento;
	}

	public void buildNossoNumero(Integer nossoNumero) {
		this.nossoNumero = nossoNumero;
	}

	public Boleto getBoleto() {
		return new BBBoleto(sacado, cedente, valor, vencimento, nossoNumero);
	}
}
