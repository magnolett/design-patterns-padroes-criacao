package FactoryMethod.Emissores;


public class EmissorEmail implements Emissor {

	public void envia(String mensagem) {
		System.out.println("Enviando mensagem por email: " + mensagem);
	}

}
