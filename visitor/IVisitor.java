package visitor;

public interface IVisitor {
	public double visit(Perro perro);
	public double visit(Gato gato);
	public double visit(Caballo caballo);
}
