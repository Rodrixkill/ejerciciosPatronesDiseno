package bridge;

public class Client {
    public static void main (String []args){
    	ConcreteAccount cuenta= new ConcreteAccount("dolares", 1000.00);
    	Ahorro ahorro = new Ahorro(cuenta);
    	ahorro.depositar(100.00);
    	ahorro.consulta();
    	ConcreteAccount cuenta1= new ConcreteAccount("bolivianos", 1000.00);
    	Credito credito= new Credito(cuenta1);
    	credito.depositar(100.00);
    	credito.consulta();
    	ConcreteAccount cuenta2= new ConcreteAccount("euros", 1000.00);
    	PlazoFijo fijo= new PlazoFijo(cuenta2);
    	fijo.depositar(1000.00);
    	fijo.consulta();
    }
}
