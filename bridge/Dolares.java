package bridge;

public class Dolares {
	ConcreteAccount cuenta;
	IAbstraction abstraction;
	public Dolares(double value) {
		cuenta= new ConcreteAccount(Moneda.DOLARES, value);
	}
	public void setCuenta(IAbstraction abstraction) {
		this.abstraction= abstraction;
	}
	public ConcreteAccount getConcrete() {
		return cuenta;
	}

}
