package adapter;

public class Celular implements ArtefactosElectronicos {

	@Override
	public void precio() {
		System.out.println("1000$ costo del Celular");
		
	}

	@Override
	public void tiempoDeVida() {
		System.out.println("2 años de vida");	
		
	}

	

	
}
