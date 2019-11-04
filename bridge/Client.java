package bridge;

public class Client {
    public static void main (String []args){
    	Dolares dolares= new Dolares(1000.00);
    	Ahorro ahorro = new Ahorro(dolares.getConcrete());
   
    	ahorro.depositar(100.00);
    	ahorro.consulta();
    	System.out.println();
    	
    	Bolivianos cuenta1= new Bolivianos(10000.00);
    	Credito credito= new Credito(cuenta1.getConcrete());
    	credito.depositar(100.00);
    	credito.consulta();
    	System.out.println();
    	
    	Euros cuenta2= new Euros(1000.00);
    	PlazoFijo fijo= new PlazoFijo(cuenta2.getConcrete());
    	fijo.depositar(1000.00);
    	fijo.consulta();
    }
}
