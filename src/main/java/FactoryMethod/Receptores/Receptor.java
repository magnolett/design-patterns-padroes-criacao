package FactoryMethod.Receptores;

//FACTORY METHOD
//Objetivo: Encapsular a escolha da classe concreta a ser utilizada na criação de objetos de um determinado tipo.

public interface Receptor {
	String recebe();

	void envia(String string);

	
}
