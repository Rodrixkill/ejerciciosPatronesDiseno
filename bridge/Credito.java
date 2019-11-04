package bridge;

public class Credito extends IAbstraction {
    private Cuenta implementor;

    public Credito(Moneda moneda,Cuenta implementor) {
		this.implementor = implementor;
		double previous= this.implementor.getMoney();
		
        this.implementor.setMoney(moneda.getCambiado(previous));
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
