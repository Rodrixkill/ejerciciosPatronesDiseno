package bridge;

public class Ahorro extends IAbstraction {
    private Cuenta implementor;

    public Ahorro(Moneda moneda,Cuenta implementor) {
		this.implementor = implementor;
		double previous= this.implementor.getMoney()*1.02;
		
	
        double newMoney= moneda.getCambiado(previous);
        this.implementor.setMoney(newMoney);
	}
	
	@Override
	public void depositar(double value) {
	
		this.implementor.depositar(value*1.02);
	
	}
	

	@Override
	public void consulta() {
		this.implementor.consulta();
	}

    
}
