package bridge;

public class Euros implements Moneda {

	@Override
	public double getCambiado(double price) {
		price/=9;
		return price;
	}

}
