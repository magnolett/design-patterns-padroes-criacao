package FactoryMethod.Emissores;

public class EmissorMaster implements Emissor {
	
	public void envia (String mensagem) {
		
		System.out.println("Enviando mensagem para MASTERCARD: " + mensagem);
	}
	
}
