package bridge;

public class Bolivianos implements Moneda {

	@Override
	public double getCambiado(double price) {

		return price;
	}

}
