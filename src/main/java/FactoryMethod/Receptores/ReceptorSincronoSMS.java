package FactoryMethod.Receptores;

public class ReceptorSincronoSMS extends ReceptorSMS {

	public void envia(String mensagem) {
		System.out.println("Enviando mensagem por SMS: " + mensagem);

	}

}
