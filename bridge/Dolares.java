package bridge;

public class Dolares implements Moneda {

	@Override
	public double getCambiado(double price) {
		price/=7;
		return price;
	}

}
