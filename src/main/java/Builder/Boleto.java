package Builder;

import java.util.Calendar;

public interface Boleto {

	String getSacado();
	String getCedente();
	double getValor();
	Calendar getVencimento();
	Integer getNossoNumero();
	String toString();
	
	
}
