package FactoryMethod.Emissores;

public class EmissorSincronoSMS extends EmissorSMS {

	public void envia(String mensagem) {
		System.out.println("Enviando mensagem por SMS: " + mensagem);

	}

}
