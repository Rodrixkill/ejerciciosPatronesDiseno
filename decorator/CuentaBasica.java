package decorator;

public abstract class CuentaBasica {
	private String propietario;
	private double monto;
	public abstract void navigate();
	
	public String getPropietario() {
		return this.propietario;
	}
	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}
	public void setMonto(double monto) {
		this.monto = monto;
	}
	public double getMonto() {
		return this.monto;
	}


}
