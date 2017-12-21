package FactoryMethod.Receptores;

//Objetivo: Encapsular a escolha da classe concreta a ser utilizada na criação de objetos de um determinado tipo.

public class Run {
	public static void main(String[] args) {
		ReceptorCreator creator = new ReceptorAssincronoCreator();
		Receptor receptor = creator.create(ReceptorCreator.SMS);
		receptor.envia("ENVIANDO!");
		Receptor emissorJMS = new ReceptorJMS();
		emissorJMS.envia("ENVIANDO!");
		Receptor emissorEmail = new ReceptorEmail();
		emissorEmail.envia("ENVIANDO!");
	}
}
