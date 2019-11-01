package decorator;

public abstract class Decorator extends CuentaBasica {

		private CuentaBasica componente;
	  
	  	public CuentaBasica getCuentaBasica() {
	  		return this.componente;
	  	}

	    public Decorator(CuentaBasica componente){
	        this.componente = componente;
	        
	    }
	    @Override
		public void navigate() {

			componente.navigate();
			
		}
	  

}
