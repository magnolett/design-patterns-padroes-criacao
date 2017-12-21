package FactoryMethod.Receptores;


public class ReceptorEmail implements Receptor {

	public String recebe(String mensagem) {
		System.out.println("Enviando mensagem por email: " + mensagem);
		return mensagem;
	}

	public String recebe() {
		// TODO Auto-generated method stub
		return null;
	}
}
