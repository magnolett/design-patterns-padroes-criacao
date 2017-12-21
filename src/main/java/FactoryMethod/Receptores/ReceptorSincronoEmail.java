package FactoryMethod.Receptores;

public class ReceptorSincronoEmail extends ReceptorEmail {

	public void envia(String mensagem) {
		System.out.println("Enviando mensagem por EMAIL: " + mensagem);


	}

}
