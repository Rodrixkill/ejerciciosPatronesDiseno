package bridge;

public class ConcreteAccount extends Cuenta {
	private Moneda type;
	private double money;
	
	@Override
	public Moneda getType() {
		return type;
	}

	public ConcreteAccount(Moneda type, double money) {
		this.type = type;
		this.money = money;
	}

	@Override
	public void depositar(double value) {
		money+=value;
		
	}

	@Override
	public void consulta() {
		if (type.equals(Moneda.DOLARES)) {
			System.out.println(money/6.96+"$ en Dolares");
		}else if (type.equals(Moneda.EUROS)) {
			System.out.println(money/7.70+"$ en Euros");
		}
		System.out.println(money+"$ en bolivianos");
		
	}

	@Override
	public double getMoney() {
		return money;
	}

	@Override
	public void setMoney(double money) {
		this.money=money;
		
	}

}
