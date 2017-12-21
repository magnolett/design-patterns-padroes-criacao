package FactoryMethod.Receptores;

public class ReceptorSincronoJMS extends ReceptorJMS {

	public void envia(String mensagem) {
		System.out.println("Enviando mensagem por JMS: " + mensagem);

	}

}
