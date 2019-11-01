package composite;

public class Computadora extends Component {
	public Computadora(String nombre){
        super(nombre);
    }

    @Override
    public void imprimir() {
        System.out.println("\t Computadora : "+this.nombre());
    }

    @Override
    public void add(Component component) {
        System.out.println("not applicable on Computadora");
    }

    @Override
    public void remove(Component component) {
        System.out.println("not applicable on Computadora");
    }

    @Override
    public void getChild(int position) {
        System.out.println("\t Computadora :"+this.nombre());
    }

	@Override
	public int getPrice() {
		return 100;
		
	}

}
