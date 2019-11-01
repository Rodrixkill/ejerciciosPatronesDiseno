package adapter;

public class Tablet implements ArtefactosElectronicos {

	@Override
	public void precio() {
		System.out.println("500$ costo de la tablet");
		
	}

	@Override
	public void tiempoDeVida() {
		System.out.println("3 años de vida");		
	}

	
}
