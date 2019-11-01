package decorator;

import java.util.Random;

public class Promocion extends Decorator {

	Random rand = new Random();
	int par;

	public Promocion(CuentaBasica componente) {
		super(componente);
		par = rand.nextInt(100);
		this.setMonto(componente.getMonto());
		this.setPropietario(componente.getPropietario());

	}

	public double promocion() {
		int par = rand.nextInt(100);
		double money = super.getCuentaBasica().getMonto();
		System.out.println(super.getCuentaBasica().getMonto());
		if (par % 2 == 0) {
			money *= 2;
			System.out.print("Duplicaste tu dinero con la promocion ");
		}
		super.setMonto(money);
		System.out.println(super.getCuentaBasica().getMonto());
		return super.getCuentaBasica().getMonto();
	}

	
	public void navigate() {
		super.navigate();
		promocion();
		
	}

}
