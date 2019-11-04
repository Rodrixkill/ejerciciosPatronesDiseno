package bridge;

public class ConcreteAccount extends Cuenta {

	private double money;
	
	public ConcreteAccount(double money) {
		this.money = money;
	}

	@Override
	public void depositar(double value) {
		money+=value;
		
	}

	@Override
	public void consulta() {
		System.out.println(money+"$");
		
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
