package visitor;

public class Perro implements IElemento {
	private String enfermedad1;
	private String enfermedad2;
	public Perro(String enfermedad1,String enfermedad2) {
		this.enfermedad1=enfermedad1;
		this.enfermedad2=enfermedad2;
	}
	
	@Override
	public double accept(IVisitor visitor) {
		return visitor.visit(this);
	}

	@Override
	public String enfermedad1() {
		if (enfermedad1==null) {
			enfermedad1="esta sano";
		}
		return enfermedad1;
		
	}

	@Override
	public String enfermedad2() {
		if (enfermedad2==null) {
			enfermedad2="esta sano";
		}
		return enfermedad2;
		
	}

	

}
