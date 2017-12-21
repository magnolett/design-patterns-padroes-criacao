package FactoryMethod.Receptores;

public class ReceptorMaster implements Receptor {

	public String recebe() {
		System.out.println("Recebendo mensagem da MASTERCARD: ");
		String mensagem = "Mensagem para MASTERCARD";
		return mensagem;
	}

}
