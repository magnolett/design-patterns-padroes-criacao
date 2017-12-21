package FactoryMethod.Receptores;

public class ReceptorAssincronoCreator extends ReceptorCreator {
	
	public Receptor create(int tipoDeEmissor) {
		if (tipoDeEmissor == ReceptorCreator.SMS) {
			return new ReceptorAssincronoSMS();
		} else if (tipoDeEmissor == ReceptorCreator.Email) {
			return new ReceptorAssincronoEmail();
		} else if (tipoDeEmissor == ReceptorCreator.JMS) {
			return new ReceptorAssincronoJMS();
		} else {
			throw new IllegalArgumentException("Tipo de emissor não suportado!");
			
		}
	}

}
