package adapter;

public class Lavadora implements OtherEnterprise {

	@Override
	public void costo() {
		System.out.println("500$ costo de la Lavadora");

	}

	@Override
	public void tiempoDeGarantia() {
		System.out.println("1 año de garantía");

	}

}
