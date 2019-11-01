package adapter;

public class Televisor implements OtherEnterprise {

	@Override
	public void costo() {
		System.out.println("2000$ costo del televisor");

	}

	@Override
	public void tiempoDeGarantia() {
		System.out.println("2 años de garantía");

	}

}
