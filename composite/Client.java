package composite;

public class Client {

	public static void main(String[] args) {
		Composite laboratorio1 = new Composite("Laboratorio");
		laboratorio1.add(new Computadora("Computadora 1"));
		laboratorio1.add(new Computadora("Computadora 2"));
		laboratorio1.add(new Computadora("Computadora 3"));
		Composite laboratorio2 = new Composite("subTask2");
		laboratorio2.add(new Computadora("Computadora 4"));
		laboratorio2.add(new Computadora("Computadora 5"));
		laboratorio2.add(new Computadora("Computadora 6"));
		
		Composite laboratorio3 = new Composite("subTask1");
		laboratorio3.add(new Computadora("Computadora 7"));
		laboratorio3.add(new Computadora("Computadora 8"));
		laboratorio3.add(new Computadora("Computadora 9"));
		Composite laboratorio4 = new Composite("subTask2");
		laboratorio4.add(new Computadora("Computadora 10"));
		laboratorio4.add(new Computadora("Computadora 11"));
		laboratorio4.add(new Computadora("Computadora 12"));
		
		Composite contenedor1 = new Composite("contenedor1");
		contenedor1.add(laboratorio1);
		contenedor1.add(laboratorio2);
		Composite contenedor2 = new Composite("contenedor2");
		contenedor2.add(laboratorio3);
		contenedor2.add(laboratorio4);
		
		
	
		contenedor1.imprimir();
		System.out.println(contenedor1.getPrice());
		
		contenedor2.imprimir();
		System.out.println(contenedor2.getPrice());
		
        

       

		

	}

}
