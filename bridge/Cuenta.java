package bridge;

public abstract class Cuenta {
	public abstract double getMoney();
	public abstract void setMoney(double money);
    public abstract void depositar(double value);
    public abstract void consulta();
}
