package visitor;

public class Client {

	public static void main(String[] args) {
		Perro perro= new Perro("fiebre","resfrio");
		Gato gato= new Gato("pulgas",null);
		Caballo caballo= new Caballo(null, null);
		
		ConcreteVisitor concreteVisitor= new ConcreteVisitor();
		
		perro.accept(concreteVisitor);
		gato.accept(concreteVisitor);
		caballo.accept(concreteVisitor);

	}

}
