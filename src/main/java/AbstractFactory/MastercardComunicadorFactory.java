package AbstractFactory;

import FactoryMethod.Emissores.Emissor;
import FactoryMethod.Emissores.EmissorCreator;
import FactoryMethod.Receptores.Receptor;
import FactoryMethod.Receptores.ReceptorCreator;

public class MastercardComunicadorFactory implements ComunicadorFactory {

	private EmissorCreator emissorCreator = new EmissorCreator();
	private ReceptorCreator receptorCreator = new ReceptorCreator();
	
	public Emissor createEmissor() {
		return this.emissorCreator.create(EmissorCreator.MASTER);

	}

	public Receptor createReceptor() {
		return this.receptorCreator.create(ReceptorCreator.MASTER);

	}

}