package adapter;

public class Computadora implements ArtefactosElectronicos {

	@Override
	public void precio() {
		System.out.println("5000$ costo de la Computadora");

	}

	@Override
	public void tiempoDeVida() {
		System.out.println("10 años de vida");	

	}

}
