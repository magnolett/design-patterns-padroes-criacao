package FactoryMethod.Emissores;

//Objetivo: Encapsular a escolha da classe concreta a ser utilizada na criação de objetos de um determinado tipo.

public class Run {
	public static void main(String[] args) {
		EmissorCreator creator = new EmissorAssincronoCreator();
		Emissor emissor = creator.create(EmissorCreator.SMS);
		emissor.envia("ENVIANDO!");
		Emissor emissorJMS = new EmissorJMS();
		emissorJMS.envia("ENVIANDO!");
		Emissor emissorEmail = new EmissorEmail();
		emissorEmail.envia("ENVIANDO!");
	}
}
