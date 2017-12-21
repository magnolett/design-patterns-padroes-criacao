package FactoryMethod.Emissores;

public class EmissorAssincronoJMS extends EmissorJMS {

	public void envia(String mensagem) {
		System.out.println("Enviando mensagem por JMS: " + mensagem);

	}

}
