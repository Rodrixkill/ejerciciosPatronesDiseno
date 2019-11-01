package bridge;

public class ConcreteAccount extends Cuenta {
	private String type;
	private double money;
	
	@Override
	public String getType() {
		return type;
	}

	public ConcreteAccount(String type, double money) {
		this.type = type;
		this.money = money;
	}

	@Override
	public void depositar(double value) {
		money+=value;
		
	}

	@Override
	public void consulta() {
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
