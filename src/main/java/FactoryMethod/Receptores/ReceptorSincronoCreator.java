package FactoryMethod.Receptores;

public class ReceptorSincronoCreator extends ReceptorCreator {
	
	public Receptor create(int tipoDeEmissor) {
		if (tipoDeEmissor == ReceptorCreator.SMS) {
			return new ReceptorSincronoSMS();
		} else if (tipoDeEmissor == ReceptorCreator.Email) {
			return new ReceptorSincronoEmail();
		} else if (tipoDeEmissor == ReceptorCreator.JMS) {
			return new ReceptorSincronoJMS();
		} else {
			throw new IllegalArgumentException("Tipo de emissor não suportado!");
			
		}
	}

}
