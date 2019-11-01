package composite;

abstract class Component {
	private String nombre;
	public Component(String nombre) {
		this.nombre=nombre;
		System.out.println("Constructor: "+ nombre);
	}
	public String nombre() {
		return nombre;
	}
	public abstract void imprimir();
	public abstract void add(Component component);
	public abstract void remove(Component component);
	public abstract void getChild(int position);
	public abstract int getPrice();

}
