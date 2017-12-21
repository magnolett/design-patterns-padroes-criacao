package FactoryMethod.Receptores;

public class ReceptorAssincronoSMS extends ReceptorSMS {

	@Override
	public void envia(String mensagem) {
		System.out.println("Enviando mensagem por SMS: " + mensagem);

	}

}
