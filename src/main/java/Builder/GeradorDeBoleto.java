package Builder;

import java.util.Calendar;

public class GeradorDeBoleto {
	private BoletoBuilder boletoBuilder;
	
	public GeradorDeBoleto(BoletoBuilder boletoBuilder) {
		this.boletoBuilder = boletoBuilder;
	}

	public Boleto geraBoleto() {
		this.boletoBuilder.buildSacado("Marcos Agnoletto");
		
		this.boletoBuilder.buildCedente("Assert Sistemas");
		
		this.boletoBuilder.buildValor(1469.53);
		
		Calendar vencimento = Calendar.getInstance();
		vencimento.add(Calendar.DATE, 30);
		this.boletoBuilder.buildVencimento(vencimento);

		this.boletoBuilder.buildNossoNumero(43210);
		
		Boleto boleto = boletoBuilder.getBoleto();
		
		return boleto;
	}

}
