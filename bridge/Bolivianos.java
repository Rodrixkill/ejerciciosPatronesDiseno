package bridge;

public class Bolivianos {
	ConcreteAccount cuenta;
	IAbstraction abstraction;
	public Bolivianos(double value) {
		cuenta= new ConcreteAccount(Moneda.BOLIVIANOS, value);
	}
	public void setCuenta(IAbstraction abstraction) {
		this.abstraction= abstraction;
	}
	public ConcreteAccount getConcrete() {
		return cuenta;
	}
}
