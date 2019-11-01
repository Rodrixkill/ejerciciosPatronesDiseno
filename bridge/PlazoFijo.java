package bridge;

public class PlazoFijo extends IAbstraction {
	private Cuenta implementor;
	
	public PlazoFijo(Cuenta implementor) {
		this.implementor = implementor;
		double previous= this.implementor.getMoney();
        String type= implementor.getType();
		if (type.equals("bolivianos")) {
			
		}else if (type.equals("euros")) {
			previous*=7.70;
			
		}else if (type.equals("dolares")) {
			previous*=6.96;
			
		}
        double newMoney= previous*1.05;
        this.implementor.setMoney(newMoney);
	}
	
	@Override
	public void depositar(double value) {
		String type= implementor.getType();
		if (type.equals("bolivianos")) {
			this.implementor.depositar(value*1.05);
		}else if (type.equals("euros")) {
			value*=7.70;
			this.implementor.depositar(value*1.05);
		}else if (type.equals("dolares")) {
			value*=6.96;
			this.implementor.depositar(value*1.05);
		}
	
	}

	@Override
	public void consulta() {
		this.implementor.consulta();
	}

}
