package FactoryMethod.Emissores;

public class EmissorVisa implements Emissor {
	
	public void envia (String mensagem) {
		
		System.out.println("Enviando mensagem para VISA: " + mensagem);
	}
	
}
