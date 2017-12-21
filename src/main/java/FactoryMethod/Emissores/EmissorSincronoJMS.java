package FactoryMethod.Emissores;

public class EmissorSincronoJMS extends EmissorJMS {

	public void envia(String mensagem) {
		System.out.println("Enviando mensagem por JMS: " + mensagem);

	}

}
