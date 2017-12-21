package FactoryMethod.Emissores;


public class EmissorSMS implements Emissor {

	public void envia(String mensagem) {
		System.out.println("Enviando SMS por mensagem: " + mensagem);

	}
}
