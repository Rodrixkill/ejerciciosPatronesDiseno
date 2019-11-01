package decorator;

public class BancaXInternet extends Decorator {
	private boolean enable;

    public BancaXInternet(CuentaBasica componente){
        super(componente);
        this.enable=true;
        this.setMonto(componente.getMonto());
        this.setPropietario(componente.getPropietario());
    }

    
    public void browse() {
    	if (enable) {
    		System.out.println("Browse with internet");
		} else {
			System.out.println("Browse without internet");
		}
    	
    }


	public void navigate() {
		super.navigate();
		browse();
		
	}
	

}
