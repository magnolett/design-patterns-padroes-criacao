package FactoryMethod.Emissores;

public class EmissorCreator {
	public static final int SMS = 0;
	public static final int JMS = 1;
	public static final int Email = 2;
	public static final int VISA = 3;
	public static final int MASTER = 4;

	public Emissor create(int tipoEmissor) {
		if (tipoEmissor == EmissorCreator.SMS) {
			return new EmissorSMS();
		}
		if (tipoEmissor == EmissorCreator.JMS) {
			return new EmissorJMS();
		}
		if (tipoEmissor == EmissorCreator.Email) {
			return new EmissorEmail();
		}
		if (tipoEmissor == EmissorCreator.VISA) {
			return new EmissorVisa();
		}
		if (tipoEmissor == EmissorCreator.MASTER) {
			return new EmissorMaster();
		} else { 
			throw new IllegalArgumentException("Tipo de emissor não encontrado!"); 
			
		}
	}
}
