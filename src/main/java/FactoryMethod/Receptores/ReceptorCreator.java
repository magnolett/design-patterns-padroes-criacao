package FactoryMethod.Receptores;

public class ReceptorCreator {
	public static final int SMS = 0;
	public static final int JMS = 1;
	public static final int Email = 2;
	public static final int VISA = 3;
	public static final int MASTER = 4;

	public Receptor create(int tipoReceptor) {
		if (tipoReceptor == ReceptorCreator.SMS) {
			return new ReceptorSMS();
		}
		if (tipoReceptor == ReceptorCreator.JMS) {
			return new ReceptorJMS();
		}
		if (tipoReceptor == ReceptorCreator.Email) {
			return new ReceptorEmail();
		}
		if (tipoReceptor == ReceptorCreator.VISA) {
			return new ReceptorVisa();
		}
		if (tipoReceptor == ReceptorCreator.MASTER) {
			return new ReceptorMaster();
		} else { 
			throw new IllegalArgumentException("Tipo de emissor não encontrado!"); 
			
		}
	}
}
