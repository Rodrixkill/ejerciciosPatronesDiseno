package adapter;

public class ConcreteAdapter implements ArtefactosElectronicos {
	OtherEnterprise adaptee;
	public ConcreteAdapter(OtherEnterprise adaptee) {
		this.adaptee= adaptee;
	}
	@Override
	public void precio() {
		adaptee.costo();
		
	}
	@Override
	public void tiempoDeVida() {
		adaptee.tiempoDeGarantia();
		
	}

}
