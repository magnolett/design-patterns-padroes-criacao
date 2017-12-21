package FactoryMethod.Receptores;


public class ReceptorJMS implements Receptor {

	public void envia(String mensagem) {
		System.out.println("Enviando mensagem por JMS: " + mensagem);
	}

	public String recebe() {
		// TODO Auto-generated method stub
		return null;
	}

}
