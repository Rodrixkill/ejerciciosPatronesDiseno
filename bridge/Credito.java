package bridge;

public class Credito extends IAbstraction {
    private Cuenta implementor;

    public Credito(Cuenta implementor) {
		this.implementor = implementor;
		double previous= this.implementor.getMoney();
		Moneda type= implementor.getType();
		if (type.equals(Moneda.BOLIVIANOS)) {
			
		}else if (type.equals(Moneda.EUROS)) {
			previous*=7.70;
			
		}else if (type.equals(Moneda.DOLARES)) {
			previous*=6.96;
			
		}
        this.implementor.setMoney(previous);
	}
	
	@Override
	public void depositar(double value) {
		Moneda type= implementor.getType();
		if (type.equals(Moneda.BOLIVIANOS)) {
			this.implementor.depositar(value*1.05);
		}else if (type.equals(Moneda.EUROS)) {
			value*=7.70;
			this.implementor.depositar(value*1.05);
		}else if (type.equals(Moneda.DOLARES)) {
			value*=6.96;
			this.implementor.depositar(value*1.05);
		}
	
	}

	@Override
	public void consulta() {
		this.implementor.consulta();
	}

}
