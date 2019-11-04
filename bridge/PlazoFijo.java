package bridge;

public class PlazoFijo extends IAbstraction {
	private Cuenta implementor;
	
	public PlazoFijo(Moneda moneda,Cuenta implementor) {
		this.implementor = implementor;
		double previous= this.implementor.getMoney()*1.05;
		
        double newMoney= moneda.getCambiado(previous);
        this.implementor.setMoney(newMoney);
	}
	
	@Override
	public void depositar(double value) {
			this.implementor.depositar(value*1.05);
	
	}

	@Override
	public void consulta() {
		this.implementor.consulta();
	}

}
