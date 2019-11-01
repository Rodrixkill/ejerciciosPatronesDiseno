package visitor;

public interface IElemento {
	public double accept(IVisitor visitor);
	public String enfermedad1();
	public String enfermedad2();
	
	

}
