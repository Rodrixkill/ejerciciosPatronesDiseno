package decorator;

public class Client {

	public static void main(String[] args) {
		 CuentaBasica objectConcrete = new ComponentConcrete();
		 objectConcrete.setMonto(100000.00);
		 objectConcrete.setPropietario("Rodrigo");
	        objectConcrete = new BancaXInternet(objectConcrete);
	        objectConcrete = new Promocion(objectConcrete);
	        objectConcrete = new SeguroCuenta(objectConcrete);
	        objectConcrete.navigate();
	        System.out.println(objectConcrete.getMonto());
	        
	}

}
