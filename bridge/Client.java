package bridge;

public class Client {
    public static void main (String []args){
    	ConcreteAccount cuenta= new ConcreteAccount(Moneda.DOLARES, 1000.00);
    	Ahorro ahorro = new Ahorro(cuenta);
    	ahorro.depositar(100.00);
    	ahorro.consulta();
    	System.out.println();
    	ConcreteAccount cuenta1= new ConcreteAccount(Moneda.BOLIVIANOS, 1000.00);
    	Credito credito= new Credito(cuenta1);
    	credito.depositar(100.00);
    	credito.consulta();
    	System.out.println();
    	ConcreteAccount cuenta2= new ConcreteAccount(Moneda.EUROS, 1000.00);
    	PlazoFijo fijo= new PlazoFijo(cuenta2);
    	fijo.depositar(1000.00);
    	fijo.consulta();
    }
}
