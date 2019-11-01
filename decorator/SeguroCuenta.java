package decorator;

public class SeguroCuenta extends Decorator {

	public SeguroCuenta(CuentaBasica componente) {
		super(componente);
		this.setMonto(componente.getMonto());
		this.setPropietario(componente.getPropietario());
	}

	public void descuento(double monto) {
		double money = super.getCuentaBasica().getMonto() - monto;
		super.setMonto(money);
		System.out.println("se te desconto 1000.00$ por tus servicios de seguro de cuenta "+super.getCuentaBasica().getMonto());
	}

	
	public void navigate() {
		super.navigate();
		descuento(1000.00);
		
	}

	

}
