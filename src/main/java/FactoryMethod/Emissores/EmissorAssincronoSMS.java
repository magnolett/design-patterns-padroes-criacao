package FactoryMethod.Emissores;

public class EmissorAssincronoSMS extends EmissorSMS {

	@Override
	public void envia(String mensagem) {
		System.out.println("Enviando mensagem por SMS: " + mensagem);

	}

}
