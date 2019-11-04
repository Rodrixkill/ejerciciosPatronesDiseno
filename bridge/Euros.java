package bridge;

public class Euros {
	ConcreteAccount cuenta;
	IAbstraction abstraction;
	Credito credito=null;
	PlazoFijo plazoFijo=null;
	Ahorro ahorro=null;
	public Euros(double value) {
		cuenta= new ConcreteAccount(Moneda.EUROS, value);
		
	}
	public Credito getCredito() {
		if (credito==null) {
			credito= new Credito(cuenta);
		}
		return credito;
	}
	public PlazoFijo getPlazoFijo() {
		if (plazoFijo==null) {
			plazoFijo= new PlazoFijo(cuenta);
		}
		return plazoFijo;
	}
	public Ahorro getAhorro() {
		if (ahorro==null) {
			ahorro= new Ahorro(cuenta);
		}
		return ahorro;
	}
	public ConcreteAccount getConcrete() {
		return cuenta;
	}
}
