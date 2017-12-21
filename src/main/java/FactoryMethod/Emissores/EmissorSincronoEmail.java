package FactoryMethod.Emissores;

public class EmissorSincronoEmail extends EmissorEmail {

	public void envia(String mensagem) {
		System.out.println("Enviando mensagem por EMAIL: " + mensagem);


	}

}
