package bridge;

public class Client {
    public static void main (String []args){

    	Dolares dolares= new Dolares(100);
    	
   
    	dolares.getAhorro().depositar(100.00);
    	dolares.getAhorro().consulta();
    	System.out.println();
    	
    	Bolivianos cuenta1= new Bolivianos(100.00);
    	
    	cuenta1.getCredito().depositar(100.00);
    	cuenta1.getCredito().consulta();
    	System.out.println();
    	
    	Euros cuenta2= new Euros(1000.00);
    	
    	cuenta2.getPlazoFijo().depositar(100.00);
    	cuenta2.getPlazoFijo().consulta();
    }
}
