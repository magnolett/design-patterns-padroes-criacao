package FactoryMethod.Emissores;


public class EmissorJMS implements Emissor {

	public void envia(String mensagem) {
		System.out.println("Enviando mensagem por JMS: " + mensagem);
	}
	
}
