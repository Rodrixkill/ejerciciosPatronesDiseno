package bridge;

public class Client {
    public static void main (String []args){

    	Dolares dolares= new Dolares();
    	Bolivianos bolivianos= new Bolivianos();
    	Euros euros= new Euros();
   
    	Ahorro ahorro = new Ahorro(bolivianos, new ConcreteAccount( 100.0));
    	Credito credito= new Credito(dolares, new ConcreteAccount( 100.0));
    	PlazoFijo fijo= new PlazoFijo(euros, new ConcreteAccount( 100.0));
    	
    	ahorro.consulta();
    	credito.consulta();
    	fijo.consulta();
    }
}
