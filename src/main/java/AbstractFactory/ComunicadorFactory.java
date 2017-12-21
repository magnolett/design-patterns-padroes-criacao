package AbstractFactory;

import FactoryMethod.Emissores.Emissor;
import FactoryMethod.Receptores.Receptor;

//ABSTRACT METHOD
//Objetivo: Encapsular a escolha das classes concretas a serem utilizadas na criação dos objetos dediversas famílias.

public interface ComunicadorFactory {

	Emissor createEmissor();
	Receptor createReceptor();
	
}
