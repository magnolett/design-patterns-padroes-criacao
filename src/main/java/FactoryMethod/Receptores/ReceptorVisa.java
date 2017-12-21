package FactoryMethod.Receptores;

public class ReceptorVisa implements Receptor {

	public String recebe() {
		System.out.println("Recebendo mensagem da VISA: ");
		String mensagem = "Mensagem pra VISA";
		return mensagem;
	
	}

}
