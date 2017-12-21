package FactoryMethod.Receptores;


public class ReceptorSMS implements Receptor {

	public void envia(String mensagem) {
		System.out.println("Enviando SMS por mensagem: " + mensagem);

	}

	public String recebe() {
		// TODO Auto-generated method stub
		return null;
	}
}
