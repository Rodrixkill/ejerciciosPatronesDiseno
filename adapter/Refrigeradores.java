package adapter;

public class Refrigeradores implements OtherEnterprise {

	@Override
	public void costo() {
		System.out.println("300$ costo del refrigerador");

	}

	@Override
	public void tiempoDeGarantia() {
		System.out.println("1 año de garantía");

	}

}
