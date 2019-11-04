package bridge;

public class Euros {
	ConcreteAccount cuenta;
	IAbstraction abstraction;
	public Euros(double value) {
		cuenta= new ConcreteAccount(Moneda.EUROS, value);
	}
	public void setCuenta(IAbstraction abstraction) {
		this.abstraction= abstraction;
	}
	public ConcreteAccount getConcrete() {
		return cuenta;
	}
}
